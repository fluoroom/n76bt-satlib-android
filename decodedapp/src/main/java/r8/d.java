package r8;

import com.google.android.gms.common.api.Scope;
import t7.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g f25615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.g f25616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.AbstractC0384a f25617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a.AbstractC0384a f25618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Scope f25619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Scope f25620f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t7.a f25621g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t7.a f25622h;

    static {
        a.g gVar = new a.g();
        f25615a = gVar;
        a.g gVar2 = new a.g();
        f25616b = gVar2;
        b bVar = new b();
        f25617c = bVar;
        c cVar = new c();
        f25618d = cVar;
        f25619e = new Scope("profile");
        f25620f = new Scope("email");
        f25621g = new t7.a("SignIn.API", bVar, gVar);
        f25622h = new t7.a("SignIn.INTERNAL_API", cVar, gVar2);
    }
}
