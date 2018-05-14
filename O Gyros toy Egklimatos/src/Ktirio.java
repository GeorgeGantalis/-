
public class Ktirio extends Koutaki{
	
	private int poso;
	private int xronos_anamonis;
	private int Zoes_ktiriou;

	public Ktirio(String onoma, int poso, int xronos_anamonis, int zoes_ktiriou) {
		super(onoma);
		this.poso = poso;
		this.xronos_anamonis = xronos_anamonis;
		Zoes_ktiriou = zoes_ktiriou;
	}

	public int getPoso() {
		return poso;
	}

	public int getXronos_anamonis() {
		return xronos_anamonis;
	}

	public int getZoes_ktiriou() {
		return Zoes_ktiriou;
	}
	
	public boolean diarkia_anamonis_ktiriou()
	{
		if (xronos_anamonis > 0)
		{
			xronos_anamonis --;
			return false;
		}
		else return true;
	}

}
