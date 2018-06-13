import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class batmologia_tablo extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public batmologia_tablo() {
		setTitle("\u0392\u0391\u0398\u039C\u039F\u039B\u039F\u0393\u0399\u0391");
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		textField.setBounds(87, 56, 306, 33);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(87, 94, 306, 33);
		getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(87, 170, 306, 33);
		getContentPane().add(textField_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(87, 132, 306, 33);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel.setBounds(-12, -28, 512, 404);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(batmologia_tablo.class.getResource("/images/\u03B2\u03B1\u03B8\u03BC\u03BF\u03BB\u03BF\u03B3\u03AF\u03B1_\u03BA\u03BF\u03C5\u03BC\u03C0\u03AF_\u03C3\u03C4\u03BF_\u03C4\u03B1\u03BC\u03C0\u03BB\u03CC.png")));
	}
}
