package demo;

public class Oto extends Xe {
	public Oto(String ten, String loai, String mau) {
		super(ten, loai, mau);
	}

	@Override
	public void chay() {
		System.out.println("Chay bang bon banh...");
	}

	@Override
	public void bopCoi() {
		System.out.println("An nut coi tren vo lang");
	}

	@Override
	public void thang() {
		System.out.println("Thang bang chan");
	}

}
