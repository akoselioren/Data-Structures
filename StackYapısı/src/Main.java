import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Stack yapısı kaç düğümlü olmasını istersiniz:");
		int dgmsys=scanner.nextInt();
		
		StackYapisi liste =new StackYapisi(dgmsys);/*liste adında stack 
		olusturduk size'nıda 10 belirledik*/
		
		int secim=-1, sayi;
		
		while (secim!=0) 
		{
		
			System.out.println("1- ekle");
			System.out.println("2- çıkar");
			System.out.println("3- en üsttekini göster");
			System.out.println("4- yazdır");
			System.out.println("0- çıkış");
			System.out.print("seciminiz:");
			secim = scanner.nextInt();
			
			switch (secim)
			{
			case 1: System.out.print("eklenecek sayı: ");
			sayi=scanner.nextInt();
			liste.push(sayi); break;
			case 2: liste.pop();break;
			case 3: liste.topGoster();break;
			case 4: liste.print();break;
			case 0: System.out.println("çıkış yaptınız... ");break;
			default:System.out.println("Hatalı seçim yaptınız.");
			}
			
			
			
			
		}
		
	}

}
