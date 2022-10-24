import java.util.Scanner;

public class BagliListe {

	Scanner scanner = new Scanner(System.in);
	
	MusteriNode head =null;
	MusteriNode tail =null;
	
	int id;
	String ad, soyad, tel ,adres,urun;
	
	void ekle() 
	{
		System.out.println("Musterinin Bilgilerini giriniz :");
		System.out.print("numarası :"); id=scanner.nextInt();
		scanner.nextLine();
		System.out.print("ad       :"); ad=scanner.nextLine();
		System.out.print("soyad    :"); soyad=scanner.nextLine();
		System.out.print("telefon  :"); tel=scanner.nextLine();
		System.out.print("adres    :"); adres=scanner.nextLine();
		System.out.print("urun     :"); urun=scanner.nextLine();
		MusteriNode eleman =new MusteriNode(id,ad,soyad,tel,adres,urun);
	
		
		if(head==null)
		{
			head=eleman;
			tail=eleman;
			System.out.println("Liste Olusturuldu ilk musteri kayit edildi.");
		}
		else
		{
			eleman.next=head;
			head.prev=eleman;
			head=eleman;
			System.out.println(id + " numarali musteri kayit edildi ");
		}
		}
	
	void sil() 
	{
		boolean sonuc=false;
		if(head==null)
			System.out.println("liste bos silme islemi yapilamaz.!");
		else
		{
			System.out.print("Silinecek musterinin numarasini giriniz :"); id=scanner.nextInt();
			scanner.nextLine();	
			
			
			if (head.next==null && head.id==id) 
			{
				head=null;
				tail=null;
				System.out.print(id + "numarali musteri silindi.");
				sonuc=true;
			}
			else if (head.next!=null && head.id==id) 
			{
				head=head.next;
				head.prev=null;
				System.out.print(id + "numarali musteri silindi.");
				sonuc=true;
			}
			else if (tail.id==id) 
			{
				tail=tail.prev;
				tail.next=null;
				System.out.print(id + "numarali musteri silindi.");
				sonuc=true;
			}
			else 
			{
				MusteriNode temp = head;
				while (temp!=null) 
				{
					if (temp.id==id) 
					{
						temp.next.prev=temp.prev;
						temp.prev.next= temp.next;
						sonuc=true;
						break;
						
					}
					temp = temp.next;
				}
			}
			
			if (!sonuc) 
				System.out.println(id + "numaralı musteri listede yok.!");
		}
		}
	
	void guncelle() 
	{
		boolean sonuc=false;
		if(head==null)
			System.out.println("liste bos guncelleme islemi yapilamaz.!");
		else
		{
			System.out.print("Guncellenecek musterinin numarasini giriniz :"); id=scanner.nextInt();
			scanner.nextLine();	
			
				MusteriNode temp = head;
				while (temp!=null) 
				{
					if (temp.id==id) 
					{
						
						System.out.println(id + "numarali musteri bilgileri :");
						System.out.println("ad        :" + temp.ad);
						System.out.println("soyad     :" + temp.soyad);
						System.out.println("telefon   :" + temp.tel);
						System.out.println("adres     :" + temp.adres);
						System.out.println("urun      :" + temp.urun);
						System.out.println("Urun bigisini Guncelleyiniz :");
						temp.urun=scanner.nextLine();
						System.out.println("Urun Bilgisi Guncellenmistir..");
						System.out.println("ad        :" + temp.ad);
						System.out.println("soyad     :" + temp.soyad);
						System.out.println("telefon   :" + temp.tel);
						System.out.println("adres     :" + temp.adres);
						System.out.println("urun      :" + temp.urun);
						sonuc=true;
						break;
						
					}
					temp = temp.next;
				}
			}
			
			if (!sonuc) 
				System.out.println(id + "numaralı musteri listede yok.!");
		}
		
	void musteriBul() 
	{
		boolean sonuc=false;
		if(head==null)
			System.out.println("liste bos Arama islemi yapilamaz.!");
		else
		{
			System.out.print("Aranacak musterinin numarasini giriniz :"); id=scanner.nextInt();
			scanner.nextLine();	
			
				MusteriNode temp = head;
				while (temp!=null) 
				{
					if (temp.id==id) 
					{
						
						System.out.println(id + "numarali musteri bilgileri :");
						System.out.println("ad        :" + temp.ad);
						System.out.println("soyad     :" + temp.soyad);
						System.out.println("telefon   :" + temp.tel);
						System.out.println("adres     :" + temp.adres);
						System.out.println("urun      :" + temp.urun);
						sonuc=true;
						break;
						
					}
					temp = temp.next;
				}
			}
			
			if (!sonuc) 
				System.out.println(id + "numaralı musteri listede yok.!");
		}
		
	void musteriYazdir() 
	{
		if(head==null)
			System.out.println("liste bos Yazdirma islemi yapilamaz.!");
		else
		{
			System.out.print("Numara\tAd\tSoyad\tTelefon\tAdres\tUrun\n:");	
				MusteriNode temp = head;
				while (temp!=null) 
				{
						System.out.println(temp.id + "\t" + temp.ad + "\t" + temp.soyad + "\t" + temp.tel  + "\t" + temp.adres +"\t" + temp.urun);
						temp = temp.next;
				}
			}
			
			}
		
	
	}