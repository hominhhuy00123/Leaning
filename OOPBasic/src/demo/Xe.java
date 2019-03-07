package demo;

/**
 * Mo ta lop xe
 * 
 * @author Huy
 *
 */
public abstract class Xe {
	// region -- Fields --

	/**
	 * Ten cua xe
	 */
	private String ten;

	/**
	 * Loai xe
	 */
	private String loai;

	/**
	 * Mau xe
	 */
	private String mau;

	/**
	 * Gia xe
	 */
	private int gia;

	// end

	// -- Get set --

	/**
	 * Get gia
	 * 
	 * @return
	 */
	public int getGia() {
		return gia;
	}

	/**
	 * Set gia
	 * 
	 * @param gia
	 */
	public void setGia(int gia) {
		if (gia < 0) {
			gia = 0;
		}

		this.gia = gia;
	}

	// end

	// region -- Methods --

	protected Xe(String ten, String loai, String mau) {
		this.ten = ten;
		this.loai = loai;
		this.mau = mau;
	}

	/**
	 * In thong tin xe
	 */
	public void in() {
		System.out.println("Thong tin xe");
		System.out.print("Ten: " + ten);
		System.out.print(", Mau: " + mau);
		System.out.print(", Gia: " + gia);
		System.out.println(", Loai: " + loai);
	}

	/**
	 * Chay
	 */
	public abstract void chay();

	/**
	 * Bop coi
	 */
	public abstract void bopCoi();

	/**
	 * Thang
	 */
	public abstract void thang();

	// end
}