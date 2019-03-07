package demo;

public class Moto extends Xe {
	public Moto(String ten, String loai, String mau) {
		super(ten, loai, mau);
	}

	@Override
	public void chay() {
		System.out.println("Chay bang hai banh...");
	}

	@Override
	public void bopCoi() {
		System.out.println("An nut coi tren tay trai");
	}

	@Override
	public void thang() {
		System.out.println("Thang tay va chan");
	}
}