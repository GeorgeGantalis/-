import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class kleveis_yesORno extends JFrame{
	public kleveis_yesORno() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u039D\u0391\u0399");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 59));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton button = new JButton("\u039F\u03A7\u0399");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 59));
		button.setBackground(new Color(102, 0, 0));
		button.setBounds(217, 152, 135, 99);
		getContentPane().add(button);
		btnNewButton.setBounds(35, 152, 135, 99);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(kleveis_yesORno.class.getResource("/images/\u039B\u03B7\u03C3\u03C4\u03B5\u03CD\u03B5\u03B9\u03C2;;;;.png")));
		lblNewLabel.setBounds(0, 0, 401, 325);
		getContentPane().add(lblNewLabel);
	}
}
