import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class epeses_stin_favela extends JFrame{
	public epeses_stin_favela() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(epeses_stin_favela.class.getResource("/images/\u03AD\u03C0\u03B5\u03C3\u03B5\u03C2 \u03C3\u03C4\u03B7\u03BD \u03C6\u03B1\u03B2\u03AD\u03BB\u03B1.png")));
		lblNewLabel.setBounds(0, 0, 401, 282);
		getContentPane().add(lblNewLabel);
	}
	

}
