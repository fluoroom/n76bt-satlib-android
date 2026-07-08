package com.dw.ht.fragments;

import android.content.Context;
import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.FrameLayout;
import androidx.loader.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.benshikj.ht.R;
import com.dw.ht.fragments.ContactsListFragment;
import com.dw.ht.fragments.g;
import com.dw.ht.ii.a;
import com.dw.ht.provider.a;
import d5.g;
import kotlin.Metadata;
import m4.z;
import org.greenrobot.eventbus.ThreadMode;
import org.simpleframework.xml.strategy.Name;
import rd.m;
import v3.e0;
import v4.l1;
import v4.n0;
import v4.n1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0012\b\u0012\u00060\u0005R\u00020\u00060\u00042\u00020\u0007:\u0004\u0091\u0001\u0092\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020 2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b$\u0010%J'\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030)2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b*\u0010+J#\u0010/\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010.\u001a\u0004\u0018\u00010,H\u0014¢\u0006\u0004\b/\u00100J%\u00103\u001a\u00020\n2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030)2\u0006\u00102\u001a\u00020\u0003H\u0016¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\n2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030)H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\nH\u0016¢\u0006\u0004\b7\u0010\tJ#\u00109\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0005R\u00020\u00062\u0006\u00108\u001a\u00020&H\u0016¢\u0006\u0004\b9\u0010:J\u001d\u0010=\u001a\u00020\n2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u0004¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\n2\u0006\u0010@\u001a\u00020?H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\nH\u0016¢\u0006\u0004\bC\u0010\tJ\u000f\u0010D\u001a\u00020\nH\u0016¢\u0006\u0004\bD\u0010\tJ!\u0010H\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010G\u001a\u00020&H\u0016¢\u0006\u0004\bH\u0010IJ\u0019\u0010K\u001a\u00020\n2\b\u0010@\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bK\u0010LJ\u0015\u0010O\u001a\u00020\n2\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0017\u0010Z\u001a\u00020U8\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0018\u0010]\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u001e\u0010k\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010o\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR*\u0010w\u001a\u00020\u00122\u0006\u0010p\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR*\u0010\u007f\u001a\u00020x2\u0006\u0010p\u001a\u00020x8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R0\u0010\u0085\u0001\u001a\u00020\u00182\u0006\u0010p\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0005\b\u0084\u0001\u0010\u001bR\u001a\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008b\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0088\u0001R'\u0010N\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u008c\u0001\u0010_\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0093\u0001"}, d2 = {"Lcom/dw/ht/fragments/ContactsListFragment;", "Lcom/dw/ht/fragments/DeviceFragment;", "Landroidx/loader/app/a$a;", "Landroid/database/Cursor;", "Lc6/i;", "Lcom/dw/ht/fragments/g$a;", "Lcom/dw/ht/fragments/g;", "Landroid/hardware/SensorEventListener;", "<init>", "()V", "Ldd/d0;", "x5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "F2", "(Landroid/view/MenuItem;)Z", "Lv3/e0;", "getSearchable", "()Lv3/e0;", "", "queryText", "h", "(Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "", Name.MARK, "args", "Lg1/c;", "S", "(ILandroid/os/Bundle;)Lg1/c;", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "loader", "data", "q5", "(Lg1/c;Landroid/database/Cursor;)V", "t0", "(Lg1/c;)V", "y2", "action", "p5", "(Lcom/dw/ht/fragments/g$a;I)Z", "Ld5/g;", "listener", "u5", "(Lc6/i;)V", "Lcom/dw/ht/ii/a$b;", "event", "onMessageEvent", "(Lcom/dw/ht/ii/a$b;)V", "M2", "H2", "Landroid/hardware/Sensor;", "sensor", "accuracy", "onAccuracyChanged", "(Landroid/hardware/Sensor;I)V", "Landroid/hardware/SensorEvent;", "onSensorChanged", "(Landroid/hardware/SensorEvent;)V", "", "degree", "t5", "(F)V", "Lm4/z;", "P0", "Lm4/z;", "binding", "Landroid/net/Uri;", "Q0", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "R0", "Lcom/dw/ht/fragments/g;", "mAdapter", "S0", "I", "mLastCount", "Lg1/b;", "T0", "Lg1/b;", "mLoader", "Landroidx/recyclerview/widget/LinearLayoutManager;", "U0", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mLinearLayoutManager", "V0", "Lc6/i;", "mListener", "Landroid/hardware/SensorManager;", "W0", "Landroid/hardware/SensorManager;", "mSensorManager", "value", "X0", "Z", "getShowAction", "()Z", "v5", "(Z)V", "showAction", "", "Y0", "J", "getStartTime", "()J", "w5", "(J)V", "startTime", "Z0", "Ljava/lang/String;", "getEmptyMessage", "()Ljava/lang/String;", "setEmptyMessage", "emptyMessage", "Lg4/f;", "a1", "Lg4/f;", "devFilter", "b1", "searchFilter", "c1", "getDegree", "()I", "setDegree", "(I)V", "b", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactsListFragment extends DeviceFragment implements a.InterfaceC0037a, c6.i, SensorEventListener {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private z binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private final Uri uri;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private g mAdapter;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private int mLastCount;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private g1.b mLoader;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private LinearLayoutManager mLinearLayoutManager;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private c6.i mListener;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private SensorManager mSensorManager;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    private boolean showAction;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    private long startTime;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    private String emptyMessage;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    private g4.f devFilter;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    private g4.f searchFilter;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    private int degree;

    public static final class a extends ed.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Long[] f6157b;

        public a(Long[] lArr) {
            m.e(lArr, "uids");
            this.f6157b = lArr;
        }

        @Override // ed.b
        public int c() {
            return this.f6157b.length;
        }

        @Override // ed.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof d5.g) {
                return e((d5.g) obj);
            }
            return false;
        }

        public /* bridge */ boolean e(d5.g gVar) {
            return super.contains(gVar);
        }

        @Override // ed.d, java.util.List
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public d5.g get(int i10) {
            d5.g gVar = new d5.g();
            gVar.f10613o = this.f6157b[i10].longValue();
            return gVar;
        }

        public /* bridge */ int g(d5.g gVar) {
            return super.indexOf(gVar);
        }

        public /* bridge */ int h(d5.g gVar) {
            return super.lastIndexOf(gVar);
        }

        @Override // ed.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof d5.g) {
                return g((d5.g) obj);
            }
            return -1;
        }

        @Override // ed.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof d5.g) {
                return h((d5.g) obj);
            }
            return -1;
        }
    }

    public static final class b extends g4.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Cursor cursor) {
            super(cursor);
            m.e(cursor, "cursor");
        }

        public /* bridge */ boolean c(d5.g gVar) {
            return super.contains(gVar);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof d5.g) {
                return c((d5.g) obj);
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // g4.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public d5.g b(Cursor cursor) {
            return new d5.g(cursor);
        }

        public /* bridge */ int e() {
            return super.size();
        }

        public /* bridge */ int f(d5.g gVar) {
            return super.indexOf(gVar);
        }

        public /* bridge */ int g(d5.g gVar) {
            return super.lastIndexOf(gVar);
        }

        public /* bridge */ boolean h(d5.g gVar) {
            return super.remove(gVar);
        }

        @Override // java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof d5.g) {
                return f((d5.g) obj);
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof d5.g) {
                return g((d5.g) obj);
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof d5.g) {
                return h((d5.g) obj);
            }
            return false;
        }

        @Override // g4.b, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return e();
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6158a;

        static {
            int[] iArr = new int[a.EnumC0091a.values().length];
            try {
                iArr[a.EnumC0091a.f6333d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6158a = iArr;
        }
    }

    public ContactsListFragment() {
        Uri uriBuild = a.d.f6668a.buildUpon().appendQueryParameter("PRE_SORT", "date DESC,_from").appendQueryParameter("GROUP_BY", "_from").build();
        m.b(uriBuild);
        this.uri = uriBuild;
        this.showAction = true;
        this.emptyMessage = "";
        this.devFilter = new g4.f("1=0");
        this.searchFilter = new g4.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r5(final ContactsListFragment contactsListFragment, z zVar) {
        l1 l1VarY4 = contactsListFragment.Y4();
        zVar.f21710d.postDelayed(new Runnable() { // from class: s4.x0
            @Override // java.lang.Runnable
            public final void run() {
                ContactsListFragment.s5(this.f26831a);
            }
        }, 10000L);
        if (l1VarY4 instanceof n1) {
            ((n1) l1VarY4).A1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s5(ContactsListFragment contactsListFragment) {
        SwipeRefreshLayout swipeRefreshLayout;
        z zVar = contactsListFragment.binding;
        if (zVar == null || (swipeRefreshLayout = zVar.f21710d) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    private final void x5() {
        g1.b bVar = this.mLoader;
        if (bVar == null) {
            return;
        }
        g4.f fVarH = this.devFilter.clone().h(this.searchFilter);
        if (this.startTime > 0) {
            fVarH.h(new g4.f("date>=" + this.startTime));
        }
        bVar.S(fVarH.k());
        bVar.R(fVarH.n());
        bVar.p();
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        m.e(item, "item");
        if (item.getItemId() == R.id.clean) {
            return true;
        }
        return super.F2(item);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        Sensor defaultSensor;
        SensorManager sensorManager;
        super.M2();
        SensorManager sensorManager2 = this.mSensorManager;
        if (sensorManager2 == null || (defaultSensor = sensorManager2.getDefaultSensor(3)) == null || (sensorManager = this.mSensorManager) == null) {
            return;
        }
        sensorManager.registerListener(this, defaultSensor, 3);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        Context context = view.getContext();
        final z zVar = this.binding;
        if (zVar == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.mLinearLayoutManager = linearLayoutManager;
        zVar.f21709c.setLayoutManager(linearLayoutManager);
        zVar.f21709c.l(new c6.m(k1(), 0));
        g gVar = new g(this);
        this.mAdapter = gVar;
        gVar.M(this.showAction);
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.f6253f = Y4();
        }
        zVar.f21709c.setAdapter(this.mAdapter);
        zVar.f21710d.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: s4.w0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                ContactsListFragment.r5(this.f26818a, zVar);
            }
        });
        g4(zVar.f21709c);
        if (this.emptyMessage.length() > 0) {
            zVar.f21708b.setText(this.emptyMessage);
        }
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public g1.c S(int id2, Bundle args) {
        return new g1.b(x3(), this.uri, g.c.f10650a, "1=0", null, "date DESC,_from");
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 oldLink, n0 newLink) {
        g4.f fVar;
        super.d5(oldLink, newLink);
        if (newLink == null || (newLink instanceof n1)) {
            fVar = new g4.f("1=0");
        } else {
            l1 l1VarY4 = Y4();
            fVar = new g4.f("dev_id IN(?) AND (length(_from)>0 OR bss_user_id>0) AND type=1", new String[]{String.valueOf(l1VarY4 != null ? Long.valueOf(l1VarY4.q()) : null)});
        }
        this.devFilter = fVar;
        g gVar = this.mAdapter;
        if (gVar != null) {
            m.b(gVar);
            gVar.f6253f = Y4();
        }
        x5();
        if (newLink instanceof n1) {
            l1 l1VarY42 = Y4();
            Long[] lArrA0 = l1VarY42 != null ? l1VarY42.a0() : null;
            g gVar2 = this.mAdapter;
            if (gVar2 != null) {
                gVar2.L(lArrA0 != null ? new a(lArrA0) : null);
            }
        }
    }

    @Override // v3.f0, v3.e0
    public void h(String queryText) {
        g4.f fVar;
        m.e(queryText, "queryText");
        if (queryText.length() == 0) {
            fVar = new g4.f();
        } else {
            fVar = new g4.f("_from LIKE(?)", new String[]{'%' + queryText + '%'});
        }
        this.searchFilter = fVar;
        x5();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(a.b event) {
        SwipeRefreshLayout swipeRefreshLayout;
        m.e(event, "event");
        l1 l1VarY4 = Y4();
        n1 n1Var = l1VarY4 instanceof n1 ? (n1) l1VarY4 : null;
        if (n1Var != null && m.a(n1Var.S, event.b())) {
            if (c.f6158a[event.a().ordinal()] == 1) {
                Long[] lArrA0 = n1Var.a0();
                g gVar = this.mAdapter;
                if (gVar != null) {
                    gVar.L(lArrA0 != null ? new a(lArrA0) : null);
                }
                z zVar = this.binding;
                if (zVar == null || (swipeRefreshLayout = zVar.f21710d) == null) {
                    return;
                }
                swipeRefreshLayout.setRefreshing(false);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        Sensor sensor;
        FrameLayout frameLayoutB;
        Display display;
        int i10;
        if (event == null || (sensor = event.sensor) == null || sensor.getType() != 3) {
            return;
        }
        float f10 = event.values[0];
        z zVar = this.binding;
        if (zVar != null && (frameLayoutB = zVar.b()) != null && (display = frameLayoutB.getDisplay()) != null) {
            int rotation = display.getRotation();
            if (rotation == 1) {
                i10 = 90;
            } else if (rotation == 2) {
                i10 = 180;
            } else if (rotation == 3) {
                i10 = 270;
            }
            f10 = (f10 + i10) % 360;
        }
        t5(f10);
    }

    @Override // c6.i
    /* JADX INFO: renamed from: p5, reason: merged with bridge method [inline-methods] */
    public boolean V0(g.a item, int action) {
        m.e(item, "item");
        c6.i iVar = this.mListener;
        if (iVar == null) {
            return false;
        }
        m.b(iVar);
        return iVar.V0(item.L, action);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    /* JADX INFO: renamed from: q5, reason: merged with bridge method [inline-methods] */
    public void K(g1.c loader, Cursor data) {
        TextView textView;
        TextView textView2;
        m.e(loader, "loader");
        m.e(data, "data");
        if (Y4() instanceof n1) {
            return;
        }
        int count = data.getCount();
        g gVar = this.mAdapter;
        if (gVar != null) {
            gVar.L(new b(data));
        }
        this.mLastCount = count;
        if (count == 0) {
            z zVar = this.binding;
            if (zVar == null || (textView2 = zVar.f21708b) == null) {
                return;
            }
            textView2.setVisibility(0);
            return;
        }
        z zVar2 = this.binding;
        if (zVar2 == null || (textView = zVar2.f21708b) == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        g1.c cVarC = x1().c(0, null, this);
        m.c(cVarC, "null cannot be cast to non-null type androidx.loader.content.CursorLoader");
        this.mLoader = (g1.b) cVarC;
        x5();
        G3(true);
        Object systemService = x3().getSystemService("sensor");
        this.mSensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void t0(g1.c loader) {
        m.e(loader, "loader");
        g gVar = this.mAdapter;
        if (gVar != null) {
            gVar.L(null);
        }
    }

    public final void t5(float degree) {
        Location locationB;
        int iB = td.a.b(degree);
        g gVar = this.mAdapter;
        if (gVar != null) {
            gVar.K(iB);
        }
        if (iB == this.degree) {
            return;
        }
        this.degree = iB;
        z zVar = this.binding;
        if (zVar == null || (locationB = o5.g.f23195s.b(x3())) == null) {
            return;
        }
        int childCount = zVar.f21709c.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView.f0 f0VarO0 = zVar.f21709c.o0(zVar.f21709c.getChildAt(i10));
            m.c(f0VarO0, "null cannot be cast to non-null type com.dw.ht.fragments.ContactsRecyclerViewAdapter.ViewHolder");
            ((g.a) f0VarO0).T(locationB);
        }
    }

    public final void u5(c6.i listener) {
        this.mListener = listener;
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        z zVarC = z.c(inflater, container, false);
        this.binding = zVarC;
        m.b(zVarC);
        FrameLayout frameLayoutB = zVarC.b();
        m.d(frameLayoutB, "getRoot(...)");
        return frameLayoutB;
    }

    public final void v5(boolean z10) {
        if (this.showAction == z10) {
            return;
        }
        this.showAction = z10;
        g gVar = this.mAdapter;
        if (gVar != null) {
            gVar.M(z10);
        }
    }

    public final void w5(long j10) {
        if (this.startTime == j10) {
            return;
        }
        this.startTime = j10;
        x5();
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        g gVar = this.mAdapter;
        if (gVar != null) {
            gVar.L(null);
        }
        super.y2();
        this.binding = null;
    }

    @Override // v3.f0, v3.e0
    public e0 getSearchable() {
        return this;
    }
}
