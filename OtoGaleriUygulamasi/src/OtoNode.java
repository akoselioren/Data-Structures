
public class OtoNode {

	String plaka,marka,model,renk,aciklama;
	int alisFiyati,satisFiyati;
	OtoNode next;
	public OtoNode(String plaka, String marka, String model, String renk, String aciklama, int alisFiyati
		) {
		super();
		this.plaka = plaka;
		this.marka = marka;
		this.model = model;
		this.renk = renk;
		this.aciklama = aciklama;
		this.alisFiyati = alisFiyati;
		this.satisFiyati = alisFiyati * 12/10;
		next=null;
	}
}
