package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.e;
import androidx.emoji2.text.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a */
    private final e.j f2081a;

    /* JADX INFO: renamed from: b */
    private final m f2082b;

    /* JADX INFO: renamed from: c */
    private e.InterfaceC0030e f2083c;

    /* JADX INFO: renamed from: d */
    private final boolean f2084d;

    /* JADX INFO: renamed from: e */
    private final int[] f2085e;

    private static final class a {
        static int a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(cCharAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        static int b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char cCharAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(cCharAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(cCharAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a */
        public s f2086a;

        /* JADX INFO: renamed from: b */
        private final e.j f2087b;

        b(s sVar, e.j jVar) {
            this.f2086a = sVar;
            this.f2087b = jVar;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean a(CharSequence charSequence, int i10, int i11, o oVar) {
            if (oVar.k()) {
                return true;
            }
            if (this.f2086a == null) {
                this.f2086a = new s(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f2086a.setSpan(this.f2087b.a(oVar), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: b */
        public s getResult() {
            return this.f2086a;
        }
    }

    private interface c {
        boolean a(CharSequence charSequence, int i10, int i11, o oVar);

        Object getResult();
    }

    private static class d implements c {

        /* JADX INFO: renamed from: a */
        private final String f2088a;

        d(String str) {
            this.f2088a = str;
        }

        @Override // androidx.emoji2.text.h.c
        public boolean a(CharSequence charSequence, int i10, int i11, o oVar) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f2088a)) {
                return true;
            }
            oVar.l(true);
            return false;
        }

        @Override // androidx.emoji2.text.h.c
        /* JADX INFO: renamed from: b */
        public d getResult() {
            return this;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a */
        private int f2089a = 1;

        /* JADX INFO: renamed from: b */
        private final m.a f2090b;

        /* JADX INFO: renamed from: c */
        private m.a f2091c;

        /* JADX INFO: renamed from: d */
        private m.a f2092d;

        /* JADX INFO: renamed from: e */
        private int f2093e;

        /* JADX INFO: renamed from: f */
        private int f2094f;

        /* JADX INFO: renamed from: g */
        private final boolean f2095g;

        /* JADX INFO: renamed from: h */
        private final int[] f2096h;

        e(m.a aVar, boolean z10, int[] iArr) {
            this.f2090b = aVar;
            this.f2091c = aVar;
            this.f2095g = z10;
            this.f2096h = iArr;
        }

        private static boolean d(int i10) {
            return i10 == 65039;
        }

        private static boolean f(int i10) {
            return i10 == 65038;
        }

        private int g() {
            this.f2089a = 1;
            this.f2091c = this.f2090b;
            this.f2094f = 0;
            return 1;
        }

        private boolean h() {
            if (this.f2091c.b().j() || d(this.f2093e)) {
                return true;
            }
            if (this.f2095g) {
                if (this.f2096h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f2096h, this.f2091c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        int a(int i10) {
            m.a aVarA = this.f2091c.a(i10);
            int iG = 2;
            if (this.f2089a != 2) {
                if (aVarA == null) {
                    iG = g();
                } else {
                    this.f2089a = 2;
                    this.f2091c = aVarA;
                    this.f2094f = 1;
                }
            } else if (aVarA != null) {
                this.f2091c = aVarA;
                this.f2094f++;
            } else if (f(i10)) {
                iG = g();
            } else if (!d(i10)) {
                if (this.f2091c.b() != null) {
                    iG = 3;
                    if (this.f2094f != 1 || h()) {
                        this.f2092d = this.f2091c;
                        g();
                    } else {
                        iG = g();
                    }
                } else {
                    iG = g();
                }
            }
            this.f2093e = i10;
            return iG;
        }

        o b() {
            return this.f2091c.b();
        }

        o c() {
            return this.f2092d.b();
        }

        boolean e() {
            if (this.f2089a != 2 || this.f2091c.b() == null) {
                return false;
            }
            return this.f2094f > 1 || h();
        }
    }

    h(m mVar, e.j jVar, e.InterfaceC0030e interfaceC0030e, boolean z10, int[] iArr, Set set) {
        this.f2081a = jVar;
        this.f2082b = mVar;
        this.f2083c = interfaceC0030e;
        this.f2084d = z10;
        this.f2085e = iArr;
        g(set);
    }

    private static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        i[] iVarArr;
        if (f(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!e(selectionStart, selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            for (i iVar : iVarArr) {
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean b(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int iMax;
        int iMin;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (e(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                iMax = a.a(editable, selectionStart, Math.max(i10, 0));
                iMin = a.b(editable, selectionEnd, Math.max(i11, 0));
                if (iMax == -1 || iMin == -1) {
                    return false;
                }
            } else {
                iMax = Math.max(selectionStart - i10, 0);
                iMin = Math.min(selectionEnd + i11, editable.length());
            }
            i[] iVarArr = (i[]) editable.getSpans(iMax, iMin, i.class);
            if (iVarArr != null && iVarArr.length > 0) {
                for (i iVar : iVarArr) {
                    int spanStart = editable.getSpanStart(iVar);
                    int spanEnd = editable.getSpanEnd(iVar);
                    iMax = Math.min(spanStart, iMax);
                    iMin = Math.max(spanEnd, iMin);
                }
                int iMax2 = Math.max(iMax, 0);
                int iMin2 = Math.min(iMin, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(iMax2, iMin2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    static boolean c(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : a(editable, keyEvent, true) : a(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    private boolean d(CharSequence charSequence, int i10, int i11, o oVar) {
        if (oVar.d() == 0) {
            oVar.m(this.f2083c.a(charSequence, i10, i11, oVar.h()));
        }
        return oVar.d() == 2;
    }

    private static boolean e(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    private static boolean f(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    private void g(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            i(str, 0, str.length(), 1, true, new d(str));
        }
    }

    private Object i(CharSequence charSequence, int i10, int i11, int i12, boolean z10, c cVar) {
        int iCharCount;
        e eVar = new e(this.f2082b.f(), this.f2084d, this.f2085e);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i13 = 0;
        boolean zA = true;
        loop0: while (true) {
            iCharCount = i10;
            while (i10 < i11 && i13 < i12 && zA) {
                int iA = eVar.a(iCodePointAt);
                if (iA == 1) {
                    iCharCount += Character.charCount(Character.codePointAt(charSequence, iCharCount));
                    if (iCharCount < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                    i10 = iCharCount;
                } else if (iA == 2) {
                    i10 += Character.charCount(iCodePointAt);
                    if (i10 < i11) {
                        iCodePointAt = Character.codePointAt(charSequence, i10);
                    }
                } else if (iA == 3) {
                    if (z10 || !d(charSequence, iCharCount, i10, eVar.c())) {
                        zA = cVar.a(charSequence, iCharCount, i10, eVar.c());
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (eVar.e() && i13 < i12 && zA && (z10 || !d(charSequence, iCharCount, i10, eVar.b()))) {
            cVar.a(charSequence, iCharCount, i10, eVar.b());
        }
        return cVar.getResult();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004b A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:81:0x000e, B:84:0x0013, B:86:0x0017, B:88:0x0024, B:96:0x003c, B:98:0x0044, B:100:0x0047, B:102:0x004b, B:104:0x0057, B:105:0x005a, B:115:0x0078), top: B:144:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0069 A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:109:0x0069, B:118:0x0085, B:93:0x0031), top: B:140:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x003c A[Catch: all -> 0x002a, TRY_ENTER, TryCatch #2 {all -> 0x002a, blocks: (B:81:0x000e, B:84:0x0013, B:86:0x0017, B:88:0x0024, B:96:0x003c, B:98:0x0044, B:100:0x0047, B:102:0x004b, B:104:0x0057, B:105:0x005a, B:115:0x0078), top: B:144:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.CharSequence h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r1 = r11 instanceof androidx.emoji2.text.n
            if (r1 == 0) goto La
            r0 = r11
            androidx.emoji2.text.n r0 = (androidx.emoji2.text.n) r0
            r0.a()
        La:
            java.lang.Class<androidx.emoji2.text.i> r0 = androidx.emoji2.text.i.class
            if (r1 != 0) goto L31
            boolean r2 = r11 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L13
            goto L31
        L13:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2f
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L2a
            int r3 = r12 + (-1)
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r0)     // Catch: java.lang.Throwable -> L2a
            if (r2 > r13) goto L2f
            androidx.emoji2.text.s r2 = new androidx.emoji2.text.s     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r11)     // Catch: java.lang.Throwable -> L2a
            goto L39
        L2a:
            r0 = move-exception
            r12 = r0
            r3 = r11
            goto Lba
        L2f:
            r2 = 0
            goto L39
        L31:
            androidx.emoji2.text.s r2 = new androidx.emoji2.text.s     // Catch: java.lang.Throwable -> Lb0
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch: java.lang.Throwable -> Lb0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb0
        L39:
            r3 = 0
            if (r2 == 0) goto L65
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r0)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.i[] r4 = (androidx.emoji2.text.i[]) r4     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            if (r5 <= 0) goto L65
            int r5 = r4.length     // Catch: java.lang.Throwable -> L2a
            r6 = 0
        L49:
            if (r6 >= r5) goto L65
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L2a
            int r8 = r2.getSpanStart(r7)     // Catch: java.lang.Throwable -> L2a
            int r9 = r2.getSpanEnd(r7)     // Catch: java.lang.Throwable -> L2a
            if (r8 == r13) goto L5a
            r2.removeSpan(r7)     // Catch: java.lang.Throwable -> L2a
        L5a:
            int r12 = java.lang.Math.min(r8, r12)     // Catch: java.lang.Throwable -> L2a
            int r13 = java.lang.Math.max(r9, r13)     // Catch: java.lang.Throwable -> L2a
            int r6 = r6 + 1
            goto L49
        L65:
            r4 = r12
            r5 = r13
            if (r4 == r5) goto L6f
            int r12 = r11.length()     // Catch: java.lang.Throwable -> Lb0
            if (r4 < r12) goto L71
        L6f:
            r3 = r11
            goto Lb3
        L71:
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r12) goto L84
            if (r2 == 0) goto L84
            int r12 = r2.length()     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r12 = r2.getSpans(r3, r12, r0)     // Catch: java.lang.Throwable -> L2a
            androidx.emoji2.text.i[] r12 = (androidx.emoji2.text.i[]) r12     // Catch: java.lang.Throwable -> L2a
            int r12 = r12.length     // Catch: java.lang.Throwable -> L2a
            int r14 = r14 - r12
        L84:
            r6 = r14
            androidx.emoji2.text.h$b r8 = new androidx.emoji2.text.h$b     // Catch: java.lang.Throwable -> Lb0
            androidx.emoji2.text.e$j r12 = r10.f2081a     // Catch: java.lang.Throwable -> Lb0
            r8.<init>(r2, r12)     // Catch: java.lang.Throwable -> Lb0
            r2 = r10
            r3 = r11
            r7 = r15
            java.lang.Object r11 = r2.i(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> La4
            androidx.emoji2.text.s r11 = (androidx.emoji2.text.s) r11     // Catch: java.lang.Throwable -> La4
            if (r11 == 0) goto La7
            android.text.Spannable r11 = r11.b()     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto La3
            r12 = r3
            androidx.emoji2.text.n r12 = (androidx.emoji2.text.n) r12
            r12.d()
        La3:
            return r11
        La4:
            r0 = move-exception
        La5:
            r12 = r0
            goto Lba
        La7:
            if (r1 == 0) goto Laf
            r11 = r3
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.n) r11
        Lac:
            r11.d()
        Laf:
            return r3
        Lb0:
            r0 = move-exception
            r3 = r11
            goto La5
        Lb3:
            if (r1 == 0) goto Lb9
            r11 = r3
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.n) r11
            goto Lac
        Lb9:
            return r3
        Lba:
            if (r1 == 0) goto Lc2
            r11 = r3
            androidx.emoji2.text.n r11 = (androidx.emoji2.text.n) r11
            r11.d()
        Lc2:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
