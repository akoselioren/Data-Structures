import java.util.Scanner;

public class BagliListe {

	Scanner scanner=new Scanner(System.in);
	
	OtoNode head =null;
	OtoNode tail =null;
	
	String plaka,marka,model,renk,aciklama;
	int alisFiyati,satisFiyati;
	
	
	
	void ekle()
	{
		System.out.print("Galeriye eklenecek otomobilin bilgilerini giriniz:");
		System.out.print("plaka    :"); plaka=scanner.nextLine();
		System.out.print("marka    :"); marka=scanner.nextLine();
		System.out.print("model    :"); model=scanner.nextLine();
		System.out.print("renk    :"); renk=scanner.nextLine();
		System.out.print("alisFiyat    :"); alisFiyati=scanner.nextInt();
		scanner.nextLine();
		System.out.print("aciklama    :"); aciklama=scanner.nextLine();
		
		
		
		OtoNode arac=new OtoNode(plaka, marka, model, renk, aciklama, alisFiyati);
		
		if (head==null) {
			
			head=arac;
			tail=arac;
			tail.next=head;
			System.out.println(plaka + "plakalı araç otogaleriye eklenmistir. ");
		}
			else {	
				arac.next=head;
				head=arac;
				tail.next=head;
				System.out.println(plaka + "plakalı araç otogaleriye eklenmistir. ");	
			}
		}
		void sil()
		{
			if (head==null)
			{
				System.out.println("Otogaleride Araç Bulunmamaktadır.!");
			}
			else
			{
				System.out.println("Satışını Yaptığınız otomobilin plakası :");
				plaka =scanner.nextLine();
				if (head==tail && head.plaka.equals(plaka))
				{
					System.out.println(plaka + "plakalı araç" + head.satisFiyati + "TL ye satıldı.");
					head=null;
					tail=null;
				}
				else if (head!=tail && head.plaka.equals(plaka))
				{
					System.out.println(plaka + "plakalı araç" + head.satisFiyati + "TL ye satıldı.");
					head=head.next;
					tail=head;
				}
				else 
				{
					OtoNode temp= head;
					OtoNode temp2=temp;
					
					while (temp!=tail) 
					{
						if (temp.plaka.equals(plaka)) 
						{
							System.out.println(plaka + "plakalı araç" + head.satisFiyati + "TL ye satıldı.");
							temp2.next= temp.next;							
						}
						
						temp2=temp;
						temp=temp.next;
					}
					if (temp.plaka.equals(plaka))
					{
						System.out.println(plaka + "plakalı araç" + head.satisFiyati + "TL ye satıldı.");
						tail=temp2;
						tail.next=head;
						
					}
				}
				
				
			}
			
		}
		
		void yazdir()
		{
			if (head==null) 
			{
				System.out.println("Otogaleride araç yok.!");
			}
			else
			{
				System.out.println("Plaka\tMarka\tModel\tRenk\taFiyat\tsFiyat\tAçıklama");
				
				OtoNode temp=head;
				while (temp!=tail)
				{
					System.out.println(temp.plaka + "\t" + temp.marka + "\t" + temp.model + "\t" + temp.renk + "\t" + temp.alisFiyati + "\t" + temp.satisFiyati+ "\t" + temp.aciklama);
					temp=temp.next;
				}
				System.out.println(temp.plaka + "\t" + temp.marka + "\t" + temp.model + "\t" + temp.renk + "\t" + temp.alisFiyati + "\t" + temp.satisFiyati+ "\t" + temp.aciklama);
			}
		}
		
		void aracAra()
		{
			boolean sonuc =false;
			if (head==null)
			{
				System.out.println("Otogaleride Araç Bulunmamaktadır.!");
			}
			else
			{
				System.out.println("Arama Yaptığınız otomobilin plakası :");
				plaka =scanner.nextLine();
				OtoNode temp=null;
				OtoNode temp2=null;
			
			while (temp!=tail) 
			{
				if (temp.plaka.equals(plaka))
				{
					temp2=temp;
					sonuc=true;
				}
				temp=temp.next;
				
			}
			if (temp.plaka.equals(plaka))
			{
				temp2=temp;
				sonuc =true;
			}
			
			if (sonuc==false)
			{
				System.out.println(plaka + "plakalı araç oto galeride yok.!");
			}
			else
			{
				System.out.println(plaka + "plakalı araç bilgileri :");
				System.out.println("marka          :" + temp2.marka);
				System.out.println("model          :" + temp2.model);
				System.out.println("renk           :" + temp2.renk);
				System.out.println("alisfiyat      :" + temp2.alisFiyati);
				System.out.println("satisfiyat     :" + temp2.satisFiyati);
				System.out.println("açıklama       :" + temp2.aciklama);
				
			}
			
			
			}
		}
		
	}
