import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class uygulamaMain {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		BagliListe liste=new BagliListe();
		
		int secim=-1;
		
		while (secim!=0)
		{
			
			System.out.println("1- musteri ekle");
			System.out.println("2- musteri sil");
			System.out.println("3- musteri urun guncelle");
			System.out.println("4- musteri bul");
			System.out.println("5- yazdir");
			System.out.println("0- çıkış");
			System.out.print("seçiminiz:"); 
			secim=scanner.nextInt();
			scanner.nextLine();
			
			switch (secim)
			{
			case 1: liste.ekle();break;
			case 2: liste.sil();break;
			case 3: liste.guncelle();break;
			case 4: liste.musteriBul();break;
			case 5: liste.musteriYazdir();break;
			case 0: System.out.println("Çıkış Yaptınız..");break;
			default: System.out.println("Hatalı seçim yaptınız [0-5]");break;
			}
			
			
		}
		
	}

}
