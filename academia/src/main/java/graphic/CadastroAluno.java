package graphic;

import java.awt.Font;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroAluno extends JFrame {
    
    private JLabel lblNome;
    private JTextField txtNome;
    
    private JLabel lblNasc;
    private JTextField txtNasc;
    
    
    public CadastroAluno(){
        	setSize(500, 1000);
		setTitle("Cadastro de Alunos");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
                
                lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblNome.setBounds(20, 20, 130, 25);
		getContentPane().add(lblNome);
                
                txtNome = new JTextField();
		txtNome.setBounds(150, 20, 150, 25);
		getContentPane().add(txtNome);
                
                lblNasc = new JLabel("Data de nascimento:");
		lblNasc.setFont(new Font(Font.MONOSPACED, Font.BOLD, 22));
		lblNasc.setBounds(20, 20, 130, 25);
		getContentPane().add(lblNasc);
                
                txtNasc = new JTextField();
		txtNasc.setBounds(150, 20, 150, 25);
		getContentPane().add(txtNasc);
    }
            

}
