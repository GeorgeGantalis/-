import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class Screen2 extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public Screen2() {
		setSize(new Dimension(875, 730));
		getContentPane().setLayout(null);
		
		JButton btnPiso = new JButton("\u03A0\u0399\u03A3\u03A9");
		btnPiso.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPiso.setBackground(Color.RED);
		btnPiso.setBounds(55, 571, 106, 59);
		getContentPane().add(btnPiso);
		
		JButton btnEnarksi = new JButton("\u0395\u039D\u0391\u03A1\u039E\u0397");
		btnEnarksi.setBackground(Color.RED);
		btnEnarksi.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEnarksi.setBounds(708, 571, 106, 59);
		getContentPane().add(btnEnarksi);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.activeCaption);
		textField.setBounds(316, 250, 396, 40);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.activeCaption);
		textField_1.setBounds(316, 301, 396, 40);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.activeCaption);
		textField_2.setBounds(316, 352, 396, 43);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.activeCaption);
		textField_3.setBounds(316, 406, 396, 40);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Screen2.class.getResource("/images/\u039F\u03B8\u03CC\u03BD\u03B7\u039F\u03BD\u03BF\u03BC\u03AC\u03C4\u03C9\u03BD.png")));
		lblNewLabel.setBounds(0, 0, 859, 691);
		getContentPane().add(lblNewLabel);
		
		this.setVisible(true);   //κάνει το παράθυρο ορατό στην οθόνη
		this.setSize(875,730);  //διαστάσεις
		this.setTitle("My first Frame!"); //ονομασία
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}