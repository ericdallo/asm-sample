package asm.sample.lib;

import java.util.ArrayList;
import java.util.List;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

class JavaParserClassVisitor extends ClassVisitor {

    private List<JavaParseFieldResult> fields = new ArrayList<>();

    public JavaParserClassVisitor() {
        super(Opcodes.ASM9);
    }

    @Override
    public FieldVisitor visitField(int access, String name, String descriptor, String signature, Object value) {
        FieldVisitor visitField = super.visitField(access, name, descriptor, signature, value);
        fields.add(new JavaParseFieldResult(name, Type.getType(descriptor)));
        return visitField;
    }

    public JavaParseClassResult buildResult() {
        return new JavaParseClassResult(fields);
    }
}
