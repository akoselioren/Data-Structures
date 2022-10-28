import java.util.Scanner;

public class QueueYapisi {

	Scanner scanner =new Scanner(System.in);
	
	NodeATM front;
	NodeATM rear;
	int size; //toplam düğüm sayısı
	int cnt; //sayac
	int kisisayac =0;
	public QueueYapisi(int size) {
		this.size = size;
		cnt=0;
		front=null;
		rear=null;
		
	}
	
	String isim;
	int cekilendeger,ToplamGelir=0;
	
	void enQueue()
	{
		if (isFull())
		{
			System.out.println("Kuruk sırası Full doludur ekleme yapılamaz.!");
		}
		else
		{
			
			
			System.out.print("müşteri İsmi :"); isim=scanner.nextLine();
			System.out.print("çekeceği miktar :"); cekilendeger=scanner.nextInt();
			scanner.nextLine();
			NodeATM dugum=new NodeATM(isim, cekilendeger);
			
			if (isEmpty()) //kuyruk bomboş ise ilk kişidir.
			{
				
				front=dugum;
				rear=dugum;
				System.out.println("Kuyruk yapısı oluşturuldu ilk kişi kuyrukta sıraya girdi.!");
			}
			else
			{
				rear.next=dugum;
				rear=dugum;
				System.out.println(rear.isim+ " .kişi sıraya girdi.");
			}
			
			cnt++;
		}
	}
	
	void deQueue()
	{
		if (isEmpty())
		{
			System.out.println("Kuyrukta bekleyen kimse yoktur.!");
		}
		else
		{	
			ToplamGelir+=front.ucret;
			System.out.println(front.isim +" "+ front.cekilendeger + " TL çekerek kuyruktan ayrıldı. ");
			front=front.next;
			cnt--;
		}
	}
	
	void print()
	{
		if (isEmpty())
		{
			System.out.println("Kuyrukta bekleyen kimse yoktur.!");
		}
		else
		{
			NodeATM temp= front;
			System.out.print("baş < -|");
			while (temp!=null)
			{
				System.out.print(temp.isim+ " |< -|");
				temp=temp.next;
			}
			System.out.println(" |-> son");
		}
	}
	
	boolean isEmpty()
	{
		return cnt==0;
		
	}
	boolean isFull()
	{
		return cnt==size;
		
	}
	
}
