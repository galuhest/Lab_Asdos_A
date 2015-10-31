package Lab06;

/**
 * Class peternak
 * @author AsdosA
 *
 */
public class Peternak {

	/**
	 * Instance variable dari class Peternak, tambahkan yang diperlukan
	 */
	private String nama;
	private int money;
	private KandangAyam kandang;
	private static final int HARGA_BELI_AYAM = 1500;
	private static final int HARGA_JUAL_AYAM_BIASA = 1500;
	private static final int HARGA_JUAL_AYAM_EMAS = 3000;

	/**
	 * Constructor peternak
	 * @param nama nama peternak
	 * @param money jumlah uang yang dimiliki peternak
	 */
	public Peternak(String nama, int money) {
		this.nama = nama;
		this.money = money;
		kandang = new KandangAyam();
	}
	
	/**
	 * Setter dan Getter
	 * @return
	 */
	public KandangAyam getKandang() {
		return kandang;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setKandang(KandangAyam kandang) {
		this.kandang = kandang;
	}

	public String getNama() {
		return nama;
	}

	public int getMoney() {
		return money;
	}

	public int getHARGA_AYAM() {
		return HARGA_BELI_AYAM;
	}

	/**
	 * Method ini berfungsi untuk membeli ayam baru
	 * @param namaAyam nama ayam yang baru dibeli
	 * @return uang sekarang
	 */
	public int buyChicken(String namaAyam) {
		setMoney(getMoney() - HARGA_BELI_AYAM);
		kandang.addChicken(namaAyam);
		return getMoney();
	}

	/**
	 * Method ini berfungsi untuk menjual ayam, harga tergantung jenis ayam
	 * @param namaAyam nama ayam yang ingin dijual.
	 * @return uang sekarang
	 */
	public int sellChicken(String namaAyam) {
		if (kandang.removeChicken(namaAyam))
			setMoney(getMoney() - HARGA_JUAL_AYAM_EMAS);

		else
			setMoney(getMoney() - HARGA_JUAL_AYAM_BIASA);

		return getMoney();
	}

	/**
	 * Method ini membuat peternak mengangkat ayam
	 * @param namaAyam nama ayam yang diangkat
	 */
	public void pickUpChicken(String namaAyam) {
		Ayam ayam = kandang.findChicken(namaAyam);
		ayam.pickUp();
	}
	
	/**
	 * Method ini membuat peternak menendang ayam
	 * @param namaAyam nama ayam yang ditendang
	 */
	public void kickChicken(String namaAyam)	{
		Ayam ayam = kandang.findChicken(namaAyam);
		ayam.kick();
	}
	
	public void upgradeKandang() {
		int upgradeSize = kandang.size() * 2;
		if(upgradeSize > 0) {
			kandang.setKandang(upgradeSize);
		}
	}
	
}