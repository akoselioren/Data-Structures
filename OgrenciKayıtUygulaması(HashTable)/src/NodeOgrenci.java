
public class NodeOgrenci {

	int numara; //key
	String ad;
	int ort;
	String durum;
	NodeOgrenci next;
	public NodeOgrenci() {
		next=null;
	}
	public NodeOgrenci(int numara, String ad, int ort) {
		this.numara = numara;
		this.ad = ad;
		this.ort = ort;
		this.durum = ort<50 ? "Kaldı" : "Geçti";
		next=null;
	}
	
	
	
}
