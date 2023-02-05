package asm.sample.lib;

import java.util.ArrayList;
import java.util.List;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

class JavaParserClassVisitor extends ClassVisitor {

    private List<JavaParserFieldResult> fields = new ArrayList<>();
    private List<JavaParserMethodResult> methods = new ArrayList<>();

    public JavaParserClassVisitor() {
        super(Opcodes.ASM9);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        FieldVisitor visitField = super.visitField(access, name, descriptor, signature, value);
        fields.add(new JavaParserFieldResult(name, Type.getType(descriptor)));
        return visitField;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature,
            String[] exceptions) {
        MethodVisitor visitMethod = super.visitMethod(access, name, descriptor, signature, exceptions);
        methods.add(new JavaParserMethodResult(name, Type.getMethodType(descriptor)));
        return visitMethod;
    }

   public JavaParserClassResult buildResult() {
        return new JavaParserClassResult(fields, methods);
    }
}
