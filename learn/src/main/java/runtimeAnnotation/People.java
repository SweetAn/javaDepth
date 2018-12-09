package runtimeAnnotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface People {
    String name() default "";

    int age() default 0;
}
