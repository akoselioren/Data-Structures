import java.util.Scanner;
//	---Açıklamalar---
//head: baş düğüm
//tail: son düğüm
//next: düğümden sonraki düğümü gösterir.
//prev: düğümden önceki düğümü gösterir.

//biraz kafa karıştırıcı bir yapı olabilmektedir. youtube veya udemy gibi
//platformlardan videolar izleyerek mantığın, bizde tam oturmasını sağlayabiliriz.
//böylece kodları daha rahat bir şekilde anlamış oluruz.

public class BagliListe { //Linked List Çift Yönlü dairesel bağlı liste

	Scanner scanner=new Scanner(System.in);
	
	Node head =null; //head: başlangıç düğümü
	Node tail= null; //tail: son düğüm
	Node temp=null;  //araya ekleme/silme yapabilmek için sonraki düğümü tutacağımız geçici yer burası.
	Node temp2=null;  //araya ekleme/silme yapabilmek için önceki düğümü tutacağımız geçici yer burası.
	
	int data,indis;		//data: kullanıcıdan alınacak düğümlerin içinde tutulan değer 
	// indis: kullanıcının silme yada araya ekleme yapacağı zaman hangi indis'e ekleme
	//yada silme yapacağını belirlemek için
	
	void basaekle() //başa yani head'a dügüm eklemek için fonsiyon oluşturduk.
	{
		System.out.println("data giriniz: ");
		data=scanner.nextInt();
		
		Node dugum=new Node(data);  //datayı kullanıcıdan aldık düğüm oluşturduk 
		if (head==null)  //eğer başlangıçta liste boş ise hem head hemde tail girilen data oluyor yani ilk düğüm oluşturuluyor.
		{
			head=dugum;  //head'ı belirledik.
			tail=dugum;  //tail'i belirledik.
			head.next=tail;  // tek düğüm olduğunda head' ın next'i tail'i gösterir.
			tail.prev=head;  // tail de tek düğüm olduğundan şu anda mecburen head'i gösterecek.
			head.prev=tail;  // burada tek düğüm olduğundan prev'de o düğümü gösterir.
			tail.next=head;	 //// burada tek düğüm olduğundan next'de o düğümü gösterir.
		}
		else   // eger listede en az 1 düğüm var ise veya liste boş değilse
		{
			dugum.next=head;  //eklenen dugum basa eklendiği için next'i eski head'i gösterecek
			head.prev=dugum;  // eski head'in previ'de basa eklenen yeni düğümü gösterecek. 
			head=dugum;  //artık bastaki düğüm yeni eklediğimiz düğüm oldu.
			tail.next=head;  // dairesel olduğundan tail'in nexti'de yeni dugumu gösterecek.
			head.prev=tail;  //yeni eklenen düğümün previ'de artık tail'i gösterecek.
			
		}
	}
	
	void arayaekle() //başa yani head'a dügüm eklemek için fonsiyon oluşturduk.
	{
		System.out.println("İndis'i giriniz: "); //araya ekleyeceğimiz için düğüm hangi indis olarak ekleneceğini kullanıcıdan alıyoruz.
		indis=scanner.nextInt();
		System.out.println("data giriniz: ");
		data=scanner.nextInt();
		
		Node dugum=new Node(data);//datayı ve indisi kullanıcıdan aldık düğüm oluşturduk 
		if (head==null)  //eğer başlangıçta liste boş ise araya ekleme işlemi gerçekleştirilemez.
		{
			System.out.println("Liste bos olduğu için araya ekleme işlemi yapamazsınız.!");
		}
		
		else   // eger listede en az 1 yada 1 den fazla düğüm var ise 
		{
			temp=head; 
			temp2= temp;
			int n=0;
			while (temp!=tail)
			{
				n++;
				temp=temp.next;
			}
			temp=head;
			int i=0;
			while (i<indis)
			{
				temp2=temp;
				temp=temp.next;
				i++;
			}
			if (n<indis)
			{
				tail.next=dugum;  //eklenen dugum sona eklendiği için eski tail'in next'i yeni tail'i gösterecek
				dugum.prev=tail;  // eski dugum'in previ'de sona eklenen yeni düğümü gösterecek. 
				tail=dugum;  //artık sondaki düğüm yeni eklediğimiz düğüm oldu.
				tail.next=head;  // dairesel olduğundan tail'in nexti'de yeni dugumu gösterecek.
				head.prev=tail;  //yeni eklenen düğümün previ'de artık tail'i gösterecek.
					
			}
			else
			{
			temp2.next=dugum;  //temp2'nin next'i ekliyeceğimiz düğümü gösteriyor
		 	dugum.prev=temp2;  //ekleyeceğimiz düğümün previ'de temp2 yi gösteriyor.
		 	dugum.next=temp;  //eklediğimiz düğümün next'ine ekleyecegimzi yerden sonraki düğümü gösteriyor.
		 	temp.prev=dugum;  //ekleyeceğimiz yerden sonraki düğümün previ'de araya eklenecek düğümü gösteriyor.
			}
			
		}
		
	}
	
