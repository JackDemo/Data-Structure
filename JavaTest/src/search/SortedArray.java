package search;
/**
 * 此查找工具类为二分法查找（适用于数据量较小的情况）
 * 需要将<br>
 * 1.数据顺序存储<br>
 * 2.数据元素排序(实现Comparable接口)<br>
 * 的情况下方可使用
 *
 */
public class SortedArray {
	public static <T extends Comparable<? super T>> int binarySearch(T[] value,int begin,int end,T key) {
		while (begin<=end) {
			int mid = (begin+end)/2;
			if (key.compareTo(value[mid])==0) {
				return mid;
			}else if(key.compareTo(value[mid])>0){
				begin = mid+1;
			}else {
				end = mid-1;
			}
		}
		return -1;
	}
	public static <T extends Comparable<? super T>> int binarySearch(T[] value,T key){
		return binarySearch(value, 0, value.length-1, key);
	} 
}
