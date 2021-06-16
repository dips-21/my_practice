package tours;
import java.lang.annotation.*;
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE) //@Target({ElementType.FIELD, ElementType.METHOD})
    public @interface Tax {
        int value() default 4;
    }

