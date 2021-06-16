package tours;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE) //@Target({ElementType.FIELD, ElementType.METHOD})
    public @interface Discount {
        int value() default 5;
    }