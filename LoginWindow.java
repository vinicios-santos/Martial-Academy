package graphic;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class LoginWindow extends JFrame {
	
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JTextField txfUsuario;
	private JPasswordField psfUsuario;
	private JButton buttonEnviar;
	private JComboBox<String> cbxPerfil;
	private JCheckBox chkHabilitado;
	private JTextArea txaObservacao;
	private JScrollPane scrollObs;
	
	private JTable tblDados;
	private DefaultTableModel model;
	private JScrollPane scrollDados;
	
	public LoginWindow() {
		setSize(500, 300);
		setTitle("Cadastro de usuarios");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblUsuario.setBounds(20, 20, 130, 25);
		getContentPane().add(lblUsuario);
		
		txfUsuario = new JTextField();
		txfUsuario.setBounds(150, 20, 150, 25);
		getContentPane().add(txfUsuario);

		lblPassword = new JLabel("Senha");
		lblPassword.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblPassword.setBouds(20, 20, 130, 25);
		getContentPane().add(lblPassword);

		psfUsuario = new JPasswordField();
		psfUsuario.setBounds(150, 20, 150, 25);
		getContentPanel().add(psfUsuario);

		buttonEnviar = new Jbutton("Enviar");
		buttonEnviar.setBounds(100, 100, 100, 100);
		getContentPanel().add(buttonEnviar);
	}

	public static void main(String[] args) {
		new LoginWindow().setVisible(true);
	}

}
