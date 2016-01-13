package pk.ciit.Calc;

public class Claculator implements CalInterface {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2; 
	}
                
	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int devide(int num1, int num2) throws ArithmeticException {
		// TODO Auto-generated method stub
		if(num2==0)
		throw new ArithmeticException("division by zero");
		return num1 / num2;
	}

}
