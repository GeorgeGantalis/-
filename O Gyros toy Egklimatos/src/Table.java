import javax.swing.JFrame;
import  sun.audio.*;    //import the sun.audio package
import  java.io.*;
import javax.swing.JButton;

import java.awt.BasicStroke;
import java.awt.BorderLayout;

import javax.jws.soap.SOAPBinding.Style;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

public class Table extends JFrame{
	private Pawn pawn;             // Περιέχει την εικόνα του ταμπλό και το πιόνι
	private tablo t;
	private int num_svisimo=0;
	private int last_player=5;
	ArrayList<Integer> pointx=new ArrayList<Integer>();                  //Oi listes xrisimopoiounte gia ta svismena ktiria
	ArrayList<Integer> pointy=new ArrayList<Integer>();
	ArrayList<Integer> pleura=new ArrayList<Integer>();
	private Music music;
	private JTextField textField;
	private JButton buttonzari;
	private JButton buttonmenu;
	private JButton buttonbathm;
	private int number=0;        //Δείχνει τον παίκτη που έχει σειρά

	
	public Table(tablo tablPaix) {
		t=tablPaix;
		
		 music=new Music("1.wav");      //backround music
		
		
	    // getContentPane().setLayout(null);
		pawn=new Pawn();
		this.setContentPane(pawn);
		
		
		JButton buttonmenu = new JButton("\u039C\u0395\u039D\u039F\u03A5");
		buttonmenu.setForeground(Color.WHITE);
		buttonmenu.setFont(new Font("Tahoma", Font.BOLD, 17));
		buttonmenu.setBackground(Color.RED);
		buttonmenu.setBounds(10, 11, 98, 43);
		getContentPane().add(buttonmenu);
		buttonmenu.setActionCommand("MENU");
		
		JButton buttonzari = new JButton("\u03A1\u0399\u039E\u0395");
		buttonzari.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonzari.setBackground(Color.GREEN);
		buttonzari.setBounds(226, 280, 89, 23);
		getContentPane().add(buttonzari);
		buttonzari.setActionCommand("ZARI");
		
		JButton buttonbathm = new JButton("\u0392\u0391\u0398\u039C\u039F\u039B\u039F\u0393\u0399\u0391");
		buttonbathm.setForeground(Color.WHITE);
		buttonbathm.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonbathm.setBackground(Color.RED);
		buttonbathm.setBounds(711, 637, 138, 43);
		getContentPane().add(buttonbathm);
		buttonbathm.setActionCommand("BATHMOLOGIA");
		
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBackground(new Color(128, 0, 0));
		textField.setBounds(305, 320, 42, 32);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
		ButtonListener listener = new ButtonListener();
		buttonmenu.addActionListener(listener);
		buttonzari.addActionListener(listener);
		buttonbathm.addActionListener(listener);
		
		
		this.setVisible(true);   //κάνει το παράθυρο ορατό στην οθόνη
		this.setSize(875,730);  //διαστάσεις
		this.setTitle("Ο γύρος του εγκλήματος"); //ονομασία
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		
	}
	
