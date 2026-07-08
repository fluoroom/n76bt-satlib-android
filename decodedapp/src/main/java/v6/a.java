package v6;

import e6.j;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class a extends g {
    public a(j jVar, String str, e6.h hVar, Class cls, String str2, Collection collection) {
        super(jVar, str, hVar, cls, str2, collection);
    }

    public static a z(j jVar, Object obj, String str, Collection collection) {
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        a aVar = new a(jVar, String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", str, cls.getName()), jVar.H(), cls, str, collection);
        aVar.e(obj, str);
        return aVar;
    }
}
