import java.util.Iterator;

public class hashTable {
	NodeOgrenci dizi[];
	int size;
	
	public hashTable(int size) {
		this.size=size;
		dizi= new NodeOgrenci[size];
		for (int i = 0; i < size; i++) {
			dizi[i]=new NodeOgrenci();
			
		}
	}
	
	int indisUret(int numara)
	{
		return numara % size;
	}
	
	
	void ekle(int numara, String ad,int ort)
	{
		int indis=indisUret(numara);
		
		NodeOgrenci ogr=new NodeOgrenci(numara,ad,ort);
		
		NodeOgrenci temp=dizi[indis];
		while (temp.next!=null) 
			temp=temp.next;
		
		temp.next=ogr;
		System.out.println(ad + " eklendi ");
	}
	
	void delete(int numara)
	{
		int indis=indisUret(numara);
		NodeOgrenci temp=dizi[indis];
		NodeOgrenci temp2=temp;
		boolean sonuc=false;
		
		if (temp.next==null) 
		{
			sonuc=true;
			System.out.println(numara + " numaralı öğrenci kayıtta yok!");
		}
		else if (temp.next.next==null && temp.next.numara==numara)
		{
			sonuc=true;
			temp.next=null;
			System.out.println(numara + " numaralı öğrenci silindi");
		}
		else
		{
			while (temp.next!=null)
			{
				temp2=temp;
				temp=temp.next;
				
				if (temp.numara==numara)
				{
					sonuc= true;
					temp2.next=temp.next;
					System.out.println(numara +" numaralı öğrenci silindi.");
				}
			}
		}
		if (sonuc==false)
			System.out.println(numara + " böyle bir numaralı kayıt bulunamamaktardır.!");
		
		
		
	}
	void yazdır()
	{
		System.out.println("\nNumara\t" + "Ad\t" + "Ort\t" + "Durum");
		for (int i = 0; i < size; i++) {
			NodeOgrenci temp = dizi[i];
			
			while (temp.next!=null)
			{
				System.out.println(temp.next.numara + "\t" + temp.next.ad+ "\t"+temp.next.ort +"\t" + temp.next.durum);
				temp=temp.next;
			}
			
		}
	}
	void ara(int numara)
	{
		boolean sonuc =false;
		int indis = indisUret(numara);
		NodeOgrenci temp= dizi[indis];
		while (temp.next!=null)
		{
			
			if (temp.next.numara==numara)
			{
				sonuc=true;
				System.out.println();
				System.out.println(numara + "numaralı öğrenci bilgileri");
				System.out.println("Ad            : " +temp.next.ad);
				System.out.println("Ortalama      : " +temp.next.ort);
				System.out.println("Durum         : " +temp.next.durum);
				break;
			}
			temp=temp.next;
		}
		if (sonuc==false)
			System.out.println(numara + "numaralı öğrenci kaydı yok ");
	}
	
	
	
	
	
	
}
