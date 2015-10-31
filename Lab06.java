import java.util.Scanner;
import java.util.StringTokenizer;
import Lab06.*;

public class Lab06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Peternak farmer = new Peternak("Boss", 3000);
		while (input.hasNext()) {
			StringTokenizer inputSplit = new StringTokenizer(input.nextLine());
			if (inputSplit.nextToken().equalsIgnoreCase("Beli")) {
				String nama = inputSplit.nextToken();
				farmer.buyAyam(nama);
			} else if (inputSplit.nextToken().equalsIgnoreCase("Jual")) {
				String nama = inputSplit.nextToken();
				farmer.sellAyam(nama);
			} else if (inputSplit.nextToken().equalsIgnoreCase("Angkat")) {
				String nama = inputSplit.nextToken();
				farmer.pickUpAyam(nama);
			} else if (inputSplit.nextToken().equalsIgnoreCase("Upgrade")) {
				farmer.upgradeKandang();
			} else if (inputSplit.nextToken().equalsIgnoreCase("Kick")) {
				String nama = inputSplit.nextToken();
				farmer.kickAyam(nama);
			}
		}
		
		
	}
}
