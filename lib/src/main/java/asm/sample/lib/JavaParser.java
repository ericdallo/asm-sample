package asm.sample.lib;

import org.objectweb.asm.ClassReader;

public class JavaParser {

    public JavaParserClassResult parseClass(String className) {
        try {
            ClassReader r = new ClassReader(className);
            JavaParserClassVisitor customVisitor = new JavaParserClassVisitor();
            r.accept(customVisitor, 0);

            return customVisitor.buildResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
