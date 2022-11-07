package agacSilmeIslemi;

public class Main {

	public static void main(String[] args) {


		Tree bst=new Tree();
		
		bst.root=bst.insert(bst.root, 10);
		bst.root=bst.insert(bst.root, 8);
		bst.root=bst.insert(bst.root, 15);
		bst.root=bst.insert(bst.root, 20);
		
		bst.inOrder(bst.root);
		
		System.out.println("\nkök düğümdeki değer: "+bst.root.data);
		
		bst.root=bst.delete(bst.root, 10);
		
		System.out.println("\n silme isleminden sonra ");
		
		bst.inOrder(bst.root);
		
		System.out.println("\nkök düğümdeki değer: "+bst.root.data);
	}

}
