package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import i7.h;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f7100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final JavaType[] f7101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f7102g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f7103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaType[] f7104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f7105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7106d;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f7107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JavaType[] f7108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f7109c;

        public a(Class cls, JavaType[] javaTypeArr, int i10) {
            this.f7107a = cls;
            this.f7108b = javaTypeArr;
            this.f7109c = (cls.hashCode() * 31) + i10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f7109c == aVar.f7109c && this.f7107a == aVar.f7107a) {
                JavaType[] javaTypeArr = aVar.f7108b;
                int length = this.f7108b.length;
                if (length == javaTypeArr.length) {
                    for (int i10 = 0; i10 < length; i10++) {
                        if (!this.f7108b[i10].equals(javaTypeArr[i10])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f7109c;
        }

        public String toString() {
            return this.f7107a.getName() + "<>";
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.type.b$b, reason: collision with other inner class name */
    static class C0111b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final TypeVariable[] f7110a = AbstractList.class.getTypeParameters();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final TypeVariable[] f7111b = Collection.class.getTypeParameters();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final TypeVariable[] f7112c = Iterable.class.getTypeParameters();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final TypeVariable[] f7113d = List.class.getTypeParameters();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final TypeVariable[] f7114e = ArrayList.class.getTypeParameters();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final TypeVariable[] f7115f = Map.class.getTypeParameters();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final TypeVariable[] f7116g = HashMap.class.getTypeParameters();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final TypeVariable[] f7117h = LinkedHashMap.class.getTypeParameters();

        public static TypeVariable[] a(Class cls) {
            return cls == Collection.class ? f7111b : cls == List.class ? f7113d : cls == ArrayList.class ? f7114e : cls == AbstractList.class ? f7110a : cls == Iterable.class ? f7112c : cls.getTypeParameters();
        }

        public static TypeVariable[] b(Class cls) {
            return cls == Map.class ? f7115f : cls == HashMap.class ? f7116g : cls == LinkedHashMap.class ? f7117h : cls.getTypeParameters();
        }
    }

    static {
        String[] strArr = new String[0];
        f7100e = strArr;
        JavaType[] javaTypeArr = new JavaType[0];
        f7101f = javaTypeArr;
        f7102g = new b(strArr, javaTypeArr, null);
    }

    private b(String[] strArr, JavaType[] javaTypeArr, String[] strArr2) {
        strArr = strArr == null ? f7100e : strArr;
        this.f7103a = strArr;
        javaTypeArr = javaTypeArr == null ? f7101f : javaTypeArr;
        this.f7104b = javaTypeArr;
        if (strArr.length == javaTypeArr.length) {
            this.f7105c = strArr2;
            this.f7106d = Arrays.hashCode(javaTypeArr);
            return;
        }
        throw new IllegalArgumentException("Mismatching names (" + strArr.length + "), types (" + javaTypeArr.length + ")");
    }

    public static b b(Class cls, JavaType javaType) {
        TypeVariable[] typeVariableArrA = C0111b.a(cls);
        int length = typeVariableArrA == null ? 0 : typeVariableArrA.length;
        if (length == 1) {
            return new b(new String[]{typeVariableArrA[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static b c(Class cls, JavaType javaType, JavaType javaType2) {
        TypeVariable[] typeVariableArrB = C0111b.b(cls);
        int length = typeVariableArrB == null ? 0 : typeVariableArrB.length;
        if (length == 2) {
            return new b(new String[]{typeVariableArrB[0].getName(), typeVariableArrB[1].getName()}, new JavaType[]{javaType, javaType2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static b d(Class cls, List list) {
        return e(cls, (list == null || list.isEmpty()) ? f7101f : (JavaType[]) list.toArray(f7101f));
    }

    public static b e(Class cls, JavaType[] javaTypeArr) {
        String[] strArr;
        if (javaTypeArr == null) {
            javaTypeArr = f7101f;
        } else {
            int length = javaTypeArr.length;
            if (length == 1) {
                return b(cls, javaTypeArr[0]);
            }
            if (length == 2) {
                return c(cls, javaTypeArr[0], javaTypeArr[1]);
            }
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = f7100e;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i10 = 0; i10 < length2; i10++) {
                strArr[i10] = typeParameters[i10].getName();
            }
        }
        if (strArr.length == javaTypeArr.length) {
            return new b(strArr, javaTypeArr, null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot create TypeBindings for class ");
        sb2.append(cls.getName());
        sb2.append(" with ");
        sb2.append(javaTypeArr.length);
        sb2.append(" type parameter");
        sb2.append(javaTypeArr.length == 1 ? "" : "s");
        sb2.append(": class expects ");
        sb2.append(strArr.length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static b f(List list, List list2) {
        return (list == null || list.isEmpty() || list2 == null || list2.isEmpty()) ? f7102g : new b((String[]) list.toArray(f7100e), (JavaType[]) list2.toArray(f7101f), null);
    }

    public static b g(Class cls, JavaType javaType) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 0) {
            return f7102g;
        }
        if (length == 1) {
            return new b(new String[]{typeParameters[0].getName()}, new JavaType[]{javaType}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static b h(Class cls, JavaType[] javaTypeArr) {
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            return f7102g;
        }
        if (javaTypeArr == null) {
            javaTypeArr = f7101f;
        }
        int length = typeParameters.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = typeParameters[i10].getName();
        }
        if (length == javaTypeArr.length) {
            return new b(strArr, javaTypeArr, null);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot create TypeBindings for class ");
        sb2.append(cls.getName());
        sb2.append(" with ");
        sb2.append(javaTypeArr.length);
        sb2.append(" type parameter");
        sb2.append(javaTypeArr.length == 1 ? "" : "s");
        sb2.append(": class expects ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static b i() {
        return f7102g;
    }

    private boolean o() {
        for (JavaType javaType : this.f7104b) {
            if (javaType instanceof com.fasterxml.jackson.databind.type.a) {
                return true;
            }
        }
        return false;
    }

    public Object a(Class cls) {
        if (o()) {
            return null;
        }
        return new a(cls, this.f7104b, this.f7106d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!h.H(obj, getClass())) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7106d == bVar.f7106d && Arrays.equals(this.f7104b, bVar.f7104b);
    }

    public int hashCode() {
        return this.f7106d;
    }

    public JavaType j(String str) {
        JavaType javaTypeN0;
        int length = this.f7103a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(this.f7103a[i10])) {
                JavaType javaType = this.f7104b[i10];
                return (!(javaType instanceof ResolvedRecursiveType) || (javaTypeN0 = ((ResolvedRecursiveType) javaType).n0()) == null) ? javaType : javaTypeN0;
            }
        }
        return null;
    }

    public JavaType k(int i10) {
        if (i10 < 0) {
            return null;
        }
        JavaType[] javaTypeArr = this.f7104b;
        if (i10 >= javaTypeArr.length) {
            return null;
        }
        return javaTypeArr[i10];
    }

    public List l() {
        JavaType[] javaTypeArr = this.f7104b;
        return javaTypeArr.length == 0 ? Collections.EMPTY_LIST : Arrays.asList(javaTypeArr);
    }

    public boolean n(String str) {
        String[] strArr = this.f7105c;
        if (strArr == null) {
            return false;
        }
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                return false;
            }
        } while (!str.equals(this.f7105c[length]));
        return true;
    }

    public boolean p() {
        return this.f7104b.length == 0;
    }

    public int q() {
        return this.f7104b.length;
    }

    protected JavaType[] r() {
        return this.f7104b;
    }

    public b s(String str) {
        String[] strArr = this.f7105c;
        int length = strArr == null ? 0 : strArr.length;
        String[] strArr2 = length == 0 ? new String[1] : (String[]) Arrays.copyOf(strArr, length + 1);
        strArr2[length] = str;
        return new b(this.f7103a, this.f7104b, strArr2);
    }

    public String toString() {
        if (this.f7104b.length == 0) {
            return "<>";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('<');
        int length = this.f7104b.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 > 0) {
                sb2.append(',');
            }
            sb2.append(this.f7104b[i10].n());
        }
        sb2.append('>');
        return sb2.toString();
    }
}
