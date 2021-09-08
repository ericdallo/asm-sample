package asm.sample.lib;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class JavaParserClassResult {
    private List<JavaParserFieldResult> fields;
    private List<JavaParserMethodResult> methods;

    public JavaParserClassResult(List<JavaParserFieldResult> fields, List<JavaParserMethodResult> methods) {
        this.fields = fields;
        this.methods = methods;
    }

    public List<JavaParserFieldResult> getFields() {
        return fields;
    }

    public List<JavaParserMethodResult> getMethods() {
        return methods;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
