package com.javaBase.controller;

import org.junit.Test;

import java.util.Date;

public class DateTest {

    @Test
    public void main(){
        Date nowDate = new Date();
        System.out.println(nowDate.after(nowDate));
        System.out.println(nowDate + "//" + new Date());
    }
}
