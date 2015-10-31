import java.util.Scanner;
import java.util.StringTokenizer;
import Lab06.*;

public class Lab06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String namaPeternak = input.nextLine();
		int uangAwal = Integer.parseInt(input.nextLine());
		Peternak farmer = new Peternak(namaPeternak, uangAwal);
		/**
		 * Beli [namaAyamDibeli] merupakan perintah agar Peternak membeli ayam.
		 * Beli [namaAyamDibeli] akan mengoutput
		 * Baris 1 : "[nama farmer] + membeli ayam bernama [nama ayam]"
		 * Baris 2 : "Uang [nama farmer] sekarang: [uang-sekarang] G"
		 * 
		 * 
		 * Jual [namaAyamDijual] merupakan perintah agar Peternak menjual ayam.
		 * Jual [namaAyamDijual] akan mengoutput
		 * Baris 1 : "[nama farmer] + menjual ayam bernama [nama ayam]"
		 * Baris 2 : "Uang [nama farmer] sekarang: [uang-sekarang] G"
		 * 
		 * Angkat [namaAyam] merupakan perintah agar Peternak mengangkat ayam.
		 * Angkat [namaAyam] akan mengoutput
		 * Baris 1: "Affection ayam [namaAyam] bertambah 1 :)"
		 * Jika Ayam mengalami evolusi, maka akan ada output
		 * Baris 2: "Ayam [namaAyam] berubah menjadi Ayam Emas!"
		 * 
		 * Kick [namaAyam] merupakan perintah agar Peternak menendang ayam.
		 * Kick [namaAyam] akan mengoutput
		 * Baris 1: "Affection ayam [namaAyam] berkurang 1 :("
		 * Jika Ayam mengalami devolusi, maka akan ada output 
		 * Baris 2: "Ayam [namaAyam] berubah menjadi Ayam Biasa"
		 * 
		 * Upgrade merupakan perintah agar Peternak mengupgrade kandang.
		 * Upgrade akan mengoutput
		 * Baris 1: "[nama farmer] mengupgrade kandang. Kapasitas baru : [kapasitas baru]"
		 * 
		 * Jualtelur merupakan perintah agar Peternak menjual telur. Pada perintah ini, diasumsi
		 * satu ayam hanya menghasilkan 1 telur dan semua telur tersebut dijual.
		 * Jualtelur akan mengoutput
		 * Baris 1: "[jumlahTelurTerjual] telur telah terjual"
		 * Baris 2: "Uang [namaFarmer] sekarang: [uangSekarang] G"
		 * 
		 * 
		 */
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
				if (farmer.getKandang().findAyam(nama).getAffection() - 1 == 9) {
					System.out.println("Ayam " + nama + " berubah menjadi Ayam Emas!");
				}
			} else if (inputSplit.nextToken().equalsIgnoreCase("Upgrade")) {
				farmer.upgradeKandang();
				System.out.println(farmer.getNama()
						+ " mengupgrade kandang. Kapasitas baru : "
						+ farmer.getKandang().size());
			} else if (inputSplit.nextToken().equalsIgnoreCase("Kick")) {
				String nama = inputSplit.nextToken();
				farmer.kickAyam(nama);
				System.out.println("Affection ayam " + nama + " berkurang 1 :(");
				if (farmer.getKandang().findAyam(nama).getAffection() + 1 ==5) {
					System.out.println("Ayam " + nama + " berubah menjadi Ayam Biasa");
				}
			} else if (inputSplit.nextToken().equalsIgnoreCase("Jualtelur")) {
				farmer.jualTelor();
				System.out.println(farmer.getKandang().getayams().size() + " telur telah terjual");
				System.out.println("Uang " + farmer.getNama() + " sekarang: "+ farmer.getDuit() + " G");
			}
		}
		
		
	}
}
