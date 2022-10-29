import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		StackYapisi st=new StackYapisi(100);
		QueueYapisi qu=new QueueYapisi(100);
		
		System.out.println("Palindrom nedir : Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir.");
		System.out.println(" ");
		System.out.println("Örneğin : mum, ada, yapay, kazak, küçük, neden, niçin");
		System.out.println("Örnek Cümleler: “ey edip adanada pide ye” veya ''zamkı çok o çıkmaz''");
		System.out.println(" ");
		System.out.println("Örnek Sayılar: 1221 - 123321 - 9889 vb.");
		System.out.println(" ");
		String kelime;
		System.out.print("kelime girin :");
		kelime=scanner.nextLine();
		int n=kelime.length();
		
		char []harfler=kelime.toCharArray();
		int i=0;
		
		while (i<n) 
		{
			st.push(harfler[i]);
			qu.enQueue(harfler[i]);
			i++;
		}
		boolean sonuc=true;
		
		while (!st.isEmpty()) 
		{
			if (st.pop() != qu.deQueue())
			{
				sonuc=false;
				break;
			}
		}
		if (sonuc)
		{
			System.out.println(kelime + " palindromdur. ");
		}
		else
		{
			System.out.println(kelime + " palindrom değildir. ");
				
		}
	}

}
