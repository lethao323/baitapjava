package com.humg.baitapjava.main;

import java.util.Scanner;

import com.humg.baitapjava.ncc.ChiTietPhieuNhap;
import com.humg.baitapjava.phieunhap.PhieuNhap;

public class Main {
	public static void main(String[] args) {
		ChiTietPhieuNhap[] dsPhieuNhap = new ChiTietPhieuNhap[3];
		for (int i = 0; i < 3; i++) {
			int soSanPham = 0;
			dsPhieuNhap[i].nhapTT();
			soSanPham += dsPhieuNhap[i].getSoLuong();
			System.out.println("Số sản phẩm của phiếu: " + soSanPham);
			dsPhieuNhap[i].inTT();
		}

		for (int i = 0; i < dsPhieuNhap.length; i++) {
			for (int j = 0; j < dsPhieuNhap.length; j++) {
				if (dsPhieuNhap[i].getSoLuong() > dsPhieuNhap[i].getSoLuong()) {
					ChiTietPhieuNhap temPhieuNhap = new ChiTietPhieuNhap();
					temPhieuNhap = dsPhieuNhap[i];
					dsPhieuNhap[i] = dsPhieuNhap[j];
					dsPhieuNhap[j] = temPhieuNhap;
				}
			}
		}
		System.out.println("Phiếu có sp thấp nhất: ");
		dsPhieuNhap[0].inTT();

	}
}
