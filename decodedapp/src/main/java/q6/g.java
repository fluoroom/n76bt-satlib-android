package q6;

import i7.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p6.p;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface g {

    public enum a {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    public enum b {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    Class as() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default j.a.class;

    Class contentUsing() default p.a.class;

    Class converter() default j.a.class;

    a include() default a.DEFAULT_INCLUSION;

    Class keyAs() default Void.class;

    Class keyUsing() default p.a.class;

    Class nullsUsing() default p.a.class;

    b typing() default b.DEFAULT_TYPING;

    Class using() default p.a.class;
}
