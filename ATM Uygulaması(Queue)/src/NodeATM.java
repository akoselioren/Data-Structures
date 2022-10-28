
public class NodeATM //Burada kuyruğu oluşturduk.
{
	String isim;
	int cekilendeger,ucret;
	NodeATM next;
	public NodeATM(String isim, int cekilendeger) {
		this.isim = isim;
		this.cekilendeger = cekilendeger;
		ucret =cekilendeger;
		next=null;
	}
}
