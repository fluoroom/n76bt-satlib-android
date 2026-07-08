package u6;

/* JADX INFO: loaded from: classes.dex */
public class k0 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k0 f28269e = new k0();

    public k0() {
        super(String.class);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public String e(e6.j jVar, p6.h hVar) {
        return jVar.N0(e6.m.VALUE_STRING) ? jVar.C0() : jVar.N0(e6.m.START_ARRAY) ? (String) W(jVar, hVar) : J0(jVar, hVar, this);
    }

    @Override // u6.g0, u6.c0, p6.l
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public String g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return e(jVar, hVar);
    }

    @Override // p6.l
    public Object k(p6.h hVar) {
        return "";
    }

    @Override // p6.l
    public boolean q() {
        return true;
    }

    @Override // u6.g0, p6.l
    public h7.c r() {
        return h7.c.Textual;
    }
}
