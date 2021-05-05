package com.humg.baitapjava.phieunhap;

import java.util.Scanner;

public class PhieuNhap {
	protected String maPhieu, ngayNhap, tenNV;

	public PhieuNhap() {
		this.maPhieu = maPhieu;
		this.ngayNhap = ngayNhap;
		this.tenNV = tenNV;
	}

	protected void nhapTT() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã phiếu nhập: ");
		maPhieu = scanner.nextLine();
		System.out.println("Nhập ngày nhập: ");
		ngayNhap = scanner.nextLine();
		System.out.println("Nhập tên nhân viên: ");
		tenNV = scanner.nextLine();
	}

	public void inTT() {
		// TODO Auto-generated method stub
		System.out.println("Mã phiếu nhập: " + maPhieu);
		System.out.println("Ngày nhập: " + ngayNhap);
		System.out.println("Tên nhân viên: " + tenNV);
	}

}
