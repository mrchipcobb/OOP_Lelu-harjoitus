
class Kuvakirja extends Lelu{
	
	int sivumaara;
	
	public Kuvakirja()
	{
		nimi = "";
		paino = 0;
		sivumaara = 0;
	}
	
	public Kuvakirja(String nimi, int paino, int sivumaara)
	{
		this.nimi = nimi;
		this.paino = paino;
		this.sivumaara = sivumaara;
	}
	
	public void muutaPaino(int paino)
	{
		this.paino = paino;
	}
	@Override
	public void printData()
	{
		super.printData();
		System.out.println("Sivumäärä: " + sivumaara);
	}

}
