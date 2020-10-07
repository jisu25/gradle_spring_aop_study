package gradle_spring_aop_study.aop03;

public class Main {
	public static void main(String[] args) {

		int num = 5;
		long result = 0;
		
		ExeTimeCalculator implCalculator = new ExeTimeCalculator(new ImplCalculator());
		result = implCalculator.factorial(num);
		System.out.printf("%d! = %d\n", num, result);
		
		ExeTimeCalculator recCalculator = new ExeTimeCalculator(new RecCalculator());
		result = recCalculator.factorial(num);
		System.out.printf("%d! = %d\n", num, result);
		
	}
}