package graphic;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuWindow {

    private JMenuBar menuBar;
    private JMenu menuSistema;
    private JMenuItem itemSistemaUsuario;
    private JMenuItem itemSistemaSair;

    private JMenu menuCadastro;
    private JMenuItem itemCadastroAluno;
    private JMenuItem itemCadastroModalidade;
    private JMenuItem itemCadastroGraduacao;
    private JMenuItem itemCadastroPlano;

    private JMenu menuFinanceiro;
    private JMenuItem itemFinanceiroControle;

    private JMenu menuUtilitarios;
    private JMenuItem itemBackup;

    private JFrame framePrincipal;

    public MenuWindow() {

        menuBar = new JMenuBar();
//Menu Usuario
        menuSistema = new JMenu("Sistema");
        itemSistemaUsuario = new JMenuItem();
        itemSistemaUsuario.setAction(new AbstractAction("Usuario") {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ListaUsuarios().setVisible(true);
            }
        });
        itemSistemaSair = new JMenuItem("Sair");
        itemSistemaSair.setAction(new AbstractAction("Sair") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        menuSistema.add(itemSistemaUsuario);
        menuSistema.addSeparator();
        menuSistema.add(itemSistemaSair);
//Menu Cadastro
        menuCadastro = new JMenu("Cadastro");
        itemCadastroAluno = new JMenuItem();
        itemCadastroAluno.setAction(new AbstractAction("Aluno") {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ListaAlunos().setVisible(true);
            }
        });

        itemCadastroModalidade = new JMenuItem("Modalidade");
        itemCadastroModalidade.setAction(new AbstractAction("Modalidade") {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ListaModalidades().setVisible(true);
            }
        });

        itemCadastroGraduacao = new JMenuItem("Graduação");
        itemCadastroGraduacao.setAction(new AbstractAction("Graduação") {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ListaGraduacao().setVisible(true);
            }
        });

        itemCadastroPlano = new JMenuItem("Planos");
        itemCadastroPlano.setAction(new AbstractAction("Planos") {

            @Override
            public void actionPerformed(ActionEvent e) {
                new ListaPlanos().setVisible(true);
            }
        });

        menuCadastro.add(itemCadastroAluno);
        menuCadastro.add(itemCadastroModalidade);
        menuCadastro.add(itemCadastroGraduacao);
        menuCadastro.add(itemCadastroPlano);

//Menu Financeiro
        menuFinanceiro = new JMenu("Financeiro");
        itemFinanceiroControle = new JMenuItem();
        itemFinanceiroControle.setAction(new AbstractAction("Controle de Alunos") {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new ControleAlunos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        menuFinanceiro.add(itemFinanceiroControle);

        menuBar.add(menuSistema);
        menuBar.add(menuCadastro);
        menuBar.add(menuFinanceiro);

        framePrincipal = new JFrame("Sistema de Academia de Artes Marciais");
        framePrincipal.setSize(500, 500);
        framePrincipal.setJMenuBar(menuBar);
        framePrincipal.setVisible(true);
    }

    public static void main(String[] args) {
        //
    }
}
