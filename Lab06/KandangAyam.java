package Lab06;

import java.util.ArrayList;

/**
 * Class kandang ayam
 * @author AsdosA
 *
 */
public class KandangAyam {

	/**
	 * Instance variable dari class KandangAyam, tambahkan yang diperlukan
	 */
	private ArrayList<Ayam> chickens;
	private int size;

	/**
	 * Constructor kandang ayam
	 */ 
	public KandangAyam() {
		chickens = new ArrayList<Ayam>();
		size = 1;
	}

	public ArrayList<Ayam> getChickens() {
		return chickens;
	}

	public boolean size() {
		return size;
	}

	public void setChickens(ArrayList<Ayam> chickens) {
		this.chickens = chickens;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Method ini digunakan untuk mencari ayam tertentu didalam kandang ayam
	 * @param namaAyam nama ayam yang dicari
	 * @return ayam yang dicari
	 */
	public Ayam findChicken(String namaAyam) {
		for (int i = 0; i < chickens.size(); i++) {
			if (chickens.get(i).getName().equals(namaAyam))
				return chickens.get(i);
		}
		return null;
	}

	/**
	 * Method ini berfungsi untuk menambahkan ayam baru kedalam kandang ayam
	 * @param namaAyam nama ayam baru yang dimasukkan ke kandang
	 */
	public void addChicken(String namaAyam) {
		Ayam ayamBaru = new Ayam(namaAyam);
		chickens.add(ayamBaru);
	}

	/**
	 * Method ini berfungsi untuk menghapus ayam dari kandang ayam
	 * @param namaAyam nama ayam yang ingin dihapus
	 * @return jenis ayam yang dihapus, true jika Ayam emas
	 */
	public boolean removeChicken(String namaAyam) {
		boolean statusAyam = false;
		for (int i = 0; i < chickens.size(); i++) {
			if (chickens.get(i).getName().equals(namaAyam))	{
				statusAyam = chickens.get(i).isGoldenChicken();
				chickens.remove(i);
			}
		}
		return statusAyam;
	}
}