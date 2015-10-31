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
				System.out.println(farmer.getNama() + " membeli ayam bernama "
						+ nama);
				System.out.println("Uang " + farmer.getNama() + " sekarang: "
						+ farmer.getDuit() + " G");
			} else if (inputSplit.nextToken().equalsIgnoreCase("Jual")) {
				String nama = inputSplit.nextToken();
				farmer.sellAyam(nama);
				System.out.println(farmer.getNama() + " menjual ayam bernama "
						+ nama);
				System.out.println("Uang " + farmer.getNama() + " sekarang: "
						+ farmer.getDuit() + " G");
			} else if (inputSplit.nextToken().equalsIgnoreCase("Angkat")) {
				String nama = inputSplit.nextToken();
				farmer.pickUpAyam(nama);
				System.out
						.println("Affection ayam " + nama + " bertambah 1 :)");
			} else if (inputSplit.nextToken().equalsIgnoreCase("Upgrade")) {
				farmer.upgradeKandang();
				System.out.println(farmer.getNama()
						+ " mengupgrade kandang. Kapasitas baru : "
						+ farmer.getKandang().size());
			} else if (inputSplit.nextToken().equalsIgnoreCase("Kick")) {
				String nama = inputSplit.nextToken();
				farmer.kickAyam(nama);
				System.out
						.println("Affection ayam " + nama + " berkurang 1 :(");
			}
		}
	}
}
