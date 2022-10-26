import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BagliListe {

	Scanner scanner=new Scanner(System.in);
	
	OtoNode head=null;
	OtoNode tail=null;
	OtoNode temp=head;
	OtoNode temp2=temp;
	
	String plaka,giris,cikis;
	long dakika;
	long ucret;
	long toplamUcret=0;
	void ekle()
	{
		System.out.print("Plaka :");
		plaka=scanner.nextLine();
		System.out.print("giris (ss:dd) :");
		giris=scanner.nextLine();
		
		OtoNode arac=new OtoNode(plaka,giris);
		
		if (head==null)
		{
			head=arac;
			tail=arac;
			
			head.next=tail;
			tail.prev=head;
			head.prev=tail;
			tail.next=head;
			System.out.println("Araç otopark'a girdi.");
		}
		else
		{
			arac.next=head;
			head.prev=arac;
			head=arac;
			
			head.prev=tail;
			tail.next=head;
		}
		
		
	}
	
	void sil() throws ParseException
	{
		if (head==null)
		{
			System.out.println("Şu anda otoparkta hiç araç bulunmamaktadır.");
		}
		else
		{
			System.out.print("Plaka :");
			plaka=scanner.nextLine();
			System.out.print("cıkış (ss:dd) :");
			cikis=scanner.nextLine();	
			
			if (head==tail && head.plaka.equals(plaka))
			{
				ucretHesapla(head,cikis);
				head=null;
				tail=null;
				System.out.println("Otoparktaki son araç çıkış yaptı.");
			}
			
			else if (head!=tail && head.plaka.equals(plaka))
			{
				ucretHesapla(head,cikis);
				head=head.next;
				head.prev=tail;
				tail.next=head;
				System.out.println("Otoparktan araç çıkış yaptı.");
			}
			else
			{
				temp=head;
				
				while (temp!=tail)
				{
					if (temp.plaka.equals(plaka))
					{
						ucretHesapla(temp,cikis);
						temp2.next=temp.next;
						temp.next.prev=temp2;
						System.out.println("Otoparktan araç çıkış yaptı.");
					}
					
					temp2=temp;
					temp=temp.next;
				}
				
				if (temp.plaka.equals(plaka))
				{
					ucretHesapla(temp,cikis);
					tail=temp2;
					tail.next=head;
					head.prev=tail;
					System.out.println("Otoparktan araç çıkış yaptı.");
				}
			}
			
		}
	}

	private void ucretHesapla(OtoNode temp3, String cikis2) throws ParseException
	{
		giris=temp3.giris;
		SimpleDateFormat sdf =new SimpleDateFormat("HH:mm");
		
		Date d1,d2;
		d1= sdf.parse(giris);
		d2= sdf.parse(cikis2);
		
		dakika =d2.getTime()-d1.getTime();
		dakika= dakika/60000;
		ucret=dakika/4;
		System.out.println("süre  : "+dakika+" dk");
		System.out.println("ücret :"+ucret+" TL");
		toplamUcret +=ucret;
		
	}
	
	void yazdir()
	{
		if (head==null)
			System.out.println("Otopark'ta araç yok");
		
		else
		{
			System.out.println("PLAKA\t\tGiriş SAAT");
			temp=head;
			while (temp!=tail)
			{
				System.out.println(temp.plaka + "\t\t" + temp.giris);
				temp=temp.next;
			}
			System.out.println(temp.plaka + "\t\t" + temp.giris+ "\n");
		}
	}
	
	
}
