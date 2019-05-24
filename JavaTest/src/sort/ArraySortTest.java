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
	public static void main(String[] args) {
		int[] start = {32,26,87,72,26,17};
		ArraySortTest.print(start);
		ArraySortTest.insertSort(start);
		ArraySortTest.shellSort(start);
		ArraySortTest.bubbleSort(start, false);
	}
}
