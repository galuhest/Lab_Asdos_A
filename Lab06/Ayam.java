package Lab06;

/**
 * Class Ayam
 * @author AsdosA
 *
 */
public class Ayam {
	
	/**
	 * Instance variable dari class Ayam, tambahkan yang diperlukan
	 */
	private String nama;
	private int affection;
	private boolean goldenChicken;
	public static final int HARGA_TELOR = 500;
	public static final int HARGA_TELOR_MAS = 1000;

	/**
	 * Constructor Class Ayam
	 */
	public Ayam(String nama) {
		this.nama = nama;
		this.affection = 0;
		this.goldenChicken = false;
	}

	/**
	 * Setter dan Getter
	 * 
	 * @return
	 */
	public int getAffection() {
		return affection;
	}

	public boolean isGoldenChicken() {
		return goldenChicken;
	}

	private void setAffection(int affection) {
		this.affection = affection;
	}

	private void setGoldenChicken(boolean goldenChicken) {
		this.goldenChicken = goldenChicken;
	}

	public String getName() {
		return nama;
	}

	/**
	 * Method PickUp befungsi untuk menambah Affection point dari ayam
	 * @return jumlah affection point
	 */
	public void pickUp()	{
		setAffection(getAffection()+1);
		if(getAffection() == 3) evolve();
	}
	
	/**
	 * Method kick berfungsi untuk mengurangi Affection point dari ayam 
	 * @return
	 */
	public void tendang()	{
		setAffection(getAffection()-1 );
		if(isGoldenChicken() && getAffection() < 2) devolve();
	}
	
	/**
	 * Jika ayam adalah ayam emas, akan mengembalikan harga terlur ayam emas
	 * @return harga terlur dari jenis ayam
	 */
	public int hargaTelor() {
		return goldenChicken ? HARGA_TELOR_MAS : HARGA_TELOR;
	}
	
	/**
	 * Jika Affection point mencukupi, ayam akan berubah menjadi Ayam Emas
	 */
	public void evolve()	{
		setGoldenChicken(true);
	}
	
	/**
	 * Jika point berkurang dari batas tertentu, ayam akan kembali menjadi ayam biasa
	 */
	public void devolve()	{
		setGoldenChicken(false);
	}
}
