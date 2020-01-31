import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Kupac k = new Kupac();
		int opcija;
		
		k.kolikoImasPara();
		k.opcije();
		do {
		
		System.out.print("Unesite opciju: ");
		opcija = scanner.nextInt();
		
		switch (opcija) {
		case 0:
			k.opcije();
			break;
		case 1:
			k.kupiHleb();
			break;
		case 2:
			k.kupiMleko();
			break;
		case 3:
			k.kupiKafa();
			break;
		case 4:
			k.dajRacun();
			break;
		case 5:
			System.out.println("Zavrsili ste kupovinu.\n");
			k.dajRacun();
			return;
			
		default:
			System.out.println("Nepostojeca opcija. Probajte ponovo.");
			break;
		}
		
		} while (k.kraj() == false);
		
	}

}