	void sonaekle() //sona yani tail'a dügüm eklemek için fonsiyon oluşturduk.
	{
		System.out.println("data giriniz: ");
		data=scanner.nextInt();
		
		Node dugum=new Node(data);  //datayı kullanıcıdan aldık düğüm oluşturduk 
		if (head==null)  //eğer başlangıçta liste boş ise hem head hemde tail girilen data oluyor yani ilk düğüm oluşturuluyor.
		{
			head=dugum;  //head'ı belirledik.
			tail=dugum;  //tail'i belirledik.
			head.next=tail;  // tek düğüm olduğunda head' ın next'i tail'i gösterir.
			tail.prev=head;  // tail de tek düğüm olduğundan şu anda mecburen head'i gösterecek.
			head.prev=tail;  // burada tek düğüm olduğundan prev'de o düğümü gösterir.
			tail.next=head;	 //// burada tek düğüm olduğundan next'de o düğümü gösterir.
		}
		else  // eger listede en az 1 düğüm var ise veya liste boş değilse
		{
			tail.next=dugum;  //eklenen dugum sona eklendiği için eski tail'in next'i yeni tail'i gösterecek
			dugum.prev=tail;  // eski dugum'in previ'de sona eklenen yeni düğümü gösterecek. 
			tail=dugum;  //artık sondaki düğüm yeni eklediğimiz düğüm oldu.
			tail.next=head;  // dairesel olduğundan tail'in nexti'de yeni dugumu gösterecek.
			head.prev=tail;  //yeni eklenen düğümün previ'de artık tail'i gösterecek.
			
		}
	}
	
	void bastanSil()
	{
		if(head==null)
			System.out.println("Liste Boş olduğundan Silme işlemi yapılamaz.!");
		else if (head==tail)// listede 1 eleman varsa
		{
			head=null;
			tail=null;
		}
		else
		{
		head=head.next; //bir sonraki düğümü head yap.
		head.prev=tail; //yeni head'in previni tail yap.
		tail.next=head;  //tail'in nextini yeni head yap.
		}
	}
	
	void AradanSil()
	{
		if(head==null)
			System.out.println("Liste Boş olduğundan Silme işlemi yapılamaz.!");
		
		else
		{
			System.out.println("İndis: ");
			indis=scanner.nextInt();
			
			if (indis==0 && head!=tail) {
				head=null;
				tail=null;
			}
			else if (indis==0 && head==tail) {
			
				head=head.next;
				head.prev=tail;
				tail.next=head;
				
			}
			else
			{
			 int n=0;
			 temp=head;
			 while (temp!=tail)
			 {
				 n++;
				 temp=temp.next;
			 }
			 if (indis >= n)
			 {
				 tail=temp;
				 tail.next=head;
				 head.prev=tail;
			 }
			 else
			 {
				 temp=head;
				 temp2=temp;
				 int i=0;
				 while (i<indis)
				 {
					 i++;
					 temp2=temp;
					 temp=temp.next;
				 }
				 
				 temp2.next=temp.next;
				 temp.next.prev=temp2;
				 
			 }
			}
		}
		}
		
	void SondanSil()
	{
		if(head==null)
			System.out.println("Liste Boş olduğundan Silme işlemi yapılamaz.!");
		else if (head==tail)// listede 1 eleman varsa
		{
			head=null;
			tail=null;
		}
		else
		{
		 temp=head; //temp bastaki düğümü göstersin burada sonuncu indisi bulacagız.
		 while (temp.next!=tail) //temp'in next'i son düğüme gelene kadar devam
		 {
			temp=temp.next;
		 }
		 tail=temp;//son düğümü silcegimiz için tail tempi göstersin.
		 tail.next=head; //yeni tailin next'i head'i göstersin
		 head.prev=tail; //head'in previ yeni tail'i göstersin.
		 
		 
		}
	}
	
	void yazdir()
	{
		if (head==null) //head boş ise yani listede düğüm yoksa
		{
			System.out.println("Liste Boş olduğundan yazdırma işlemi yapılamaz.!");
		}
		else // eger listede düğüm var ise 
		{
			temp=head; //temp'i başa getiriyoruz baştan yazdırmaya başlamak için
			System.out.print("Dügüm Başlangıcı->");
			while (temp!=tail)  // temp' son düğüme gelene kadar yazdırmak için while döngüsünde yazdırıyoruz.
			{
				System.out.print(temp.data + "->"); //temp'in olduğu dügümü yaz.
				temp=temp.next;  //her düğümü yazdırdıktan sonra bir sonraki düğüme geç.
			}
			System.out.print(temp.data + "-> Düğüm Sonu"); /*while son düğüme kadar gidip son düğümü yazdırmadığı için
			son düğümü burada yazdırıypruz. temp eşit değilse yazdırıyor fakat eşit olunca cıkıyor bizde son düğümü burada 
			yazdırıyoruz.*/
			System.out.println("");
		}
		
	}
}