	public void Listia(int trexonKtirio){
		if(t.getTabloPaixnidiou().get(trexonKtirio) instanceof Stratopedo){
			 int f = JOptionPane.showConfirmDialog(
	                 null,
	                 "Ληστεύεις?",
	                 "Ερώτηση",
	                 JOptionPane.YES_NO_OPTION);// το yes αντιστοιχει στο 0,το no στπο 1
             if(f==0){
            	 t.getTabloPaixnidiou().get(trexonKtirio).epilogi_1or2or3(t.getPaiktes().get(number));
             }
		}
		if(t.getTabloPaixnidiou().get(trexonKtirio) instanceof Ktirio)
	      {
		     if(t.getTabloPaixnidiou().get(trexonKtirio).getZoes_ktiriou() != 0 && t.getPaiktes().get(number).getArithmos_listiwn()<3 )
	          {//δεν εχει  γινει η περίπτoωση τράπεζας
		    	
		    /*	 JFrame pan=new JFrame();
				 pan.setUndecorated(true);
				 pan.setResizable(false);
				 pan.setBounds(475,230, 400, 320);
				 pan.setVisible(true);
				

				 JButton btnNewButton = new JButton("\u039D\u0391\u0399");
				btnNewButton.setForeground(Color.RED);
				btnNewButton.setBackground(Color.LIGHT_GRAY);
				btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 49));
				btnNewButton.setActionCommand("NAI");
				
				
				JButton button = new JButton("\u039F\u03A7\u0399");
				button.setForeground(Color.RED);
				button.setFont(new Font("Tahoma", Font.PLAIN, 59));
				button.setBackground(Color.LIGHT_GRAY);
				button.setBounds(217, 152, 135, 99);
				button.setActionCommand("NO");
				pan.getContentPane().add(button);
				btnNewButton.setBounds(35, 152, 135, 99);
				pan.getContentPane().add(btnNewButton);
				
				 JLabel lblNewLabel = new JLabel("New label");
				 lblNewLabel.setIcon(new ImageIcon(Table.class.getResource("/images/\u039B\u03B7\u03C3\u03C4\u03B5\u03CD\u03B5\u03B9\u03C2;;;;.png")));
				 lblNewLabel.setBounds(400, 320, 500, 335);
				 pan.getContentPane().add(lblNewLabel);
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(e.getActionCommand().equals("NAI")){
					 		pan.setVisible(false);
					 		pan.dispose();
					 		 
						}
								
						
					}
					
				});
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(e.getActionCommand().equals("NO")){
							pan.setVisible(false);
					 		pan.dispose();	 
						}
								
						
					}
					
				});   */
		    	 
				
		 		
		    	 
		 		
		 			
		 		
		
		 
		 		 
		         int n = JOptionPane.showConfirmDialog(
		                 null,
		                 "Ληστεύεις?",
		                 "Ερώτηση",
		                 JOptionPane.YES_NO_OPTION);// το yes αντιστοιχει στο 0,το no στπο 1
                 if(n==0)
                  {
          	       t.getTabloPaixnidiou().get(trexonKtirio).DecZoes();
          	       int posoListias =  t.getTabloPaixnidiou().get(trexonKtirio).getPoso();
          	       t.getPaiktes().get(number).IncTrexonPoso(t.getTabloPaixnidiou().get(trexonKtirio).getPoso());
          	       t.getPaiktes().get(number).IncArithmosListeiwn();
          	       t.getPaiktes().get(number).setAnamoni(t.getTabloPaixnidiou().get(trexonKtirio).getXronos_anamonis());
          	       if(t.getTabloPaixnidiou().get(trexonKtirio).getZoes_ktiriou()==0){
          	    	 num_svisimo++;
          	    	 if(num_svisimo==24)
          	    		 last_player=number;
      				if(t.getPaiktes().get(number).getThesi()<7){
      					pleura.add(1);
      					pointx.add(t.getPaiktes().get(number).getX()-number);
          				pointy.add(t.getPaiktes().get(number).getY()-number);
      				}
      				else if(t.getPaiktes().get(number).getThesi()<16){
      					pleura.add(2);
      					pointx.add(t.getPaiktes().get(number).getX()-number);
          				pointy.add(t.getPaiktes().get(number).getY()-number);
      				}
      				else if(t.getPaiktes().get(number).getThesi()<23){
      					pleura.add(3);
      					pointx.add(t.getPaiktes().get(number).getX()-number);
          				pointy.add(t.getPaiktes().get(number).getY()-number);
      				}
      				else
      				{	
      					pleura.add(4);
      					pointx.add(t.getPaiktes().get(number).getX()-number);
          				pointy.add(t.getPaiktes().get(number).getY()-number);
      				}
      					
          	       }
     				
                  }  
	       }
		     

	   }
	}
	
	

	
	
	
	class Pawn extends JLabel{
		
