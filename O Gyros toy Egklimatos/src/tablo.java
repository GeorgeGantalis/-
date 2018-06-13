
import java.util.ArrayList;
import java.util.Random;

public class tablo {
 private ArrayList<Koutaki> tabloPaixnidiou = new ArrayList<Koutaki>();
 private String name;	
 private ArrayList<Paiktis> paiktes = new ArrayList<Paiktis>();
 

 
 public tablo (String name)
 {
	 this.name= name;
 }
  
 public void addKoutaki(Koutaki e)
 {
	 tabloPaixnidiou.add(e);
 }
 
 
 public void addPlayer(Paiktis p)
 {
	 paiktes.add(p);
 }
 
 
 
 public ArrayList<Koutaki> getTabloPaixnidiou() {
	return tabloPaixnidiou;
}

public String getName() {
	return name;
}

public ArrayList<Paiktis> getPaiktes() {
	return paiktes;
}

public void AstinomosPianeiKlefti(Paiktis a,Paiktis k)             
{
	k.PigeneAT();
	k.DecZoes();
	a.IncPoso(k.getTrexon_poso());
	a.PigeneAT();
	k.Midenismos_Trexon_Poso();
	k.Midenismos_Arithmos_listion();
	k.setAnamoni(1);                        // xanei enan guro
}

public boolean TelosPaixnidiou(int num){
	if(paiktes.get(0).PaiktisIsDead() && paiktes.get(2).PaiktisIsDead())
		return true;
	else if(paiktes.get(1).PaiktisIsDead() && paiktes.get(3).PaiktisIsDead())
		return true;
	else if (num==25)         //24+1
		return true;
	else 
		return false;
	
}
	 
	
}
	 
