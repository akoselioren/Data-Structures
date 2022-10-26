
public class OgrNode {

	int numara, vize, fin;
	String ad, soyad, durum;
	double ortalama;
	
	OgrNode next;

	public OgrNode(int numara, String ad, String soyad, int vize , int fin) {
		this.numara = numara;
		this.vize = vize;
		this.fin = fin;
		this.ad = ad;
		this.soyad = soyad;
		
		ortalama = vize * 0.4 + fin * 0.6;
		
		
		if (ortalama >= 50) {
			
			durum="Geçti";
			
		} else 
			durum="Kaldı";
		
		next=null;
		
	}
	
	
	
}
