/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author vitor
 */
public class UsuarioDAO {

    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Usuario usuario) throws SQLException {
        String sql = "insert into usuarios(usuario,senha,perfil) values('" + usuario.getUsuario() + "','" + usuario.getSenha() + "','" + usuario.getPerfil() + "');";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        //connection.close();;
    }

    public boolean existePorUsuarioESenha(Usuario usuarioAutenticar) throws SQLException {
        String sql = "Select * from usuarios where usuario = '" + usuarioAutenticar.getUsuario() + "' and senha = '" + usuarioAutenticar.getSenha() + "' ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();

        ResultSet resultSet = statement.getResultSet();
        return resultSet.next();

    }

}
