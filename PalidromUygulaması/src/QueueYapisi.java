
public class QueueYapisi
	{
		Node front;
		Node rear;
		int cnt;
		int size;
		public QueueYapisi(int size) {
			super();
			this.size = size;
			front=null;
			rear=null;
			cnt=0;
		}
		void enQueue(char ch)
		{
			 if (! isFull())
			{
				 Node dugum=new Node(ch);
				 
				 if (isEmpty())
				 {
					 front=dugum;
					 rear=dugum;
				 }
				 else
				 {
					 rear.next=dugum;
					 rear=dugum;
				 }
				 cnt++;
			}
		}
		char deQueue()
		{
			if (! isEmpty())
			{
				char ch=front.harf;
				front=front.next;
				cnt--;
				return ch;
			}
			else
				return '+';
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
