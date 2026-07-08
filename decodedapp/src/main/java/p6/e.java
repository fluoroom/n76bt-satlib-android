package p6;

import a7.c;
import com.facebook.stetho.server.http.HttpStatus;
import com.fasterxml.jackson.databind.JavaType;
import d6.k0;
import d6.o0;
import i7.j;
import java.lang.reflect.Type;
import x6.e0;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    private JavaType d(JavaType javaType, String str, a7.c cVar, int i10) {
        r6.q qVarK = k();
        c.b bVarB = cVar.b(qVarK, javaType, str.substring(0, i10));
        if (bVarB == c.b.DENIED) {
            return (JavaType) g(javaType, str, cVar);
        }
        JavaType javaTypeG = l().G(str);
        if (!javaTypeG.Z(javaType.r())) {
            return (JavaType) e(javaType, str);
        }
        c.b bVar = c.b.ALLOWED;
        return (bVarB == bVar || cVar.c(qVarK, javaType, javaTypeG) == bVar) ? javaTypeG : (JavaType) f(javaType, str, cVar);
    }

    protected String a(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + ": " + str2;
    }

    protected final String b(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    protected String c(String str) {
        return str == null ? "[N/A]" : String.format("\"%s\"", h(str));
    }

    protected Object e(JavaType javaType, String str) throws m {
        throw n(javaType, str, "Not a subtype");
    }

    protected Object f(JavaType javaType, String str, a7.c cVar) throws m {
        throw n(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + i7.h.h(cVar) + ") denied resolution");
    }

    protected Object g(JavaType javaType, String str, a7.c cVar) throws m {
        throw n(javaType, str, "Configured `PolymorphicTypeValidator` (of type " + i7.h.h(cVar) + ") denied resolution");
    }

    protected final String h(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 500) {
            return str;
        }
        return str.substring(0, HttpStatus.HTTP_INTERNAL_SERVER_ERROR) + "]...[" + str.substring(str.length() - HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
    }

    public JavaType i(Type type) {
        if (type == null) {
            return null;
        }
        return l().R(type);
    }

    public i7.j j(x6.b bVar, Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof i7.j) {
            return (i7.j) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == j.a.class || i7.h.J(cls)) {
            return null;
        }
        if (i7.j.class.isAssignableFrom(cls)) {
            r6.q qVarK = k();
            qVarK.w();
            return (i7.j) i7.h.l(cls, qVarK.b());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    public abstract r6.q k();

    public abstract com.fasterxml.jackson.databind.type.c l();

    protected abstract m n(JavaType javaType, String str, String str2);

    public k0 o(x6.b bVar, e0 e0Var) {
        Class clsC = e0Var.c();
        r6.q qVarK = k();
        qVarK.w();
        return ((k0) i7.h.l(clsC, qVarK.b())).b(e0Var.f());
    }

    public o0 p(x6.b bVar, e0 e0Var) {
        Class clsE = e0Var.e();
        r6.q qVarK = k();
        qVarK.w();
        android.support.v4.media.session.b.a(i7.h.l(clsE, qVarK.b()));
        return null;
    }

    public abstract Object q(JavaType javaType, String str);

    public Object r(Class cls, String str) {
        return q(i(cls), str);
    }

    public JavaType s(JavaType javaType, String str, a7.c cVar) throws m {
        int iIndexOf = str.indexOf(60);
        if (iIndexOf > 0) {
            return d(javaType, str, cVar, iIndexOf);
        }
        r6.q qVarK = k();
        c.b bVarB = cVar.b(qVarK, javaType, str);
        if (bVarB == c.b.DENIED) {
            return (JavaType) g(javaType, str, cVar);
        }
        try {
            Class clsW = l().W(str);
            if (!javaType.a0(clsW)) {
                return (JavaType) e(javaType, str);
            }
            JavaType javaTypeO = qVarK.D().O(javaType, clsW);
            return (bVarB != c.b.INDETERMINATE || cVar.c(qVarK, javaType, javaTypeO) == c.b.ALLOWED) ? javaTypeO : (JavaType) f(javaType, str, cVar);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Exception e10) {
            throw n(javaType, str, String.format("problem: (%s) %s", e10.getClass().getName(), i7.h.o(e10)));
        }
    }
}
