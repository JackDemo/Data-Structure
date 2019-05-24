package search;

import main.TriNode;

public class BinarySortTree<T extends Comparable<? super T>> {
	TriNode<T> root;
	public BinarySortTree() {
		this.root = null;
	}
	public BinarySortTree(T[] values) {
		this();
		for (int i = 0; i < values.length; i++) {
			this.add(values[i]);
		}
	}
	public boolean isEmpty() {
		if (this.root == null) {
			return true;
		}
		return false;
	}
	public TriNode<T> searchNode(T key) {
		TriNode<T> p = this.root;
		while (p!=null&&key.compareTo(p.data)!=0) {
			if (key.compareTo(p.data)<0) {
				p = p.left;
			}else {
				p = p.right;
			}
		}
		return p!=null?p:null;
	}
	/**
	 * 插入对象不能为Null或者重复对象
	 * @param value 插入对象 
	 * @return 插入是否成功
	 */
	public boolean add(T value) { 
		if (value==null) {
			throw new NullPointerException();
		}
		if (this.root==null) {
			this.root = new TriNode<T>(value);
		}else {
			TriNode<T> p = this.root;
			TriNode<T> parent = null;
			while(p!=null) {
				if (p.data.compareTo(value)==0) {
					return false;
				}
				parent = p;
				if (p.data.compareTo(value)<0) {
					p = p.right;
				}else {
					p = p.left;
				}
			}
			if (value.compareTo(parent.data)<0) {
				parent.left = new TriNode<T>(value,parent,null,null);
			}else {
				parent.right = new TriNode<T>(value,parent,null,null);
			}
		}
		return true;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		TriNode<T> p = this.first(this.root);
		while (p!=null) {
			str.append(p.data.toString());
			p = this.next(p);
		}
		return str.toString();
	}
	public TriNode<T> first(TriNode<T> p) {
		if (p!=null) {
			while (p!=null) {
				p = p.left;
			}
		}
		return p;
	}
	public TriNode<T> next(TriNode<T> p) {
		if (p!=null) {
			if (p.right!=null) {  //如果p的右子树不为空，则p的后继节点为右子树的第一个访问节点
				return first(p.right);
			}
			while (p.parent!=null) { //如果p的右子树为空，则向上寻找p的父母节点，如果父节点的做孩子为p，则父节点为p的后继节点
				if (p.parent.left==p) {
					return p.parent;
				}
				p = p.parent;
			}
		}
		return null;
	}
}