		public void paint(Graphics g){
			JLabel lblNewLabel = new JLabel("New label"); 																//eikona tou tablo
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setIcon(new ImageIcon(Table.class.getResource("/images/\u03A4\u03B1\u03BC\u03C0\u03BB\u03CC.jpg")));
			lblNewLabel.setBounds(0, 0, 867, 694);
			getContentPane().add(lblNewLabel);
			
			Graphics2D g2=(Graphics2D) g;
		
			super.paint(g);
			Font myFont = new Font("Serif", Font.BOLD, 17);                                                 //Ta pionia twn paiktwn
			g.setFont(myFont);
			if (!t.getPaiktes().get(0).PaiktisIsDead()){
				g.setColor(Color.RED);
				g.fillOval(t.getPaiktes().get(0).getX(),t.getPaiktes().get(0).getY(), 30, 30);
				g.setColor(Color.BLACK);
				if(t.getPaiktes().get(0).getTrexon_poso()>0)
					g.setColor(Color.YELLOW);
				g.drawOval(t.getPaiktes().get(0).getX(),t.getPaiktes().get(0).getY(), 30, 30);
				g.drawString("1",t.getPaiktes().get(0).getX()+12, t.getPaiktes().get(0).getY()+20);
			}
			if(!t.getPaiktes().get(1).PaiktisIsDead()){
				g.setColor(Color.BLUE);
				g.fillOval(t.getPaiktes().get(1).getX(), t.getPaiktes().get(1).getY(), 30, 30);
				g.setColor(Color.BLACK);
				g.drawOval(t.getPaiktes().get(1).getX(), t.getPaiktes().get(1).getY(), 30, 30);
				g.drawString("1",t.getPaiktes().get(1).getX()+12, t.getPaiktes().get(1).getY()+20);
			}
			if(!t.getPaiktes().get(2).PaiktisIsDead()){
				g.setColor(Color.RED);
				g.fillOval(t.getPaiktes().get(2).getX(), t.getPaiktes().get(2).getY(), 30, 30);
				g.setColor(Color.BLACK);
				if(t.getPaiktes().get(2).getTrexon_poso()>0)
					g.setColor(Color.YELLOW);
				g.drawOval(t.getPaiktes().get(2).getX(), t.getPaiktes().get(2).getY(), 30, 30);
				g.drawString("2",t.getPaiktes().get(2).getX()+12, t.getPaiktes().get(2).getY()+20);
			}
			if(!t.getPaiktes().get(3).PaiktisIsDead()){
				g.setColor(Color.BLUE);
				g.fillOval(t.getPaiktes().get(3).getX(), t.getPaiktes().get(3).getY(), 30, 30);
				g.setColor(Color.BLACK);
				g.drawOval(t.getPaiktes().get(3).getX(), t.getPaiktes().get(3).getY(), 30, 30);
				g.drawString("2",t.getPaiktes().get(3).getX()+12, t.getPaiktes().get(3).getY()+20); 
				
			}
			
			
			
			for (int i=0; i<num_svisimo; i++){
				g2.setStroke(new BasicStroke(2));
				Color color=new Color(1,0,0,0.50f);
				g2.setColor(color);
				if(pleura.get(i)==1)
					g2.drawLine(pointx.get(i)+41,pointy.get(i),pointx.get(i)+41,pointy.get(i)+40);
				else if(pleura.get(i)==2)
					g2.drawLine(pointx.get(i),pointy.get(i)+42,pointx.get(i)+40,pointy.get(i)+42);
				else if(pleura.get(i)==3)
					g2.drawLine(pointx.get(i)-2,pointy.get(i),pointx.get(i)-2,pointy.get(i)+40);
				else
					g2.drawLine(pointx.get(i),pointy.get(i)-5,pointx.get(i)+40,pointy.get(i)-5);
				
			}
		}
	
		
		
