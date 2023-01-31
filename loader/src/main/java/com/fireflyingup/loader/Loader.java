package com.fireflyingup.loader;

import java.lang.instrument.Instrumentation;
import java.util.Arrays;

/**
 * @author: Fire Flying
 * @create: 2023-01-30 16:33
 **/

public class Loader {

    public static void main(String[] args) {

        System.out.println("main: " + Arrays.toString(args));
    }

    public static void agentmain(String args, Instrumentation inst) {

        System.out.println("agentmain: " + args);
    }


    public static void premain(String args, Instrumentation inst) {

        System.out.println("premain: " + args);
    }

}
