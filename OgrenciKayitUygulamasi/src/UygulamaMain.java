import java.util.Scanner;

public class UygulamaMain {

	public static void main(String[] args) {
		int secim=-1;
		OgrListe bilBolüm=new OgrListe();
		
		Scanner scanner=new Scanner(System.in);
		
		while (secim!=0) {
			System.out.println();
			System.out.println("Bilgisayar bölümü öğrenci kayıt uygulaması");
			System.out.println("1. yeni kayit ");
			System.out.println("2. kayit sil ");
			System.out.println("3. kayitlari listele ");
			System.out.println("4. En Basarili ogrenci bilgileri");
			System.out.println("0. cikis ");
			System.out.print("Seciminiz: ");
			
			secim=scanner.nextInt();
			
			if (secim==1)
				bilBolüm.ekle();
			else if (secim==2)
				bilBolüm.sil();
			else if (secim==3)
				bilBolüm.yazdır();
			else if (secim==4)
				bilBolüm.enBasarılıOgrenci();
			else if (secim==0)
				System.out.println("Programı sonlandırdınız.");
			else
				System.out.println("Hatali Secim Yaptiniz.!! [0 - 4]");
		}
	}

}