		public void setXYCoordinates(int dice,int number) {		//Ενημερώνει τις συντεταγμένες x και y
			int Corner1=7;        //  ΟΙ ΓΩΝΙΕΣ ΤΟΥ ΠΑΙΧΝΙΔΙΟΥ
			int Corner2=16;
			int Corner3=23;
			int Corner4=32;
			int newx=0,newy=0;
			
			newx=t.getPaiktes().get(number).getX();
			newy=t.getPaiktes().get(number).getY();
			
			
			if(t.getPaiktes().get(number).getThesi()<Corner1) {
				if(dice<=Corner1-t.getPaiktes().get(number).getThesi()) {
					newx=newx;
					newy=newy-(dice*60);
				}
				else {
					int moveY=Corner1-t.getPaiktes().get(number).getThesi();
					int moveX=dice-moveY;
					newy=newy-(moveY*60);
					newx=newx+(moveX*65);
				}
			}
			else if(t.getPaiktes().get(number).getThesi()<Corner2)
			{
				if (dice<=Corner2-t.getPaiktes().get(number).getThesi()) {
					newy=newy;
					newx=newx+(dice*65);
				}
				else {
					int moveX=Corner2-t.getPaiktes().get(number).getThesi();
					int moveY=dice-moveX;
					newy=newy+(moveY*60);
					newx=newx+(moveX*65);
						
				}
			}
			else if(t.getPaiktes().get(number).getThesi()<Corner3) {
					
					if (dice<=Corner3-t.getPaiktes().get(number).getThesi()) {
						newy=newy+(dice*60);
						newx=newx;
					}
					else {
						int moveY=Corner3-t.getPaiktes().get(number).getThesi();
						int moveX=dice-moveY;
						newy=newy+(moveY*60);
						newx=newx-(moveX*65);
							
					}
					
			}
			else {
				if (dice<=Corner4-t.getPaiktes().get(number).getThesi()){
					newy=newy;
					newx=newx-(dice*65);
				}
				else {
					int moveX=Corner4-t.getPaiktes().get(number).getThesi();
					int moveY=dice-moveX;
					newy=newy-(moveY*60);
					newx=newx-(moveX*65);
				}
			}
				
			t.getPaiktes().get(number).EnimerosiXY(newx ,newy);
				
				
			
		
		}
		
		public void setXY_dromaki(int dice,int number)                         //O paiktis proxwraei mesa sto dromaki
		{
			if(t.getPaiktes().get(number).getThesi()==33)
				t.getPaiktes().get(number).EnimerosiXY(526,216);
			else if (t.getPaiktes().get(number).getThesi()==34)
				t.getPaiktes().get(number).EnimerosiXY(586,308);
			else if(t.getPaiktes().get(number).getThesi()==35)
				t.getPaiktes().get(number).EnimerosiXY(619,395);
			else if (t.getPaiktes().get(number).getThesi()==36)
				t.getPaiktes().get(number).EnimerosiXY(583,475);
			else if (t.getPaiktes().get(number).getThesi()==37)
			{
				t.getPaiktes().get(number).EnimerosiThesis(20);             //phgainei ton paikti stin thesi 25 
				if (number==1)
					t.getPaiktes().get(number).EnimerosiXY(570,545);
				else
					t.getPaiktes().get(number).EnimerosiXY(572,547);
				
			}
			else if(t.getPaiktes().get(number).getThesi()==39)
			{
				t.getPaiktes().get(number).EnimerosiXY(614,234);
			}
			else if(t.getPaiktes().get(number).getThesi()==40)
			{
				t.getPaiktes().get(number).EnimerosiXY(484,323);
			}
			else if(t.getPaiktes().get(number).getThesi()==41)
			{
				t.getPaiktes().get(number).EnimerosiXY(487,447);
			}
			else if(t.getPaiktes().get(number).getThesi()==42)
			{
				t.getPaiktes().get(number).EnimerosiThesis(16);            //phgainei ton paikti stin thesi 26 
				
				if (number==0)
					t.getPaiktes().get(number).EnimerosiXY(505,548);
				else
					t.getPaiktes().get(number).EnimerosiXY(507,550);
			}
			
			
		}
	}
	
	
	
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			ButtonListener so =new ButtonListener();
			if(e.getActionCommand().equals("BATHMOLOGIA")){
				Vathmologia_tablo vathm =new Vathmologia_tablo(t,0);
			}
		
