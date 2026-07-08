package s4;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import androidx.appcompat.app.c;
import androidx.gridlayout.widget.GridLayout;
import com.benshikj.ht.R;
import d5.a;
import info.hoang8f.android.segmented.SegmentedGroup;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002BCB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J!\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u0019\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001d\u0010\u0010R\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\n\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00102\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010<\u001a\u00020;2\u0006\u0010<\u001a\u00020;8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006D"}, d2 = {"Ls4/l5;", "Landroidx/fragment/app/n;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "<init>", "()V", "Ldd/d0;", "n4", "", "highest", "lowest", "l4", "(II)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "Z3", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "y2", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "", "onLongClick", "(Landroid/view/View;)Z", "outState", "N2", "E0", "Z", "showModulation", "Lm4/v0;", "F0", "Lm4/v0;", "binding", "", "Landroid/widget/Button;", "G0", "[Landroid/widget/Button;", "buttons", "Lv4/d0;", "H0", "Lv4/d0;", "range", "I0", "I", "J0", "K0", "dotPosition", "", "L0", "[I", "digits", "Ld5/a$d;", "M0", "Ld5/a$d;", "modulation", "Ljava/math/BigDecimal;", "value", "i4", "()Ljava/math/BigDecimal;", "m4", "(Ljava/math/BigDecimal;)V", "N0", "a", "b", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l5 extends androidx.fragment.app.n implements View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private m4.v0 binding;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private Button[] buttons;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private v4.d0 range;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private int[] digits;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private a.d modulation;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private boolean showModulation = true;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private int highest = 8;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private int lowest = 1;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private int dotPosition = 3;

    /* JADX INFO: renamed from: s4.l5$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public static /* synthetic */ l5 c(Companion companion, v4.d0 d0Var, Integer num, a.d dVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d0Var = null;
            }
            if ((i10 & 2) != 0) {
                num = null;
            }
            if ((i10 & 4) != 0) {
                dVar = a.d.FM;
            }
            if ((i10 & 8) != 0) {
                z10 = true;
            }
            return companion.b(d0Var, num, dVar, z10);
        }

        public final l5 a(v4.d0 d0Var) {
            return c(this, d0Var, null, null, false, 14, null);
        }

        public final l5 b(v4.d0 d0Var, Integer num, a.d dVar, boolean z10) {
            rd.m.e(dVar, "modulation");
            l5 l5Var = new l5();
            Bundle bundle = new Bundle();
            if (num != null) {
                bundle.putInt("current", num.intValue());
            }
            bundle.putParcelable("range", d0Var);
            bundle.putSerializable("modulation", dVar);
            bundle.putBoolean("show_modulation", z10);
            l5Var.E3(bundle);
            return l5Var;
        }

        private Companion() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BigDecimal f26563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f26564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a.d f26565c;

        public b(BigDecimal bigDecimal, String str, a.d dVar) {
            rd.m.e(bigDecimal, "value");
            rd.m.e(dVar, "modulation");
            this.f26563a = bigDecimal;
            this.f26564b = str;
            this.f26565c = dVar;
        }

        public final a.d a() {
            return this.f26565c;
        }

        public final String b() {
            return this.f26564b;
        }

        public final BigDecimal c() {
            return this.f26563a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return rd.m.a(this.f26563a, bVar.f26563a) && rd.m.a(this.f26564b, bVar.f26564b) && this.f26565c == bVar.f26565c;
        }

        public int hashCode() {
            int iHashCode = this.f26563a.hashCode() * 31;
            String str = this.f26564b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f26565c.hashCode();
        }

        public String toString() {
            return "Event(value=" + this.f26563a + ", tag=" + this.f26564b + ", modulation=" + this.f26565c + ')';
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26566a;

        static {
            int[] iArr = new int[a.d.values().length];
            try {
                iArr[a.d.FM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.d.AM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.d.DMR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26566a = iArr;
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return gd.a.d(((Button) obj).getText().toString(), ((Button) obj2).getText().toString());
        }
    }

    public l5() {
        int i10 = 8 + 1;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = -1;
        }
        this.digits = iArr;
        this.modulation = a.d.FM;
    }

    private final BigDecimal i4() {
        BigDecimal bigDecimal = new BigDecimal(10);
        BigDecimal bigDecimal2 = new BigDecimal(0);
        int length = this.digits.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = this.digits[i10];
            bigDecimal2 = bigDecimal2.multiply(bigDecimal);
            rd.m.d(bigDecimal2, "multiply(...)");
            if (i11 < 0 || z10) {
                z10 = true;
            } else {
                bigDecimal2 = bigDecimal2.add(new BigDecimal(i11));
                rd.m.d(bigDecimal2, "add(...)");
            }
        }
        return bigDecimal2;
    }

    public static final l5 j4(v4.d0 d0Var) {
        return INSTANCE.a(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k4(l5 l5Var, RadioGroup radioGroup, int i10) {
        rd.m.e(radioGroup, "group");
        l5Var.modulation = i10 != R.id.am ? i10 != R.id.dmr ? a.d.FM : a.d.DMR : a.d.AM;
        l5Var.n4();
    }

    private final void m4(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(new BigDecimal(0)) > 0) {
            BigDecimal bigDecimal2 = new BigDecimal(10);
            for (int i10 = this.highest; -1 < i10; i10--) {
                if (i10 > this.highest - this.lowest) {
                    this.digits[i10] = -1;
                } else {
                    int[] iArr = this.digits;
                    BigDecimal bigDecimalRemainder = bigDecimal.remainder(bigDecimal2);
                    rd.m.d(bigDecimalRemainder, "remainder(...)");
                    iArr[i10] = bigDecimalRemainder.intValue();
                }
                bigDecimal = bigDecimal.divide(bigDecimal2, RoundingMode.DOWN);
                rd.m.d(bigDecimal, "divide(...)");
            }
            for (int i11 = this.highest; -1 < i11; i11--) {
                int[] iArr2 = this.digits;
                if (iArr2[i11] > 0) {
                    break;
                }
                iArr2[i11] = -1;
            }
        } else {
            int length = this.digits.length;
            for (int i12 = 0; i12 < length; i12++) {
                this.digits[i12] = -1;
            }
        }
        n4();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n4() {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.l5.n4():void");
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void N2(Bundle outState) {
        rd.m.e(outState, "outState");
        super.N2(outState);
        outState.putInt("highest", this.highest);
        outState.putInt("lowest", this.lowest);
        outState.putIntArray("digits", this.digits);
    }

    @Override // androidx.fragment.app.n
    public Dialog Z3(Bundle savedInstanceState) {
        c.a aVar = new c.a(x3(), Y3());
        m4.v0 v0VarC = m4.v0.c(LayoutInflater.from(aVar.b()));
        rd.m.d(v0VarC, "inflate(...)");
        this.binding = v0VarC;
        aVar.B(v0VarC.b());
        GridLayout gridLayout = v0VarC.f21631f;
        rd.m.d(gridLayout, "keyboard");
        ArrayList arrayList = new ArrayList();
        int childCount = gridLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = gridLayout.getChildAt(i10);
            childAt.setOnClickListener(this);
            childAt.setOnLongClickListener(this);
            if (childAt instanceof Button) {
                CharSequence text = ((Button) childAt).getText();
                if (text.length() == 1 && Character.isDigit(text.charAt(0))) {
                    arrayList.add(childAt);
                }
            }
        }
        if (arrayList.size() > 1) {
            ed.q.z(arrayList, new d());
        }
        this.buttons = (Button[]) arrayList.toArray(new Button[0]);
        if (this.showModulation) {
            v0VarC.f21633h.removeAllViews();
            v4.d0 d0Var = this.range;
            if (d0Var != null) {
                a.d[] dVarArrJ = d0Var.j();
                rd.m.b(dVarArrJ);
                if (ed.j.z(dVarArrJ, a.d.FM)) {
                    v0VarC.f21633h.addView(v0VarC.f21630e);
                }
                if (ed.j.z(dVarArrJ, a.d.AM)) {
                    v0VarC.f21633h.addView(v0VarC.f21627b);
                }
                if (ed.j.z(dVarArrJ, a.d.DMR)) {
                    v0VarC.f21633h.addView(v0VarC.f21629d);
                }
            } else {
                v0VarC.f21633h.addView(v0VarC.f21630e);
                v0VarC.f21633h.addView(v0VarC.f21627b);
            }
            v0VarC.f21633h.b();
            if (v0VarC.f21633h.getChildCount() > 0) {
                SegmentedGroup segmentedGroup = v0VarC.f21633h;
                View childAt2 = segmentedGroup.getChildAt(segmentedGroup.getChildCount() - 1);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                rd.m.c(layoutParams, "null cannot be cast to non-null type android.widget.RadioGroup.LayoutParams");
                RadioGroup.LayoutParams layoutParams2 = (RadioGroup.LayoutParams) layoutParams;
                layoutParams2.setMargins(0, 0, 0, 0);
                childAt2.setLayoutParams(layoutParams2);
            }
        } else {
            v0VarC.f21633h.setVisibility(8);
        }
        n4();
        v0VarC.f21633h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: s4.k5
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                l5.k4(this.f26553a, radioGroup, i11);
            }
        });
        androidx.appcompat.app.c cVarA = aVar.a();
        rd.m.d(cVarA, "create(...)");
        return cVarA;
    }

    public final void l4(int highest, int lowest) {
        if (highest != this.highest) {
            this.highest = highest;
            int i10 = highest + 1;
            int[] iArr = new int[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                iArr[i11] = -1;
            }
            this.digits = iArr;
        }
        this.lowest = lowest;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        if (v10 instanceof Button) {
            CharSequence text = ((Button) v10).getText();
            if (text.length() == 1) {
                char cCharAt = text.charAt(0);
                if (Character.isDigit(cCharAt)) {
                    int length = this.digits.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        int[] iArr = this.digits;
                        if (iArr[i10] < 0) {
                            iArr[i10] = rg.a.d(cCharAt);
                            n4();
                            return;
                        }
                    }
                }
            }
        }
        Integer numValueOf = v10 != null ? Integer.valueOf(v10.getId()) : null;
        if (numValueOf == null || numValueOf.intValue() != R.id.backspace) {
            if (numValueOf != null && numValueOf.intValue() == R.id.f4945ok) {
                mi.c.e().m(new b(i4(), P1(), this.modulation));
                V3();
                return;
            }
            return;
        }
        for (int i11 = this.highest - this.lowest; -1 < i11; i11--) {
            int[] iArr2 = this.digits;
            if (iArr2[i11] >= 0) {
                iArr2[i11] = -1;
                n4();
                return;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v10) {
        Integer numValueOf = v10 != null ? Integer.valueOf(v10.getId()) : null;
        if (numValueOf == null || numValueOf.intValue() != R.id.backspace) {
            return true;
        }
        int length = this.digits.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.digits[i10] = -1;
            n4();
        }
        return true;
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        Bundle bundleI1 = i1();
        if (bundleI1 != null) {
            this.range = (v4.d0) bundleI1.getParcelable("range");
            Serializable serializable = bundleI1.getSerializable("modulation");
            rd.m.c(serializable, "null cannot be cast to non-null type com.dw.ht.model.Channel.Modulation");
            this.modulation = (a.d) serializable;
            this.showModulation = bundleI1.getBoolean("modulation", this.showModulation);
            if (bundleI1.containsKey("current")) {
                int i10 = bundleI1.getInt("current");
                v4.d0 d0Var = this.range;
                if (d0Var == null || (d0Var != null && d0Var.m(i10, this.modulation))) {
                    m4(new BigDecimal(i10));
                }
            }
        }
        if (savedInstanceState != null) {
            int[] intArray = savedInstanceState.getIntArray("digits");
            if (intArray != null) {
                this.digits = intArray;
            }
            l4(savedInstanceState.getInt("highest", this.highest), savedInstanceState.getInt("lowest", this.lowest));
        }
        v4.d0 d0Var2 = this.range;
        a.d[] dVarArrJ = d0Var2 != null ? d0Var2.j() : null;
        if (dVarArrJ != null) {
            if (dVarArrJ.length != 1) {
                if (dVarArrJ.length > 1) {
                    this.showModulation = true;
                }
            } else {
                this.showModulation = false;
                a.d dVar = dVarArrJ[0];
                rd.m.d(dVar, "get(...)");
                this.modulation = dVar;
            }
        }
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
