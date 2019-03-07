package demo;

public class Train extends Xe {
	public Train(String ten, String loai, String mau) {
		super(ten, loai, mau);
	}

	@Override
	public void chay() {
		System.out.println("Chay bang tren duong ray");
	}

	@Override
	public void bopCoi() {
		System.out.println("An nut coi tren dau tau");
	}

	@Override
	public void thang() {
		System.out.println("Thang bang tay");
	}
}