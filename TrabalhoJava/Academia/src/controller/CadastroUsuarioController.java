/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import graphic.CadastroUsuario;
import graphic.MenuWindow;
import java.sql.Connection;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author vitor
 */
public class CadastroUsuarioController {

    private CadastroUsuario graphic;

    public CadastroUsuarioController(CadastroUsuario graphic) {
        this.graphic = graphic;
    }

    public void cadastrar() throws Exception {
        String usuario = graphic.getjTextFieldUsuarioNovo().getText();
        String senha = graphic.getjPasswordFieldSenhaNovo().getText();
        String perfil = graphic.getjTextFieldPerfilNovo().getText();

        Usuario usuarioInserir = new Usuario(usuario, senha, perfil);
        Usuario usuarioAutenticar = new Usuario(usuario, senha);

        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDao = new UsuarioDAO(conexao);

        boolean existe = usuarioDao.existePorUsuarioESenha(usuarioAutenticar);

        if (existe) {
            JOptionPane.showMessageDialog(graphic, "Usuário já foi cadastrado");
        } else {
            usuarioDao.inserirNoBanco(usuarioInserir);
            JOptionPane.showMessageDialog(graphic, "Usuário cadastrado com sucesso");
            MenuWindow TelaMenu = new MenuWindow();
        }
    }

}
