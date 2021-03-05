package baitap;
import java.util.Scanner;
public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap a: "); 
		a = sc.nextFloat();  
		System.out.print("Nhap b: ");
		b = sc.nextFloat();
        System.out.println("tong 2 so la : "+(a+b));
        System.out.println("hieu 2 so la : "+(a-b));
        System.out.println("thuong 2 so la :"+(a/b));
        System.out.println("tich 2 so la :"+(a*b));
        System.out.println("chia lay du cua 2 so la : "+(a%b));
        if(a>b) 
            System.out.println("a lon hon b");
        
        if(a<b) 
        	System.out.println("a nho hon b");
        
        if(a==b)
        	System.out.println("a bang b");
        
	}

}


