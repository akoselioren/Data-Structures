
public class StackYapisi {

	Node top;
	int size;
	int cnt;
	public StackYapisi(int size) {
		this.size = size;
		cnt=0;
		top=null;
	}
	void push(char ch)
	{
		if (! isFull()) 
		{
			Node dugum=new Node(ch);
			if (isEmpty()) 
			{
				top=dugum;
			}
			else 
			{
				dugum.next=top;
				top=dugum;
			}
			cnt++;
		}
	}
	char pop()
	{
		if (! isEmpty()) 
		{
			char ch=top.harf;
			top=top.next;
			cnt--;
			return ch;
		}
		else
		{
			return '+';
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
