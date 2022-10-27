
/*Not: Stack Yapısında Son giren ilk çıkar yapının bir kuralıdır.
 (kavanoz mantığı)*/

public class StackYapisi {

	int size; //stack kapasitesini tutmak için
	int cnt; //sayac
	
	Node top; // en üst düğümü tutan gösterici (head gibi düşünebiliriz.)
	
	public StackYapisi(int size) {
		this.size = size;
		cnt=0;
		top=null;
	}
	
	void push(int data) //stack'e ekleme işlemi
	{
		Node dugum=new Node(data);
		
		if (isFull())// stack doluysa ekleme yapılamaz onu kontrol ediyoruz
		{
			System.out.println("Stack dolu, ekleme yapılamadı.!");
		}
		else  // stack yapısında boşluk var ise.
		{
			if (isEmpty())//Stack Yapısı Tamamen boş ise
			{
				top =dugum;
				System.out.println(top.data+ "Stack'e ilk eleman eklendi.");
			}
			else //Stack'de eleman var fakat boşlukta var ise 
			{
				dugum.next=top; /*artık stackteki en üst dügümün next'i top'u gösterecek 
				çünkü yeni düğüm eklenecek*/
				top=dugum; //yeni düğümü ekledik.
				System.out.println(top.data+"Stack'e ekleme yapıldı.");
			}
			cnt++;//ekleme fonksiyonunun içinde dugum sayısını artırıyoruz.
		}
	}
	
	
	void pop() //stack'den çıkartma işlemi
	{
		if (isEmpty()) //Stack tamamen boş ise
		{
			System.out.println("Stack yapısı boş silenecek düğüm yok.!");
		}
		else
		{
				System.out.println(top.data+ "Dugum çıkarma işlemi yapıldı.");
				top=top.next;
				cnt--;//çıkartma işlemi yaptıgımız için dügüm sayısını 1 azalttık
		}
	}
	
	void print()
	{
		if (isEmpty())
		{
			System.out.println("Stack boş, yazdırılacak düğüm yok.!");
		}
		else
		{
		 Node temp=top;//ğeçici oluşturup en üstte çektik çünkü baştan sona yazdıracagız.
		 
		 System.out.println("Stack deki veriler \n");
		 
		 while (temp!=null) 
		 {
			System.out.println(temp.data);
			temp=temp.next;
		 }
		 System.out.println("\n");
		 
		}
	}
	
	void topGoster() //en üsteki düğümü görme fonksiyonu
	{
		if (isEmpty())
		{
			System.out.println("Stack boş ... ");
		}
		else
		{
			System.out.println("en üstteki düğümün datası:" + top.data);
		}
	}
	
	boolean isFull() // Stack yapısının dolu olup olmadığını buradan kontrol edebiliriz.
	{
		return cnt==size;//girdiğimiz dügüm sayısı dolmuş ise dolu olarak çeviriyoruz.
	}
	boolean isEmpty()  // Stack yapısının boş olup olmadığını buradan kontrol edebiliriz.
	{
		return cnt==0; //stack dugum sayısı 0 ise boş döner.
	}
	
	
	
}
