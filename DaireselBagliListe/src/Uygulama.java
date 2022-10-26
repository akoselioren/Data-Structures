import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		BagliListe liste =new BagliListe();
		int secim=-1;
		while (secim!=0)
		{
			System.out.println("\n1- başa  ekle");
			System.out.println("2- sona  ekle");
			System.out.println("3- araya ekle");
			System.out.println("4- bastan sil");
			System.out.println("5- sondan sil");
			System.out.println("6- aradan sil");
			System.out.println("0- çıkış");
			System.out.println("Seçiminiz:");
			secim=scanner.nextInt();
			
			switch (secim) {
			case 1: liste.basaekle(); break;
			case 2: liste.sonaekle(); break;
			case 3: liste.arayaekle(); break;
			case 4: liste.bastanSil(); break;
			case 5: liste.SondanSil(); break;
			case 6: liste.AradanSil(); break;
			case 0: System.out.println("Çıkış Yaptınız."); break;
			default:System.out.println("Hatalı Giriş Yaptınız."); break;
			}
			
			liste.yazdir();
			
		}
	}

}
