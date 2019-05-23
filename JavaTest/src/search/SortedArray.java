package search;
/**
 * �˲��ҹ�����Ϊ���ַ����ң���������������С�������
 * ��Ҫ��<br>
 * 1.����˳��洢<br>
 * 2.����Ԫ������(ʵ��Comparable�ӿ�)<br>
 * ������·���ʹ��
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
