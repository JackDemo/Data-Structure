package main;

public class ThreadBinaryNode<T> {
	
	public T data;
	public ThreadBinaryNode<T> left,right;
	public boolean ltag,rtag;
	public ThreadBinaryNode(T data, ThreadBinaryNode<T> left,  boolean ltag, ThreadBinaryNode<T> right,boolean rtag) {
		this.data = data;
		this.left = left;
		this.right = right;
		this.ltag = ltag;
		this.rtag = rtag;
	}
	public ThreadBinaryNode(T data) {
		this(data, null, false, null, false);
	}
	public boolean isLeaf() {
		if (this.left==null&&this.right==null) {
			return true;
		}
		return false;
	}
	public String toString() {
		return this.data.toString();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
