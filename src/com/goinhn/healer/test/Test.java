package com.goinhn.healer.test;

public class Test {

    public static void main(String[] args) {
        int a = 101;
        int b = 100;

        Integer c = Integer.divideUnsigned(a, b);
        System.out.println(c);

        Boolean f = false;

        System.out.println(f.hashCode());

        System.out.println(Integer.bitCount(256));

        Short s = 1;

        Byte x = 10;
        Byte y = 20;
        System.out.println(y.compareTo(x));

        Long l = 100L;

        Float t = 10f;

    }

    public boolean equals(Object obj) {
        if (obj instanceof Integer) {
            return true;
        }

        return false;
    }

}
