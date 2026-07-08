package l2;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class o implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f20358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f20359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f20360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f20361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f20362h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f20363a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f20364b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f20365c = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20366a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f20366a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20366a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20366a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20366a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f20367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f20369c;

        public b(c cVar) {
            this.f20367a = cVar;
        }

        @Override // l2.m
        public void a() {
            this.f20367a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f20368b = i10;
            this.f20369c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f20368b == bVar.f20368b && e3.l.d(this.f20369c, bVar.f20369c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f20368b * 31;
            Bitmap.Config config = this.f20369c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f20368b, this.f20369c);
        }
    }

    static class c extends l2.c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l2.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f20358d = configArr;
        f20359e = configArr;
        f20360f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f20361g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f20362h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private l2.o.b g(int r9, android.graphics.Bitmap.Config r10) {
        /*
            r8 = this;
            l2.o$c r0 = r8.f20363a
            l2.o$b r0 = r0.e(r9, r10)
            android.graphics.Bitmap$Config[] r1 = i(r10)
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L4c
            r4 = r1[r3]
            java.util.NavigableMap r5 = r8.j(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            java.lang.Object r5 = r5.ceilingKey(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L49
            int r6 = r5.intValue()
            int r7 = r9 * 8
            if (r6 > r7) goto L49
            int r1 = r5.intValue()
            if (r1 != r9) goto L39
            if (r4 != 0) goto L33
            if (r10 == 0) goto L4c
            goto L39
        L33:
            boolean r9 = r4.equals(r10)
            if (r9 != 0) goto L4c
        L39:
            l2.o$c r9 = r8.f20363a
            r9.c(r0)
            l2.o$c r9 = r8.f20363a
            int r10 = r5.intValue()
            l2.o$b r9 = r9.e(r10, r4)
            return r9
        L49:
            int r3 = r3 + 1
            goto Lc
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.o.g(int, android.graphics.Bitmap$Config):l2.o$b");
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f20359e;
        }
        int i10 = a.f20366a[config.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? new Bitmap.Config[]{config} : f20362h : f20361g : f20360f : f20358d;
    }

    private NavigableMap j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f20365c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f20365c.put(config, treeMap);
        return treeMap;
    }

    @Override // l2.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return h(e3.l.g(i10, i11, config), config);
    }

    @Override // l2.l
    public int b(Bitmap bitmap) {
        return e3.l.h(bitmap);
    }

    @Override // l2.l
    public void c(Bitmap bitmap) {
        b bVarE = this.f20363a.e(e3.l.h(bitmap), bitmap.getConfig());
        this.f20364b.d(bVarE, bitmap);
        NavigableMap navigableMapJ = j(bitmap.getConfig());
        Integer num = (Integer) navigableMapJ.get(Integer.valueOf(bVarE.f20368b));
        navigableMapJ.put(Integer.valueOf(bVarE.f20368b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // l2.l
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(e3.l.g(i10, i11, config), config);
        Bitmap bitmap = (Bitmap) this.f20364b.a(bVarG);
        if (bitmap != null) {
            f(Integer.valueOf(bVarG.f20368b), bitmap);
            bitmap.reconfigure(i10, i11, config);
        }
        return bitmap;
    }

    @Override // l2.l
    public String e(Bitmap bitmap) {
        return h(e3.l.h(bitmap), bitmap.getConfig());
    }

    @Override // l2.l
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f20364b.f();
        if (bitmap != null) {
            f(Integer.valueOf(e3.l.h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f20364b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry entry : this.f20365c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f20365c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
