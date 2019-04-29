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
	public void Test(){

	}
    public void getTest(){
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
    }
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
    }
    public static void main(String[] args) {
        
        Test testOne = new Test();
        testOne.getTest();
        testOne.getTestSecond();
        testOne.getTestThird();
        testOne.getForth();
        testOne.getFifth();
        testOne.getSixth();
        testOne.getSeventh();
    }
}