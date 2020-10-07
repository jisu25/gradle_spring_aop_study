package gradle_spring_aop_study.aspect;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ExeTimeAspect {

	// 적용할 대상. (aop03 패키지의 리턴 타입과 상관없이 public인 메서드 모두)
	@Pointcut("execution(public * gradle_spring_aop_study.aop03..*(..)")
	private void publicTarget() {
	}
	
	// advice. 적용 시점.
	@Around("publicTarget()")
	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {
		long start = System.nanoTime();
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			long finish = System.nanoTime();
			Signature sig = joinPoint.getSignature();
			System.out.printf("%s.%s(%s) 실행시간 : %d ns%n",
					joinPoint.getTarget().getClass().getSimpleName(),
					sig.getName(), Arrays.deepToString(joinPoint.getArgs()), (finish - start));
		}
	}
}
