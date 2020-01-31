import java.util.Scanner;

public class Kupac {
	
	Proizvodi proizvod = new Proizvodi();
	
	private double ukupnoPara;
	
	private int brojacHleba;
	private int brojacMleka;
	private int brojacKafe;
	
	Scanner scanner = new Scanner(System.in);
	
	public Kupac() {
		this.ukupnoPara = ukupnoPara;
	}
	
	protected void kolikoImasPara() {
		
		System.out.println("Koliko imate novca?");
		ukupnoPara = scanner.nextDouble();
		System.out.println("Imate " + ukupnoPara + " dinara.");
		
	}
	
	protected void kupiHleb() {
		brojacHleba = brojacHleba + 1;
		System.out.println("Kupili ste hleb.");
		ukupnoPara = ukupnoPara - proizvod.getHleb();
		System.out.println("Ostalo vam je " + ostaloPara());
	}
	
	protected void kupiMleko() {
		brojacMleka = brojacMleka + 1;
		System.out.println("Kupili ste mleko.");
		ukupnoPara = ukupnoPara - proizvod.getMleko();
		System.out.println("Ostalo vam je " + ostaloPara());
	}
	
	protected void kupiKafa() {
		brojacKafe = brojacKafe + 1;
		System.out.println("Kupili ste kafu.");
		ukupnoPara = ukupnoPara - proizvod.getKafa();
		System.out.println("Ostalo vam je " + ostaloPara());
	}

	protected double ostaloPara() {
		if (ukupnoPara < 0) {
			System.out.println("Nemate dovoljno para.");
			return 0;
		}
		else {
			return ukupnoPara;	
		}
		
	}
	
	
	protected void dajRacun() {
		double suma = 0;
		suma = (suma + (brojacHleba * proizvod.getHleb()) + (brojacMleka * proizvod.getMleko()) + (brojacKafe * proizvod.getKafa()));
		System.out.println("Vas racun iznosi: " + suma + " dinara.");
	}
	
	
	protected boolean kraj() {
		if (ukupnoPara > 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	protected void opcije() {
		System.out.println("_____________________");
		System.out.println("   Opcija 0: OPCIJE");
		System.out.println("   Opcija 1: HLEB");
		System.out.println("   Opcija 2: MLEKO");
		System.out.println("   Opcija 3: KAFA");
		System.out.println("   Opcija 4: RACUN");
		System.out.println("   Opcija 5: ZAVRSI");
		System.out.println("_____________________");
	}
	
}
