package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f3209a;

    interface a {
        void a(a.b bVar);

        a.b b(int i10, int i11, int i12, Object obj);
    }

    h(a aVar) {
        this.f3209a = aVar;
    }

    private int a(List list) {
        boolean z10 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f3093a != 8) {
                z10 = true;
            } else if (z10) {
                return size;
            }
        }
        return -1;
    }

    private void c(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        int i12 = bVar.f3096d;
        int i13 = bVar2.f3094b;
        int i14 = i12 < i13 ? -1 : 0;
        int i15 = bVar.f3094b;
        if (i15 < i13) {
            i14++;
        }
        if (i13 <= i15) {
            bVar.f3094b = i15 + bVar2.f3096d;
        }
        int i16 = bVar2.f3094b;
        if (i16 <= i12) {
            bVar.f3096d = i12 + bVar2.f3096d;
        }
        bVar2.f3094b = i16 + i14;
        list.set(i10, bVar2);
        list.set(i11, bVar);
    }

    private void d(List list, int i10, int i11) {
        a.b bVar = (a.b) list.get(i10);
        a.b bVar2 = (a.b) list.get(i11);
        int i12 = bVar2.f3093a;
        if (i12 == 1) {
            c(list, i10, bVar, i11, bVar2);
        } else if (i12 == 2) {
            e(list, i10, bVar, i11, bVar2);
        } else {
            if (i12 != 4) {
                return;
            }
            f(list, i10, bVar, i11, bVar2);
        }
    }

    void b(List list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    void e(List list, int i10, a.b bVar, int i11, a.b bVar2) {
        boolean z10;
        int i12 = bVar.f3094b;
        int i13 = bVar.f3096d;
        boolean z11 = false;
        if (i12 < i13) {
            if (bVar2.f3094b == i12 && bVar2.f3096d == i13 - i12) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
        } else if (bVar2.f3094b == i13 + 1 && bVar2.f3096d == i12 - i13) {
            z10 = true;
            z11 = true;
        } else {
            z10 = true;
        }
        int i14 = bVar2.f3094b;
        if (i13 < i14) {
            bVar2.f3094b = i14 - 1;
        } else {
            int i15 = bVar2.f3096d;
            if (i13 < i14 + i15) {
                bVar2.f3096d = i15 - 1;
                bVar.f3093a = 2;
                bVar.f3096d = 1;
                if (bVar2.f3096d == 0) {
                    list.remove(i11);
                    this.f3209a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i16 = bVar.f3094b;
        int i17 = bVar2.f3094b;
        a.b bVarB = null;
        if (i16 <= i17) {
            bVar2.f3094b = i17 + 1;
        } else {
            int i18 = bVar2.f3096d;
            if (i16 < i17 + i18) {
                bVarB = this.f3209a.b(2, i16 + 1, (i17 + i18) - i16, null);
                bVar2.f3096d = bVar.f3094b - bVar2.f3094b;
            }
        }
        if (z11) {
            list.set(i10, bVar2);
            list.remove(i11);
            this.f3209a.a(bVar);
            return;
        }
        if (z10) {
            if (bVarB != null) {
                int i19 = bVar.f3094b;
                if (i19 > bVarB.f3094b) {
                    bVar.f3094b = i19 - bVarB.f3096d;
                }
                int i20 = bVar.f3096d;
                if (i20 > bVarB.f3094b) {
                    bVar.f3096d = i20 - bVarB.f3096d;
                }
            }
            int i21 = bVar.f3094b;
            if (i21 > bVar2.f3094b) {
                bVar.f3094b = i21 - bVar2.f3096d;
            }
            int i22 = bVar.f3096d;
            if (i22 > bVar2.f3094b) {
                bVar.f3096d = i22 - bVar2.f3096d;
            }
        } else {
            if (bVarB != null) {
                int i23 = bVar.f3094b;
                if (i23 >= bVarB.f3094b) {
                    bVar.f3094b = i23 - bVarB.f3096d;
                }
                int i24 = bVar.f3096d;
                if (i24 >= bVarB.f3094b) {
                    bVar.f3096d = i24 - bVarB.f3096d;
                }
            }
            int i25 = bVar.f3094b;
            if (i25 >= bVar2.f3094b) {
                bVar.f3094b = i25 - bVar2.f3096d;
            }
            int i26 = bVar.f3096d;
            if (i26 >= bVar2.f3094b) {
                bVar.f3096d = i26 - bVar2.f3096d;
            }
        }
        list.set(i10, bVar2);
        if (bVar.f3094b != bVar.f3096d) {
            list.set(i11, bVar);
        } else {
            list.remove(i11);
        }
        if (bVarB != null) {
            list.add(i10, bVarB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f3096d
            int r1 = r13.f3094b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f3094b = r1
            goto L20
        Ld:
            int r5 = r13.f3096d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f3096d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f3209a
            int r1 = r11.f3094b
            java.lang.Object r5 = r13.f3095c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f3094b
            int r5 = r13.f3094b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f3094b = r5
            goto L41
        L2b:
            int r6 = r13.f3096d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r4 = r8.f3209a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f3095c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f3096d
            int r1 = r1 - r5
            r13.f3096d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f3096d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f3209a
            r11.a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
