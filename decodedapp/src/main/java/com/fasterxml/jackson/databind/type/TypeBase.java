package com.fasterxml.jackson.databind.type;

import a7.h;
import com.fasterxml.jackson.databind.JavaType;
import e6.g;
import e6.m;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p6.d0;
import p6.o;

/* JADX INFO: loaded from: classes.dex */
public abstract class TypeBase extends JavaType implements o {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final b f7094s = b.i();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final JavaType[] f7095t = new JavaType[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final JavaType f7096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final JavaType[] f7097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final b f7098h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    volatile transient String f7099r;

    protected TypeBase(Class cls, b bVar, JavaType javaType, JavaType[] javaTypeArr, int i10, Object obj, Object obj2, boolean z10) {
        super(cls, i10, obj, obj2, z10);
        this.f7098h = bVar == null ? f7094s : bVar;
        this.f7096f = javaType;
        this.f7097g = javaTypeArr;
    }

    protected static StringBuilder k0(Class cls, StringBuilder sb2, boolean z10) {
        if (!cls.isPrimitive()) {
            sb2.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if (cCharAt == '.') {
                    cCharAt = '/';
                }
                sb2.append(cCharAt);
            }
            if (z10) {
                sb2.append(';');
            }
            return sb2;
        }
        if (cls == Boolean.TYPE) {
            sb2.append('Z');
            return sb2;
        }
        if (cls == Byte.TYPE) {
            sb2.append('B');
            return sb2;
        }
        if (cls == Short.TYPE) {
            sb2.append('S');
            return sb2;
        }
        if (cls == Character.TYPE) {
            sb2.append('C');
            return sb2;
        }
        if (cls == Integer.TYPE) {
            sb2.append('I');
            return sb2;
        }
        if (cls == Long.TYPE) {
            sb2.append('J');
            return sb2;
        }
        if (cls == Float.TYPE) {
            sb2.append('F');
            return sb2;
        }
        if (cls == Double.TYPE) {
            sb2.append('D');
            return sb2;
        }
        if (cls == Void.TYPE) {
            sb2.append('V');
            return sb2;
        }
        throw new IllegalStateException("Unrecognized primitive type: " + cls.getName());
    }

    @Override // n6.a
    public String c() {
        String str = this.f7099r;
        return str == null ? m0() : str;
    }

    @Override // p6.o
    public void d(g gVar, d0 d0Var) {
        gVar.d1(c());
    }

    @Override // p6.o
    public void e(g gVar, d0 d0Var, h hVar) {
        n6.c cVar = new n6.c(this, m.VALUE_STRING);
        hVar.g(gVar, cVar);
        d(gVar, d0Var);
        hVar.h(gVar, cVar);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType f(int i10) {
        return this.f7098h.k(i10);
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public int g() {
        return this.f7098h.q();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public final JavaType i(Class cls) {
        JavaType javaTypeI;
        JavaType[] javaTypeArr;
        if (cls == this.f7079a) {
            return this;
        }
        if (cls.isInterface() && (javaTypeArr = this.f7097g) != null) {
            int length = javaTypeArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                JavaType javaTypeI2 = this.f7097g[i10].i(cls);
                if (javaTypeI2 != null) {
                    return javaTypeI2;
                }
            }
        }
        JavaType javaType = this.f7096f;
        if (javaType == null || (javaTypeI = javaType.i(cls)) == null) {
            return null;
        }
        return javaTypeI;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public b j() {
        return this.f7098h;
    }

    protected boolean l0(int i10) {
        return this.f7079a.getTypeParameters().length == i10;
    }

    protected String m0() {
        return this.f7079a.getName();
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public List p() {
        JavaType[] javaTypeArr = this.f7097g;
        if (javaTypeArr == null) {
            return Collections.EMPTY_LIST;
        }
        int length = javaTypeArr.length;
        return length != 0 ? length != 1 ? Arrays.asList(javaTypeArr) : Collections.singletonList(javaTypeArr[0]) : Collections.EMPTY_LIST;
    }

    @Override // com.fasterxml.jackson.databind.JavaType
    public JavaType t() {
        return this.f7096f;
    }
}