			if(e.getActionCommand().equals("ZARI"))
			{
				
				 Random rand = new Random();
				 int dice = rand.nextInt(5) + 1;
				 
				 
				 textField.setText(""+dice); 
				
				
				 
				 for (int i=1; i<=dice; i++)                                                      //Proxorame ton paikti mia mia tis theseis
				 {
					
					 if (t.getPaiktes().get(number) instanceof Astinomikos){
						 if(t.getPaiktes().get(number).getThesi()==15 && dice>=i  && i==1)       // An einai  stin thesi 15 prin riksei to zari
						 {
							 
							 int d = JOptionPane.showConfirmDialog(
							            null,
							            "Θέλεις να ακολουθήσεις το δρωμάκι;",
							            "",
							            JOptionPane.YES_NO_OPTION);
							 if(d==JOptionPane.YES_OPTION){
								 t.getPaiktes().get(number).DromakiAstinomou();
								 i=1;
							 }
						 }
						 if(t.getPaiktes().get(number).getThesi()>=32)						//Gia oso vriskete sto dromaki
						 {
							t.getPaiktes().get(number).EnimerosiThesiDromaki(1);
							pawn.setXY_dromaki(1,number);
							pawn.repaint();
						 }
						 else{
						
							
							
							 pawn.setXYCoordinates(1,number);
							 pawn.repaint();
							 t.getPaiktes().get(number).EnimerosiThesis(1);
							
						 }
						 if(t.getPaiktes().get(number).getThesi()==15 && dice>i )
						 {
							 
							 int d = JOptionPane.showConfirmDialog(
							            null,
							            "Θέλεις να ακολουθήσεις το δρωμάκι;",
							            "",
							            JOptionPane.YES_NO_OPTION);
							 if(d==JOptionPane.YES_OPTION){
								 t.getPaiktes().get(number).DromakiAstinomou();
							 }
						 }
						 
					 }
					 else
					 {
						 if (t.getPaiktes().get(number).getThesi()==17 && dice>=i  && i==1)
						 {	
							 
							 int d = JOptionPane.showConfirmDialog(
							            null,
							            "Θέλεις να ακολουθήσεις το δρωμάκι;"
							            + "Θυμήσου οτι θα χάσεις το 30% του ποσού που κουβαλάς",
							            "",
							            JOptionPane.YES_NO_OPTION);
							 if(d==JOptionPane.YES_OPTION){
								 t.getPaiktes().get(number).DromakiKlefti();
								 t.getPaiktes().get(number).DromakiMiosi();
								 i=1;
								 
							 }
						 }
						 if(t.getPaiktes().get(number).getThesi()>=38)
						 {
							
							t.getPaiktes().get(number).EnimerosiThesiDromaki(1);
							pawn.setXY_dromaki(1,number);
							pawn.repaint();
						 }
						 else{
						
							 pawn.setXYCoordinates(1,number);
							 pawn.repaint(); 
							 t.getPaiktes().get(number).EnimerosiThesis(1);
						 }
						
						 if(t.getPaiktes().get(number).getThesi()==17 && dice>i )		 
						 {
							 int d = JOptionPane.showConfirmDialog(
							            null,
							            "Θέλεις να ακολουθήσεις το δρωμάκι;"
							            + "Θυμήσου οτι θα χάσεις το 30% του ποσού που κουβαλάς",
							            "",
							            JOptionPane.YES_NO_OPTION);
							 if(d==JOptionPane.YES_OPTION){                                      //o kleftis epilegei to dromaki
								 t.getPaiktes().get(number).DromakiKlefti();	
								 t.getPaiktes().get(number).DromakiMiosi();
							 }
							
						 }
						
						 if(t.getPaiktes().get(number).getThesi()==0)                   // O kleftis pernaei apo tin favela
						 {
							 t.getPaiktes().get(number).PerasmaFavela();
							 JPanel panel= new JPanel();
							 JOptionPane.showMessageDialog(panel,"Έφτασες στην φαβέλα! Διασφαλίζεις τα χρήματα σου");
						 }
					 }
					 
					
				 }
				// o paiktis vriskete sti nea toy thesi
				
 
				 if(t.getPaiktes().get(number) instanceof Astinomikos) {
					 if(t.getPaiktes().get(number).getThesi()==0){                    //O batsos peftei stin favela
						 t.getPaiktes().get(number).DecZoes();
						 music.IxitikoEffe("machineguns.wav");
						 JFrame pan=new JFrame();
						 pan.setUndecorated(true);
						 pan.setResizable(false);
						 pan.setBounds(475,230, 400, 320);
						 pan.setVisible(true);
						 
						 JLabel lblNewLabel = new JLabel("New label");
						 
					     lblNewLabel.setIcon(new ImageIcon(Table.class.getResource("/images/\u03AD\u03C0\u03B5\u03C3\u03B5\u03C2 \u03C3\u03C4\u03B7\u03BD \u03C6\u03B1\u03B2\u03AD\u03BB\u03B1.png")));
						 lblNewLabel.setBounds(0, 0, 401, 282);
						 pan.getContentPane().add(lblNewLabel);
						 pan.addMouseListener(new MouseAdapter() {
						     @Override
						     public void mousePressed(MouseEvent e) {
						        pan.setVisible(false);
						        pan.dispose();
						     }
						  });
						

					 }
					 else if(t.getPaiktes().get(number).getThesi()==t.getPaiktes().get(0).getThesi() && t.getPaiktes().get(number).getThesi()==t.getPaiktes().get(2).getThesi() && t.getPaiktes().get(0).getTrexon_poso()>0 && t.getPaiktes().get(2).getTrexon_poso()>0 ) //An o batsos piasei kai tous 2 kleftes me posa
					 {
						 music.IxitikoEffe("Woop woop.wav");
						 if(number==1)
							 t.getPaiktes().get(number).EnimerosiXY(700,130);    // stelnoyme ton batso kai tous 2 kleftes sto AT
						 else 
							 t.getPaiktes().get(number).EnimerosiXY(702,132);
						 t.getPaiktes().get(0).EnimerosiXY(698, 128);
						 t.AstinomosPianeiKlefti(t.getPaiktes().get(number), t.getPaiktes().get(0));
						 t.getPaiktes().get(2).EnimerosiXY(700,130);
						 t.AstinomosPianeiKlefti(t.getPaiktes().get(number), t.getPaiktes().get(2));
					 }
					 else if (t.getPaiktes().get(number).getThesi()==t.getPaiktes().get(0).getThesi() && t.getPaiktes().get(0).getTrexon_poso()>0) 	//An o batsos piasei ton klefti 1
					 {
						 music.IxitikoEffe("Woop woop.wav");
						 if(number==1)
							 t.getPaiktes().get(number).EnimerosiXY(700,130);    // stelnoyme ton batso kai ton klefti pou piastike sto AT
						 else 
							 t.getPaiktes().get(number).EnimerosiXY(702,132);
						 t.getPaiktes().get(0).EnimerosiXY(698, 128);
						 t.AstinomosPianeiKlefti(t.getPaiktes().get(number), t.getPaiktes().get(0));
					 }
					 else if (t.getPaiktes().get(number).getThesi()==t.getPaiktes().get(2).getThesi())                   //An o batsos piasei ton klefti 2
					 {
						 music.IxitikoEffe("Woop woop.wav");
						 if(number==1)
							 t.getPaiktes().get(number).EnimerosiXY(700,130);    // stelnoyme ton batso kai ton klefti pou piastike sto AT
						 else 
							 t.getPaiktes().get(number).EnimerosiXY(702,132);
						 t.getPaiktes().get(2).EnimerosiXY(700,130);
						 t.AstinomosPianeiKlefti(t.getPaiktes().get(number), t.getPaiktes().get(2));
						
					 }
				 }
				 
				 if(t.getPaiktes().get(number) instanceof Kleftis && t.getPaiktes().get(number).getThesi()<32 && t.getPaiktes().get(number).getThesi()!=t.getPaiktes().get(1).getThesi() && t.getPaiktes().get(number).getThesi()!=t.getPaiktes().get(3).getThesi()){
					 Listia(t.getPaiktes().get(number).getThesi());
				 }

				 
				 if(t.getPaiktes().get(number) instanceof Kleftis){
					 if(t.getPaiktes().get(number).getTrexon_poso()>0)             //An kouvalaei trexon poso
					 {
						 if(t.getPaiktes().get(number).getThesi()==t.getPaiktes().get(1).getThesi())   //an pesei ston batso1
						 {
							 music.IxitikoEffe("Woop woop.wav");
							 if(number==1)
								 t.getPaiktes().get(number).EnimerosiXY(698,128);    // stelnoyme ton batso kai ton klefti pou piastike sto AT
							 else 
								 t.getPaiktes().get(number).EnimerosiXY(700,130);
							 t.getPaiktes().get(1).EnimerosiXY(700,130);
							 t.AstinomosPianeiKlefti(t.getPaiktes().get(1), t.getPaiktes().get(number));
						 }
						 else if(t.getPaiktes().get(number).getThesi()==t.getPaiktes().get(3).getThesi())      //an pesei ston batso2
						 {
							 music.IxitikoEffe("Woop woop.wav");
							 if(number==1)
								 t.getPaiktes().get(number).EnimerosiXY(698,128);    // stelnoyme ton batso kai ton klefti pou piastike sto AT
							 else 
								 t.getPaiktes().get(number).EnimerosiXY(700,130);
							 t.getPaiktes().get(3).EnimerosiXY(702,132);
							 t.AstinomosPianeiKlefti(t.getPaiktes().get(3), t.getPaiktes().get(number));
						 }
					 }
					 else
					 {
						 if(t.getPaiktes().get(number).getThesi()==t.getPaiktes().get(1).getThesi())   
						 {
							 t.getPaiktes().get(1).DecZoes();
							 t.getPaiktes().get(1).PigeneAT();
							 t.getPaiktes().get(1).setAnamoni(1);
							 t.getPaiktes().get(1).EnimerosiXY(700,130); 
						 }
						 else if(t.getPaiktes().get(number).getThesi()==t.getPaiktes().get(3).getThesi())   
						 {
							 t.getPaiktes().get(3).DecZoes();
							 t.getPaiktes().get(3).PigeneAT();
							 t.getPaiktes().get(3).setAnamoni(1);
							 t.getPaiktes().get(3).EnimerosiXY(700,130); 
						 } 
					 }
				 }
				 
			
				 				 
				 
				 
				 
				 pawn.repaint();
				 number=((number+1)%4);
				 
				 int test=num_svisimo;
				 if(num_svisimo==24&& t.getPaiktes().get(last_player).getTrexon_poso()==0) {
					 	 test=num_svisimo+1;																		//an exoune listeytei ola ta ktiria kai o paiktis pou to listepse xasei to trexon poso tou 
				 }
					
				 if(t.TelosPaixnidiou(test))                                 //teleiwnei to paixnidi
				 {
					 Vathmologia_tablo vathm = new Vathmologia_tablo(t,0);
				 }


				 if(t.getPaiktes().get(number).getAnamoni()>0){
					
					 JPanel panel= new JPanel();
					 JOptionPane.showMessageDialog(panel,"Ο "+t.getPaiktes().get(number).getName()+" χάνει την σειρά του");             //Xaneis tin seira soy
					 t.getPaiktes().get(number).DecAnamoni(); 
					 number=((number+1)%4);
				 }
				 if(t.getPaiktes().get(number).getAnamoni()>0){
					 
					 JPanel panel= new JPanel();
					 JOptionPane.showMessageDialog(panel,t.getPaiktes().get(number).getName()+"Χάνεις την σειρά σου");
					 t.getPaiktes().get(number).DecAnamoni();
					 number=((number+1)%4);
				 }
				 if(t.getPaiktes().get(number).getAnamoni()>0){
					 
					 JPanel panel= new JPanel();
					 JOptionPane.showMessageDialog(panel,t.getPaiktes().get(number).getName()+"Χάνεις την σειρά σου");
					 t.getPaiktes().get(number).DecAnamoni();
					 number=((number+1)%4);
				 }
				 if(t.getPaiktes().get(number).getAnamoni()>0){
					 
					 JPanel panel= new JPanel();
					 JOptionPane.showMessageDialog(panel,t.getPaiktes().get(number).getName()+"Χάνεις την σειρά σου");
					 t.getPaiktes().get(number).DecAnamoni();
					 number=((number+1)%4);
				 }
				 
				 
				 if(t.getPaiktes().get(number).PaiktisIsDead()){
					 number=((number+1)%4);
				 }
				 if(t.getPaiktes().get(number).PaiktisIsDead())
				 {
					 number=((number+1)%4);
				 }
				 if(t.getPaiktes().get(number).PaiktisIsDead())
				 {
					 number=((number+1)%4);
				 } 
				 
				 			 
				 
				 
			}
	
			
			
		
		}
		public void timea(){
			try {
				Thread.sleep(500);
			} catch (java.lang.InterruptedException iex) {
				System.out.println(iex);
			}
		}
		
	
	}
	public void IsDead(){                                            //emfanizei minima thanatou tou paikti
		
	}

	
	
}