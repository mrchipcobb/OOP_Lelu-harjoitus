
public class MainLelu {

	public static void main(String[] args) {
		
		Lelu lelu1 = new Lelu("nukke", 100);
		lelu1.printData();
		
		Vieteriauto vieteriauto1 = new Vieteriauto("Lotus",50,0);
		vieteriauto1.printData();
		vieteriauto1.kiihdyta();
		vieteriauto1.printData();
		
		Kuvakirja kuvakirja1 = new Kuvakirja("Nalle PUH", 200,58);
		kuvakirja1.printData();
		kuvakirja1.muutaPaino(100);
		kuvakirja1.printData();

	}

}
