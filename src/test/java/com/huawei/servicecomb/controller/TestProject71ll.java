package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject71ll {

        Project71llDelegate project71llDelegate = new Project71llDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project71llDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}