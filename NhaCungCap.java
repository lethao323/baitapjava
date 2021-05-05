package com.humg.baitapjava.ncc;

import java.util.Scanner;

import com.humg.baitapjava.iterface.Interface;

public class NhaCungCap implements Interface {
	String maNCC, tenNCC, diaChi;

	public NhaCungCap(String maNCC, String tenNCC, String diaChi) {
		super();
		this.maNCC = maNCC;
		this.tenNCC = tenNCC;
		this.diaChi = diaChi;
	}

	@Override
	public void nhapTT() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã nhà cung cấp: ");
		maNCC = scanner.nextLine();
		System.out.println("Nhập tên nhà cung cấp: ");
		tenNCC = scanner.nextLine();
		System.out.println("Nhập địa chỉ: ");
		diaChi = scanner.nextLine();
	}

	@Override
	public void inTT() {
		// TODO Auto-generated method stub
		System.out.println("Mã nhà cung cấp: " + maNCC);
		System.out.println("Tên nhà cung cấp: " + tenNCC);
		System.out.println("Địa chỉ: " + diaChi);
	}

}
