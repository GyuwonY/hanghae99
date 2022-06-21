package com.sparta.week02.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


@Aspect
@Component
public class LogAspect {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // PointCut : 적용할 지점 또는 범위 선택
    @Pointcut(value = "execution(public * com.sparta.week02.service..*(..))")
    private void publicTarget() { }

    // Advice : 실제 부가기능 구현부
    @Around("publicTarget()")
    public Object calcPerformanceAdvice(ProceedingJoinPoint pjp) throws Throwable {
        logger.info("성능 측정을 시작합니다.");
        StopWatch sw = new StopWatch();
        sw.start();

        // 비즈니스 로직 (메인 로직)
        Object result = pjp.proceed();

        sw.stop();
        logger.info("성능 측정이 끝났습니다.");
        logger.info("걸린시간: " + sw.getLastTaskTimeMillis() + "ms");
        return result;
    }

    @AfterReturning(value = "publicTarget()",returning = "returnValue")
    public void afterReturn(Object returnValue)
    {
        System.out.println("afterReturn  "+returnValue);
    }

    @Before("publicTarget()")
    public void before(String a, String b){
        System.out.println("before" + a);
        System.out.println("before" + b);
    }
}