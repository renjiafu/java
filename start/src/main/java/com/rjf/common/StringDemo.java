package com.rjf.common;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {

    public static void main(String[] args) {

        String str = "Hello Rene! are u ok? ";

        System.out.println("原始数据 ---> " + str);
        System.out.println("length ---> " + str.length());
        System.out.println("charAt(0) --->" + str.charAt(0));
        System.out.println("replace('R', 'K') ---> " + str.replace('R', 'K'));
        System.out.println("hashCode ---> " + str.hashCode());

        System.out.println();

        System.out.println("concat(\" my friend \") ---> " + str.concat(" my friend "));
        System.out.println("contains(\"Rene\") ---> " + str.contains("Rene"));
        System.out.println("startsWith(\"He\") ---> " + str.startsWith("He"));
        System.out.println("endsWith(\" \") ---> " + str.endsWith(" "));
        System.out.println("matches(\"\\\\w+\") ---> " + str.matches("\\w?"));

        System.out.println();

        System.out.println("getBytes ---> " + Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));
        System.out.println("toCharArray ---> " + Arrays.toString(str.toCharArray()));

        System.out.println();

        System.out.println("toLowerCase ---> " + str.toLowerCase());
        System.out.println("toUpperCase ---> " + str.toUpperCase());

        /*
        原始数据 ---> Hello Rene! are u ok?
        length ---> 22
        charAt(0) --->H
        replace('R', 'K') ---> Hello Kene! are u ok?
        hashCode ---> 149426699

        concat(" my friend ") ---> Hello Rene! are u ok?  my friend
        contains("Rene") ---> true
        startsWith("He") ---> true
        endsWith(" ") ---> true
        matches("\\w+") ---> false

        getBytes ---> [72, 101, 108, 108, 111, 32, 82, 101, 110, 101, 33, 32, 97, 114, 101, 32, 117, 32, 111, 107, 63, 32]
        toCharArray ---> [H, e, l, l, o,  , R, e, n, e, !,  , a, r, e,  , u,  , o, k, ?,  ]

        toLowerCase ---> hello rene! are u ok?
        toUpperCase ---> HELLO RENE! ARE U OK?

        */
    }
}
