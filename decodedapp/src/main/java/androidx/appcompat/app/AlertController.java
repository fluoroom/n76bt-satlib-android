package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.WeakReference;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a */
    private final Context f746a;

    /* JADX INFO: renamed from: b */
    final q f747b;

    /* JADX INFO: renamed from: c */
    private final Window f748c;

    /* JADX INFO: renamed from: d */
    private final int f749d;

    /* JADX INFO: renamed from: e */
    private CharSequence f750e;

    /* JADX INFO: renamed from: f */
    private CharSequence f751f;

    /* JADX INFO: renamed from: g */
    ListView f752g;

    /* JADX INFO: renamed from: h */
    private View f753h;

    /* JADX INFO: renamed from: i */
    private int f754i;

    /* JADX INFO: renamed from: j */
    private int f755j;

    /* JADX INFO: renamed from: k */
    private int f756k;

    /* JADX INFO: renamed from: l */
    private int f757l;

    /* JADX INFO: renamed from: m */
    private int f758m;

    /* JADX INFO: renamed from: o */
    Button f760o;

    /* JADX INFO: renamed from: p */
    private CharSequence f761p;

    /* JADX INFO: renamed from: q */
    Message f762q;

    /* JADX INFO: renamed from: r */
    private Drawable f763r;

    /* JADX INFO: renamed from: s */
    Button f764s;

    /* JADX INFO: renamed from: t */
    private CharSequence f765t;

    /* JADX INFO: renamed from: u */
    Message f766u;

    /* JADX INFO: renamed from: v */
    private Drawable f767v;

    /* JADX INFO: renamed from: w */
    Button f768w;

    /* JADX INFO: renamed from: x */
    private CharSequence f769x;

    /* JADX INFO: renamed from: y */
    Message f770y;

    /* JADX INFO: renamed from: z */
    private Drawable f771z;

    /* JADX INFO: renamed from: n */
    private boolean f759n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a */
        private final int f772a;

        /* JADX INFO: renamed from: b */
        private final int f773b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.j.f14984m2);
            this.f773b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.f14989n2, -1);
            this.f772a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(h.j.f14994o2, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f772a, getPaddingRight(), z11 ? getPaddingBottom() : this.f773b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message messageObtain = (view != alertController.f760o || (message3 = alertController.f762q) == null) ? (view != alertController.f764s || (message2 = alertController.f766u) == null) ? (view != alertController.f768w || (message = alertController.f770y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f747b).sendToTarget();
        }
    }

    class b implements NestedScrollView.e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f775a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f776b;

        b(View view, View view2) {
            this.f775a = view;
            this.f776b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.e
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.g(nestedScrollView, this.f775a, this.f776b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f778a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f779b;

        c(View view, View view2) {
            this.f778a = view;
            this.f779b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f778a, this.f779b);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f781a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f782b;

        d(View view, View view2) {
            this.f781a = view;
            this.f782b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.g(absListView, this.f781a, this.f782b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f784a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f785b;

        e(View view, View view2) {
            this.f784a = view;
            this.f785b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f752g, this.f784a, this.f785b);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* JADX INFO: renamed from: a */
        public final Context f787a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f788b;

        /* JADX INFO: renamed from: d */
        public Drawable f790d;

        /* JADX INFO: renamed from: f */
        public CharSequence f792f;

        /* JADX INFO: renamed from: g */
        public View f793g;

        /* JADX INFO: renamed from: h */
        public CharSequence f794h;

        /* JADX INFO: renamed from: i */
        public CharSequence f795i;

        /* JADX INFO: renamed from: j */
        public Drawable f796j;

        /* JADX INFO: renamed from: k */
        public DialogInterface.OnClickListener f797k;

        /* JADX INFO: renamed from: l */
        public CharSequence f798l;

        /* JADX INFO: renamed from: m */
        public Drawable f799m;

        /* JADX INFO: renamed from: n */
        public DialogInterface.OnClickListener f800n;

        /* JADX INFO: renamed from: o */
        public CharSequence f801o;

        /* JADX INFO: renamed from: p */
        public Drawable f802p;

        /* JADX INFO: renamed from: q */
        public DialogInterface.OnClickListener f803q;

        /* JADX INFO: renamed from: s */
        public DialogInterface.OnCancelListener f805s;

        /* JADX INFO: renamed from: t */
        public DialogInterface.OnDismissListener f806t;

        /* JADX INFO: renamed from: u */
        public DialogInterface.OnKeyListener f807u;

        /* JADX INFO: renamed from: v */
        public CharSequence[] f808v;

        /* JADX INFO: renamed from: w */
        public ListAdapter f809w;

        /* JADX INFO: renamed from: x */
        public DialogInterface.OnClickListener f810x;

        /* JADX INFO: renamed from: y */
        public int f811y;

        /* JADX INFO: renamed from: z */
        public View f812z;

        /* JADX INFO: renamed from: c */
        public int f789c = 0;

        /* JADX INFO: renamed from: e */
        public int f791e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* JADX INFO: renamed from: r */
        public boolean f804r = true;

        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ RecycleListView f813a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f813a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f813a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* JADX INFO: renamed from: a */
            private final int f815a;

            /* JADX INFO: renamed from: b */
            private final int f816b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ RecycleListView f817c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ AlertController f818d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f817c = recycleListView;
                this.f818d = alertController;
                Cursor cursor2 = getCursor();
                this.f815a = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f816b = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f815a));
                this.f817c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f816b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f788b.inflate(this.f818d.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AlertController f820a;

            c(AlertController alertController) {
                this.f820a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                f.this.f810x.onClick(this.f820a.f747b, i10);
                if (f.this.H) {
                    return;
                }
                this.f820a.f747b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ RecycleListView f822a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AlertController f823b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f822a = recycleListView;
                this.f823b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f822a.isItemChecked(i10);
                }
                f.this.J.onClick(this.f823b.f747b, i10, this.f822a.isItemChecked(i10));
            }
        }

        public f(Context context) {
            this.f787a = context;
            this.f788b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            f fVar;
            AlertController alertController2;
            ListAdapter hVar;
            RecycleListView recycleListView = (RecycleListView) this.f788b.inflate(alertController.L, (ViewGroup) null);
            if (!this.G) {
                fVar = this;
                alertController2 = alertController;
                int i10 = fVar.H ? alertController2.N : alertController2.O;
                if (fVar.K != null) {
                    hVar = new SimpleCursorAdapter(fVar.f787a, i10, fVar.K, new String[]{fVar.L}, new int[]{R.id.text1});
                } else {
                    hVar = fVar.f809w;
                    if (hVar == null) {
                        hVar = new h(fVar.f787a, i10, R.id.text1, fVar.f808v);
                    }
                }
            } else if (this.K == null) {
                fVar = this;
                hVar = fVar.new a(this.f787a, alertController.M, R.id.text1, this.f808v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                fVar = this;
                alertController2 = alertController;
                hVar = fVar.new b(fVar.f787a, fVar.K, false, recycleListView, alertController2);
            }
            alertController2.H = hVar;
            alertController2.I = fVar.I;
            if (fVar.f810x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (fVar.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = fVar.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (fVar.H) {
                recycleListView.setChoiceMode(1);
            } else if (fVar.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f752g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f793g;
            if (view != null) {
                alertController.m(view);
            } else {
                CharSequence charSequence = this.f792f;
                if (charSequence != null) {
                    alertController.r(charSequence);
                }
                Drawable drawable = this.f790d;
                if (drawable != null) {
                    alertController.o(drawable);
                }
                int i10 = this.f789c;
                if (i10 != 0) {
                    alertController.n(i10);
                }
                int i11 = this.f791e;
                if (i11 != 0) {
                    alertController.n(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f794h;
            if (charSequence2 != null) {
                alertController.p(charSequence2);
            }
            CharSequence charSequence3 = this.f795i;
            if (charSequence3 == null && this.f796j == null) {
                alertController2 = alertController;
            } else {
                alertController.l(-1, charSequence3, this.f797k, null, this.f796j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f798l;
            if (charSequence4 != null || this.f799m != null) {
                alertController2.l(-2, charSequence4, this.f800n, null, this.f799m);
            }
            CharSequence charSequence5 = this.f801o;
            if (charSequence5 != null || this.f802p != null) {
                alertController2.l(-3, charSequence5, this.f803q, null, this.f802p);
            }
            if (this.f808v != null || this.K != null || this.f809w != null) {
                b(alertController2);
            }
            View view2 = this.f812z;
            if (view2 != null) {
                if (this.E) {
                    alertController2.u(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController2.t(view2);
                    return;
                }
            }
            int i12 = this.f811y;
            if (i12 != 0) {
                alertController2.s(i12);
            }
        }
    }

    private static final class g extends Handler {

        /* JADX INFO: renamed from: a */
        private WeakReference f825a;

        public g(DialogInterface dialogInterface) {
            this.f825a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f825a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, q qVar, Window window) {
        this.f746a = context;
        this.f747b = qVar;
        this.f748c = window;
        this.R = new g(qVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, h.j.H, h.a.f14766o, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(h.j.I, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(h.j.K, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(h.j.M, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(h.j.N, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(h.j.P, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(h.j.L, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(h.j.O, true);
        this.f749d = typedArrayObtainStyledAttributes.getDimensionPixelSize(h.j.J, 0);
        typedArrayObtainStyledAttributes.recycle();
        qVar.k(1);
    }

    private static boolean A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.f14764n, typedValue, true);
        return typedValue.data != 0;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    private ViewGroup j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int k() {
        int i10 = this.K;
        return i10 == 0 ? this.J : this.Q == 1 ? i10 : this.J;
    }

    private void q(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f748c.findViewById(h.f.B);
        View viewFindViewById2 = this.f748c.findViewById(h.f.A);
        if (Build.VERSION.SDK_INT >= 23) {
            o0.B0(view, i10, i11);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        if (viewFindViewById != null && (i10 & 1) == 0) {
            viewGroup.removeView(viewFindViewById);
            viewFindViewById = null;
        }
        if (viewFindViewById2 != null && (i10 & 2) == 0) {
            viewGroup.removeView(viewFindViewById2);
            viewFindViewById2 = null;
        }
        if (viewFindViewById == null && viewFindViewById2 == null) {
            return;
        }
        if (this.f751f != null) {
            this.A.setOnScrollChangeListener(new b(viewFindViewById, viewFindViewById2));
            this.A.post(new c(viewFindViewById, viewFindViewById2));
            return;
        }
        ListView listView = this.f752g;
        if (listView != null) {
            listView.setOnScrollListener(new d(viewFindViewById, viewFindViewById2));
            this.f752g.post(new e(viewFindViewById, viewFindViewById2));
            return;
        }
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void v(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f760o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f761p) && this.f763r == null) {
            this.f760o.setVisibility(8);
            i10 = 0;
        } else {
            this.f760o.setText(this.f761p);
            Drawable drawable = this.f763r;
            if (drawable != null) {
                int i11 = this.f749d;
                drawable.setBounds(0, 0, i11, i11);
                this.f760o.setCompoundDrawables(this.f763r, null, null, null);
            }
            this.f760o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f764s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f765t) && this.f767v == null) {
            this.f764s.setVisibility(8);
        } else {
            this.f764s.setText(this.f765t);
            Drawable drawable2 = this.f767v;
            if (drawable2 != null) {
                int i12 = this.f749d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f764s.setCompoundDrawables(this.f767v, null, null, null);
            }
            this.f764s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f768w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f769x) && this.f771z == null) {
            this.f768w.setVisibility(8);
        } else {
            this.f768w.setText(this.f769x);
            Drawable drawable3 = this.f771z;
            if (drawable3 != null) {
                int i13 = this.f749d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f768w.setCompoundDrawables(this.f771z, null, null, null);
            }
            this.f768w.setVisibility(0);
            i10 |= 4;
        }
        if (A(this.f746a)) {
            if (i10 == 1) {
                b(this.f760o);
            } else if (i10 == 2) {
                b(this.f764s);
            } else if (i10 == 4) {
                b(this.f768w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f748c.findViewById(h.f.C);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f751f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f752g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f752g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void x(ViewGroup viewGroup) {
        View viewInflate = this.f753h;
        if (viewInflate == null) {
            viewInflate = this.f754i != 0 ? LayoutInflater.from(this.f746a).inflate(this.f754i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f748c.setFlags(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f748c.findViewById(h.f.f14854o);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f759n) {
            frameLayout.setPadding(this.f755j, this.f756k, this.f757l, this.f758m);
        }
        if (this.f752g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void y(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f748c.findViewById(h.f.U).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f748c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f750e) || !this.P) {
            this.f748c.findViewById(h.f.U).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f748c.findViewById(h.f.f14850k);
        this.E = textView;
        textView.setText(this.f750e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void z() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f748c.findViewById(h.f.f14865z);
        int i10 = h.f.V;
        View viewFindViewById4 = viewFindViewById3.findViewById(i10);
        int i11 = h.f.f14853n;
        View viewFindViewById5 = viewFindViewById3.findViewById(i11);
        int i12 = h.f.f14851l;
        View viewFindViewById6 = viewFindViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(h.f.f14855p);
        x(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i10);
        View viewFindViewById8 = viewGroup.findViewById(i11);
        View viewFindViewById9 = viewGroup.findViewById(i12);
        ViewGroup viewGroupJ = j(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupJ2 = j(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupJ3 = j(viewFindViewById9, viewFindViewById6);
        w(viewGroupJ2);
        v(viewGroupJ3);
        y(viewGroupJ);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupJ == null || viewGroupJ.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupJ3 == null || viewGroupJ3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupJ2 != null && (viewFindViewById2 = viewGroupJ2.findViewById(h.f.Q)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f751f == null && this.f752g == null) ? null : viewGroupJ.findViewById(h.f.T);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupJ2 != null && (viewFindViewById = viewGroupJ2.findViewById(h.f.R)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f752g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f752g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                q(viewGroupJ2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f752g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i13 = this.I;
        if (i13 > -1) {
            listView2.setItemChecked(i13, true);
            listView2.setSelection(i13);
        }
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f768w;
        }
        if (i10 == -2) {
            return this.f764s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f760o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f746a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f752g;
    }

    public void f() {
        this.f747b.setContentView(k());
        z();
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public boolean i(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.n(keyEvent);
    }

    public void l(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f769x = charSequence;
            this.f770y = message;
            this.f771z = drawable;
        } else if (i10 == -2) {
            this.f765t = charSequence;
            this.f766u = message;
            this.f767v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f761p = charSequence;
            this.f762q = message;
            this.f763r = drawable;
        }
    }

    public void m(View view) {
        this.G = view;
    }

    public void n(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void o(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void p(CharSequence charSequence) {
        this.f751f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void r(CharSequence charSequence) {
        this.f750e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(int i10) {
        this.f753h = null;
        this.f754i = i10;
        this.f759n = false;
    }

    public void t(View view) {
        this.f753h = view;
        this.f754i = 0;
        this.f759n = false;
    }

    public void u(View view, int i10, int i11, int i12, int i13) {
        this.f753h = view;
        this.f754i = 0;
        this.f759n = true;
        this.f755j = i10;
        this.f756k = i11;
        this.f757l = i12;
        this.f758m = i13;
    }
}
