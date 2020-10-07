package gradle_spring_aop_study;

public class Main {
	public static void main(String[] args) {

		long start = 0;
		long end = 0;
		
		ImplCalculator implCal = new ImplCalculator();
		start = System.currentTimeMillis();
		implCal.factorial(5);
		end = System.currentTimeMillis();
//		System.out.println("ImplCal : " + (end - start));
		
		RecCalculator recCal = new RecCalculator();
		start = System.currentTimeMillis();
		recCal.factorial(5);
		end = System.currentTimeMillis();
//		System.out.println("RecCal : " + (end - start));
		
	}
}
