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
    * print muti-tabel
    *
    */
    public void getForth(){
        for (int i = 1;i<=9 ;i++ ) {
            for (int j = 1;j<=i ;j++ ) {
                System.out.print(" "+j+"*"+i+"="+i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Test testOne = new Test();
        testOne.getTest();
        testOne.getTestSecond();
        testOne.getTestThird();
        testOne.getForth();
    }
}