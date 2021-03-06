package main;

import java.util.ArrayDeque;
import java.util.LinkedList;



public class Matrix {
	
	private int rows,columns;
	private int[][] element;
	public Matrix(int m,int n) {
		this.element = new int[m][n];
		this.rows = m;
		this.columns = n;
	}
	public Matrix(int n) {
		this(n, n);
	}
	public Matrix(int m,int n,int[][] value) {
		this(m,n);
		for (int i = 0; i < value.length; i++) {
			for (int j = 0; j < value[i].length; j++) {
				this.element[i][j] = value[i][j];
				
			}			
		}
	}
	public int getRows() {
		return this.rows;
	}
	public int getColumns() {
		return this.columns;
	}
	public int get(int i,int j) {
		if (i>=0&&i<this.rows&&j>=0&&j<this.columns) {
			return element[i][j];
		}
		throw new IndexOutOfBoundsException();
	}
	public void set(int i,int j,int x) {
		if (i>=0&&i<this.rows&&j>=0&&j<this.columns) {
			element[i][j] = x;
		}
		throw new IndexOutOfBoundsException();		
	}
	public String toString() {
		StringBuilder str = new StringBuilder(" Matrix"+this.getClass().getName()+"("+this.rows+"*"+this.columns+"):\n");
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.columns; j++) {
				str.append(String.format("%6d", this.element[i][j]));
			}
			str.append("\n");
		}
		return str.toString();
	}
	public void setRowsColumns(int m,int n) {
		if (m>0&&n>0) {
			if (m>this.rows||n>this.columns) {
				int[][] source = this.element;
				this.element = new int[m][n];
				for (int i = 0; i < this.rows; i++) {
					for (int j = 0; j < this.columns; j++) {
						this.element[i][j] = source[i][j];
						
					}					
				}
				this.rows = m;
				this.columns = n;
			}
		}
		else {
			new IllegalArgumentException();
		}
	}
	public static void main(String[] args) {
//		int[][] test = new int[3][3]; 
//		System.out.println(test[0][2]);
//		ArrayList<Integer> test = new ArrayList<Integer>();
//		test.add(1);
//		test.add(2);
//		test.add(3);
//		System.out.println(test.toString());
//		test.remove((Integer)2);
//		System.out.println(test.toString());
		LinkedList<Integer> list =new LinkedList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println(list.poll());
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list.pop());
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		stack.add(0);
		stack.add(1);
		stack.add(2);
		stack.add(3);
		System.out.println(stack);
		System.out.println(stack.poll());
		System.out.println(stack);
	}
}
