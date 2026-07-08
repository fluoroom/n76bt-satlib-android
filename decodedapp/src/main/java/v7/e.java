package v7;

import android.accounts.Account;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a */
    private final Account f30362a;

    /* JADX INFO: renamed from: b */
    private final Set f30363b;

    /* JADX INFO: renamed from: c */
    private final Set f30364c;

    /* JADX INFO: renamed from: d */
    private final Map f30365d;

    /* JADX INFO: renamed from: e */
    private final int f30366e;

    /* JADX INFO: renamed from: f */
    private final View f30367f;

    /* JADX INFO: renamed from: g */
    private final String f30368g;

    /* JADX INFO: renamed from: h */
    private final String f30369h;

    /* JADX INFO: renamed from: i */
    private final r8.a f30370i;

    /* JADX INFO: renamed from: j */
    private Integer f30371j;

    public static final class a {

        /* JADX INFO: renamed from: a */
        private Account f30372a;

        /* JADX INFO: renamed from: b */
        private androidx.collection.b f30373b;

        /* JADX INFO: renamed from: c */
        private String f30374c;

        /* JADX INFO: renamed from: d */
        private String f30375d;

        /* JADX INFO: renamed from: e */
        private final r8.a f30376e = r8.a.f25605s;

        public e a() {
            return new e(this.f30372a, this.f30373b, null, 0, null, this.f30374c, this.f30375d, this.f30376e, false);
        }

        public a b(String str) {
            this.f30374c = str;
            return this;
        }

        public final a c(Collection collection) {
            if (this.f30373b == null) {
                this.f30373b = new androidx.collection.b();
            }
            this.f30373b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f30372a = account;
            return this;
        }

        public final a e(String str) {
            this.f30375d = str;
            return this;
        }
    }

    public e(Account account, Set set, Map map, int i10, View view, String str, String str2, r8.a aVar, boolean z10) {
        this.f30362a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f30363b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f30365d = map;
        this.f30367f = view;
        this.f30366e = i10;
        this.f30368g = str;
        this.f30369h = str2;
        this.f30370i = aVar == null ? r8.a.f25605s : aVar;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f30364c = DesugarCollections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f30362a;
    }

    public String b() {
        Account account = this.f30362a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    public Account c() {
        Account account = this.f30362a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set d() {
        return this.f30364c;
    }

    public Set e(t7.a aVar) {
        android.support.v4.media.session.b.a(this.f30365d.get(aVar));
        return this.f30363b;
    }

    public String f() {
        return this.f30368g;
    }

    public Set g() {
        return this.f30363b;
    }

    public final r8.a h() {
        return this.f30370i;
    }

    public final Integer i() {
        return this.f30371j;
    }

    public final String j() {
        return this.f30369h;
    }

    public final void k(Integer num) {
        this.f30371j = num;
    }
}
