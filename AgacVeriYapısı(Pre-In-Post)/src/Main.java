
public class Main {

	public static void main(String[] args) {
		Tree bst=new Tree();
		bst.root=bst.insert(bst.root, 10);
		bst.root=bst.insert(bst.root, 8);
		bst.root=bst.insert(bst.root, 15);
		bst.root=bst.insert(bst.root, 5);
		bst.root=bst.insert(bst.root, 12);
		bst.root=bst.insert(bst.root, 20);
		bst.root=bst.insert(bst.root, 9);
		
		
		System.out.print("PreOrder  : ");
		bst.preOrder(bst.root);
		
		System.out.println();
		
		System.out.print("InOrder   : ");
		bst.InOrder(bst.root);
		
		System.out.println();
		
		System.out.print("PostOrder : ");
		bst.postOrder(bst.root);
		
		System.out.println();
		
		System.out.println("Ağacın yüksekliği: " + bst.height(bst.root));
		
		System.out.println("Ağac üzerindeki eleman sayısı: " + bst.size(bst.root));

	}

}
