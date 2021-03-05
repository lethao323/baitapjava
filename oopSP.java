package com.gpcoder;
import java.util.Scanner;
public class oopSP {
	public static void main(String[] args) {
		SP mot = new SP();
		mot.nhap();
		mot.in();
	}
}		
	
	class SP {
	String tenSP;
	double DonGia;
	double GiamGia;
	
	
	void nhap() {
		 System.out.println("Nhap thong tin san pham: ");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Nhap ten san pham: ");
		 tenSP = sc.next();
		 System.out.println("Nhap don gia san pham: ");
		 DonGia = sc.nextDouble();
		 System.out.println("Nhap giam gia san pham: ");
		 GiamGia = sc.nextDouble();
	}
	double Thue() {
		return (DonGia / 10);
	}
	void in() {
		 System.out.println("Ten san pham: " +tenSP);
	
		 System.out.println("Don gia: " +DonGia);

		 System.out.println("Giam gia: " +GiamGia);
	
		 System.out.println("Thue nhap khau: " +Thue());
	}
}
