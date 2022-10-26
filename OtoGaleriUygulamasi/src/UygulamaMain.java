import java.util.Scanner;

public class UygulamaMain {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		BagliListe liste =new BagliListe();
		
		int secim=-1;
		
		while (secim!=0)
		{
			System.out.println("1- arac ekle");
			System.out.println("2- arac sil");
			System.out.println("3- arac yazdir");
			System.out.println("4- arac ara");
			System.out.println("0- Cikis");
			System.out.print("Seciminiz :");
			secim=scanner.nextInt();
			
			switch (secim) {
			case 1: liste.ekle(); break;
			case 2: liste.sil(); break;
			case 3: liste.yazdir(); break;
			case 4: liste.aracAra(); break;
			case 5: System.out.println("Cikis yaptınız..");; break;
			default: System.out.println("hatalı seçim [0 - 4]"); break;
			}
			
			
		}
		
	}

}
