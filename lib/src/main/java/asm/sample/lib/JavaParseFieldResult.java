package asm.sample.lib;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.objectweb.asm.Type;

public class JavaParseFieldResult {
    private String name;
    private String type;

    public JavaParseFieldResult(String name, Type type) {
        this.name = name;
        this.type = type.getClassName();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }

}
