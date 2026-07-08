package d6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface g0 {
    boolean enabled() default true;

    String prefix() default "";

    String suffix() default "";
}
