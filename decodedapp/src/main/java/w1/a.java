package w1;

import e6.n;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class a implements x1.c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f31045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f31046f;

    a(String str, String str2, String str3, String str4, Map map, n nVar) {
        this.f31041a = str;
        this.f31042b = str2;
        this.f31043c = str3;
        this.f31044d = str4;
        this.f31045e = map == null ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(map);
        this.f31046f = nVar;
    }
}
