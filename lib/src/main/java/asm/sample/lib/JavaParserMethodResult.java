package asm.sample.lib;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.objectweb.asm.Type;

public class JavaParserMethodResult {
    private String name;
    private String returnType;

    public JavaParserMethodResult(String name, Type methodType) {
        this.name = name;
        this.returnType = methodType.getReturnType().getClassName();
    }

    public String getName() {
        return name;
    }

    public String getReturnType() {
        return returnType;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}
