public class TestOne{
	public static void main(String[] args) {
		System.out.println("封装、继承和多态");
		Parent parent = new Son();
		parent.makeMoney();
		makeDinner mother = new Mother();
		//mother.hongShaoQieZi();
		mother.hongShaoQieZi();
	}
}

class Parent{//父类
	void getName()  {
		System.out.println("Father");
	}
	void makeMoney() {
		System.out.println("It can make money.");
	}
}
class Son extends Parent{
	void getName()  {
		System.out.println("Son");
		
	}
	void makeMoney(){
		System.out.println("It can make money by using  knowledge.");
	}
}
interface makeDinner{
	public void hongShaoQieZi();
}

class Mother extends Parent implements makeDinner{
	public void hongShaoQieZi(){
		System.out.println("I can make hongShaoQieZi");
	}
}