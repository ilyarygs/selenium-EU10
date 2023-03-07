package com.cydeo.tests;

import org.testng.annotations.*;

public class Study {

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }

    @Test
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test
    public void test2(){
        System.out.println("This is test 2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is after method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is after class");
    }



}
