import java.util.Random;

public class Stratopedo extends Koutaki{

	public Stratopedo(String onoma) {
		super(onoma);
	}
	
	public void epilogi_1or2or3() {
		Random rand = new Random();
		int apotelesma = rand.nextInt(3) + 1;
		
	}

}
