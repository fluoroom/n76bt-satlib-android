package w6;

import com.fasterxml.jackson.databind.JavaType;
import i7.n;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import p6.b0;
import p6.l;
import p6.p;
import s6.o;

/* JADX INFO: loaded from: classes.dex */
public class k implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Class f31321c = Node.class;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Class f31322d = Document.class;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f31323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f31324f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f31325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31326b;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        a aVarC = null;
        try {
            aVarC = a.c();
        } catch (Throwable th2) {
            n.c(th2);
        }
        f31323e = aVarC;
        f31324f = new k();
    }

    protected k() {
        HashMap map = new HashMap();
        this.f31325a = map;
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this.f31326b = map2;
        map2.put("java.sql.Timestamp", g7.k.f13606f);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    private boolean a(Class cls, Class cls2) {
        return cls2 != null && cls2.isAssignableFrom(cls);
    }

    private boolean d(Class cls, String str) {
        do {
            cls = cls.getSuperclass();
            if (cls == null || cls == Object.class) {
                return false;
            }
        } while (!cls.getName().startsWith(str));
        return true;
    }

    private Object e(Class cls, JavaType javaType) {
        try {
            return i7.h.l(cls, false);
        } catch (Throwable th2) {
            n.c(th2);
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + i7.h.G(javaType) + ", problem: (" + th2.getClass().getName() + ") " + th2.getMessage());
        }
    }

    private Object f(String str, JavaType javaType) {
        try {
            return e(Class.forName(str), javaType);
        } catch (Throwable th2) {
            n.c(th2);
            throw new IllegalStateException("Failed to find class `" + str + "` for handling values of type " + i7.h.G(javaType) + ", problem: (" + th2.getClass().getName() + ") " + th2.getMessage());
        }
    }

    public l b(JavaType javaType, p6.g gVar, p6.c cVar) {
        Object objF;
        l lVarA;
        Class clsR = javaType.r();
        a aVar = f31323e;
        if (aVar != null && (lVarA = aVar.a(clsR)) != null) {
            return lVarA;
        }
        if (a(clsR, f31321c)) {
            return (l) f("com.fasterxml.jackson.databind.ext.DOMDeserializer$NodeDeserializer", javaType);
        }
        if (a(clsR, f31322d)) {
            return (l) f("com.fasterxml.jackson.databind.ext.DOMDeserializer$DocumentDeserializer", javaType);
        }
        String name = clsR.getName();
        String str = (String) this.f31325a.get(name);
        if (str != null) {
            return (l) f(str, javaType);
        }
        if ((name.startsWith("javax.xml.") || d(clsR, "javax.xml.")) && (objF = f("com.fasterxml.jackson.databind.ext.CoreXMLDeserializers", javaType)) != null) {
            return ((o) objF).c(javaType, gVar, cVar);
        }
        return null;
    }

    public p c(b0 b0Var, JavaType javaType, p6.c cVar) {
        Object objF;
        p pVarB;
        Class clsR = javaType.r();
        if (a(clsR, f31321c)) {
            return (p) f("com.fasterxml.jackson.databind.ext.DOMSerializer", javaType);
        }
        a aVar = f31323e;
        if (aVar != null && (pVarB = aVar.b(clsR)) != null) {
            return pVarB;
        }
        String name = clsR.getName();
        Object obj = this.f31326b.get(name);
        if (obj != null) {
            return obj instanceof p ? (p) obj : (p) f((String) obj, javaType);
        }
        if ((!name.startsWith("javax.xml.") && !d(clsR, "javax.xml.")) || (objF = f("com.fasterxml.jackson.databind.ext.CoreXMLSerializers", javaType)) == null) {
            return null;
        }
        android.support.v4.media.session.b.a(objF);
        throw null;
    }
}
