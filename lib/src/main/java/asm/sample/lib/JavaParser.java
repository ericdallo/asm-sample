package asm.sample.lib;

import java.io.IOException;

import org.objectweb.asm.ClassReader;

public class JavaParser {

    public JavaParseClassResult parseClass(String className) {
        try {
            ClassReader r = new ClassReader(className);
            JavaParserClassVisitor customVisitor = new JavaParserClassVisitor();
            r.accept(customVisitor, 0);

            return customVisitor.buildResult();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
