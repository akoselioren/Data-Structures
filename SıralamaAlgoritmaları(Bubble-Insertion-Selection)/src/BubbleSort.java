import java.util.Iterator;
import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n;
		System.out.print("Kaç adet sayı girmek istersiniz :");
		n=scanner.nextInt();
		int dizi[]=new int[n];
		
		for (int i = 0; i <  n; i++) {
			System.out.print(i+1 +". sayı :");
			dizi[i]=scanner.nextInt();
			
		}
		
		bubbleSort(dizi,n);
		
		System.out.println("Bubble Sort Algoritması uygulandı.");
		
		for (int i = 0; i < n; i++) {
		
			System.out.print(dizi[i]+"--");
		}
			
			
			
		
		
	}

	private static void bubbleSort(int[] dizi, int n) {

		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				

				if (dizi[j]>dizi[j+1]) 
				{
					int gecici=dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=gecici;
				}
				
			}
			
		}
	}

}