import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int numara = 0,ort;
		String ad;
		
		hashTable ht=new hashTable(5);
		
		int secim=menu();
		
		while (secim !=0)
		{
			switch(secim)
			{	
			case 1:
				System.out.print("eklenecek öğrenci numarası : ");
				numara =scanner.nextInt();
				System.out.print("Ad       :"); ad=scanner.next();
				System.out.print("Ortalaması :"); ort=scanner.nextInt();
				ht.ekle(numara, ad,ort); 
				break;
			case 2:
				System.out.print("silinecek öğrencinin numarası :"); numara=scanner.nextInt();
				ht.delete(numara);
				break;
			case 3:
				ht.yazdır();
				break;
			case 4:
				System.out.print("aradığınız öğrencinin numarası :");numara=scanner.nextInt();
				ht.ara(numara);
				break;
			default : System.out.print("Hatalı seçim yaptınız. !");
		
			}
			secim=menu();
		}
	}

	private static int menu() {
		Scanner scanner=new Scanner(System.in);
		
		int secim;
		System.out.println("\n1- Ögrenci Ekle");
		System.out.println("2- Ögrenci Sil");
		System.out.println("3- Ögrencileri Yazdır");
		System.out.println("4- Ögrenci Ara");
		System.out.println("0- Programdan Çıkış");
		System.out.print("Seçiminiz :");
		secim=scanner.nextInt();
		
		return secim;
	}

}
