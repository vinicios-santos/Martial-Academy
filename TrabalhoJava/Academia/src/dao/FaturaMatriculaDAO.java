/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.FaturasMatricula;

/**
 *
 * @author vitor
 */
public class FaturaMatriculaDAO {
     private Connection conexao;
     private String selecionaPorCodigoAluno = "select data_vencimento,valor,data_pagamento,data_cancelamento\n" +
                                    "from faturas_matriculas fm \n" +
                                    "where codigo_matricula = (select codigo_matricula from matriculas m where codigo_aluno = ?)";
     
     private PreparedStatement pstSelecionaPorCodigoAluno;
     
     public FaturaMatriculaDAO(Connection conexao) throws SQLException {
        this.conexao = conexao;
        pstSelecionaPorCodigoAluno = this.conexao.prepareStatement(selecionaPorCodigoAluno);
    }
     
     public List<FaturasMatricula> SelectByCodAluno(int cod_aluno) throws SQLException {
        pstSelecionaPorCodigoAluno.setInt(1, cod_aluno);
        ResultSet resultado = pstSelecionaPorCodigoAluno.executeQuery();
        List<FaturasMatricula> lista = new ArrayList<FaturasMatricula>();

        while(resultado.next()){
            FaturasMatricula f = new FaturasMatricula();
            
            f.setDataVencimento(resultado.getDate("data_vencimento"));
            f.setValor(resultado.getDouble("valor"));
            f.setDataPagamento(resultado.getDate("data_pagamento"));
            f.setDataCancelamento(resultado.getDate("data_cancelamento"));
            lista.add(f);
        }

        return lista;
    
    }
}
