package com.humg.baitapjava.ncc;

import java.util.Scanner;

import com.humg.baitapjava.phieunhap.PhieuNhap;

public class ChiTietPhieuNhap extends PhieuNhap {

	public ChiTietPhieuNhap() {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.hanSD = hanSD;
		this.soLuong = soLuong;
	}

	private String maSP, tenSP, hanSD;
	private int soLuong;

	public void nhapTT() {
		super.nhapTT();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã sản phẩm: ");
		maSP = scanner.nextLine();
		System.out.println("Nhập tên sản phẩm: ");
		tenSP = scanner.nextLine();
		System.out.println("Nhập số lượng: ");
		soLuong = scanner.nextInt();
		System.out.println("Nhập hạn sử dụng: ");
		hanSD = scanner.nextLine();
	}

	public void inTT() {
		super.inTT();
		System.out.println("Mã sản phẩm: " + maSP);
		System.out.println("Tên sản phẩm: " + tenSP);
		System.out.println("Số lượng: " + soLuong);
		System.out.println("Hạn sử dụng: " + hanSD);
	}

	public int getSoLuong() {
		return soLuong;
	}

}
