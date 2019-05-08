package main;

import javax.management.openmbean.OpenDataException;

public class ExpressionBinaryTree extends BinaryTree<ExpData> {

	private int i = 0;
	public ExpressionBinaryTree(String prelist) {
		this.root = create(prelist);
	}
	private BinaryNode<ExpData> create(String prelist) {
		BinaryNode<ExpData> p = null;
		if(i < prelist.length()) {
			T elem = prelist[i];
			i++;
			if (elem!=null	) {
				p = new BinaryNode<ExpData>(new ExpData(value, oper));
				p.left = create(prelist);
				p.right = create(prelist);
				
			}
		
		}
		return p;
		
		return null;
	}
	public static void main(String[] args) {
		

	}

}
