package jvmTest;

public class MainTest extends Father {
	
	int a = 1;
	
	ViceTest vt= new ViceTest();
	
	MainTest(){
		System.out.print(this);
	}
	
	void C() {
		this.a = 1;
	}
	public static void main(String[] args) {
		
		MainTest mt = new MainTest();
		System.out.println("?"+MainTest.class);
		System.out.print(mt);
		mt.vt.toString();
	}

}
