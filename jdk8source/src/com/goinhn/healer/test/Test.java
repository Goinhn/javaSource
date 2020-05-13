package com.goinhn.healer.test;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test implements Cloneable {

    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        PriorityQueue<String> pr = new PriorityQueue<>();

        Map<String, Integer> map = new HashMap<>();

        map.put("begin", 1);

        Map<String, String> map1 = new ConcurrentHashMap<>();

        Map<String, String> map2 = new WeakHashMap<>();


        BigInteger bigInteger = new BigInteger(10, new Random(1024));
        System.out.println(bigInteger);

        BigDecimal bigDecimal = new BigDecimal("11");



    }


}