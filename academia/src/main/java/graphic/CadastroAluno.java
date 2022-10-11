package graphic;

import java.awt.Font;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastroAluno extends JFrame {
    
    private JLabel lblNome;
    private JTextField txtNome;
    
    private JLabel lblNasc;
    private JTextField txtNasc;
    
    private JLabel lblSexo;
    private JCheckBox checkMasc;    
    private JCheckBox checkFem;
    private JCheckBox checkOutro;
    private JLabel lblMasc;
    private JLabel lblFem;
    private JLabel lblOutro;
    
    private JLabel lblNumero;
    private JTextField txtNumero;
    
    private JLabel lblEmail;
    private JTextField txtEmail;
    
    private JLabel lblObs;
    private JTextField txtObs;
    
    private JLabel lblLogra;
    private JTextField txtLogra;
    
    private JLabel lblCidade;
    private JComboBox comboCidade;

    private JLabel lblNroLogra;
    private JTextField txtNroLogra;

    private JLabel lblComplemento;
    private JTextField txtComplemento;
    
    private JLabel lblBairro;
    private JTextField txtBairro;
    
    private JLabel lblCep;
    private JTextField txtCep;
    
    private JButton buttonEnviar;

    
    
    public CadastroAluno(){
        	setSize(600, 800);
		setTitle("Cadastro de Alunos");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
                
                lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblNome.setBounds(20, 20, 130, 25);
		getContentPane().add(lblNome);
                
                txtNome = new JTextField();
		txtNome.setBounds(300, 20, 150, 25);
		getContentPane().add(txtNome);
                
                lblNasc = new JLabel("Data de nascimento:");
		lblNasc.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblNasc.setBounds(20, 70, 300, 25);
		getContentPane().add(lblNasc);
                
                txtNasc = new JTextField();
		txtNasc.setBounds(300, 70, 150, 25);
		getContentPane().add(txtNasc);
                
                lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblSexo.setBounds(20, 120, 300, 25);
		getContentPane().add(lblSexo);
                
                lblMasc = new JLabel("Masculino:");
		lblMasc.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblMasc.setBounds(300, 120, 300, 25);
		getContentPane().add(lblMasc);
                
                lblFem = new JLabel("Feminino:");
		lblFem.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblFem.setBounds(300, 150, 300, 25);
		getContentPane().add(lblFem);
                
                lblOutro = new JLabel("Outro:");
		lblOutro.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblOutro.setBounds(300, 180, 300, 25);
		getContentPane().add(lblOutro);
                
                checkMasc = new JCheckBox ();
                checkMasc.setBounds(500, 120, 150, 25);
                getContentPane().add(checkMasc);
                
                checkFem = new JCheckBox ();
                checkFem.setBounds(500, 150, 150, 25);
                getContentPane().add(checkFem);
                
                checkOutro = new JCheckBox ();
                checkOutro.setBounds(500, 180, 150, 25);
                getContentPane().add(checkOutro);
                
                lblNumero = new JLabel("Numero celular:");
		lblNumero.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblNumero.setBounds(20, 230, 300, 25);
		getContentPane().add(lblNumero);
                
                txtNumero = new JTextField();
		txtNumero.setBounds(300, 230, 150, 25);
		getContentPane().add(txtNumero);
                
                lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblEmail.setBounds(20, 280, 300, 25);
		getContentPane().add(lblEmail);
                        
                txtEmail = new JTextField();
		txtEmail.setBounds(300, 280, 250, 25);
		getContentPane().add(txtEmail);
                
                lblObs = new JLabel("Observação:");
		lblObs.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblObs.setBounds(20, 330, 300, 25);
		getContentPane().add(lblObs);
                
                txtObs = new JTextField();
		txtObs.setBounds(300, 330, 250, 25);
		getContentPane().add(txtObs);
                
                lblLogra = new JLabel("Logradouro: ");
		lblLogra.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblLogra.setBounds(20, 380, 300, 25);
		getContentPane().add(lblLogra);
                
                txtLogra = new JTextField();
		txtLogra.setBounds(300, 380, 250, 25);
		getContentPane().add(txtLogra);
                
                lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblCidade.setBounds(20, 430, 300, 25);
		getContentPane().add(lblCidade);
                
                comboCidade = new JComboBox();
                comboCidade.setBounds(300, 430, 250, 25);
                getContentPane().add(comboCidade);
                
                lblNroLogra = new JLabel("Numero Logradouro:");
		lblNroLogra.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblNroLogra.setBounds(20, 480, 300, 25);
		getContentPane().add(lblNroLogra);
                
                txtNroLogra = new JTextField();
		txtNroLogra.setBounds(300, 480, 150, 25);
		getContentPane().add(txtNroLogra);
                
                lblComplemento = new JLabel("Complemento:");
		lblComplemento.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblComplemento.setBounds(20, 530, 300, 25);
		getContentPane().add(lblComplemento);
                
                txtComplemento = new JTextField();
		txtComplemento.setBounds(300, 530, 150, 25);
		getContentPane().add(txtComplemento);
                
                lblBairro = new JLabel("Bairo:");
		lblBairro.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblBairro.setBounds(20, 580, 300, 25);
		getContentPane().add(lblBairro);
                
                txtBairro = new JTextField();
		txtBairro.setBounds(300, 580, 150, 25);
		getContentPane().add(txtBairro);
                
                lblCep = new JLabel("Cep:");
		lblCep.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblCep.setBounds(20, 630, 300, 25);
		getContentPane().add(lblCep);
                
                txtCep = new JTextField();
		txtCep.setBounds(300, 630, 150, 25);
		getContentPane().add(txtCep);
                
                buttonEnviar = new JButton("Enviar");
		buttonEnviar.setBounds(20, 680, 75, 55);
		getContentPane().add(buttonEnviar);
    }
}
