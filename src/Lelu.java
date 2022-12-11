
class Lelu {
	protected String nimi;
	public int paino;
	
	public Lelu()
	{
		nimi = "";
		paino = 0;
	}
	
	public Lelu(String nimi, int paino)
	{
		this.nimi = nimi;
		this.paino = paino;
	}
	
	public void printData()
	{
		System.out.println("Lelu: " + nimi);
		System.out.println("Lelun paino: " + paino + " grammaa");
	}
}
