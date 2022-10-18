package graphic;

import java.awt.event.ActionEvent;

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
	private JMenuItem itemFinanceiroMatricula;
	
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
						new CadastroAluno().setVisible(true);
					}
                                });
                                
                        itemCadastroModalidade = new JMenuItem("Modalidade");
                        
                        itemCadastroGraduacao = new JMenuItem("Graduação");
                        
                        itemCadastroPlano = new JMenuItem("Planos");
			menuCadastro.add(itemCadastroAluno);
			menuCadastro.add(itemCadastroModalidade);
                        menuCadastro.add(itemCadastroGraduacao);
                        menuCadastro.add(itemCadastroPlano);
			
		menuBar.add(menuSistema);
		menuBar.add(menuCadastro);
		
		framePrincipal = new JFrame("Sistema de Academia de Artes Marciais");
		framePrincipal.setSize(500, 500);
		framePrincipal.setJMenuBar(menuBar);
		framePrincipal.setVisible(true);
	}

	public static void main(String[] args) {
            //
	}
}
