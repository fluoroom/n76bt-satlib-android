package q6;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f24363b;

        public a(f fVar) {
            this(fVar.buildMethodName(), fVar.withPrefix());
        }

        public a(String str, String str2) {
            this.f24362a = str;
            this.f24363b = str2;
        }
    }

    String buildMethodName() default "build";

    String withPrefix() default "with";
}
