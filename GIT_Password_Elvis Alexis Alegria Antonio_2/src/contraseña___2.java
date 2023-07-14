import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class contraseña___2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtusu;
	private JTextField txtcon;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contraseña___2 frame = new contraseña___2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public contraseña___2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblus = new JLabel("Usuario");
		lblus.setHorizontalAlignment(SwingConstants.CENTER);
		lblus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblus.setBounds(124, 54, 132, 22);
		contentPane.add(lblus);
		
		txtusu = new JTextField();
		txtusu.setHorizontalAlignment(SwingConstants.CENTER);
		txtusu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		txtusu.setBounds(92, 88, 196, 20);
		contentPane.add(txtusu);
		txtusu.setColumns(10);
		
		JLabel lblcon = new JLabel("Contraseña");
		lblcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblcon.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblcon.setBounds(124, 130, 132, 22);
		contentPane.add(lblcon);
		
		txtcon = new JTextField();
		txtcon.setHorizontalAlignment(SwingConstants.CENTER);
		txtcon.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		txtcon.setColumns(10);
		txtcon.setBounds(92, 166, 196, 20);
		contentPane.add(txtcon);
		
		JButton btnNewButton = new JButton("Iniciar sesion");
		btnNewButton.setForeground(new Color(12, 163, 72));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtusu.getText().equals("Alexis21")&&(txtcon.getText().equals("1234"))) {
					JOptionPane.showMessageDialog(null, "Bienvenido");
				}
				else {
					JOptionPane.showMessageDialog(null, "Contraseña o usuario incorrecto. Porfavor revise e intente nuevamente");
				}
				
				
			}
		});
		btnNewButton.setBounds(124, 216, 132, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Porfavor inicia sesión");
		lblNewLabel.setForeground(new Color(170, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(59, 11, 281, 32);
		contentPane.add(lblNewLabel);
	}
}
