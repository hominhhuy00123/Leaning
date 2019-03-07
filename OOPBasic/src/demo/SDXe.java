package demo;

import java.util.ArrayList;
import java.util.List;

public class SDXe {
	public static void main(String[] args) {
		Xe x1 = new Train("Tau Thong Nhat", "A", "Xanh duong");
		Xe x2 = new Oto("Toyota Innova", "SANDAN", "Trang");
		Xe x3 = new Moto("Exciter 150", "B", "Xanh duong");
		// x3 là Instance, object, class Moto

		x1.setGia(-100);
		x2.setGia(100);
		x3.setGia(123);

		// Vi du the hien tinh da hinh
		List<Xe> ds = new ArrayList<Xe>();
		ds.add(x1);
		ds.add(x2);
		ds.add(x3);

		for (Xe x : ds) {
			x.in();
		}
	}
}