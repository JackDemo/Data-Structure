package main;

public class BinaryNode<T> {

	public T data;
	public BinaryNode<T> left,right;
	public BinaryNode(T data,BinaryNode<T> left,BinaryNode<T> right) {
		this.data= data;
		this.left = left;
		this.right = right;
	}
	public BinaryNode(T data) {
		this(data,null, null);
	}
	
	@Override
	public String toString() {
		return this.data.toString();
	}
	public boolean isLeaf() {
		return this.left == null && this.right == null;
	}
	public static void main(String[] args) {
		BinaryNode< Integer> node = new BinaryNode<Integer>(0);

	}

}
