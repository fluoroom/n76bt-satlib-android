package ek;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface k {
    boolean allowUnsafeNonAsciiValues() default false;

    String[] value();
}
