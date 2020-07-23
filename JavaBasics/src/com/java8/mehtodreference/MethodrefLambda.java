package com.java8.mehtodreference;

public class MethodrefLambda {
	
	public static void main(String[] args) {
		
		// by implementing in another claass
		MathCalculation mathCal = new Mathcalculations();
		mathCal.add();
		
		
		
		
		//This is for normal implementation before java 8 with out new class
		MathCalculation matcal1 = new MathCalculation() {
			
			@Override
			public void add() {
				int a = 10;
				int b= 20;
				System.out.println(a+b);
				
			}
		};
		
		

		//			java lambda		
		MathCalculation matcal2 = ()-> {
										int a = 10;
										int b= 20;
										System.out.println(a+b);
			
									};
									
									System.out.println("1");
		//this is lambda expression
		MathCalculation matcal3 = ()->  MethodreferenceStaticMethod.add();
		matcal3.add();
		
		System.out.println("2");
		//Static method reference
		//this is method reference in which compiler will create lambda for this 
		MathCalculation matcal4 = MethodreferenceStaticMethod::add;
		matcal4.add();
		
		
		  System.out.println("3"); 
		  //Reference to an Instance Method MathCalculation
		  MathCalculation matcal5 = new MethodreferenceInstance()::add;
		  matcal5.add();
		  
		  System.out.println("4");
		  //Constructor reference 
		  MathCalculation matcal6 =  MethodreferenceConstructor::new;
		  matcal6.add();
		  
		  System.out.println("5");
		  MathCalculation matcal7 =  MethodreferenceInstance::new;
		  matcal7.add();
		  
		
		 
				
		
		
				
		
		
					
									
		
		
		
		
	}

}
