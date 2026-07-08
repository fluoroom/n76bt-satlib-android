package com.dw.ht.fragments;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.c;
import androidx.fragment.app.o;
import c5.q0;
import c5.x;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.TrackRecordingService;
import com.dw.ht.fragments.MapToolbarFragment;
import com.dw.ht.fragments.j;
import com.dw.widget.ActionButton;
import com.ekito.simpleKML.model.Kml;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import kotlin.Metadata;
import m4.t0;
import org.greenrobot.eventbus.ThreadMode;
import rd.m;
import z4.h;
import z4.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J)\u0010!\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lcom/dw/ht/fragments/MapToolbarFragment;", "Landroidx/fragment/app/o;", "<init>", "()V", "", "message", "Ldd/d0;", "k4", "(Ljava/lang/Object;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lc5/x;", "mode", "onMessageEvent", "(Lc5/x;)V", "M2", "H2", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m2", "(IILandroid/content/Intent;)V", "o0", "I", "RC_TRACK_LIST", "Lm4/t0;", "p0", "Lm4/t0;", "binding", "Landroid/os/Handler;", "q0", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapToolbarFragment extends o {

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private t0 binding;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private final int RC_TRACK_LIST = 2;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private final Handler handler = new Handler();

    public static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f6182a = new a("MyLocationClicked", 0);

        /* JADX INFO: renamed from: b */
        public static final a f6183b = new a("JustShowStarredChanged", 1);

        /* JADX INFO: renamed from: c */
        public static final a f6184c = new a("IconShowTimeChanged", 2);

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ a[] f6185d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ kd.a f6186e;

        static {
            a[] aVarArrA = a();
            f6185d = aVarArrA;
            f6186e = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6182a, f6183b, f6184c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6185d.clone();
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6187a;

        static {
            int[] iArr = new int[x.values().length];
            try {
                iArr[x.LOCATION_ROTATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6187a = iArr;
        }
    }

    public static final void b4(h.c cVar, final MapToolbarFragment mapToolbarFragment) {
        final LatLngBounds latLngBoundsA;
        Kml kmlG = cVar.g();
        if (kmlG == null || (latLngBoundsA = b5.a.a(kmlG)) == null) {
            return;
        }
        mapToolbarFragment.handler.postDelayed(new Runnable() { // from class: s4.h5
            @Override // java.lang.Runnable
            public final void run() {
                MapToolbarFragment.c4(this.f26511a, latLngBoundsA);
            }
        }, 1000L);
    }

    public static final void c4(MapToolbarFragment mapToolbarFragment, LatLngBounds latLngBounds) {
        mapToolbarFragment.k4(new j.f(latLngBounds));
    }

    public static final void d4(View view) {
        l lVar = l.f32949a;
        m.b(view);
        l.c(lVar, view, null, null, 6, null);
    }

    public static final void e4(MapToolbarFragment mapToolbarFragment, View view) {
        mapToolbarFragment.k4(a.f6182a);
    }

    public static final void f4(t0 t0Var, MapToolbarFragment mapToolbarFragment, View view) {
        Cfg.D0(!Cfg.c0());
        t0Var.f21563d.setSelected(Cfg.c0());
        mapToolbarFragment.k4(a.f6183b);
        view.setContentDescription(mapToolbarFragment.N1(Cfg.c0() ? R.string.onlyShowFollowingUsers : R.string.showAllUsers));
    }

    public static final void g4(final MapToolbarFragment mapToolbarFragment, View view) {
        int length;
        int iBinarySearch;
        int iD = Cfg.D();
        final int[] intArray = mapToolbarFragment.H1().getIntArray(R.array.show_icon_times);
        m.d(intArray, "getIntArray(...)");
        if (intArray[intArray.length - 1] != 0) {
            length = intArray.length;
        } else {
            if (iD == 0) {
                iBinarySearch = intArray.length - 1;
                new c.a(view.getContext()).y(R.string.showRecent).v(R.array.show_icon_time_names, iBinarySearch, new DialogInterface.OnClickListener() { // from class: s4.f5
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        MapToolbarFragment.h4(intArray, mapToolbarFragment, dialogInterface, i10);
                    }
                }).C();
            }
            length = intArray.length - 1;
        }
        iBinarySearch = Arrays.binarySearch(intArray, 0, length, iD);
        new c.a(view.getContext()).y(R.string.showRecent).v(R.array.show_icon_time_names, iBinarySearch, new DialogInterface.OnClickListener() { // from class: s4.f5
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                MapToolbarFragment.h4(intArray, mapToolbarFragment, dialogInterface, i10);
            }
        }).C();
    }

    public static final void h4(int[] iArr, MapToolbarFragment mapToolbarFragment, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        Cfg.P0(iArr[i10]);
        mapToolbarFragment.k4(a.f6184c);
    }

    public static final void i4(MapToolbarFragment mapToolbarFragment, View view) {
        mapToolbarFragment.startActivityForResult(FragmentShowActivity.d2(mapToolbarFragment.k1(), "", q0.class), mapToolbarFragment.RC_TRACK_LIST);
    }

    public static final boolean j4(View view) {
        TrackRecordingService.INSTANCE.i();
        view.setSelected(Cfg.O().recordingTrack);
        return true;
    }

    private final void k4(Object message) {
        mi.c.e().m(message);
    }

    @Override // androidx.fragment.app.o
    public void H2() {
        super.H2();
        mi.c.e().t(this);
    }

    @Override // androidx.fragment.app.o
    public void M2() {
        ActionButton actionButton;
        super.M2();
        mi.c.e().q(this);
        t0 t0Var = this.binding;
        if (t0Var == null || (actionButton = t0Var.f21565f) == null) {
            return;
        }
        actionButton.setSelected(Cfg.O().recordingTrack);
    }

    @Override // androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        final t0 t0Var = this.binding;
        if (t0Var == null) {
            return;
        }
        t0Var.f21561b.setOnClickListener(new View.OnClickListener() { // from class: s4.z4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MapToolbarFragment.d4(view2);
            }
        });
        t0Var.f21562c.setOnClickListener(new View.OnClickListener() { // from class: s4.a5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MapToolbarFragment.e4(this.f26360a, view2);
            }
        });
        t0Var.f21563d.setSelected(Cfg.c0());
        t0Var.f21563d.setContentDescription(N1(Cfg.c0() ? R.string.onlyShowFollowingUsers : R.string.showAllUsers));
        t0Var.f21563d.setOnClickListener(new View.OnClickListener() { // from class: s4.b5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MapToolbarFragment.f4(t0Var, this, view2);
            }
        });
        t0Var.f21564e.setOnClickListener(new View.OnClickListener() { // from class: s4.c5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MapToolbarFragment.g4(this.f26392a, view2);
            }
        });
        t0Var.f21565f.setOnClickListener(new View.OnClickListener() { // from class: s4.d5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MapToolbarFragment.i4(this.f26402a, view2);
            }
        });
        t0Var.f21565f.setOnLongClickListener(new View.OnLongClickListener() { // from class: s4.e5
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return MapToolbarFragment.j4(view2);
            }
        });
        t0Var.f21565f.setSelected(Cfg.O().recordingTrack);
    }

    @Override // androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        if (requestCode != this.RC_TRACK_LIST) {
            super.m2(requestCode, resultCode, data);
            return;
        }
        if (resultCode != -1 || data == null) {
            return;
        }
        final h.c cVarG = z4.h.i().g(data.getStringExtra("android.intent.extra.TEXT"));
        if (cVarG != null) {
            AsyncTask.execute(new Runnable() { // from class: s4.g5
                @Override // java.lang.Runnable
                public final void run() {
                    MapToolbarFragment.b4(cVarG, this);
                }
            });
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(x mode) {
        m.e(mode, "mode");
        t0 t0Var = this.binding;
        if (t0Var == null) {
            return;
        }
        if (b.f6187a[mode.ordinal()] == 1) {
            t0Var.f21562c.setImageResource(R.drawable.ic_compass_outline);
            t0Var.f21562c.setSelected(true);
        } else {
            t0Var.f21562c.setImageResource(R.drawable.ic_my_location_black_24dp);
            t0Var.f21562c.setSelected(mode == x.FOLLOWING);
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        t0 t0VarC = t0.c(inflater, container, false);
        this.binding = t0VarC;
        m.b(t0VarC);
        LinearLayout linearLayoutB = t0VarC.b();
        m.d(linearLayoutB, "getRoot(...)");
        return linearLayoutB;
    }

    @Override // androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
