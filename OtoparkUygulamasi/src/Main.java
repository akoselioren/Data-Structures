import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner scanner=new Scanner(System.in);
		
		BagliListe liste=new BagliListe();
		int secim =-1;
		while (secim!=0) 
		{
			System.out.println("1- otopark'a araç girişi");
			System.out.println("2- otoparktan araç çıkışı");
			System.out.println("3- otoparktaki araçları listele");
			System.out.println("4- toplam gelir (TL)");
			System.out.println("0- çıkış");
			System.out.println("seciminiz :");
			secim=scanner.nextInt();
			
			switch (secim) {
			case 1:liste.ekle(); break; 
			case 2:liste.sil(); break; 
			case 3:liste.yazdir(); break; 
			case 4: System.out.println("Toplam Ucret :"+liste.toplamUcret+" TL"); break; 
			case 0: System.out.println("Çıkış Yaptınız.."); break;
			default: System.out.println("Hatalı seçim yaptınız.!"); break;
			
			}
		}
	}

}
