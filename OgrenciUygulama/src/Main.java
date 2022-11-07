import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no,not;
		String ad;
		
		Tree ogr=new Tree();
		
		int secim=menu();
		
		while (secim!=0)
		{
			switch(secim)
			{
			
			case 0:break;
			
			case 1: System.out.println("eklenecek ögrencinin bilgilerini giriniz: ");
			System.out.print("Numara : "); no = scanner.nextInt();
			System.out.print("Ad : "); ad=scanner.next();
			System.out.print("Not : "); not=scanner.nextInt();
			ogr.root=ogr.insert(ogr.root, no, ad, not);
			System.out.println(no + " Numaralı öğrenci eklendi. ");
			break;
			
			case 2: System.out.println("silinecek öğreninin numarası :"); no=scanner.nextInt();
			ogr.root=ogr.delete(ogr.root, no);
			System.out.println(no + " Numaralı öğrenci silindi. ");
			break;
			
			case 3: System.out.println("No\t" + "AD\t" + "NOT\t");
			ogr.inOrder(ogr.root);
			break;
			
			default : System.out.println("Hatalı giriş yaptınız");
			}
			
			secim=menu();
		}
		
	}

	private static int menu() {
		int secim;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1- ekle");
		System.out.println("2- sil");
		System.out.println("3- yazdır");
		System.out.println("0- çıkış");
		System.out.print("Seçiminiz: ");
		
		secim=scanner.nextInt();
		
		return secim;
	}

}
