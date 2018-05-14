import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> kartes_klefti = new ArrayList<String>();
		ArrayList <String> kartes_astinomou=  new ArrayList<String>();
		ArrayList <Paiktis> paiktes=new ArrayList<Paiktis>();
		
		Kleftis kleftis1 = new Kleftis ("paris",0,0,4, 0, 0);
		Kleftis kleftis2 = new Kleftis ("nick",0,0,4, 0, 0);
		Astinomikos cop1 = new Astinomikos ("george",0,16,4);
		Astinomikos cop2 = new Astinomikos ("thanos",0,16,4);
		paiktes.add(kleftis1);
		paiktes.add(kleftis2);
		paiktes.add(cop1);
		paiktes.add(cop2);

		
		
		kartes_klefti.add("Κάρτα ασυλίας");
		kartes_klefti.add("Βγες από την φυλακή! Χρησιμοποίησε αυτή την κάρτα όταν σε πιάσει ο αστυνόμος");
		kartes_klefti.add("Πήγαινε στη φαβέλα");
		kartes_klefti.add("Χάνεις την σειρά");
		kartes_klefti.add("Χάνεις το 25% των χρημάτων που κουβαλάς!");
		kartes_klefti.add("");
		kartes_klefti.add("");
		kartes_klefti.add("");
		kartes_klefti.add("");
		kartes_klefti.add("");
		Karta card =new Karta("karta1",kartes_klefti,kartes_astinomou);
		
		

	}

}
