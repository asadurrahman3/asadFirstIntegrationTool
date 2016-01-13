package pk.ciit.Calc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private static CalInterface calculatorTest; 
	
	public static void init(){
		calculatorTest= new CalInterface() {
			
			@Override
			public int subtract(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 - num2;
			}
			
			@Override
			public int devide(int num1, int num2) throws ArithmeticException {
				// TODO Auto-generated method stub
				return num1 / num2;
			}
			
			@Override
			public int add(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 + num2;
			}
			
		};
		
	}
	
	public static void last(){
		System.out.println("this is excluded");
		
	}
	@Before
	public static void before(){
	System.out.println("this is excluted before each test class");	
	}

	@After
	public  void after(){
		System.out.println("this is exuceted after each test class ");
	}
	@Test
	public  void addTest(){
		int result= calculatorTest.add;
	}
	
	@Test
	public void Subtract(){
		int result= calculatorTest.subtract(num1, num2); 
	}
	
	@Test (expectd=ArthwmaticException.class)
	public void testDevideException() throws ArithmeticException
	Calculator.devide(6,0);
	
}
