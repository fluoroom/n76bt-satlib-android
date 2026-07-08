package io.grpc.internal;

import io.grpc.internal.j;
import io.grpc.internal.j0;
import j$.util.Objects;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.q0;
import qb.z1;

/* JADX INFO: loaded from: classes3.dex */
final class a2 extends qb.q0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Logger f16263u = Logger.getLogger(a2.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f16264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final q0.e f16265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f16266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e f16267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f16269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private z1.d f16270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private qb.q f16271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private qb.q f16272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f16273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j.a f16274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private j f16275r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private z1.d f16276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f16277t;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16278a;

        static {
            int[] iArr = new int[qb.q.values().length];
            f16278a = iArr;
            try {
                iArr[qb.q.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16278a[qb.q.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16278a[qb.q.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16278a[qb.q.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a2.this.f16276s = null;
            a2.this.f16267j.h();
            a2.this.c();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a2.this.f16270m = null;
            if (a2.this.f16267j.e()) {
                a2.this.c();
            }
        }
    }

    private final class d implements q0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i f16281a;

        private d() {
        }

        @Override // qb.q0.l
        public void a(qb.r rVar) {
            if (a2.this.f16273p) {
                a2.f16263u.log(Level.WARNING, "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{rVar, this.f16281a.f16294a});
                return;
            }
            a2.f16263u.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{rVar, this.f16281a.f16294a});
            this.f16281a.f16297d = rVar;
            if (a2.this.f16267j.g() && this.f16281a == a2.this.f16266i.get(a2.this.f16267j.a())) {
                a2.this.z(this.f16281a);
            }
        }

        /* synthetic */ d(a2 a2Var, a aVar) {
            this();
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f16283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16284b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f16285c;

        private static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final qb.a f16286a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final SocketAddress f16287b;

            public a(qb.a aVar, SocketAddress socketAddress) {
                this.f16286a = aVar;
                this.f16287b = socketAddress;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public qb.y d() {
                return new qb.y(this.f16287b, this.f16286a);
            }
        }

        e(List list, boolean z10) {
            this.f16285c = z10;
            k(list);
        }

        private qb.y b() {
            if (g()) {
                return ((a) this.f16283a.get(this.f16284b)).d();
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        private List f(List list, List list2) {
            if (list.isEmpty()) {
                return list2;
            }
            if (list2.isEmpty()) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size() + list2.size());
            for (int i10 = 0; i10 < Math.max(list.size(), list2.size()); i10++) {
                if (i10 < list.size()) {
                    arrayList.add((a) list.get(i10));
                }
                if (i10 < list2.size()) {
                    arrayList.add((a) list2.get(i10));
                }
            }
            return arrayList;
        }

        private List l(List list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Boolean bool = null;
            for (int i10 = 0; i10 < list.size(); i10++) {
                qb.y yVar = (qb.y) list.get(i10);
                for (int i11 = 0; i11 < yVar.a().size(); i11++) {
                    SocketAddress socketAddress = (SocketAddress) yVar.a().get(i11);
                    if ((socketAddress instanceof InetSocketAddress) && (((InetSocketAddress) socketAddress).getAddress() instanceof Inet4Address)) {
                        if (bool == null) {
                            bool = Boolean.FALSE;
                        }
                        arrayList.add(new a(yVar.b(), socketAddress));
                    } else {
                        if (bool == null) {
                            bool = Boolean.TRUE;
                        }
                        arrayList2.add(new a(yVar.b(), socketAddress));
                    }
                }
            }
            return (bool == null || !bool.booleanValue()) ? f(arrayList, arrayList2) : f(arrayList2, arrayList);
        }

        private List m(List list) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                qb.y yVar = (qb.y) list.get(i10);
                for (int i11 = 0; i11 < yVar.a().size(); i11++) {
                    arrayList.add(new a(yVar.b(), (SocketAddress) yVar.a().get(i11)));
                }
            }
            return arrayList;
        }

        public SocketAddress a() {
            if (g()) {
                return ((a) this.f16283a.get(this.f16284b)).f16287b;
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        public List c() {
            return Collections.singletonList(b());
        }

        public qb.a d() {
            if (g()) {
                return ((a) this.f16283a.get(this.f16284b)).f16286a;
            }
            throw new IllegalStateException("Index is off the end of the address group list");
        }

        public boolean e() {
            if (!g()) {
                return false;
            }
            this.f16284b++;
            return g();
        }

        public boolean g() {
            return this.f16284b < this.f16283a.size();
        }

        public void h() {
            this.f16284b = 0;
        }

        public boolean i(SocketAddress socketAddress) {
            r9.l.o(socketAddress, "needle");
            for (int i10 = 0; i10 < this.f16283a.size(); i10++) {
                if (((a) this.f16283a.get(i10)).f16287b.equals(socketAddress)) {
                    this.f16284b = i10;
                    return true;
                }
            }
            return false;
        }

        public int j() {
            return this.f16283a.size();
        }

        public void k(List list) {
            r9.l.o(list, "newGroups");
            this.f16283a = this.f16285c ? l(list) : m(list);
            h();
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Boolean f16288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Long f16289b;

        public f(Boolean bool) {
            this(bool, null);
        }

        f(Boolean bool, Long l10) {
            this.f16288a = bool;
            this.f16289b = l10;
        }
    }

    private static final class g extends q0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0.g f16290a;

        g(q0.g gVar) {
            this.f16290a = (q0.g) r9.l.o(gVar, "result");
        }

        @Override // qb.q0.k
        public q0.g a(q0.h hVar) {
            return this.f16290a;
        }

        public String toString() {
            return r9.g.a(g.class).d("result", this.f16290a).toString();
        }
    }

    private final class h extends q0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a2 f16291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f16292b = new AtomicBoolean(false);

        h(a2 a2Var) {
            this.f16291a = (a2) r9.l.o(a2Var, "pickFirstLeafLoadBalancer");
        }

        @Override // qb.q0.k
        public q0.g a(q0.h hVar) {
            if (this.f16292b.compareAndSet(false, true)) {
                qb.z1 z1VarD = a2.this.f16265h.d();
                final a2 a2Var = this.f16291a;
                Objects.requireNonNull(a2Var);
                z1VarD.execute(new Runnable() { // from class: io.grpc.internal.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        a2Var.c();
                    }
                });
            }
            return q0.g.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q0.j f16294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private qb.q f16295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f16296c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private qb.r f16297d = qb.r.a(qb.q.IDLE);

        public i(q0.j jVar, qb.q qVar) {
            this.f16294a = jVar;
            this.f16295b = qVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public qb.q g() {
            return this.f16297d.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(qb.q qVar) {
            this.f16295b = qVar;
            if (qVar == qb.q.READY || qVar == qb.q.TRANSIENT_FAILURE) {
                this.f16296c = true;
            } else if (qVar == qb.q.IDLE) {
                this.f16296c = false;
            }
        }

        public qb.q h() {
            return this.f16295b;
        }

        public q0.j i() {
            return this.f16294a;
        }

        public boolean j() {
            return this.f16296c;
        }
    }

    a2(q0.e eVar) {
        boolean z10 = !s() && e2.g();
        this.f16264g = z10;
        this.f16266i = new HashMap();
        this.f16267j = new e(s9.k.t(), z10);
        this.f16268k = 0;
        this.f16269l = true;
        this.f16270m = null;
        qb.q qVar = qb.q.IDLE;
        this.f16271n = qVar;
        this.f16272o = qVar;
        this.f16273p = true;
        this.f16274q = new j0.a();
        this.f16276s = null;
        this.f16277t = s();
        this.f16265h = (q0.e) r9.l.o(eVar, "helper");
    }

    private void n() {
        z1.d dVar = this.f16270m;
        if (dVar != null) {
            dVar.a();
            this.f16270m = null;
        }
    }

    private i o(SocketAddress socketAddress, qb.a aVar) {
        d dVar = new d(this, null);
        q0.j jVarA = this.f16265h.a(q0.b.d().e(s9.p.g(new qb.y(socketAddress, aVar))).b(qb.q0.f24710b, dVar).b(qb.q0.f24711c, Boolean.valueOf(this.f16277t)).c());
        if (jVarA == null) {
            f16263u.warning("Was not able to create subchannel for " + socketAddress);
            throw new IllegalStateException("Can't create subchannel");
        }
        final i iVar = new i(jVarA, qb.q.IDLE);
        dVar.f16281a = iVar;
        this.f16266i.put(socketAddress, iVar);
        qb.a aVarC = jVarA.c();
        if (this.f16273p || aVarC.b(qb.q0.f24712d) == null) {
            iVar.f16297d = qb.r.a(qb.q.READY);
        }
        jVarA.h(new q0.l() { // from class: io.grpc.internal.z1
            @Override // qb.q0.l
            public final void a(qb.r rVar) {
                this.f17273a.t(iVar, rVar);
            }
        });
        return iVar;
    }

    private static List p(List list) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qb.y yVar = (qb.y) it.next();
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : yVar.a()) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new qb.y(arrayList2, yVar.b()));
            }
        }
        return arrayList;
    }

    private SocketAddress q(q0.j jVar) {
        return (SocketAddress) jVar.a().a().get(0);
    }

    private boolean r() {
        if (this.f16266i.size() < this.f16267j.j()) {
            return false;
        }
        Iterator it = this.f16266i.values().iterator();
        while (it.hasNext()) {
            if (!((i) it.next()).j()) {
                return false;
            }
        }
        return true;
    }

    static boolean s() {
        return w0.g("GRPC_SERIALIZE_RETRIES", false);
    }

    private void u() {
        if (this.f16277t && this.f16276s == null) {
            if (this.f16275r == null) {
                this.f16275r = this.f16274q.get();
            }
            this.f16276s = this.f16265h.d().c(new b(), this.f16275r.a(), TimeUnit.NANOSECONDS, this.f16265h.c());
        }
    }

    private void v() {
        if (this.f16264g) {
            z1.d dVar = this.f16270m;
            if (dVar == null || !dVar.b()) {
                this.f16270m = this.f16265h.d().c(new c(), 250L, TimeUnit.MILLISECONDS, this.f16265h.c());
            }
        }
    }

    private void w(i iVar) {
        z1.d dVar = this.f16276s;
        if (dVar != null) {
            dVar.a();
            this.f16276s = null;
        }
        this.f16275r = null;
        n();
        for (i iVar2 : this.f16266i.values()) {
            if (!iVar2.i().equals(iVar.f16294a)) {
                iVar2.i().g();
            }
        }
        this.f16266i.clear();
        iVar.k(qb.q.READY);
        this.f16266i.put(q(iVar.f16294a), iVar);
    }

    private boolean x(s9.k kVar) {
        HashSet<SocketAddress> hashSet = new HashSet(this.f16266i.keySet());
        HashSet hashSet2 = new HashSet();
        s9.b0 it = kVar.iterator();
        while (it.hasNext()) {
            hashSet2.addAll(((qb.y) it.next()).a());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((i) this.f16266i.remove(socketAddress)).i().g();
            }
        }
        return hashSet.isEmpty();
    }

    private void y(qb.q qVar, q0.k kVar) {
        if (qVar == this.f16272o && (qVar == qb.q.IDLE || qVar == qb.q.CONNECTING)) {
            return;
        }
        this.f16272o = qVar;
        this.f16265h.f(qVar, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(i iVar) {
        qb.q qVar = iVar.f16295b;
        qb.q qVar2 = qb.q.READY;
        if (qVar != qVar2) {
            return;
        }
        if (this.f16273p || iVar.g() == qVar2) {
            y(qVar2, new q0.d(q0.g.j(iVar.f16294a)));
            return;
        }
        qb.q qVarG = iVar.g();
        qb.q qVar3 = qb.q.TRANSIENT_FAILURE;
        if (qVarG == qVar3) {
            y(qVar3, new g(q0.g.h(iVar.f16297d.d())));
        } else if (this.f16272o != qVar3) {
            y(iVar.g(), new g(q0.g.i()));
        }
    }

    @Override // qb.q0
    public qb.u1 a(q0.i iVar) {
        f fVar;
        Boolean bool;
        if (this.f16271n == qb.q.SHUTDOWN) {
            return qb.u1.f24779o.s("Already shut down");
        }
        Boolean bool2 = (Boolean) iVar.b().b(qb.q0.f24713e);
        this.f16273p = bool2 == null || !bool2.booleanValue();
        List listA = iVar.a();
        if (listA.isEmpty()) {
            qb.u1 u1VarS = qb.u1.f24784t.s("NameResolver returned no usable address. addrs=" + iVar.a() + ", attrs=" + iVar.b());
            b(u1VarS);
            return u1VarS;
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            if (((qb.y) it.next()) == null) {
                qb.u1 u1VarS2 = qb.u1.f24784t.s("NameResolver returned address list with null endpoint. addrs=" + iVar.a() + ", attrs=" + iVar.b());
                b(u1VarS2);
                return u1VarS2;
            }
        }
        this.f16269l = true;
        List listP = p(listA);
        if ((iVar.c() instanceof f) && (bool = (fVar = (f) iVar.c()).f16288a) != null && bool.booleanValue()) {
            Collections.shuffle(listP, fVar.f16289b != null ? new Random(fVar.f16289b.longValue()) : new Random());
        }
        s9.k kVarH = s9.k.j().g(listP).h();
        qb.q qVar = this.f16271n;
        qb.q qVar2 = qb.q.READY;
        if (qVar == qVar2 || (qVar == qb.q.CONNECTING && (!this.f16264g || this.f16267j.g()))) {
            SocketAddress socketAddressA = this.f16267j.a();
            this.f16267j.k(kVarH);
            if (this.f16267j.i(socketAddressA)) {
                ((i) this.f16266i.get(socketAddressA)).i().i(this.f16267j.c());
                x(kVarH);
                return qb.u1.f24769e;
            }
        } else {
            this.f16267j.k(kVarH);
        }
        if (x(kVarH)) {
            qb.q qVar3 = qb.q.CONNECTING;
            this.f16271n = qVar3;
            y(qVar3, new g(q0.g.i()));
        }
        qb.q qVar4 = this.f16271n;
        if (qVar4 == qVar2) {
            qb.q qVar5 = qb.q.IDLE;
            this.f16271n = qVar5;
            y(qVar5, new h(this));
        } else if (qVar4 == qb.q.CONNECTING || qVar4 == qb.q.TRANSIENT_FAILURE) {
            n();
            c();
        }
        return qb.u1.f24769e;
    }

    @Override // qb.q0
    public void b(qb.u1 u1Var) {
        if (this.f16271n == qb.q.SHUTDOWN) {
            return;
        }
        Iterator it = this.f16266i.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).i().g();
        }
        this.f16266i.clear();
        this.f16267j.k(s9.k.t());
        qb.q qVar = qb.q.TRANSIENT_FAILURE;
        this.f16271n = qVar;
        y(qVar, new g(q0.g.h(u1Var)));
    }

    @Override // qb.q0
    public void c() {
        if (!this.f16267j.g() || this.f16271n == qb.q.SHUTDOWN) {
            return;
        }
        SocketAddress socketAddressA = this.f16267j.a();
        i iVarO = (i) this.f16266i.get(socketAddressA);
        if (iVarO == null) {
            iVarO = o(socketAddressA, this.f16267j.d());
        }
        int i10 = a.f16278a[iVarO.h().ordinal()];
        if (i10 == 1) {
            iVarO.f16294a.f();
            iVarO.k(qb.q.CONNECTING);
            v();
        } else {
            if (i10 == 2) {
                v();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (!this.f16277t) {
                this.f16267j.e();
                c();
            } else if (!this.f16267j.g()) {
                u();
            } else {
                iVarO.f16294a.f();
                iVarO.k(qb.q.CONNECTING);
            }
        }
    }

    @Override // qb.q0
    public void d() {
        f16263u.log(Level.FINE, "Shutting down, currently have {} subchannels created", Integer.valueOf(this.f16266i.size()));
        qb.q qVar = qb.q.SHUTDOWN;
        this.f16271n = qVar;
        this.f16272o = qVar;
        n();
        z1.d dVar = this.f16276s;
        if (dVar != null) {
            dVar.a();
            this.f16276s = null;
        }
        this.f16275r = null;
        Iterator it = this.f16266i.values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).i().g();
        }
        this.f16266i.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(i iVar, qb.r rVar) {
        qb.q qVarC = rVar.c();
        if (iVar == this.f16266i.get(q(iVar.f16294a)) && qVarC != qb.q.SHUTDOWN) {
            qb.q qVar = qb.q.IDLE;
            if (qVarC == qVar && iVar.f16295b == qb.q.READY) {
                this.f16265h.e();
            }
            iVar.k(qVarC);
            qb.q qVar2 = this.f16271n;
            qb.q qVar3 = qb.q.TRANSIENT_FAILURE;
            if (qVar2 == qVar3 || this.f16272o == qVar3) {
                if (qVarC == qb.q.CONNECTING) {
                    return;
                }
                if (qVarC == qVar) {
                    c();
                    return;
                }
            }
            int i10 = a.f16278a[qVarC.ordinal()];
            if (i10 == 1) {
                this.f16267j.h();
                this.f16271n = qVar;
                y(qVar, new h(this));
                return;
            }
            if (i10 == 2) {
                qb.q qVar4 = qb.q.CONNECTING;
                this.f16271n = qVar4;
                y(qVar4, new g(q0.g.i()));
                return;
            }
            if (i10 == 3) {
                w(iVar);
                this.f16267j.i(q(iVar.f16294a));
                this.f16271n = qb.q.READY;
                z(iVar);
                return;
            }
            if (i10 != 4) {
                throw new IllegalArgumentException("Unsupported state:" + qVarC);
            }
            if (this.f16267j.g() && this.f16266i.get(this.f16267j.a()) == iVar) {
                if (this.f16267j.e()) {
                    n();
                    c();
                } else if (this.f16266i.size() >= this.f16267j.j()) {
                    u();
                } else {
                    this.f16267j.h();
                    c();
                }
            }
            if (r()) {
                this.f16271n = qVar3;
                y(qVar3, new g(q0.g.h(rVar.d())));
                int i11 = this.f16268k + 1;
                this.f16268k = i11;
                if (i11 >= this.f16267j.j() || this.f16269l) {
                    this.f16269l = false;
                    this.f16268k = 0;
                    this.f16265h.e();
                }
            }
        }
    }
}
