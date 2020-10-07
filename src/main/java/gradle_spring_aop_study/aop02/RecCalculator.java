package gradle_spring_aop_study.aop02;

public class RecCalculator implements Calculator {

	@Override
	public long factorial(long num) {
		if(num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

}
