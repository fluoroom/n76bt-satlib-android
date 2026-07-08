package com.google.protobuf;

import com.google.protobuf.a3;
import com.google.protobuf.e0;
import com.google.protobuf.i1;
import com.google.protobuf.l1;
import com.google.protobuf.n2;
import com.google.protobuf.o0;
import com.google.protobuf.q;
import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f9940a = Logger.getLogger(r.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f9941b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b[] f9942c = new b[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final g[] f9943d = new g[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e[] f9944e = new e[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final m[] f9945f = new m[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final l[] f9946g = new l[0];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f9948b;

        static {
            int[] iArr = new int[g.b.values().length];
            f9948b = iArr;
            try {
                iArr[g.b.ENUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9948b[g.b.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[g.c.values().length];
            f9947a = iArr2;
            try {
                iArr2[g.c.f10022f.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9947a[g.c.A.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9947a[g.c.f10032y.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9947a[g.c.f10030w.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9947a[g.c.f10024h.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9947a[g.c.f10020d.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9947a[g.c.B.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9947a[g.c.f10033z.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9947a[g.c.f10021e.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9947a[g.c.f10023g.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9947a[g.c.f10019c.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9947a[g.c.f10018b.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9947a[g.c.f10025r.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9947a[g.c.f10026s.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9947a[g.c.f10029v.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9947a[g.c.f10031x.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f9947a[g.c.f10028u.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9947a[g.c.f10027t.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    public static final class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q.b f9950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f9952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f9953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b[] f9954f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e[] f9955g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final g[] f9956h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final g[] f9957r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final g[] f9958s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final l[] f9959t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final int f9960u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final int[] f9961v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int[] f9962w;

        /* synthetic */ b(q.b bVar, h hVar, b bVar2, int i10, a aVar) {
            this(bVar, hVar, bVar2, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() throws d {
            for (b bVar : this.f9954f) {
                bVar.h();
            }
            for (g gVar : this.f9956h) {
                gVar.k();
            }
            Arrays.sort(this.f9957r);
            w();
            for (g gVar2 : this.f9958s) {
                gVar2.k();
            }
        }

        private void w() throws d {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                g[] gVarArr = this.f9957r;
                if (i11 >= gVarArr.length) {
                    return;
                }
                g gVar = gVarArr[i10];
                g gVar2 = gVarArr[i11];
                if (gVar.getNumber() == gVar2.getNumber()) {
                    throw new d(gVar2, "Field number " + gVar2.getNumber() + " has already been used in \"" + gVar2.m().d() + "\" by field \"" + gVar.e() + "\".", (a) null);
                }
                i10 = i11;
            }
        }

        @Override // com.google.protobuf.r.i
        public h a() {
            return this.f9952d;
        }

        @Override // com.google.protobuf.r.i
        public String d() {
            return this.f9951c;
        }

        @Override // com.google.protobuf.r.i
        public String e() {
            return this.f9950b.getName();
        }

        public g i(String str) {
            i iVarC = this.f9952d.f10042h.c(this.f9951c + '.' + str);
            if (iVarC instanceof g) {
                return (g) iVarC;
            }
            return null;
        }

        public g j(int i10) {
            g[] gVarArr = this.f9957r;
            return (g) r.j(gVarArr, gVarArr.length, g.f9993v, i10);
        }

        public List k() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f9955g));
        }

        public List l() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f9956h));
        }

        public List m() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f9954f));
        }

        public List n() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f9959t));
        }

        public q.n q() {
            return this.f9950b.m0();
        }

        public List r() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f9959t).subList(0, this.f9960u));
        }

        public boolean s() {
            return !this.f9950b.c0().isEmpty();
        }

        public boolean u(int i10) {
            int iBinarySearch = Arrays.binarySearch(this.f9961v, i10);
            if (iBinarySearch < 0) {
                iBinarySearch = (~iBinarySearch) - 1;
            }
            return iBinarySearch >= 0 && i10 < this.f9962w[iBinarySearch];
        }

        @Override // com.google.protobuf.r.i
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public q.b f() {
            return this.f9950b;
        }

        b(String str) {
            String strSubstring;
            String strSubstring2;
            super(null);
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                strSubstring2 = str.substring(iLastIndexOf + 1);
                strSubstring = str.substring(0, iLastIndexOf);
            } else {
                strSubstring = "";
                strSubstring2 = str;
            }
            this.f9949a = 0;
            this.f9950b = q.b.t0().f0(strSubstring2).g(q.b.c.C().C(1).A(536870912).build()).build();
            this.f9951c = str;
            this.f9953e = null;
            this.f9954f = r.f9942c;
            this.f9955g = r.f9944e;
            this.f9956h = r.f9943d;
            this.f9957r = r.f9943d;
            this.f9958s = r.f9943d;
            this.f9959t = r.f9946g;
            this.f9960u = 0;
            this.f9952d = new h(strSubstring, this);
            this.f9961v = new int[]{1};
            this.f9962w = new int[]{536870912};
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private b(q.b bVar, h hVar, b bVar2, int i10) throws d {
            l[] lVarArr;
            b[] bVarArr;
            e[] eVarArr;
            g[] gVarArr;
            g[] gVarArr2;
            a aVar = null;
            super(aVar);
            this.f9949a = i10;
            this.f9950b = bVar;
            this.f9951c = r.k(hVar, bVar2, bVar.getName());
            this.f9952d = hVar;
            this.f9953e = bVar2;
            if (bVar.k0() <= 0) {
                lVarArr = r.f9946g;
            } else {
                lVarArr = new l[bVar.k0()];
            }
            this.f9959t = lVarArr;
            int i11 = 0;
            for (int i12 = 0; i12 < bVar.k0(); i12++) {
                this.f9959t[i12] = new l(bVar.j0(i12), hVar, this, i12, null);
            }
            if (bVar.h0() <= 0) {
                bVarArr = r.f9942c;
            } else {
                bVarArr = new b[bVar.h0()];
            }
            this.f9954f = bVarArr;
            for (int i13 = 0; i13 < bVar.h0(); i13++) {
                this.f9954f[i13] = new b(bVar.g0(i13), hVar, this, i13);
            }
            if (bVar.T() <= 0) {
                eVarArr = r.f9944e;
            } else {
                eVarArr = new e[bVar.T()];
            }
            this.f9955g = eVarArr;
            for (int i14 = 0; i14 < bVar.T(); i14++) {
                this.f9955g[i14] = new e(bVar.S(i14), hVar, this, i14, null);
            }
            if (bVar.e0() <= 0) {
                gVarArr = r.f9943d;
            } else {
                gVarArr = new g[bVar.e0()];
            }
            this.f9956h = gVarArr;
            for (int i15 = 0; i15 < bVar.e0(); i15++) {
                this.f9956h[i15] = new g(bVar.d0(i15), hVar, this, i15, false, null);
            }
            this.f9957r = bVar.e0() > 0 ? (g[]) this.f9956h.clone() : r.f9943d;
            if (bVar.Y() <= 0) {
                gVarArr2 = r.f9943d;
            } else {
                gVarArr2 = new g[bVar.Y()];
            }
            this.f9958s = gVarArr2;
            for (int i16 = 0; i16 < bVar.Y(); i16++) {
                this.f9958s[i16] = new g(bVar.X(i16), hVar, this, i16, true, null);
            }
            for (int i17 = 0; i17 < bVar.k0(); i17++) {
                l lVar = this.f9959t[i17];
                lVar.f10062g = new g[lVar.l()];
                this.f9959t[i17].f10061f = 0;
            }
            for (int i18 = 0; i18 < bVar.e0(); i18++) {
                l lVarL = this.f9956h[i18].l();
                if (lVarL != null) {
                    lVarL.f10062g[l.j(lVarL)] = this.f9956h[i18];
                }
            }
            int i19 = 0;
            for (l lVar2 : this.f9959t) {
                if (lVar2.q()) {
                    i19++;
                } else if (i19 > 0) {
                    throw new d(this, "Synthetic oneofs must come last.", aVar);
                }
            }
            this.f9960u = this.f9959t.length - i19;
            hVar.f10042h.b(this);
            if (bVar.b0() <= 0) {
                this.f9961v = r.f9941b;
                this.f9962w = r.f9941b;
                return;
            }
            this.f9961v = new int[bVar.b0()];
            this.f9962w = new int[bVar.b0()];
            for (q.b.c cVar : bVar.c0()) {
                this.f9961v[i11] = cVar.w();
                this.f9962w[i11] = cVar.t();
                i11++;
            }
            Arrays.sort(this.f9961v);
            Arrays.sort(this.f9962w);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f9963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f9964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f9965c = new HashMap();

        private static final class a extends i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f9966a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f9967b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final h f9968c;

            a(String str, String str2, h hVar) {
                super(null);
                this.f9968c = hVar;
                this.f9967b = str2;
                this.f9966a = str;
            }

            @Override // com.google.protobuf.r.i
            public h a() {
                return this.f9968c;
            }

            @Override // com.google.protobuf.r.i
            public String d() {
                return this.f9967b;
            }

            @Override // com.google.protobuf.r.i
            public String e() {
                return this.f9966a;
            }

            @Override // com.google.protobuf.r.i
            public i1 f() {
                return this.f9968c.f();
            }
        }

        enum b {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        c(h[] hVarArr, boolean z10) {
            this.f9963a = Collections.newSetFromMap(new IdentityHashMap(hVarArr.length));
            this.f9964b = z10;
            for (h hVar : hVarArr) {
                this.f9963a.add(hVar);
                e(hVar);
            }
            for (h hVar2 : this.f9963a) {
                try {
                    a(hVar2.n(), hVar2);
                } catch (d e10) {
                    throw new AssertionError(e10);
                }
            }
        }

        private void e(h hVar) {
            for (h hVar2 : hVar.q()) {
                if (this.f9963a.add(hVar2)) {
                    e(hVar2);
                }
            }
        }

        static void i(i iVar) throws d {
            String strE = iVar.e();
            a aVar = null;
            if (strE.length() == 0) {
                throw new d(iVar, "Missing name.", aVar);
            }
            for (int i10 = 0; i10 < strE.length(); i10++) {
                char cCharAt = strE.charAt(i10);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i10 <= 0))) {
                    throw new d(iVar, '\"' + strE + "\" is not a valid identifier.", aVar);
                }
            }
        }

        void a(String str, h hVar) throws d {
            String strSubstring;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                strSubstring = str;
            } else {
                a(str.substring(0, iLastIndexOf), hVar);
                strSubstring = str.substring(iLastIndexOf + 1);
            }
            i iVar = (i) this.f9965c.put(str, new a(strSubstring, str, hVar));
            if (iVar != null) {
                this.f9965c.put(str, iVar);
                if (iVar instanceof a) {
                    return;
                }
                throw new d(hVar, '\"' + strSubstring + "\" is already defined (as something other than a package) in file \"" + iVar.a().e() + "\".", (a) null);
            }
        }

        void b(i iVar) throws d {
            i(iVar);
            String strD = iVar.d();
            i iVar2 = (i) this.f9965c.put(strD, iVar);
            if (iVar2 != null) {
                this.f9965c.put(strD, iVar2);
                a aVar = null;
                if (iVar.a() != iVar2.a()) {
                    throw new d(iVar, '\"' + strD + "\" is already defined in file \"" + iVar2.a().e() + "\".", aVar);
                }
                int iLastIndexOf = strD.lastIndexOf(46);
                if (iLastIndexOf == -1) {
                    throw new d(iVar, '\"' + strD + "\" is already defined.", aVar);
                }
                throw new d(iVar, '\"' + strD.substring(iLastIndexOf + 1) + "\" is already defined in \"" + strD.substring(0, iLastIndexOf) + "\".", aVar);
            }
        }

        i c(String str) {
            return d(str, b.ALL_SYMBOLS);
        }

        i d(String str, b bVar) {
            i iVar = (i) this.f9965c.get(str);
            if (iVar != null && (bVar == b.ALL_SYMBOLS || ((bVar == b.TYPES_ONLY && g(iVar)) || (bVar == b.AGGREGATES_ONLY && f(iVar))))) {
                return iVar;
            }
            Iterator it = this.f9963a.iterator();
            while (it.hasNext()) {
                i iVar2 = (i) ((h) it.next()).f10042h.f9965c.get(str);
                if (iVar2 != null && (bVar == b.ALL_SYMBOLS || ((bVar == b.TYPES_ONLY && g(iVar2)) || (bVar == b.AGGREGATES_ONLY && f(iVar2))))) {
                    return iVar2;
                }
            }
            return null;
        }

        boolean f(i iVar) {
            return (iVar instanceof b) || (iVar instanceof e) || (iVar instanceof a) || (iVar instanceof m);
        }

        boolean g(i iVar) {
            return (iVar instanceof b) || (iVar instanceof e);
        }

        i h(String str, i iVar, b bVar) throws d {
            i iVarD;
            String string;
            if (str.startsWith(".")) {
                string = str.substring(1);
                iVarD = d(string, bVar);
            } else {
                int iIndexOf = str.indexOf(46);
                String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
                StringBuilder sb2 = new StringBuilder(iVar.d());
                while (true) {
                    int iLastIndexOf = sb2.lastIndexOf(".");
                    if (iLastIndexOf == -1) {
                        iVarD = d(str, bVar);
                        string = str;
                        break;
                    }
                    int i10 = iLastIndexOf + 1;
                    sb2.setLength(i10);
                    sb2.append(strSubstring);
                    i iVarD2 = d(sb2.toString(), b.AGGREGATES_ONLY);
                    if (iVarD2 != null) {
                        if (iIndexOf != -1) {
                            sb2.setLength(i10);
                            sb2.append(str);
                            iVarD = d(sb2.toString(), bVar);
                        } else {
                            iVarD = iVarD2;
                        }
                        string = sb2.toString();
                    } else {
                        sb2.setLength(iLastIndexOf);
                    }
                }
            }
            if (iVarD != null) {
                return iVarD;
            }
            if (!this.f9964b || bVar != b.TYPES_ONLY) {
                throw new d(iVar, '\"' + str + "\" is not defined.", (a) null);
            }
            r.f9940a.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
            b bVar2 = new b(string);
            this.f9963a.add(bVar2.a());
            return bVar2;
        }
    }

    public static class d extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i1 f9974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9975c;

        /* synthetic */ d(h hVar, String str, a aVar) {
            this(hVar, str);
        }

        /* synthetic */ d(i iVar, String str, a aVar) {
            this(iVar, str);
        }

        /* synthetic */ d(i iVar, String str, Throwable th2, a aVar) {
            this(iVar, str, th2);
        }

        private d(i iVar, String str) {
            super(iVar.d() + ": " + str);
            this.f9973a = iVar.d();
            this.f9974b = iVar.f();
            this.f9975c = str;
        }

        private d(i iVar, String str, Throwable th2) {
            this(iVar, str);
            initCause(th2);
        }

        private d(h hVar, String str) {
            super(hVar.e() + ": " + str);
            this.f9973a = hVar.e();
            this.f9974b = hVar.f();
            this.f9975c = str;
        }
    }

    public static final class e extends i implements o0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q.d f9977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f9979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f9980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final f[] f9981f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final f[] f9982g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f9983h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Map f9984r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ReferenceQueue f9985s;

        private static class a extends WeakReference {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f9986a;

            /* synthetic */ a(int i10, f fVar, a aVar) {
                this(i10, fVar);
            }

            private a(int i10, f fVar) {
                super(fVar);
                this.f9986a = i10;
            }
        }

        /* synthetic */ e(q.d dVar, h hVar, b bVar, int i10, a aVar) {
            this(dVar, hVar, bVar, i10);
        }

        @Override // com.google.protobuf.r.i
        public h a() {
            return this.f9979d;
        }

        @Override // com.google.protobuf.r.i
        public String d() {
            return this.f9978c;
        }

        @Override // com.google.protobuf.r.i
        public String e() {
            return this.f9977b.getName();
        }

        public f h(String str) {
            i iVarC = this.f9979d.f10042h.c(this.f9978c + '.' + str);
            if (iVarC instanceof f) {
                return (f) iVarC;
            }
            return null;
        }

        public f i(int i10) {
            return (f) r.j(this.f9982g, this.f9983h, f.f9988f, i10);
        }

        public f j(int i10) {
            f fVar;
            f fVarI = i(i10);
            if (fVarI != null) {
                return fVarI;
            }
            synchronized (this) {
                try {
                    if (this.f9985s == null) {
                        this.f9985s = new ReferenceQueue();
                        this.f9984r = new HashMap();
                    } else {
                        while (true) {
                            a aVar = (a) this.f9985s.poll();
                            if (aVar == null) {
                                break;
                            }
                            this.f9984r.remove(Integer.valueOf(aVar.f9986a));
                        }
                    }
                    WeakReference weakReference = (WeakReference) this.f9984r.get(Integer.valueOf(i10));
                    a aVar2 = null;
                    fVar = weakReference == null ? null : (f) weakReference.get();
                    if (fVar == null) {
                        fVar = new f(this, Integer.valueOf(i10), aVar2);
                        this.f9984r.put(Integer.valueOf(i10), new a(i10, fVar, aVar2));
                    }
                } finally {
                }
            }
            return fVar;
        }

        public List k() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f9981f));
        }

        @Override // com.google.protobuf.r.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public q.d f() {
            return this.f9977b;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private e(q.d dVar, h hVar, b bVar, int i10) throws d {
            a aVar = null;
            super(aVar);
            this.f9984r = null;
            this.f9985s = null;
            this.f9976a = i10;
            this.f9977b = dVar;
            this.f9978c = r.k(hVar, bVar, dVar.getName());
            this.f9979d = hVar;
            this.f9980e = bVar;
            if (dVar.N() == 0) {
                throw new d(this, "Enums must contain at least one value.", aVar);
            }
            this.f9981f = new f[dVar.N()];
            int i11 = 0;
            for (int i12 = 0; i12 < dVar.N(); i12++) {
                this.f9981f[i12] = new f(dVar.L(i12), hVar, this, i12, null);
            }
            f[] fVarArr = (f[]) this.f9981f.clone();
            this.f9982g = fVarArr;
            Arrays.sort(fVarArr, f.f9987e);
            for (int i13 = 1; i13 < dVar.N(); i13++) {
                f[] fVarArr2 = this.f9982g;
                f fVar = fVarArr2[i11];
                f fVar2 = fVarArr2[i13];
                if (fVar.getNumber() != fVar2.getNumber()) {
                    i11++;
                    this.f9982g[i11] = fVar2;
                }
            }
            int i14 = i11 + 1;
            this.f9983h = i14;
            Arrays.fill(this.f9982g, i14, dVar.N(), (Object) null);
            hVar.f10042h.b(this);
        }
    }

    public static final class f extends i implements o0.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final Comparator f9987e = new a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final k f9988f = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q.f f9990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9991c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e f9992d;

        class a implements Comparator {
            a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(f fVar, f fVar2) {
                return Integer.valueOf(fVar.getNumber()).compareTo(Integer.valueOf(fVar2.getNumber()));
            }
        }

        class b implements k {
            b() {
            }

            @Override // com.google.protobuf.r.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int a(f fVar) {
                return fVar.getNumber();
            }
        }

        /* synthetic */ f(q.f fVar, h hVar, e eVar, int i10, a aVar) {
            this(fVar, hVar, eVar, i10);
        }

        @Override // com.google.protobuf.r.i
        public h a() {
            return this.f9992d.f9979d;
        }

        @Override // com.google.protobuf.r.i
        public String d() {
            return this.f9991c;
        }

        @Override // com.google.protobuf.r.i
        public String e() {
            return this.f9990b.getName();
        }

        public int g() {
            return this.f9989a;
        }

        @Override // com.google.protobuf.o0.c
        public int getNumber() {
            return this.f9990b.v();
        }

        public e h() {
            return this.f9992d;
        }

        @Override // com.google.protobuf.r.i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public q.f f() {
            return this.f9990b;
        }

        public String toString() {
            return this.f9990b.getName();
        }

        /* synthetic */ f(e eVar, Integer num, a aVar) {
            this(eVar, num);
        }

        private f(q.f fVar, h hVar, e eVar, int i10) throws d {
            super(null);
            this.f9989a = i10;
            this.f9990b = fVar;
            this.f9992d = eVar;
            this.f9991c = eVar.d() + '.' + fVar.getName();
            hVar.f10042h.b(this);
        }

        private f(e eVar, Integer num) {
            super(null);
            q.f fVarH = q.f.C().B("UNKNOWN_ENUM_VALUE_" + eVar.e() + "_" + num).C(num.intValue()).build();
            this.f9989a = -1;
            this.f9990b = fVarH;
            this.f9992d = eVar;
            this.f9991c = eVar.d() + '.' + fVarH.getName();
        }
    }

    public static final class g extends i implements Comparable, e0.c {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final k f9993v = new a();

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final a3.b[] f9994w = a3.b.values();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f9995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q.j f9996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f9997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f9998d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f9999e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f10000f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private c f10001g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private b f10002h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private b f10003r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private l f10004s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private e f10005t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Object f10006u;

        class a implements k {
            a() {
            }

            @Override // com.google.protobuf.r.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int a(g gVar) {
                return gVar.getNumber();
            }
        }

        public enum b {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.FALSE),
            STRING(""),
            BYTE_STRING(com.google.protobuf.l.f9119b),
            ENUM(null),
            MESSAGE(null);


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f10017a;

            b(Object obj) {
                this.f10017a = obj;
            }
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        public static final class c {
            public static final c A;
            public static final c B;
            private static final c[] C;
            private static final /* synthetic */ c[] D;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f10018b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f10019c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final c f10020d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final c f10021e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final c f10022f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final c f10023g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final c f10024h;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public static final c f10025r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public static final c f10026s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public static final c f10027t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public static final c f10028u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public static final c f10029v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public static final c f10030w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public static final c f10031x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public static final c f10032y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public static final c f10033z;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f10034a;

            static {
                c cVar = new c("DOUBLE", 0, b.DOUBLE);
                f10018b = cVar;
                c cVar2 = new c("FLOAT", 1, b.FLOAT);
                f10019c = cVar2;
                b bVar = b.LONG;
                c cVar3 = new c("INT64", 2, bVar);
                f10020d = cVar3;
                c cVar4 = new c("UINT64", 3, bVar);
                f10021e = cVar4;
                b bVar2 = b.INT;
                c cVar5 = new c("INT32", 4, bVar2);
                f10022f = cVar5;
                c cVar6 = new c("FIXED64", 5, bVar);
                f10023g = cVar6;
                c cVar7 = new c("FIXED32", 6, bVar2);
                f10024h = cVar7;
                c cVar8 = new c("BOOL", 7, b.BOOLEAN);
                f10025r = cVar8;
                c cVar9 = new c("STRING", 8, b.STRING);
                f10026s = cVar9;
                b bVar3 = b.MESSAGE;
                c cVar10 = new c("GROUP", 9, bVar3);
                f10027t = cVar10;
                c cVar11 = new c("MESSAGE", 10, bVar3);
                f10028u = cVar11;
                c cVar12 = new c("BYTES", 11, b.BYTE_STRING);
                f10029v = cVar12;
                c cVar13 = new c("UINT32", 12, bVar2);
                f10030w = cVar13;
                c cVar14 = new c("ENUM", 13, b.ENUM);
                f10031x = cVar14;
                c cVar15 = new c("SFIXED32", 14, bVar2);
                f10032y = cVar15;
                c cVar16 = new c("SFIXED64", 15, bVar);
                f10033z = cVar16;
                c cVar17 = new c("SINT32", 16, bVar2);
                A = cVar17;
                c cVar18 = new c("SINT64", 17, bVar);
                B = cVar18;
                D = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18};
                C = values();
            }

            private c(String str, int i10, b bVar) {
                this.f10034a = bVar;
            }

            public static c e(q.j.d dVar) {
                return C[dVar.getNumber() - 1];
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) D.clone();
            }

            public b d() {
                return this.f10034a;
            }
        }

        static {
            if (c.C.length != q.j.d.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        /* synthetic */ g(q.j jVar, h hVar, b bVar, int i10, boolean z10, a aVar) {
            this(jVar, hVar, bVar, i10, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public void k() throws d {
            a aVar = null;
            if (this.f9996b.c0()) {
                i iVarH = this.f9998d.f10042h.h(this.f9996b.Q(), this, c.b.TYPES_ONLY);
                if (!(iVarH instanceof b)) {
                    throw new d(this, '\"' + this.f9996b.Q() + "\" is not a message type.", aVar);
                }
                this.f10002h = (b) iVarH;
                if (!m().u(getNumber())) {
                    throw new d(this, '\"' + m().d() + "\" does not declare " + getNumber() + " as an extension number.", aVar);
                }
            }
            if (this.f9996b.l0()) {
                i iVarH2 = this.f9998d.f10042h.h(this.f9996b.a0(), this, c.b.TYPES_ONLY);
                if (!this.f9996b.k0()) {
                    if (iVarH2 instanceof b) {
                        this.f10001g = c.f10028u;
                    } else {
                        if (!(iVarH2 instanceof e)) {
                            throw new d(this, '\"' + this.f9996b.a0() + "\" is not a type.", aVar);
                        }
                        this.f10001g = c.f10031x;
                    }
                }
                if (u() == b.MESSAGE) {
                    if (!(iVarH2 instanceof b)) {
                        throw new d(this, '\"' + this.f9996b.a0() + "\" is not a message type.", aVar);
                    }
                    this.f10003r = (b) iVarH2;
                    if (this.f9996b.b0()) {
                        throw new d(this, "Messages can't have default values.", aVar);
                    }
                } else {
                    if (u() != b.ENUM) {
                        throw new d(this, "Field with primitive type has type_name.", aVar);
                    }
                    if (!(iVarH2 instanceof e)) {
                        throw new d(this, '\"' + this.f9996b.a0() + "\" is not an enum type.", aVar);
                    }
                    this.f10005t = (e) iVarH2;
                }
            } else if (u() == b.MESSAGE || u() == b.ENUM) {
                throw new d(this, "Field with message or enum type missing type_name.", aVar);
            }
            if (this.f9996b.X().f0() && !F()) {
                throw new d(this, "[packed = true] can only be specified for repeated primitive fields.", aVar);
            }
            if (this.f9996b.b0()) {
                if (b()) {
                    throw new d(this, "Repeated fields cannot have default values.", aVar);
                }
                try {
                    switch (a.f9947a[y().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            this.f10006u = Integer.valueOf(n2.j(this.f9996b.O()));
                            break;
                        case 4:
                        case 5:
                            this.f10006u = Integer.valueOf(n2.m(this.f9996b.O()));
                            break;
                        case 6:
                        case 7:
                        case 8:
                            this.f10006u = Long.valueOf(n2.k(this.f9996b.O()));
                            break;
                        case 9:
                        case 10:
                            this.f10006u = Long.valueOf(n2.n(this.f9996b.O()));
                            break;
                        case 11:
                            if (this.f9996b.O().equals("inf")) {
                                this.f10006u = Float.valueOf(Float.POSITIVE_INFINITY);
                            } else if (this.f9996b.O().equals("-inf")) {
                                this.f10006u = Float.valueOf(Float.NEGATIVE_INFINITY);
                            } else if (!this.f9996b.O().equals("nan")) {
                                this.f10006u = Float.valueOf(this.f9996b.O());
                            } else {
                                this.f10006u = Float.valueOf(Float.NaN);
                            }
                            break;
                        case 12:
                            if (this.f9996b.O().equals("inf")) {
                                this.f10006u = Double.valueOf(Double.POSITIVE_INFINITY);
                            } else if (this.f9996b.O().equals("-inf")) {
                                this.f10006u = Double.valueOf(Double.NEGATIVE_INFINITY);
                            } else if (!this.f9996b.O().equals("nan")) {
                                this.f10006u = Double.valueOf(this.f9996b.O());
                            } else {
                                this.f10006u = Double.valueOf(Double.NaN);
                            }
                            break;
                        case 13:
                            this.f10006u = Boolean.valueOf(this.f9996b.O());
                            break;
                        case 14:
                            this.f10006u = this.f9996b.O();
                            break;
                        case 15:
                            try {
                                this.f10006u = n2.p(this.f9996b.O());
                            } catch (n2.b e10) {
                                throw new d(this, "Couldn't parse default value: " + e10.getMessage(), e10, aVar);
                            }
                            break;
                        case 16:
                            f fVarH = this.f10005t.h(this.f9996b.O());
                            this.f10006u = fVarH;
                            if (fVarH == null) {
                                throw new d(this, "Unknown enum default value: \"" + this.f9996b.O() + '\"', aVar);
                            }
                            break;
                            break;
                        case 17:
                        case 18:
                            throw new d(this, "Message type had default value.", aVar);
                    }
                } catch (NumberFormatException e11) {
                    throw new d(this, "Could not parse default value: \"" + this.f9996b.O() + '\"', e11, aVar);
                }
            } else if (b()) {
                this.f10006u = Collections.EMPTY_LIST;
            } else {
                int i10 = a.f9948b[u().ordinal()];
                if (i10 == 1) {
                    this.f10006u = this.f10005t.k().get(0);
                } else if (i10 != 2) {
                    this.f10006u = u().f10017a;
                } else {
                    this.f10006u = null;
                }
            }
            b bVar = this.f10002h;
            if (bVar == null || !bVar.q().R()) {
                return;
            }
            if (!C()) {
                throw new d(this, "MessageSets cannot have fields, only extensions.", aVar);
            }
            if (!E() || y() != c.f10028u) {
                throw new d(this, "Extensions of MessageSets must be optional messages.", aVar);
            }
        }

        public boolean A() {
            if (this.f10000f) {
                return true;
            }
            return this.f9998d.r() == h.a.PROTO2 && E() && l() == null;
        }

        public boolean B() {
            if (b()) {
                return false;
            }
            return y() == c.f10028u || y() == c.f10027t || l() != null || this.f9998d.r() == h.a.PROTO2;
        }

        public boolean C() {
            return this.f9996b.c0();
        }

        public boolean D() {
            return y() == c.f10028u && b() && v().q().Q();
        }

        public boolean E() {
            return this.f9996b.S() == q.j.c.LABEL_OPTIONAL;
        }

        public boolean F() {
            return b() && c().e();
        }

        public boolean G() {
            return this.f9996b.S() == q.j.c.LABEL_REQUIRED;
        }

        public boolean H() {
            return y() == c.f10031x && a().r() == h.a.PROTO2;
        }

        public boolean I() {
            if (this.f10001g != c.f10026s) {
                return false;
            }
            if (m().q().Q() || a().r() == h.a.PROTO3) {
                return true;
            }
            return a().m().z0();
        }

        @Override // com.google.protobuf.r.i
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public q.j f() {
            return this.f9996b;
        }

        @Override // com.google.protobuf.r.i
        public h a() {
            return this.f9998d;
        }

        @Override // com.google.protobuf.e0.c
        public boolean b() {
            return this.f9996b.S() == q.j.c.LABEL_REPEATED;
        }

        @Override // com.google.protobuf.e0.c
        public a3.b c() {
            return f9994w[this.f10001g.ordinal()];
        }

        @Override // com.google.protobuf.r.i
        public String d() {
            return this.f9997c;
        }

        @Override // com.google.protobuf.r.i
        public String e() {
            return this.f9996b.getName();
        }

        @Override // com.google.protobuf.e0.c
        public int getNumber() {
            return this.f9996b.T();
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            if (gVar.f10002h == this.f10002h) {
                return getNumber() - gVar.getNumber();
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        public l l() {
            return this.f10004s;
        }

        public b m() {
            return this.f10002h;
        }

        public Object n() {
            if (u() != b.MESSAGE) {
                return this.f10006u;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        @Override // com.google.protobuf.e0.c
        public a3.c o() {
            return c().a();
        }

        @Override // com.google.protobuf.e0.c
        public boolean p() {
            if (F()) {
                return a().r() == h.a.PROTO2 ? w().f0() : !w().t0() || w().f0();
            }
            return false;
        }

        public e q() {
            if (u() == b.ENUM) {
                return this.f10005t;
            }
            throw new UnsupportedOperationException(String.format("This field is not of enum type. (%s)", this.f9997c));
        }

        public b r() {
            if (C()) {
                return this.f9999e;
            }
            throw new UnsupportedOperationException(String.format("This field is not an extension. (%s)", this.f9997c));
        }

        public int s() {
            return this.f9995a;
        }

        @Override // com.google.protobuf.e0.c
        public l1.a t(l1.a aVar, l1 l1Var) {
            return ((i1.a) aVar).mergeFrom((i1) l1Var);
        }

        public String toString() {
            return d();
        }

        public b u() {
            return this.f10001g.d();
        }

        public b v() {
            if (u() == b.MESSAGE) {
                return this.f10003r;
            }
            throw new UnsupportedOperationException(String.format("This field is not of message type. (%s)", this.f9997c));
        }

        public q.k w() {
            return this.f9996b.X();
        }

        public l x() {
            l lVar = this.f10004s;
            if (lVar == null || lVar.q()) {
                return null;
            }
            return this.f10004s;
        }

        public c y() {
            return this.f10001g;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(q.j jVar, h hVar, b bVar, int i10, boolean z10) throws d {
            a aVar = null;
            super(aVar);
            this.f9995a = i10;
            this.f9996b = jVar;
            this.f9997c = r.k(hVar, bVar, jVar.getName());
            this.f9998d = hVar;
            if (jVar.k0()) {
                this.f10001g = c.e(jVar.Z());
            }
            this.f10000f = jVar.Y();
            if (getNumber() <= 0) {
                throw new d(this, "Field numbers must be positive integers.", aVar);
            }
            if (z10) {
                if (!jVar.c0()) {
                    throw new d(this, "FieldDescriptorProto.extendee not set for extension field.", aVar);
                }
                this.f10002h = null;
                if (bVar != null) {
                    this.f9999e = bVar;
                } else {
                    this.f9999e = null;
                }
                if (jVar.h0()) {
                    throw new d(this, "FieldDescriptorProto.oneof_index set for extension field.", aVar);
                }
                this.f10004s = null;
            } else {
                if (jVar.c0()) {
                    throw new d(this, "FieldDescriptorProto.extendee set for non-extension field.", aVar);
                }
                this.f10002h = bVar;
                if (!jVar.h0()) {
                    this.f10004s = null;
                } else {
                    if (jVar.W() < 0 || jVar.W() >= bVar.f().k0()) {
                        throw new d(this, "FieldDescriptorProto.oneof_index is out of range for type " + bVar.e(), aVar);
                    }
                    l lVar = (l) bVar.n().get(jVar.W());
                    this.f10004s = lVar;
                    l.j(lVar);
                }
                this.f9999e = null;
            }
            hVar.f10042h.b(this);
        }
    }

    public static abstract class i {
        /* synthetic */ i(a aVar) {
            this();
        }

        public abstract h a();

        public abstract String d();

        public abstract String e();

        public abstract i1 f();

        private i() {
        }
    }

    public static final class j extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q.o f10050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f10052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final m f10053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private b f10054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f10055g;

        /* synthetic */ j(q.o oVar, h hVar, m mVar, int i10, a aVar) {
            this(oVar, hVar, mVar, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() throws d {
            c cVar = a().f10042h;
            String strD = this.f10050b.D();
            c.b bVar = c.b.TYPES_ONLY;
            i iVarH = cVar.h(strD, this, bVar);
            a aVar = null;
            if (!(iVarH instanceof b)) {
                throw new d(this, '\"' + this.f10050b.D() + "\" is not a message type.", aVar);
            }
            this.f10054f = (b) iVarH;
            i iVarH2 = a().f10042h.h(this.f10050b.H(), this, bVar);
            if (iVarH2 instanceof b) {
                this.f10055g = (b) iVarH2;
                return;
            }
            throw new d(this, '\"' + this.f10050b.H() + "\" is not a message type.", aVar);
        }

        @Override // com.google.protobuf.r.i
        public h a() {
            return this.f10052d;
        }

        @Override // com.google.protobuf.r.i
        public String d() {
            return this.f10051c;
        }

        @Override // com.google.protobuf.r.i
        public String e() {
            return this.f10050b.getName();
        }

        @Override // com.google.protobuf.r.i
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public q.o f() {
            return this.f10050b;
        }

        private j(q.o oVar, h hVar, m mVar, int i10) throws d {
            super(null);
            this.f10049a = i10;
            this.f10050b = oVar;
            this.f10052d = hVar;
            this.f10053e = mVar;
            this.f10051c = mVar.d() + '.' + oVar.getName();
            hVar.f10042h.b(this);
        }
    }

    private interface k {
        int a(Object obj);
    }

    public static final class l extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q.C0140q f10057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f10059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private b f10060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f10061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g[] f10062g;

        /* synthetic */ l(q.C0140q c0140q, h hVar, b bVar, int i10, a aVar) {
            this(c0140q, hVar, bVar, i10);
        }

        static /* synthetic */ int j(l lVar) {
            int i10 = lVar.f10061f;
            lVar.f10061f = i10 + 1;
            return i10;
        }

        @Override // com.google.protobuf.r.i
        public h a() {
            return this.f10059d;
        }

        @Override // com.google.protobuf.r.i
        public String d() {
            return this.f10058c;
        }

        @Override // com.google.protobuf.r.i
        public String e() {
            return this.f10057b.getName();
        }

        public b k() {
            return this.f10060e;
        }

        public int l() {
            return this.f10061f;
        }

        public List m() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f10062g));
        }

        public int n() {
            return this.f10056a;
        }

        public boolean q() {
            g[] gVarArr = this.f10062g;
            return gVarArr.length == 1 && gVarArr[0].f10000f;
        }

        @Override // com.google.protobuf.r.i
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public q.C0140q f() {
            return this.f10057b;
        }

        private l(q.C0140q c0140q, h hVar, b bVar, int i10) {
            super(null);
            this.f10057b = c0140q;
            this.f10058c = r.k(hVar, bVar, c0140q.getName());
            this.f10059d = hVar;
            this.f10056a = i10;
            this.f10060e = bVar;
            this.f10061f = 0;
        }
    }

    public static final class m extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q.s f10064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f10065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h f10066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private j[] f10067e;

        /* synthetic */ m(q.s sVar, h hVar, int i10, a aVar) {
            this(sVar, hVar, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() throws d {
            for (j jVar : this.f10067e) {
                jVar.h();
            }
        }

        @Override // com.google.protobuf.r.i
        public h a() {
            return this.f10066d;
        }

        @Override // com.google.protobuf.r.i
        public String d() {
            return this.f10065c;
        }

        @Override // com.google.protobuf.r.i
        public String e() {
            return this.f10064b.getName();
        }

        public j i(String str) {
            i iVarC = this.f10066d.f10042h.c(this.f10065c + '.' + str);
            if (iVarC instanceof j) {
                return (j) iVarC;
            }
            return null;
        }

        @Override // com.google.protobuf.r.i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public q.s f() {
            return this.f10064b;
        }

        private m(q.s sVar, h hVar, int i10) throws d {
            super(null);
            this.f10063a = i10;
            this.f10064b = sVar;
            this.f10065c = r.k(hVar, null, sVar.getName());
            this.f10066d = hVar;
            this.f10067e = new j[sVar.x()];
            for (int i11 = 0; i11 < sVar.x(); i11++) {
                this.f10067e[i11] = new j(sVar.w(i11), hVar, this, i11, null);
            }
            hVar.f10042h.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object j(Object[] objArr, int i10, k kVar, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) / 2;
            Object obj = objArr[i14];
            int iA = kVar.a(obj);
            if (i11 < iA) {
                i12 = i14 - 1;
            } else {
                if (i11 <= iA) {
                    return obj;
                }
                i13 = i14 + 1;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k(h hVar, b bVar, String str) {
        if (bVar != null) {
            return bVar.d() + '.' + str;
        }
        String strN = hVar.n();
        if (strN.isEmpty()) {
            return str;
        }
        return strN + '.' + str;
    }

    public static final class h extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private q.l f10035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f10036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e[] f10037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final m[] f10038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final g[] f10039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final h[] f10040f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final h[] f10041g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final c f10042h;

        public enum a {
            UNKNOWN("unknown"),
            PROTO2("proto2"),
            PROTO3("proto3"),
            EDITIONS("editions");


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f10048a;

            a(String str) {
                this.f10048a = str;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(q.l lVar, h[] hVarArr, c cVar, boolean z10) throws d {
            a aVar = null;
            super(aVar);
            this.f10042h = cVar;
            this.f10035a = lVar;
            this.f10040f = (h[]) hVarArr.clone();
            HashMap map = new HashMap();
            for (h hVar : hVarArr) {
                map.put(hVar.e(), hVar);
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < lVar.o0(); i10++) {
                int iN0 = lVar.n0(i10);
                if (iN0 < 0 || iN0 >= lVar.Z()) {
                    throw new d(this, "Invalid public dependency index.", aVar);
                }
                String strY = lVar.Y(iN0);
                h hVar2 = (h) map.get(strY);
                if (hVar2 != null) {
                    arrayList.add(hVar2);
                } else if (!z10) {
                    throw new d(this, "Invalid public dependency: " + strY, aVar);
                }
            }
            h[] hVarArr2 = new h[arrayList.size()];
            this.f10041g = hVarArr2;
            arrayList.toArray(hVarArr2);
            cVar.a(n(), this);
            this.f10036b = lVar.j0() > 0 ? new b[lVar.j0()] : r.f9942c;
            for (int i11 = 0; i11 < lVar.j0(); i11++) {
                this.f10036b[i11] = new b(lVar.i0(i11), this, null, i11, null);
            }
            this.f10037c = lVar.d0() > 0 ? new e[lVar.d0()] : r.f9944e;
            for (int i12 = 0; i12 < lVar.d0(); i12++) {
                this.f10037c[i12] = new e(lVar.c0(i12), this, null, i12, null);
            }
            this.f10038d = lVar.r0() > 0 ? new m[lVar.r0()] : r.f9945f;
            for (int i13 = 0; i13 < lVar.r0(); i13++) {
                this.f10038d[i13] = new m(lVar.q0(i13), this, i13, aVar);
            }
            this.f10039e = lVar.g0() > 0 ? new g[lVar.g0()] : r.f9943d;
            for (int i14 = 0; i14 < lVar.g0(); i14++) {
                this.f10039e[i14] = new g(lVar.f0(i14), this, null, i14, true, null);
            }
        }

        public static h h(q.l lVar, h[] hVarArr, boolean z10) throws d {
            h hVar = new h(lVar, hVarArr, new c(hVarArr, z10), z10);
            hVar.i();
            return hVar;
        }

        private void i() throws d {
            for (b bVar : this.f10036b) {
                bVar.h();
            }
            for (m mVar : this.f10038d) {
                mVar.h();
            }
            for (g gVar : this.f10039e) {
                gVar.k();
            }
        }

        public static h s(String[] strArr, h[] hVarArr) {
            try {
                q.l lVarG0 = q.l.G0(u(strArr));
                try {
                    return h(lVarG0, hVarArr, true);
                } catch (d e10) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + lVarG0.getName() + "\".", e10);
                }
            } catch (p0 e11) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e11);
            }
        }

        private static byte[] u(String[] strArr) {
            if (strArr.length == 1) {
                return strArr[0].getBytes(o0.f9246c);
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArr) {
                sb2.append(str);
            }
            return sb2.toString().getBytes(o0.f9246c);
        }

        @Override // com.google.protobuf.r.i
        public h a() {
            return this;
        }

        @Override // com.google.protobuf.r.i
        public String d() {
            return this.f10035a.getName();
        }

        @Override // com.google.protobuf.r.i
        public String e() {
            return this.f10035a.getName();
        }

        public m j(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String strN = n();
            if (!strN.isEmpty()) {
                str = strN + '.' + str;
            }
            i iVarC = this.f10042h.c(str);
            if ((iVarC instanceof m) && iVarC.a() == this) {
                return (m) iVarC;
            }
            return null;
        }

        public List k() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f10037c));
        }

        public List l() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f10036b));
        }

        public q.m m() {
            return this.f10035a.l0();
        }

        public String n() {
            return this.f10035a.m0();
        }

        public List q() {
            return DesugarCollections.unmodifiableList(Arrays.asList(this.f10041g));
        }

        public a r() {
            a aVar = a.PROTO3;
            if (aVar.f10048a.equals(this.f10035a.u0())) {
                return aVar;
            }
            a aVar2 = a.EDITIONS;
            return aVar2.f10048a.equals(this.f10035a.u0()) ? aVar2 : a.PROTO2;
        }

        @Override // com.google.protobuf.r.i
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public q.l f() {
            return this.f10035a;
        }

        h(String str, b bVar) throws d {
            super(null);
            c cVar = new c(new h[0], true);
            this.f10042h = cVar;
            this.f10035a = q.l.D0().c0(bVar.d() + ".placeholder.proto").d0(str).g(bVar.f()).build();
            this.f10040f = new h[0];
            this.f10041g = new h[0];
            this.f10036b = new b[]{bVar};
            this.f10037c = r.f9944e;
            this.f10038d = r.f9945f;
            this.f10039e = r.f9943d;
            cVar.a(str, this);
            cVar.b(bVar);
        }
    }
}
