/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import dao.Conexao;
import dao.UsuarioDAO;
import graphic.Login;
import graphic.MenuWindow;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author vitor
 */
public class LoginController {

    private Login graphic;

    public LoginController(Login graphic) {
        this.graphic = graphic;
    }

    public void autenticar() throws SQLException {    
        String usuario = graphic.getjTextFieldUsuario().getText();
        String senha = graphic.getjPasswordFieldSenha().getText();

        Usuario usuarioAutenticar = new Usuario(usuario, senha);

        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);

        boolean existe = usuarioDao.existePorUsuarioESenha(usuarioAutenticar);

        if (existe) {
            MenuWindow TelaMenu = new MenuWindow();
        } else {
            JOptionPane.showMessageDialog(graphic, "Usuario ou senha inválidos");
        }
    }


}
