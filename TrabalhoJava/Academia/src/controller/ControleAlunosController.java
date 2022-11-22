/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AssiduidadeDAO;
import dao.FaturaMatriculaDAO;
import dao.MatriculasModalidadeDAO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Assiduidade;
import model.FaturasMatricula;
import model.MatriculasModalidades;

/**
 *
 * @author vitor
 */
public class ControleAlunosController {

    private Connection connection;

    public ControleAlunosController(Connection connection) {
        this.connection = connection;
    }

    public void listarModalidadesMatriculas(DefaultTableModel modeloTabela, int cod_aluno) {
        try {
            MatriculasModalidadeDAO matriculaModalidadeDAO = new MatriculasModalidadeDAO(connection);
            List<MatriculasModalidades> listaMatriculaModalidades = matriculaModalidadeDAO.SelectByCodAluno(cod_aluno);

            if (listaMatriculaModalidades != null) {
                modeloTabela.setRowCount(0);

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                for (MatriculasModalidades mm : listaMatriculaModalidades) {
                    if (mm.getDataFim() == null) {
                        Object[] dados = {mm.getModalidade(), mm.getGraduacao(), mm.getPlano(), sdf.format(mm.getDataInicio())};
                        modeloTabela.addRow(dados);
                    } else {
                        Object[] dados = {mm.getModalidade(), mm.getGraduacao(), mm.getPlano(), sdf.format(mm.getDataInicio()), sdf.format(mm.getDataFim())};
                        modeloTabela.addRow(dados);
                    }
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void listarFaturas(DefaultTableModel modeloTabela, int cod_aluno) throws ParseException {
        try {
            FaturaMatriculaDAO faturaMatriculaDAO = new FaturaMatriculaDAO(connection);
            List<FaturasMatricula> listaFaturas = faturaMatriculaDAO.SelectByCodAluno(cod_aluno);
            if (listaFaturas != null) {
                modeloTabela.setRowCount(0);

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                for (FaturasMatricula f : listaFaturas) {
                    if (f.getDataPagamento() == null) {
                        Object[] dados = {sdf.format(f.getDataVencimento()), f.getValor()};
                        modeloTabela.addRow(dados);
                    } else if (f.getDataCancelamento() == null) {
                        Object[] dados = {sdf.format(f.getDataVencimento()), f.getValor(), sdf.format(f.getDataPagamento())};
                        modeloTabela.addRow(dados);
                    } else {
                        Object[] dados = {sdf.format(f.getDataVencimento()), f.getValor(), sdf.format(f.getDataPagamento()), sdf.format(f.getDataCancelamento())};
                        modeloTabela.addRow(dados);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void VerificaSituacaoRegular(JTextField jTextFieldSituacao, int cod_aluno) throws ParseException {
        try {
            FaturaMatriculaDAO faturaMatriculaDAO = new FaturaMatriculaDAO(connection);
            List<FaturasMatricula> listaFaturas = faturaMatriculaDAO.SelectByCodAluno(cod_aluno);
            if (listaFaturas == null) {
                jTextFieldSituacao.setText("Nenhuma Fatura Encontrada");
                return;
            }
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date todayDate = new Date();

            for (FaturasMatricula f : listaFaturas) {
                Date dataVencimento = sdf.parse(sdf.format(f.getDataVencimento()));
                if (f.getDataPagamento() == null && todayDate.compareTo(dataVencimento) > 0) {
                    jTextFieldSituacao.setText("Débitos Pendentes");
                    jTextFieldSituacao.setBackground(Color.red);
                } else {
                    jTextFieldSituacao.setText("Situação Regular");
                    jTextFieldSituacao.setBackground(Color.green);
                }

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void listarAssiduidade(DefaultTableModel modeloTabela, int cod_aluno) {
        try {
            AssiduidadeDAO assiduidadeDAO = new AssiduidadeDAO(connection);
            List<Assiduidade> listaAssiduidade = assiduidadeDAO.SelectByCodAluno(cod_aluno);

            if (listaAssiduidade != null) {
                modeloTabela.setRowCount(0);

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                for (Assiduidade a : listaAssiduidade) {
                    if (a.getDataEntrada() == null) {
                        return;
                    } else {
                        Object[] dados = {sdf.format(a.getDataEntrada())};
                        modeloTabela.addRow(dados);
                    }
                }
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
