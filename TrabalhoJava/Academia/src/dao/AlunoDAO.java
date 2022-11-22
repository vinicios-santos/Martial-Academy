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
import model.Aluno;
import model.AlunoConsulta;

/**
 *
 * @author vitor
 */
public class AlunoDAO {

    private Connection conexao;
    private String selectComClasula = "SELECT * FROM ALUNOS WHERE codigo_aluno = ?";
    private String selecionaPorCodigoAluno = "select a.codigo_aluno, a.aluno, mm.modalidades, mm.graduacao, mm.plano, mm.data_inicio,\n" +
                                        "mm.data_fim from alunos a\n" +
                                        "inner join matriculas m on (m.codigo_aluno = a.codigo_aluno)\n" +
                                        "inner join matriculas_modalidades mm on (mm.codigo_matricula = m.codigo_matricula)\n" +
                                        "where a.codigo_aluno = ?;";

    private PreparedStatement pstSelectComClasula;
    private PreparedStatement pstSelecionaPorCodigoAluno;

    public AlunoDAO(Connection conexao) throws SQLException {
        this.conexao = conexao;
         pstSelectComClasula = this.conexao.prepareStatement(selectComClasula);

        pstSelecionaPorCodigoAluno = this.conexao.prepareStatement(selecionaPorCodigoAluno);

    }
    
    public Aluno SelectWithCondition(Object param) throws SQLException {
        pstSelectComClasula.setInt(1, Integer.parseInt(param.toString()));
        ResultSet rs = pstSelectComClasula.executeQuery();
        
        Aluno aluno = new Aluno();
        while(rs.next()){
            int cod = rs.getInt("codigo_aluno");
            aluno.setCodigoAluno(cod);
            aluno.setAluno(rs.getString("aluno"));
            aluno.setDataNascimento(rs.getDate("data_nascimento"));
            aluno.setSexo(rs.getString("sexo").charAt(0));
            aluno.setTelefone(rs.getString("telefone"));
            aluno.setCelular(rs.getString("celular"));
            aluno.setEmail(rs.getString("email"));
            aluno.setObservacao(rs.getString("observacao"));
            aluno.setEndereco(rs.getString("endereco"));
            aluno.setNumero(rs.getString("numero"));
            aluno.setComplemento(rs.getString("complemento"));
            aluno.setBairro(rs.getString("bairro"));
            
            aluno.setCep(rs.getString("cep"));
        }
        return aluno;
    }

    public List<AlunoConsulta> selecionaPorCodigoAluno(int cod_aluno) throws SQLException {
        pstSelecionaPorCodigoAluno.setInt(1, cod_aluno);
        ResultSet resultado = pstSelecionaPorCodigoAluno.executeQuery();
        List<AlunoConsulta> lista = new ArrayList<AlunoConsulta>();

        while (resultado.next()) {
            AlunoConsulta fm = new AlunoConsulta();

            fm.setCodigoAluno(resultado.getInt("codigo_aluno"));
            fm.setAluno(resultado.getString("aluno"));
            fm.setModalidade(resultado.getString("modalidades"));
            fm.setGraduacao(resultado.getString("graduacao"));
            fm.setPlano(resultado.getString("plano"));
            fm.setDataInicio(resultado.getDate("data_inicio"));
            fm.setDataFim(resultado.getDate("data_fim"));
            lista.add(fm);
        }
        return lista;

    }
}
