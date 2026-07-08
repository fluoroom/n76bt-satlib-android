package v6;

import e6.j;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class h extends g {
    public h(j jVar, String str, e6.h hVar, Class cls, String str2, Collection collection) {
        super(jVar, str, hVar, cls, str2, collection);
    }

    public static h z(j jVar, Object obj, String str, Collection collection) {
        Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
        h hVar = new h(jVar, String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", str, cls.getName()), jVar.H(), cls, str, collection);
        hVar.e(obj, str);
        return hVar;
    }
}
