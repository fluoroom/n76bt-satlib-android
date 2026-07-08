package rg;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import rg.l;
import rg.m;

/* JADX INFO: loaded from: classes3.dex */
final class m implements l {

    /* JADX INFO: renamed from: a */
    private final Matcher f26067a;

    /* JADX INFO: renamed from: b */
    private final CharSequence f26068b;

    /* JADX INFO: renamed from: c */
    private final k f26069c;

    /* JADX INFO: renamed from: d */
    private List f26070d;

    public static final class a extends ed.d {
        a() {
        }

        @Override // ed.b
        public int c() {
            return m.this.f().groupCount() + 1;
        }

        @Override // ed.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean e(String str) {
            return super.contains(str);
        }

        @Override // ed.d, java.util.List
        /* JADX INFO: renamed from: f */
        public String get(int i10) {
            String strGroup = m.this.f().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int g(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int h(String str) {
            return super.lastIndexOf(str);
        }

        @Override // ed.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return g((String) obj);
            }
            return -1;
        }

        @Override // ed.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return h((String) obj);
            }
            return -1;
        }
    }

    public static final class b extends ed.b implements k {
        b() {
        }

        public static final j g(b bVar, int i10) {
            return bVar.get(i10);
        }

        @Override // ed.b
        public int c() {
            return m.this.f().groupCount() + 1;
        }

        @Override // ed.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof j) {
                return f((j) obj);
            }
            return false;
        }

        public /* bridge */ boolean f(j jVar) {
            return super.contains(jVar);
        }

        @Override // rg.k
        public j get(int i10) {
            xd.c cVarF = p.f(m.this.f(), i10);
            if (cVarF.h().intValue() < 0) {
                return null;
            }
            String strGroup = m.this.f().group(i10);
            rd.m.d(strGroup, "group(...)");
            return new j(strGroup, cVarF);
        }

        @Override // ed.b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return qg.k.H(ed.q.S(ed.q.l(this)), new qd.l() { // from class: rg.n
                @Override // qd.l
                public final Object l(Object obj) {
                    return m.b.g(this.f26073a, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public m(Matcher matcher, CharSequence charSequence) {
        rd.m.e(matcher, "matcher");
        rd.m.e(charSequence, "input");
        this.f26067a = matcher;
        this.f26068b = charSequence;
        this.f26069c = new b();
    }

    public final MatchResult f() {
        return this.f26067a;
    }

    @Override // rg.l
    public /* bridge */ l.b a() {
        return l.a.a(this);
    }

    @Override // rg.l
    public List b() {
        if (this.f26070d == null) {
            this.f26070d = new a();
        }
        List list = this.f26070d;
        rd.m.b(list);
        return list;
    }

    @Override // rg.l
    public k c() {
        return this.f26069c;
    }

    @Override // rg.l
    public xd.c d() {
        return p.e(f());
    }
}
