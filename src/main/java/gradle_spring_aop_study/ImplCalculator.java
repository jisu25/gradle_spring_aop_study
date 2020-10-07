package gradle_spring_aop_study;

public class ImplCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		long start = System.currentTimeMillis();
		
		long result =1;
		for(long i=1; i <=num; i++) {
			result *= i;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("ImplCalculator(" + num + ") 실행시간 : " + (end - start));
		
		return result;
	}

}
