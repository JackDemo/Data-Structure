import java.util.Date;
import java.util.Locale;
import java.util.Arrays;
//import java.util.StringBuilder;
/**
*start out learning route
*@author  JackDemo
*@version  0.0.1
*/
public class Test {
    /**
    *@param name 使用者姓名
    *@param id 使用者id 不可更改
    */
	final	String  id = "007";
	String name = "Zhang Mingkun";
	int age = 24;
    Test getTest()  {
        return this;
    }
  /*  public void getTest(){
        int numInt = 8;
        float num = 43.2f;
        System.out.println("Hello World");
        System.out.println(1+2+3);
        //System.out.println(Test.id);
        System.out.println(new Test().age);
        System.out.println(numInt>>3);
        if (numInt>2) {
            System.out.println(numInt+" bigger than 2");
        }else if (numInt>5) {
            System.out.println(numInt+" bigger than 5");
        }else if (numInt>10) {
            System.out.println(numInt+" bigger than 10");
        }
        String today = "10";
        int num_day = Integer.parseInt(today);
        switch(num_day){
            case 1: {
                System.out.println(" Input 1");   
            }
            case 10: {
                System.out.println(" Input 10");    
                break;
            }
            default:System.out.println(" Input otherthing");
        }
    }*/
    public void getTestSecond(){
        int num = 1;
        int sum = 0;
        while(num<=10){
            sum = sum+num;
            num++;
        }
        System.out.println("sum finally equal " + sum);
        do{
            num--;
            System.out.println(num);
        }while(num!=1);
    }
    public void getTestThird(){
        int array[] = {1,2,3,4,5,6};
        for (int num : array ) {
            System.out.println(num);
        }
    }
    /**
    * 打印乘法表 并在5处跳出
    */
    public void getForth(){
        LOOP : for (int i = 1;i<=9 ;i++ ) {
            for (int j = 1;j<=i ;j++ ) {
                System.out.print(" "+j+"*"+i+"="+i*j);
                if (j==5) {
                    break LOOP;
                }
            }
            System.out.println();
        }
    }
    /**
    * 打印菱形
    */
    public void getFifth(){
        System.out.println();
        for (int row = 1; row<=10;row++ ) {
            for (int j = 1; j<=10-row;j++ ) {
               System.out.print(" "); 
            }
            for (int i  = 1; i<=2*row-1;i = i+1 ) {
                System.out.print("*");
            }
            System.out.println("");           
        }
        for (int row = 9; row>=1;row--) {
            for (int j = 1; j<=10-row;j++ ) {
               System.out.print(" "); 
            }
            for (int i  = 1; i<=2*row-1;i = i+1 ) {
                System.out.print("*");
            }
            System.out.println("");           
        }
        System.out.println("");
    }
    /**
    * 打印1+1/2！+1/3！+.....+1/20！
    */
    public void getSixth(){
        int num = 1;
        double sum = 0;
        while(num<=20){
            int i = num;
            long result = 1;
            while(i>0){
                result = result*i;
                i--;
            }
            //System.out.println(result);
            sum = sum + (double)1/result;
            num++;
        }
        //return sum
        System.out.println(sum);
        //System.out.println((double)1/10);
    }
    /**
    *对字符串进行操作
    */
    public void getSeventh(){
        String str = "I am Iroy man .";
        System.out.println(str.indexOf("I"));
        System.out.println(str.lastIndexOf("m"));
        System.out.println(str.charAt(6));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,8));
        System.out.println(str.trim());//去除首尾字符串的空格
        System.out.println(str.replace(" ",""));      
        System.out.println(str.startsWith("I"));
        System.out.println(str.endsWith("."));

        String Tom = "Jerry";
        String John = "Jerry";
        System.out.println(Tom==John);      

        String s1 = new String("Go to bedroom");
        String s2 = new String("Go to bedroom");
        System.out.println(s1==s2);      
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("Jerry".compareTo("JackDemo"));
        System.out.println("Jerry".toLowerCase());
        System.out.println("Jerry".toUpperCase());

        String str_ = "192.168.1.1";
        String[] firstArray = str_.split("\\.");
        String[] secondArray = str_.split("\\.",3);//limit参数代表的意义是分割后形成limit段

        System.out.println("未分割： "+str_);
        for (String a : firstArray ) {
            System.out.print("["+a+"]");
        }
        System.out.println();
        for (String a : secondArray) {
            System.out.print("["+a+"]");
        }
    

    }
    public void getEight(){
          Date date = new Date();

          String year = String.format("%tY",date);
          String month = String.format("%tm",date);
          String day = String.format("%td",date);  

          String weekday = String.format(Locale.SIMPLIFIED_CHINESE,"%tA",date);

          System.out.println("Now,the time is:"+year+"-"+month+"-"+day+" "+weekday);
    }    
    /**
    * 判断输入字符串是否是QQ邮箱
    */
    public void getNinth(){
        String regx = "\\d{5,11}@qq.com";
        String s1 = "1215211544@qq.com";
        String s2 = "zmk1215211544@outlook.com";
       
        System.out.println(s1.matches(regx));
        System.out.println(s2.matches(regx));
                
        StringBuilder str = new StringBuilder("");
            for (int i = 0;i<=10;i++ ) {
                str.append(i);
            }
        System.out.println(str.toString());
    }
    void getTen(){
        int day[]  = new int[]{1,2,3,4,5,6,7};
        int num_day[] = {1,2,3,4,5,6,7};
        int arrayOne[][] = new int[3][4];
        int array[][] = new int[2][];
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{4,5,6,6,6,6,6,7,8}; 

        for (int[] x : array) {
            for (int e : x) {
                System.out.print(e);
            }
            System.out.println();
        }
        Arrays.sort(array[1]);
        for (int[] x : array) {
            for (int e : x) {
                System.out.print(e);
            }
            System.out.println();
        }
        int newarray[] = Arrays.copyOfRange(array[1],1,array[1].length);
        for (int e : newarray) {
            System.out.print(e);
        }
        System.out.println();
        Arrays.sort(newarray);
        int index = Arrays.binarySearch(newarray,6);
        System.out.println(index);
    }
    /*冒泡排序时间复杂度在O(1)~O(n^2)之间*/
    void BubbleSort(){
        
        int arr[] = {43,4,24,1,3,15};

        int length =arr.length;
        int arr_max;
        int arr_min;

        for (int j = 0;j<length-2 ;j++ ) {//最后第二轮比较找出第3位置最大值时已经确定第一位置与第二位置的值
            for (int i = 0; i<length-1-j; i++) {
                if(arr[i]>arr[i+1])
                {
                    arr_max = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = arr_max;
                }
            }
    
        }
        

        for (int e : arr) {
            System.out.print(e+" ");
        }
    }
    /*直接选择排序时间复杂度为O(n^2)   不稳定算法*/
    void SelectSort(){
        int arr[] = {43,4,24,1,3,15};
        int length =arr.length;

        int temp;
        int index = 0;

        for (int j = 1;j<length ; j++) {
            index = 0;
            for (int i=1;i<=length-j; i++) {
               if(arr[index]<arr[i]){
                    index = i;
                }        
            }
            temp = arr[length-j];
            arr[length-j] = arr[index];
            arr[index] = temp;
        }
          


        for (int e : arr) {
            System.out.print(e+" ");
        }
    }
    /*数组转置*/
    void T(){
        int array[][] = {{1,2,3,4,5},{6,7,8,9,10}};
        for (int arr[] : array) {
            for (int e : arr) {
                System.out.print(e);
            }
            System.out.println();
        }        

        int row = array.length;
        int cols = array[0].length;

        for (int i = 0 ; i<cols;i++ ) {
            for (int j = 0;j<row;j++ ) {
                System.out.print(array[j][i]+"");
            }
            System.out.println();
        }


    }
    public static void main(String[] args) {
        
        Test testOne = new Test();
        // testOne.getTest();
        // testOne.getTestSecond();
        // testOne.getTestThird();
        // testOne.getForth();
        // testOne.getFifth();
        // testOne.getSixth();
        // testOne.getSeventh();
        // testOne.getEight();
        // testOne.getNinth();
        testOne.getTen();
        testOne.maoPaoSort();
        testOne.SelectSort();
        testOne.T();
        // Test testOne =  testOne.getTest();
    }
}
