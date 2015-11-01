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
	private ArrayList<Ayam> ayams;
	private int size;

	/**
	 * Constructor kandang ayam
	 */ 
	public KandangAyam() {
		ayams = new ArrayList<Ayam>();
		size = 5;
	}

	public ArrayList<Ayam> getayams() {
		return ayams;
	}
	
	public Ayam getAyam(int index)	{
		return ayams.get(index);
	}

	public int getSize() {
		return size;
	}

	public void setAyams(ArrayList<Ayam> ayams) {
		this.ayams = ayams;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * Method ini digunakan untuk mencari ayam tertentu didalam kandang ayam
	 * @param namaAyam nama ayam yang dicari
	 * @return ayam yang dicari
	 */
	public Ayam findAyam(String namaAyam) {
		for (int i = 0; i < ayams.size(); i++) {
			if (ayams.get(i).getName().equals(namaAyam))
				return ayams.get(i);
		}
		return null;
	}

	/**
	 * Method ini berfungsi untuk menambahkan ayam baru kedalam kandang ayam
	 * @param namaAyam nama ayam baru yang dimasukkan ke kandang
	 */
	public void addAyam(String namaAyam) {
		if(size > ayams.size()) {
			Ayam ayamBaru = new Ayam(namaAyam);
			ayams.add(ayamBaru);
		}
	}

	/**
	 * Method ini berfungsi untuk menghapus ayam dari kandang ayam
	 * @param namaAyam nama ayam yang ingin dihapus
	 * @return jenis ayam yang dihapus, true jika Ayam emas
	 */
	public boolean removeAyam(String namaAyam) {
		boolean statusAyam = false;
		for (int i = 0; i < ayams.size(); i++) {
			if (ayams.get(i).getName().equals(namaAyam))	{
				statusAyam = ayams.get(i).isGoldenChicken();
				ayams.remove(i);
			}
		}
		return statusAyam;
	}
}
