package com.aoptest.msg;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Aspect
public class TestMsg {
    @Pointcut("execution(* com.aoptest.sevrice.Imp.TestImp.test1())")
    private void t1(){}
    @Pointcut("execution(* com.aoptest.sevrice.Imp.TestImp.test02())")
    private void t2(){}
    @Pointcut("execution(* com.aoptest.sevrice.Imp.TestImp.test03())")
    private void t3(){}
    @Pointcut("execution(* com.aoptest.sevrice.Imp.TestImp.test04())")
    private void t4(){}
    @Pointcut("execution(* com.aoptest.sevrice.Imp.TestImp.test05())")
    private void t5(){}

    @Before("t1()")
    private void fun1(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
    }

    @After("t2()")
    private void fun2(){
        System.out.println("-------------测试成功-------------");
    }

    @Around("t3()")
    private Object fun3(ProceedingJoinPoint point)throws Throwable{
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
        Object object=point.proceed();
        System.out.println(formattedDateTime);
        return object;
    }

    @AfterThrowing("t4()")
    private void fun4(){
        System.out.println("异常");
    }

    @After("t5()")
    private void fun5(){
        System.out.println("-------------后置通知-------------");
    }

}
