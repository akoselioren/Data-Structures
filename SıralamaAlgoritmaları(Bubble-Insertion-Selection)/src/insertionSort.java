import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Sayı adedi giriniz: ");
		int n=scanner.nextInt();
		int[] dizi=new int [n];
		for (int i = 0; i <n; i++) 
		{
			System.out.print(i+1+". sayı : ");
			dizi[i]=scanner.nextInt();
		}
		insortionSort(dizi,n);
		System.out.println("Sıralama işlemi tamamlandı..");
		
		for (int i = 0; i < n; i++) {
			System.out.print(" "+dizi[i]);
			
		}
	}

	private static void insortionSort(int[] dizi, int n) {
		
		for (int i = 1; i<n; i++) {
			for (int k = i; k >0; k--) {
				
				if (dizi[k]<dizi[k-1])
				{
					int temp=dizi[k];
					dizi[k]=dizi[k-1];
					dizi[k-1]=temp;
				}
				
			}
			
		}
		
	}

}
