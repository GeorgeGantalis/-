import java.util.ArrayList;
import java.util.Random;

public class tablo {
 private ArrayList<Koutaki> tabloPaixnidiou = new ArrayList<Koutaki>();
 private String name;	
 
 public tablo (String name)
 {
	 this.name= name;
 }
 
 public void addKoutaki(Koutaki e)
 {
	 tabloPaixnidiou.add(e);
 }
 
 public void kiriaRoi(ArrayList<Paiktis> paiktes,Karta card)
 {
	 int trexon_paiktis=0;
	 int dice,i;
	 Random rand = new Random();
	 
	 while(true)
	 {
		 for (trexon_paiktis=0; trexon_paiktis<paiktes.size(); trexon_paiktis++)
		 {
			 
			
			 
			 dice = rand.nextInt(4) + 1;
			 paiktes.get(trexon_paiktis).EnimerosiThesis(dice);
			 int trexon_thesi=paiktes.get(trexon_paiktis).getThesi();
			// int trexon_poso=paiktes.get(trexon_paiktis).getTrexon_Poso();
		
			 switch(trexon_thesi)
			 {
			 case 0:
				 System.out.println("Εφτασες στη φαβέλα");
				 
			 case 16:
				 System.out.println("Εφτασες στο Αστυνομικό τμήμα");
			 case 12: case 19: case 27:
				 i=card.Epilogi_Kartas(paiktes.get(trexon_paiktis));
				 
			default:
				//if(tabloPaixnidiou.get(trexon_thesi).getZoes_Ktiriou()>0)    // Έλεγχος, αν το κουτάκι μπορεί να λυστευτεί
				System.out.println("Λυστεύεις;");
				
				 
			 }
			 
		 }
	
			
			
	 }
	 
	 
 }
	 
	
}
	 
