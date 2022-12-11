
class Vieteriauto extends Lelu{
	
	int nopeus;
	
	public Vieteriauto()
	{
		nimi = "";
		paino = 0;
		nopeus = 0;
	}
	
	public Vieteriauto(String nimi, int paino, int nopeus)
	{
		this.nimi = nimi;
		this.paino = paino;
		this.nopeus = nopeus;
	}
	
	public void kiihdyta()
	{
		nopeus++;
	}
	
	@Override
	public void printData()
	{
		super.printData();
		System.out.println("Nopeus: " + nopeus + " km/h");
	}
}
