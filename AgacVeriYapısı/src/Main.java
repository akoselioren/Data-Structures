
public class Main {

	public static void main(String[] args) {

		BTree bt=new BTree();
		
		bt.root = bt.insert(bt.root, 10);
		bt.root = bt.insert(bt.root, 15);
		bt.root = bt.insert(bt.root, 8);
		bt.root = bt.insert(bt.root, 20);
		bt.root = bt.insert(bt.root, 4);
		bt.root = bt.insert(bt.root, 12);
		
		
		
		System.out.println("Kökün datası: "+ bt.root.data);
		System.out.println("Kökün sağındaki datası: "+ bt.root.right.data);
		System.out.println("Kökün solundaki datası: "+ bt.root.left.data);
		System.out.println("Kökün solunun solundaki datası: "+ bt.root.left.left.data);
		System.out.println("Kökün sagının sağındaki datası: "+ bt.root.right.right.data);
		System.out.println("Kökün sağındaki solundaki datası: "+ bt.root.right.left.data);
		
	}

}
