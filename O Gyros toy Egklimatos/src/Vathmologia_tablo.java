import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class Vathmologia_tablo extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public Vathmologia_tablo(tablo t,int i) {                                               //An to i einai 1 emfanise tin teliki vathmologia ,alliws prosorini
		setTitle("\u0392\u0391\u0398\u039C\u039F\u039B\u039F\u0393\u0399\u0391");
		getContentPane().setLayout(null);
		
		if(i==1){
			boolean tie=false;
			int winners;
			 int first=0;
			 int second=1;
			 int third=2;
			 int fourth=3;

			if(t.getPaiktes().get(0).PaiktisIsDead() && t.getPaiktes().get(2).PaiktisIsDead()){          //kerdizoyn oi astinomoi
				winners=1;
				if(t.getPaiktes().get(1).getPoso()>t.getPaiktes().get(3).getPoso()){
					 first=1;
					 second=3;
					 third=0;
					 fourth=2;
				}
				else if (t.getPaiktes().get(1).getPoso()<t.getPaiktes().get(3).getPoso())
				{
					 first=3;
					 second=1;
					 third=0;
					 fourth=2;
				}
				else 
					tie=true;
			}
			else 
			{
				winners=0;
				if(t.getPaiktes().get(0).getPoso()>t.getPaiktes().get(2).getPoso()){
					 first=0;
					 second=2;
					 third=1;
					 fourth=3;
				}
				else if (t.getPaiktes().get(0).getPoso()<t.getPaiktes().get(2).getPoso())
				{
					 first=2;
					 second=0;
					 third=1;
					 fourth=3;
				}
				else 
					tie=true;
			}
			String poso0=Double.toString(t.getPaiktes().get(first).getPoso());
			String zoes0=Integer.toString(t.getPaiktes().get(first).getZoes());
			String poso1=Double.toString(t.getPaiktes().get(second).getPoso());
			String zoes1=Integer.toString(t.getPaiktes().get(second).getZoes());
			String poso2=Double.toString(t.getPaiktes().get(third).getPoso());
			String zoes2=Integer.toString(t.getPaiktes().get(third).getZoes());
			String poso3=Double.toString(t.getPaiktes().get(fourth).getPoso());
			String zoes3=Integer.toString(t.getPaiktes().get(fourth).getZoes());
			
			textField = new JTextField(t.getPaiktes().get(first).getName()+"   "+poso0+"$         "+"����:"+zoes0);                  
			textField.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
			textField.setBounds(87, 56, 306, 33);
			getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField(t.getPaiktes().get(second).getName()+"   "+poso1+"$         "+"����:"+zoes1);
			textField_1.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
			textField_1.setColumns(10);
			textField_1.setBounds(87, 94, 306, 33);
			getContentPane().add(textField_1);
			
			textField_3 = new JTextField(t.getPaiktes().get(third).getName()+"   "+poso2+"$         "+"����:"+zoes2);
			textField_3.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
			textField_3.setColumns(10);
			textField_3.setBounds(87, 170, 306, 33);
			getContentPane().add(textField_3);
			
			textField_2 = new JTextField(t.getPaiktes().get(fourth).getName()+"   "+poso3+"$         "+"����:"+zoes3);
			textField_2.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
			textField_2.setColumns(10);
			textField_2.setBounds(87, 132, 306, 33);
			getContentPane().add(textField_2);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
			lblNewLabel.setBounds(-12, -28, 512, 404);
			getContentPane().add(lblNewLabel);
			lblNewLabel.setIcon(new ImageIcon(Vathmologia_tablo.class.getResource("/images/\u03B2\u03B1\u03B8\u03BC\u03BF\u03BB\u03BF\u03B3\u03AF\u03B1_\u03BA\u03BF\u03C5\u03BC\u03C0\u03AF_\u03C3\u03C4\u03BF_\u03C4\u03B1\u03BC\u03C0\u03BB\u03CC.png")));
			
			if(winners==0){
				
			}
			else{
				
			}
			
			this.setVisible(true);   //����� �� �������� ����� ���� �����
			this.setSize(500,385);  //����������
			this.setTitle("����������"); //��������
			this.setLocationRelativeTo(null);
			
		}
		else{
			String poso0=Double.toString(t.getPaiktes().get(0).getPoso());
			String zoes0=Integer.toString(t.getPaiktes().get(0).getZoes());
			String poso1=Double.toString(t.getPaiktes().get(1).getPoso());
			String zoes1=Integer.toString(t.getPaiktes().get(1).getZoes());
			String poso2=Double.toString(t.getPaiktes().get(2).getPoso());
			String zoes2=Integer.toString(t.getPaiktes().get(2).getZoes());
			String poso3=Double.toString(t.getPaiktes().get(3).getPoso());
			String zoes3=Integer.toString(t.getPaiktes().get(3).getZoes());
			
			textField = new JTextField(t.getPaiktes().get(0).getName()+"   "+poso0+"$         "+"����:"+zoes0);                  
			textField.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
			textField.setBounds(87, 56, 306, 33);
			getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField(t.getPaiktes().get(2).getName()+"   "+poso2+"$         "+"����:"+zoes2);
			textField_1.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
			textField_1.setColumns(10);
			textField_1.setBounds(87, 94, 306, 33);
			getContentPane().add(textField_1);
			
			textField_3 = new JTextField(t.getPaiktes().get(1).getName()+"   "+poso1+"$         "+"����:"+zoes1);
			textField_3.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
			textField_3.setColumns(10);
			textField_3.setBounds(87, 170, 306, 33);
			getContentPane().add(textField_3);
			
			textField_2 = new JTextField(t.getPaiktes().get(3).getName()+"   "+poso3+"$         "+"����:"+zoes3);
			textField_2.setFont(new Font("Sitka Heading", Font.PLAIN, 15));
			textField_2.setColumns(10);
			textField_2.setBounds(87, 132, 306, 33);
			getContentPane().add(textField_2);
			
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
			lblNewLabel.setBounds(-12, -28, 512, 404);
			getContentPane().add(lblNewLabel);
			lblNewLabel.setIcon(new ImageIcon(Vathmologia_tablo.class.getResource("/images/\u03B2\u03B1\u03B8\u03BC\u03BF\u03BB\u03BF\u03B3\u03AF\u03B1_\u03BA\u03BF\u03C5\u03BC\u03C0\u03AF_\u03C3\u03C4\u03BF_\u03C4\u03B1\u03BC\u03C0\u03BB\u03CC.png")));
			this.setVisible(true);   //����� �� �������� ����� ���� �����
			this.setSize(500,385);  //����������
			this.setTitle("����������"); //��������
			this.setLocationRelativeTo(null);
		}
		
		
	}
}
