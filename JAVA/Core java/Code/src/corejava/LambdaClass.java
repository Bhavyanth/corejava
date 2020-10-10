package corejava;

public class LambdaClass {
	
	public void method1() {
		//before java 7
		LambdaInterface a = new LambdaInterface() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		a.method1();
		
		
		//from java8
		LambdaInterface b = () -> {System.out.println("lambda");};
		
		Runnable runa = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Runnable runb = () -> System.out.println("excecute thread code");
		new Thread(runb);
		
	methodb(()->System.out.println("hello"));
		
	}
	
	
	public void methodb(LambdaInterface c) {
		c.method1();
		
	}

}
