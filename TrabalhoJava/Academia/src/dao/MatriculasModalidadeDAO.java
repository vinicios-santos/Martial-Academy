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
import model.MatriculasModalidades;

/**
 *
 * @author vitor
 */
public class MatriculasModalidadeDAO {
      private Connection conexao;
     private String selecionaPorCodigoAluno = "select modalidades,graduacao,plano,data_inicio,data_fim \n" +
                                        "from matriculas_modalidades mm \n" +
                                        "where codigo_matricula = (select codigo_matricula from matriculas m where codigo_aluno = ?)";
      
       private PreparedStatement pstSelecionaPorCodigoAluno;
       
        public MatriculasModalidadeDAO(Connection conexao) throws SQLException {
        this.conexao = conexao;
        pstSelecionaPorCodigoAluno = this.conexao.prepareStatement(selecionaPorCodigoAluno);
    }
        
         public List<MatriculasModalidades> SelectByCodAluno(int cod_aluno) throws SQLException {
        pstSelecionaPorCodigoAluno.setInt(1, cod_aluno);
        ResultSet resultado = pstSelecionaPorCodigoAluno.executeQuery();
        List<MatriculasModalidades> lista = new ArrayList<MatriculasModalidades>();

        while(resultado.next()){
            MatriculasModalidades mm = new MatriculasModalidades();
            mm.setModalidade(resultado.getString("modalidades"));
            mm.setGraduacao(resultado.getString("graduacao"));
            mm.setPlano(resultado.getString("plano"));
            mm.setDataInicio(resultado.getDate("data_inicio"));
            mm.setDataFim(resultado.getDate("data_fim"));
            lista.add(mm);
        }

        return lista;
    
    }

}
