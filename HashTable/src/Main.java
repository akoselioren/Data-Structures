
import javax.swing.table.TableColumn;

public class Main {

	public static void main(String[] args) {
		
		HashTable hTablo=new HashTable(5);
		
		hTablo.ekle(4, "Pelinsu");
		hTablo.ekle(6, "Alican");
		hTablo.ekle(9, "Bensu");
		hTablo.ekle(17, "Berkcan");
		hTablo.ekle(2, "Asu");
		hTablo.ekle(5, "Bircan");
		hTablo.ekle(13, "İlaydasu");
		hTablo.ekle(11, "Atacan");
		
		//hTablo.sil(12);
		
		
		System.out.println();
		
		hTablo.yazdır();
		
	}

}
