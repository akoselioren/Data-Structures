import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		int n;
		System.out.print("Girilecek Sayı Adedi :");
		n=scanner.nextInt();
		
		int dizi[]=new int[n];
		
		for (int i = 0; i <n; i++) 
		{
			System.out.print(i+1+". sayı : ");
			dizi[i]=scanner.nextInt();
		}
		
		
		selectionSort(dizi,n);
		
		System.out.println("Sıralama işlemi tamamlandı..");
		
		for (int i = 0; i < n; i++) {
			System.out.print(" "+dizi[i]);
		}
			
	}

	private static void selectionSort(int[] dizi, int n) {
		for (int i = 0; i <n-1; i++)
		{
			int min=i;
			for (int j = i; j <n; j++) {
				if (dizi[min]>dizi[j])
					min=j;
			}
			int temp=dizi[min];
			dizi[min]=dizi[i];
			dizi[i]=temp;
			
		}
		
	}

}
