package com.aoptest.sevrice.Imp;

import com.aoptest.sevrice.Test;
import org.springframework.stereotype.Service;

@Service("tsevrice")
public class TestImp implements Test {

    @Override
    public void test1() {
        System.out.println("测试1");
    }

    @Override
    public void test02() {
        System.out.println("测试2");
    }

    @Override
    public void test03() {
        System.out.println("测试3");
    }

    @Override
    public void test04() {
//        System.out.println(1/0);
        System.out.println("测试4");
    }

    @Override
    public void test05() {
        System.out.println("测试5");
    }
}
