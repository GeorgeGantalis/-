
public class Paiktis {

private String name;
private int thesi;
private int zoes;
private int poso;


public Paiktis(String name,int thesi,int poso,int zoes)
{
	this.name=name;
	this.thesi=thesi;
	this.poso=poso;
	this.zoes=zoes;
}


public String getName() {
	return name;
}


public int getThesi() {
	return thesi;
}


public int getZoes() {
	return zoes;
}


public int getPoso() {
	return poso;
}
	
public void  DecZoes()
{
	zoes= zoes-1;
}

public void IncPoso(int p)
{
	poso=poso + p;
}

public void EnimerosiThesis(int zari)
{
  thesi=(thesi+zari) % 32;	
}

}