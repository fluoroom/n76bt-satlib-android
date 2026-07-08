package a7;

import com.fasterxml.jackson.databind.JavaType;
import java.io.Serializable;
import r6.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Serializable {

    public static abstract class a extends c implements Serializable {
    }

    public enum b {
        ALLOWED,
        DENIED,
        INDETERMINATE
    }

    public abstract b a(q qVar, JavaType javaType);

    public abstract b b(q qVar, JavaType javaType, String str);

    public abstract b c(q qVar, JavaType javaType, JavaType javaType2);
}
