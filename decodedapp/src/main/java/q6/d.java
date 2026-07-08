package q6;

import i7.j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p6.l;
import p6.q;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface d {
    Class as() default Void.class;

    Class builder() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default j.a.class;

    Class contentUsing() default l.a.class;

    Class converter() default j.a.class;

    Class keyAs() default Void.class;

    Class keyUsing() default q.a.class;

    Class using() default l.a.class;
}
