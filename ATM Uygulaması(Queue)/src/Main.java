import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
	
		int secim=-1,dgmsys;
		System.out.print("ATM Sırasındaki toplam kişi sayısı:");
		dgmsys=scanner.nextInt();
		
		QueueYapisi kuyruk=new QueueYapisi(dgmsys);
		
		while (secim!=0) 
		{
		
			System.out.println("1- kişi ekle");
			System.out.println("2- kişi çıkar");
			System.out.println("3- kuyruktaki kişiler");
			System.out.println("4- Toplam çekilen TL");
			System.out.println("0- çıkış");
			System.out.print("seciminiz:");
			secim = scanner.nextInt();
			
			switch (secim)
			{
			case 1: kuyruk.enQueue();break;
			case 2: kuyruk.deQueue();break;
			case 3: kuyruk.print();break;
			case 4: System.out.println("Toplam Gelir "+ kuyruk.ToplamGelir+ "TL");break;
			case 0: System.out.println("Çıkış Yaptınız..");break;
			default:System.out.println("Hatalı seçim yaptınız.!");
			}
			
		}	
	}

}
