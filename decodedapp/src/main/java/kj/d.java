package kj;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kj.x0;
import zj.s;

/* JADX INFO: loaded from: classes3.dex */
class d extends kj.a implements d0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f20026a;

        static {
            int[] iArr = new int[c.values().length];
            f20026a = iArr;
            try {
                iArr[c.EOP_FINAL_VALUES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20026a[c.POLE_OFFSETS_IAU_1980_FINAL_VALUES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20026a[c.POLE_OFFSETS_IAU_2000_FINAL_VALUES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20026a[c.EOP_RAPID_SERVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20026a[c.POLE_OFFSETS_IAU_1980_RAPID_SERVICE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20026a[c.POLE_OFFSETS_IAU_2000_RAPID_SERVICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20026a[c.EOP_PREDICTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private class b implements gj.e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final z0 f20030d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private x0.b f20031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f20032f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f20034h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f20027a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f20028b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f20029c = new HashMap();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f20033g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f20035i = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f20036j = RtlSpacingHelper.UNDEFINED;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f20037k = -1;

        b() {
            this.f20030d = new x0("itrf-versions.conf", d.this.e());
        }

        private void d(c cVar, boolean z10, BufferedReader bufferedReader, String str, c0 c0Var) {
            double[] dArr;
            this.f20034h = bufferedReader.readLine();
            boolean z11 = false;
            while (true) {
                String str2 = this.f20034h;
                if (str2 == null) {
                    throw new hj.a(hj.f.UNEXPECTED_END_OF_FILE_AFTER_LINE, str, Integer.valueOf(this.f20033g));
                }
                this.f20033g++;
                String[] strArrA = cVar.a(str2);
                if (strArrA != null) {
                    int i10 = Integer.parseInt(strArrA[0]);
                    this.f20035i = aj.d.E(this.f20035i, i10);
                    this.f20036j = aj.d.C(this.f20036j, i10);
                    if (this.f20028b.containsKey(Integer.valueOf(i10))) {
                        dArr = (double[]) this.f20028b.get(Integer.valueOf(i10));
                    } else {
                        dArr = new double[5];
                        this.f20028b.put(Integer.valueOf(i10), dArr);
                    }
                    double d10 = dArr[0];
                    int i11 = this.f20037k;
                    if (d10 <= i11) {
                        dArr[0] = i11;
                        if (z10) {
                            dArr[1] = Double.parseDouble(strArrA[1]);
                            dArr[2] = Double.parseDouble(strArrA[2]);
                        } else {
                            dArr[3] = Double.parseDouble(strArrA[1]);
                            dArr[4] = Double.parseDouble(strArrA[2]);
                        }
                        this.f20029c.put(Integer.valueOf(i10), c0Var);
                    }
                    z11 = true;
                } else if (z11) {
                    return;
                }
                this.f20034h = bufferedReader.readLine();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00e7, code lost:
        
            throw new hj.a(hj.f.INCONSISTENT_DATES_IN_IERS_FILE, r20, java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r8), java.lang.Integer.valueOf(r10));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void e(kj.d.c r18, java.io.BufferedReader r19, java.lang.String r20, kj.c0 r21) {
            /*
                Method dump skipped, instruction units count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kj.d.b.e(kj.d$c, java.io.BufferedReader, java.lang.String, kj.c0):void");
        }

        private c f(List list, BufferedReader bufferedReader) {
            while (true) {
                this.f20034h = bufferedReader.readLine();
                if (this.f20034h == null) {
                    return null;
                }
                this.f20033g++;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.d(this.f20034h)) {
                        return cVar;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0036, B:17:0x0051, B:18:0x0056, B:19:0x0057, B:11:0x003f, B:12:0x0042), top: B:51:0x0036 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0069 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:26:0x006e, B:22:0x0062, B:25:0x0069, B:29:0x007a, B:31:0x0084, B:33:0x008c, B:35:0x009b, B:40:0x00ae, B:41:0x00ba), top: B:47:0x0062 }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0051 A[SYNTHETIC] */
        /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
            java.lang.UnsupportedOperationException
            	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1060)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
            */
        @Override // gj.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(java.io.InputStream r9, java.lang.String r10) {
            /*
                Method dump skipped, instruction units count: 234
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kj.d.b.a(java.io.InputStream, java.lang.String):void");
        }

        public void b(SortedSet sortedSet) {
            double[] dArr = (double[]) this.f20027a.get(Integer.valueOf(this.f20035i));
            int i10 = this.f20035i;
            while (i10 <= this.f20036j) {
                yj.b bVarT = yj.b.T(i10, 0.0d, d.this.g());
                double[] dArr2 = (double[]) this.f20028b.get(Integer.valueOf(i10));
                c0 c0Var = (c0) this.f20029c.get(Integer.valueOf(i10));
                int i11 = i10 + 1;
                double[] dArr3 = (double[]) this.f20027a.get(Integer.valueOf(i11));
                if (dArr != null) {
                    x0.b bVar = this.f20031e;
                    if (bVar == null || !bVar.c(i10)) {
                        this.f20031e = this.f20030d.a(this.f20032f, i10);
                    }
                    if (dArr2 == null) {
                        double d10 = dArr[3];
                        bk.k kVar = bk.k.f4180f;
                        sortedSet.add(new i(i10, d10, Double.NaN, kVar.a(dArr[1]), kVar.a(dArr[2]), Double.NaN, Double.NaN, 0.0d, 0.0d, 0.0d, 0.0d, this.f20031e.b(), bVarT, c0Var));
                    } else {
                        double d11 = dArr[3];
                        bk.k kVar2 = bk.k.f4180f;
                        double dA = kVar2.a(dArr[1]);
                        double dA2 = kVar2.a(dArr[2]);
                        bk.k kVar3 = bk.k.f4181g;
                        sortedSet.add(new i(i10, d11, Double.NaN, dA, dA2, Double.NaN, Double.NaN, kVar3.a(dArr2[1]), kVar3.a(dArr2[2]), kVar3.a(dArr2[3]), kVar3.a(dArr2[4]), this.f20031e.b(), bVarT, c0Var));
                    }
                } else if (dArr2 != null) {
                    x0.b bVar2 = this.f20031e;
                    if (bVar2 == null || !bVar2.c(i10)) {
                        this.f20031e = this.f20030d.a(this.f20032f, i10);
                    }
                    bk.k kVar4 = bk.k.f4181g;
                    sortedSet.add(new i(i10, 0.0d, Double.NaN, 0.0d, 0.0d, Double.NaN, Double.NaN, kVar4.a(dArr2[1]), kVar4.a(dArr2[2]), kVar4.a(dArr2[3]), kVar4.a(dArr2[4]), this.f20031e.b(), bVarT, c0Var));
                }
                i10 = i11;
                dArr = dArr3;
            }
        }

        @Override // gj.e
        public boolean c() {
            return true;
        }
    }

    private enum c {
        EOP_RAPID_SERVICE("^ *COMBINED EARTH ORIENTATION PARAMETERS: *$", "^\\p{Blank}+\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}*$"),
        EOP_FINAL_VALUES("^ *IERS Final Values *$", "^\\p{Blank}+\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}*$"),
        EOP_PREDICTION("^ *PREDICTIONS: *$", "^\\p{Blank}+\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}*([-+]?\\p{Digit}+)\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}*$"),
        POLE_OFFSETS_IAU_1980_RAPID_SERVICE("^ *NEOS Celestial Pole Offset Series *$", "^\\p{Blank}+\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}*$"),
        POLE_OFFSETS_IAU_1980_FINAL_VALUES("^ *IERS Celestial Pole Offset Final Series *$", "^\\p{Blank}+\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}*$"),
        POLE_OFFSETS_IAU_2000_RAPID_SERVICE("^ *IAU2000A Celestial Pole Offset Series *$", "^\\p{Blank}+\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+[-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?\\p{Blank}*$"),
        POLE_OFFSETS_IAU_2000_FINAL_VALUES("^ *IAU2000A Celestial Pole Offset Final Series *$", "^\\p{Blank}+\\p{Blank}+(\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit}\\p{Digit})\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}+([-+]?(?:(?:\\p{Digit}+(?:\\.\\p{Digit}*)?)|(?:\\.\\p{Digit}+))(?:[eE][-+]?\\p{Digit}+)?)\\p{Blank}*$");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Pattern f20047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Pattern f20048b;

        c(String str, String str2) {
            this.f20047a = Pattern.compile(str);
            this.f20048b = Pattern.compile(str2);
        }

        public String[] a(String str) {
            Matcher matcher = this.f20048b.matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            int iGroupCount = matcher.groupCount();
            String[] strArr = new String[iGroupCount];
            int i10 = 0;
            while (i10 < iGroupCount) {
                int i11 = i10 + 1;
                strArr[i10] = matcher.group(i11);
                i10 = i11;
            }
            return strArr;
        }

        public boolean d(String str) {
            return this.f20047a.matcher(str).matches();
        }
    }

    d(String str, gj.g gVar, Supplier supplier) {
        super(str, gVar, supplier);
    }

    @Override // kj.d0
    public void a(s.g gVar, SortedSet sortedSet) {
        b bVar = new b();
        d(bVar);
        bVar.b(sortedSet);
    }
}
