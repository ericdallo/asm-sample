package asm.sample.lib;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class JavaParseClassResult {
    private List<JavaParseFieldResult> fields;

    public JavaParseClassResult(List<JavaParseFieldResult> fields) {
        this.fields = fields;
    }

    public List<JavaParseFieldResult> getFields() {
        return fields;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}
