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
import model.Assiduidade;

/**
 *
 * @author vitor
 */
public class AssiduidadeDAO {
    private Connection conexao;
      private String selecionaPorCodigoAluno = "select data_entrada\n" +
                                        "from assiduidade a \n" +
                                        "where codigo_matricula = (select codigo_matricula from matriculas m where codigo_aluno = ?)";
      
     private PreparedStatement pstSelecionaPorCodigoAluno;
        
        public AssiduidadeDAO(Connection conexao) throws SQLException {
            this.conexao = conexao;
            pstSelecionaPorCodigoAluno = this.conexao.prepareStatement(selecionaPorCodigoAluno);    
        }
        
        public List<Assiduidade> SelectByCodAluno(int cod_aluno) throws SQLException {
        pstSelecionaPorCodigoAluno.setInt(1, cod_aluno);
        ResultSet resultado = pstSelecionaPorCodigoAluno.executeQuery();
        List<Assiduidade> lista = new ArrayList<Assiduidade>();

        while(resultado.next()){
            Assiduidade a = new Assiduidade();
            
            a.setDataEntrada(resultado.getDate("data_entrada"));
            lista.add(a);
        }

        return lista;
    
    }
}
