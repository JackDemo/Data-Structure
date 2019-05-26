package main;

public class Test {

	public static void main(String[] args) {
//		//MyList<String> mylist = new MyList();
//		System.out.println("Josephus Problem");
//		Test name = new Test(5,0,2);
		String str = "aabbbcccc";
		StringBuilder result = new StringBuilder();
		int i = 0;
		int j = 0;
		char pattern = str.charAt(0);
		do {
			if (pattern!=str.charAt(i)) {
				result.append(pattern+""+j);
				j = 1;
				pattern = str.charAt(i);

			}else {
				j++;
			}
			i++;
		}while(i<str.length());
		result.append(pattern+""+j);
		System.out.println(result);
	}
	public Test(int number,int start,int distance) {
		MyList< String> myList = new MyList<String>(number);
		for (int i = 0; i < number; i++) {
			myList.insert(i, (char)('A'+i)+"");
			
		}
		System.out.println(myList.toString());
		int i = start;
		while (myList.getSize()>1) {
			if (i+distance-1<myList.getSize()) {
				i = i + distance-1;
				System.out.println(myList.remove(i));
			}else {
				i = (i+distance-1)%myList.getSize();
				System.out.println(myList.remove((i)));
				
			}
		}
		System.out.println(myList.toString());
	}
}
