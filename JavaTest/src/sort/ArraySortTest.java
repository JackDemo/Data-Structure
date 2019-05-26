package sort;

import java.util.Random;

/**
 * 数组排序算法实现类
 * @author JackDemo
 *
 */
public class ArraySortTest {
	public static int[] randomInt(int n,int size) {
		int result[] = new int[size];
		Random random = new Random();
		for (int i = 0; i < result.length; i++) {
			result[i] = random.nextInt(n);
		}
		return result;
	}
	public static void print(int[] values) {
		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
	}
	/**
	 * 基于插入排序
	 * 直接插入算法排序 时间复杂度在O(n)~O(n^2)之间
	 * 该排序算法稳定
	 * @param values 排序队列
	 */
	public static void insertSort(int[] values) {
		for (int i = 1; i < values.length; i++) {
			int temp = values[i];
			int j;
			for (j= i-1;j>=0&&temp<values[j]; j--) {
				values[j+1] = values[j];
			}
			//System.out.println(j);
			values[j+1] = temp;
		}
		ArraySortTest.print(values);
	}
	/**
	 * 基于插入排序
	 * 希尔排序算法排序 时间复杂度在O(n)~O(n^2)之间
	 * 该排序算法不稳定
	 * @param values 排序队列
	 */
	public static void shellSort(int[] values) {
		for (int delta = values.length/2; delta > 0; delta/=2) {
			for (int i = delta; i < values.length; i++) {
				int temp=values[i],j;
				for (j = i-delta; j >=0&&temp<values[j]; j-=delta) {
					values[j+delta] = values[j];
				}
				values[j+delta] = temp;
			}
		}
		ArraySortTest.print(values);
	}
	/**
	 * 基于交换排序
	 * 冒泡排序算法排序 时间复杂度在O(n)~O(n^2)之间
	 * 该排序算法稳定
	 * @param asc true 升序   false 降序 
	 * @param values 排序队列
	 */
	public static void bubbleSort(int[] values,boolean asc) {
		int temp;
		for (int i = 1; i < values.length; i++) {
			for (int j = 0; j < values.length-1; j++) {
				if (asc?values[j]>values[j+1]:values[j]<values[j+1]) {
					temp = values[j+1];
					values[j+1] = values[j];
					values[j] = temp;
				}
			}
		}
		ArraySortTest.print(values);
	}
	/**
	 * 基于交换排序
	 * 快速排序算法排序 时间复杂度在O(nlog2(n))~O(n^2)之间
	 * 该排序算法不稳定
	 * @param values 排序序列
	 * @param begin 第一个元素下标
	 * @param end 最后一个元素下标
	 */
	public static void quickSort(int[] values,int begin,int end) {
		if (begin>=0&&begin<values.length&&end>=0&&end<values.length&&begin<end) {
			int i = begin;
			int j = end;
			int vot = values[i];
			while (i!=j) {
				while (i<j&&values[j]>=vot) 
					j--;
				if (i<j) {
					values[i++] = values[j];
				}
				while (i<j&&values[i]<=vot) 
					i++;
				if (i<j) {
					values[j--] = values[i];
				}
			}
			values[i] = vot;
			quickSort(values, begin, j-1);
			quickSort(values, i+1, end);
			}
	}
	/**
	 * 基于选择排序
	 * 直接选择排序算法排序 时间复杂度O(n^2)
	 * 该排序算法不稳定
	 * @param values 排序序列
	 */
	public static void selectSort(int[] values) {
		for (int i = 1; i < values.length; i++) {
			int min = i;
			int temp;
			for (int j = i; j < values.length; j++) {
				if (values[min]>values[j]) {
					min = j;
				}	
			}
			if (min!=i) {
				temp = values[min];
				values[min] = values[i];
				values[i] = temp;
			}
		}
		print(values);
	}
	/**
	 * 基于选择排序
	 * 堆排序算法排序 时间复杂度O(nlog2(n))
	 * 该排序算法不稳定
	 * @param keys 排序序列
	 * @param minheap true 最小堆排序 false 最大堆排序
	 */
	public static void heapSort(int[] keys,boolean minheap) {
		for (int i = keys.length/2-1; i >= 0; i--) {
			sift(keys, i, keys.length-1, minheap);
		}
		for (int i = keys.length-1; i > 0; i--) {
			int temp = keys[0];
			keys[0] = keys[i];
			keys[i] = temp;
			sift(keys, 0, i-1, minheap);
		}
	}
	private static void sift(int[] keys,int parent,int end,boolean minheap) {
		int child = 2*parent+1;
		int value = keys[parent];
		while (child<=end) {
			if (child<end&&(minheap?keys[child]>keys[child+1]:keys[child]<keys[child+1])) {
				child++;
			}
			if(minheap?value>keys[child]:value<keys[child]) {
				keys[parent] = keys[child];
				parent = child;
				child = 2*parent+1;
			}
			else {
				break;
			}
		}
		keys[parent]=value;
	}
	public static void main(String[] args) {
		int[] start = {81,49,19,38,97,76,13,19};
		print(start);
		insertSort(start);
		shellSort(start);
		bubbleSort(start, true);
		quickSort(start, 0, start.length-1);
		print(start);
		selectSort(start);
		heapSort(start, true);
		print(start);
		
	}
}
