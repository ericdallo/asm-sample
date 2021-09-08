package asm.sample;

import asm.sample.lib.JavaParseClassResult;
import asm.sample.lib.JavaParser;

public class Main {
    public static void main(String... args) {
        JavaParser parser = new JavaParser();

        JavaParseClassResult r = parser.parseClass("asm.sample.Foo");
        System.out.println(r);
    }
}
