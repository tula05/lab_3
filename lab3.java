package lab3;
import java.util.Random;
import java.util.Scanner;
public class lab3 {
	
	private static Scanner sc;
	public static void main(String[] args) {
		int n,i;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter your random value : ");
        n = sc.nextInt();
		int [] arr = new int[n]; //เอาจำนวน array มาจาก n
		
		for ( i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(99); // เก็บเลขที่สุ่มมา ลงใน array i ช่อง
			for( int j = 0; j <= arr.length ; j++) //นับ จำนวนช่อง array เทียบ n
			{
				if (i != n) {
					System.out.println("Array"+"[" +i+ "] " +arr[i]);
					break;
				} 	
			}
		}
	}
}

