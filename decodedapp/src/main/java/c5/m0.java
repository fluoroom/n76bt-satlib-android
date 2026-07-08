package c5;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.ListItemView;
import com.dw.ht.Cfg;
import com.dw.ht.map.OfflineMapDownloadService;
import com.dw.ht.map.entitys.SatelliteOfflineMapItem;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import v3.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 S2\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002:\u0001TB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u001b\u0010\u0014\u001a\u00020\t2\n\u0010\u0013\u001a\u00060\u0011R\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J#\u0010)\u001a\u00060(R\u00020\u00012\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020!H\u0016¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u00020\t2\n\u0010+\u001a\u00060(R\u00020\u00012\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\t2\u0006\u0010/\u001a\u00020.2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b0\u00101J)\u00105\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b5\u00106J;\u0010>\u001a\u00020\u001e2\b\u00108\u001a\u0004\u0018\u0001072\u0006\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u00020!2\b\u0010=\u001a\u0004\u0018\u00010<H\u0014¢\u0006\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010R\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lc5/m0;", "Lv3/x;", "Lfc/a;", "", "Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "data", "a5", "(Ljava/util/List;)V", "O2", "P2", "Lcom/dw/ht/map/OfflineMapDownloadService$c;", "Lcom/dw/ht/map/OfflineMapDownloadService;", "event", "onMessageEvent", "(Lcom/dw/ht/map/OfflineMapDownloadService$c;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "F2", "(Landroid/view/MenuItem;)Z", "", "position", "H4", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "Lv3/x$b;", "G4", "(Landroid/view/ViewGroup;I)Lv3/x$b;", "holder", "F4", "(Lv3/x$b;I)V", "Landroid/view/View;", "actionView", "E4", "(Landroid/view/View;I)V", "Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;", "status", "justWifi", "b5", "(Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem;Lcom/dw/ht/map/entitys/SatelliteOfflineMapItem$a;Ljava/lang/Boolean;)V", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "Lfc/d;", "G0", "Lfc/d;", "dataSubscription", "", "H0", "Ljava/util/List;", "items", "Lz4/j;", "I0", "Lz4/j;", "mapLayer", "Lio/objectbox/a;", "J0", "Lio/objectbox/a;", "box", "B4", "()I", "itemCount", "K0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 extends v3.x implements fc.a {

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private fc.d dataSubscription;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private List items = ed.q.k();

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private z4.j mapLayer = z4.j.f32939c;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private io.objectbox.a box;

    /* JADX INFO: renamed from: c5.m0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public final Intent a(Context context, z4.j jVar) {
            rd.m.e(context, "context");
            rd.m.e(jVar, "layer");
            Bundle bundle = new Bundle();
            bundle.putSerializable("layer", jVar);
            Intent intentE2 = FragmentShowActivity.e2(context, null, m0.class, bundle);
            rd.m.d(intentE2, "getShowFragmentIntent(...)");
            return intentE2;
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4346a;

        static {
            int[] iArr = new int[SatelliteOfflineMapItem.a.values().length];
            try {
                iArr[SatelliteOfflineMapItem.a.f6551c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SatelliteOfflineMapItem.a.f6549a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SatelliteOfflineMapItem.a.f6552d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SatelliteOfflineMapItem.a.f6553e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SatelliteOfflineMapItem.a.f6550b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SatelliteOfflineMapItem.a.f6554f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f4346a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R4(final m0 m0Var, final SatelliteOfflineMapItem satelliteOfflineMapItem, MenuItem menuItem) {
        io.objectbox.a aVar = null;
        switch (menuItem.getItemId()) {
            case R.id.cancel /* 2131296503 */:
                satelliteOfflineMapItem.s(SatelliteOfflineMapItem.a.f6554f);
                io.objectbox.a aVar2 = m0Var.box;
                if (aVar2 == null) {
                    rd.m.o("box");
                } else {
                    aVar = aVar2;
                }
                aVar.n(satelliteOfflineMapItem);
                OfflineMapDownloadService.Companion companion = OfflineMapDownloadService.INSTANCE;
                Context contextK1 = m0Var.k1();
                rd.m.b(contextK1);
                companion.a(contextK1, satelliteOfflineMapItem.getId());
                break;
            case R.id.delete /* 2131296623 */:
                satelliteOfflineMapItem.s(SatelliteOfflineMapItem.a.f6555g);
                io.objectbox.a aVar3 = m0Var.box;
                if (aVar3 == null) {
                    rd.m.o("box");
                } else {
                    aVar = aVar3;
                }
                aVar.n(satelliteOfflineMapItem);
                OfflineMapDownloadService.Companion companion2 = OfflineMapDownloadService.INSTANCE;
                Context contextK12 = m0Var.k1();
                rd.m.b(contextK12);
                companion2.a(contextK12, satelliteOfflineMapItem.getId());
                Context contextK13 = m0Var.k1();
                rd.m.b(contextK13);
                companion2.e(contextK13);
                break;
            case R.id.rename /* 2131297255 */:
                Context contextK14 = m0Var.k1();
                rd.m.b(contextK14);
                v3.q qVarO4 = v3.q.o4(contextK14, menuItem.getTitle(), "", satelliteOfflineMapItem.getTitle(), "");
                qVarO4.h4().putLong("SatelliteOfflineMapItem.id", satelliteOfflineMapItem.getId());
                qVarO4.g4(m0Var.j1(), "rename");
                break;
            case R.id.restart /* 2131297260 */:
                OfflineMapDownloadService.Companion companion3 = OfflineMapDownloadService.INSTANCE;
                Context contextK15 = m0Var.k1();
                rd.m.b(contextK15);
                if (companion3.d(contextK15)) {
                    c5(m0Var, satelliteOfflineMapItem, SatelliteOfflineMapItem.a.f6549a, null, 4, null);
                    dd.d0 d0Var = dd.d0.f10897a;
                } else if (!Cfg.f5488g) {
                    Context contextK16 = m0Var.k1();
                    rd.m.b(contextK16);
                    new AlertDialog.Builder(contextK16).setMessage(m0Var.N1(R.string.downloadByMobileData)).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: c5.g0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            m0.U4(this.f4331a, satelliteOfflineMapItem, dialogInterface, i10);
                        }
                    }).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: c5.h0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            m0.V4(this.f4334a, satelliteOfflineMapItem, dialogInterface, i10);
                        }
                    }).show();
                } else {
                    Context contextK17 = m0Var.k1();
                    rd.m.b(contextK17);
                    new AlertDialog.Builder(contextK17).setMessage("下载离线地图需要Wi-Fi连接，当设备连接到Wi-Fi时下载会自动开始。").setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: c5.e0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            m0.S4(dialogInterface, i10);
                        }
                    }).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: c5.f0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            m0.T4(this.f4328a, satelliteOfflineMapItem, dialogInterface, i10);
                        }
                    }).show();
                }
                break;
            case R.id.update /* 2131297619 */:
                OfflineMapDownloadService.Companion companion4 = OfflineMapDownloadService.INSTANCE;
                Context contextK18 = m0Var.k1();
                rd.m.b(contextK18);
                if (companion4.d(contextK18)) {
                    c5(m0Var, satelliteOfflineMapItem, SatelliteOfflineMapItem.a.f6550b, null, 4, null);
                    dd.d0 d0Var2 = dd.d0.f10897a;
                } else if (!Cfg.f5488g) {
                    Context contextK19 = m0Var.k1();
                    rd.m.b(contextK19);
                    new AlertDialog.Builder(contextK19).setMessage(m0Var.N1(R.string.downloadByMobileData)).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: c5.k0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            m0.Y4(this.f4341a, satelliteOfflineMapItem, dialogInterface, i10);
                        }
                    }).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: c5.l0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            m0.Z4(this.f4343a, satelliteOfflineMapItem, dialogInterface, i10);
                        }
                    }).show();
                } else {
                    Context contextK110 = m0Var.k1();
                    rd.m.b(contextK110);
                    new AlertDialog.Builder(contextK110).setMessage("下载离线地图需要Wi-Fi连接，当设备连接到Wi-Fi时下载会自动开始。").setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: c5.i0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            m0.W4(dialogInterface, i10);
                        }
                    }).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: c5.j0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i10) {
                            m0.X4(this.f4338a, satelliteOfflineMapItem, dialogInterface, i10);
                        }
                    }).show();
                }
                break;
            case R.id.use_mobile_data /* 2131297629 */:
                m0Var.b5(satelliteOfflineMapItem, SatelliteOfflineMapItem.a.f6549a, Boolean.FALSE);
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(m0 m0Var, SatelliteOfflineMapItem satelliteOfflineMapItem, DialogInterface dialogInterface, int i10) {
        m0Var.b5(satelliteOfflineMapItem, SatelliteOfflineMapItem.a.f6549a, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(m0 m0Var, SatelliteOfflineMapItem satelliteOfflineMapItem, DialogInterface dialogInterface, int i10) {
        m0Var.b5(satelliteOfflineMapItem, SatelliteOfflineMapItem.a.f6549a, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V4(m0 m0Var, SatelliteOfflineMapItem satelliteOfflineMapItem, DialogInterface dialogInterface, int i10) {
        m0Var.b5(satelliteOfflineMapItem, SatelliteOfflineMapItem.a.f6549a, Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X4(m0 m0Var, SatelliteOfflineMapItem satelliteOfflineMapItem, DialogInterface dialogInterface, int i10) {
        m0Var.b5(satelliteOfflineMapItem, SatelliteOfflineMapItem.a.f6550b, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y4(m0 m0Var, SatelliteOfflineMapItem satelliteOfflineMapItem, DialogInterface dialogInterface, int i10) {
        m0Var.b5(satelliteOfflineMapItem, SatelliteOfflineMapItem.a.f6550b, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z4(m0 m0Var, SatelliteOfflineMapItem satelliteOfflineMapItem, DialogInterface dialogInterface, int i10) {
        m0Var.b5(satelliteOfflineMapItem, SatelliteOfflineMapItem.a.f6550b, Boolean.FALSE);
    }

    public static /* synthetic */ void c5(m0 m0Var, SatelliteOfflineMapItem satelliteOfflineMapItem, SatelliteOfflineMapItem.a aVar, Boolean bool, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            bool = null;
        }
        m0Var.b5(satelliteOfflineMapItem, aVar, bool);
    }

    @Override // v3.x
    public int B4() {
        return this.items.size();
    }

    @Override // v3.x
    public void E4(View actionView, int position) {
        SatelliteOfflineMapItem satelliteOfflineMapItemL;
        rd.m.e(actionView, "actionView");
        c6.k kVar = new c6.k(actionView.getContext(), actionView);
        kVar.b().inflate(R.menu.satellite_offline_map, kVar.a());
        final SatelliteOfflineMapItem satelliteOfflineMapItem = (SatelliteOfflineMapItem) this.items.get(position);
        Menu menuA = kVar.a();
        menuA.setGroupVisible(R.id.optional, false);
        SatelliteOfflineMapItem.a status = satelliteOfflineMapItem.getStatus();
        switch (status == null ? -1 : b.f4346a[status.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                menuA.findItem(R.id.cancel).setVisible(true);
                break;
            case 4:
                menuA.findItem(R.id.update).setVisible(true);
                break;
            case 6:
                menuA.findItem(R.id.restart).setVisible(true);
                break;
        }
        OfflineMapDownloadService.c cVarB = OfflineMapDownloadService.INSTANCE.b();
        if (!Cfg.f5488g && cVarB != null && (satelliteOfflineMapItemL = cVarB.l()) != null && satelliteOfflineMapItem.getId() == satelliteOfflineMapItemL.getId() && satelliteOfflineMapItem.getJustDownloadInWifi() && cVarB.o()) {
            menuA.findItem(R.id.use_mobile_data).setVisible(true);
        }
        kVar.f();
        kVar.e(new PopupMenu.OnMenuItemClickListener() { // from class: c5.d0
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return m0.R4(this.f4324a, satelliteOfflineMapItem, menuItem);
            }
        });
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        if (item.getItemId() != R.id.add) {
            return super.F2(item);
        }
        Intent intentE2 = FragmentShowActivity.e2(k1(), N1(R.string.selectRegionToDownload), z4.m.f(), i1());
        rd.m.d(intentE2, "getShowFragmentIntent(...)");
        startActivityForResult(intentE2, 1);
        return true;
    }

    @Override // v3.x
    public void F4(x.b holder, int position) {
        SatelliteOfflineMapItem satelliteOfflineMapItemL;
        ListItemView listItemViewQ;
        String strN1;
        rd.m.e(holder, "holder");
        SatelliteOfflineMapItem satelliteOfflineMapItem = (SatelliteOfflineMapItem) this.items.get(position);
        if (satelliteOfflineMapItem.getTitle().length() == 0) {
            ListItemView listItemViewQ2 = holder.Q();
            if (listItemViewQ2 != null) {
                rd.g0 g0Var = rd.g0.f25951a;
                Locale locale = Locale.getDefault();
                String strN12 = N1(R.string.offline_map_i);
                rd.m.d(strN12, "getString(...)");
                String str = String.format(locale, strN12, Arrays.copyOf(new Object[]{Long.valueOf(satelliteOfflineMapItem.getId())}, 1));
                rd.m.d(str, "format(...)");
                listItemViewQ2.setTitle(str);
            }
        } else {
            ListItemView listItemViewQ3 = holder.Q();
            if (listItemViewQ3 != null) {
                listItemViewQ3.setTitle(satelliteOfflineMapItem.getTitle());
            }
        }
        ListItemView listItemViewQ4 = holder.Q();
        if (listItemViewQ4 != null) {
            SatelliteOfflineMapItem.a status = satelliteOfflineMapItem.getStatus();
            switch (status == null ? -1 : b.f4346a[status.ordinal()]) {
                case 1:
                    strN1 = N1(R.string.downloading);
                    break;
                case 2:
                    strN1 = N1(R.string.waitForDownload);
                    break;
                case 3:
                    strN1 = N1(R.string.updating);
                    break;
                case 4:
                    strN1 = N1(R.string.downloaded);
                    break;
                case 5:
                    strN1 = N1(R.string.waitForUpdate);
                    break;
                case 6:
                    strN1 = N1(R.string.cancelled);
                    break;
                default:
                    strN1 = "";
                    break;
            }
            listItemViewQ4.setDetail(strN1);
        }
        OfflineMapDownloadService.c cVarB = OfflineMapDownloadService.INSTANCE.b();
        if (cVarB == null || (satelliteOfflineMapItemL = cVarB.l()) == null || satelliteOfflineMapItem.getId() != satelliteOfflineMapItemL.getId() || (listItemViewQ = holder.Q()) == null) {
            return;
        }
        listItemViewQ.setDetail(cVarB.n());
    }

    @Override // v3.x
    public x.b G4(ViewGroup parent, int viewType) {
        rd.m.e(parent, "parent");
        Context context = parent.getContext();
        rd.m.d(context, "getContext(...)");
        ListItemView listItemView = new ListItemView(context, ListItemView.b.f5301d);
        listItemView.setLayoutParams(new RecyclerView.r(-1, -2));
        listItemView.setAccessory(ListItemView.a.f5295d);
        return new x.b(this, listItemView);
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        io.objectbox.a aVar = this.box;
        if (aVar == null) {
            rd.m.o("box");
            aVar = null;
        }
        QueryBuilder queryBuilderQ = aVar.q();
        rd.m.d(queryBuilderQ, "builder");
        queryBuilderQ.g(com.dw.ht.map.entitys.b.f6585h, SatelliteOfflineMapItem.a.f6555g.ordinal());
        queryBuilderQ.j(com.dw.ht.map.entitys.b.f6582e);
        Query queryA = queryBuilderQ.a();
        rd.m.d(queryA, "builder.build()");
        this.dataSubscription = queryA.p0().f(zb.a.c()).e(this);
        OfflineMapDownloadService.Companion companion = OfflineMapDownloadService.INSTANCE;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        companion.e(contextX3);
        mi.c.e().q(this);
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        super.P2();
        mi.c.e().t(this);
        fc.d dVar = this.dataSubscription;
        if (dVar != null) {
            dVar.cancel();
        }
    }

    @Override // fc.a
    /* JADX INFO: renamed from: a5, reason: merged with bridge method [inline-methods] */
    public void Q0(List data) {
        rd.m.e(data, "data");
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (((SatelliteOfflineMapItem) obj).f() == this.mapLayer) {
                arrayList.add(obj);
            }
        }
        this.items = arrayList;
        D4();
    }

    public final void b5(SatelliteOfflineMapItem item, SatelliteOfflineMapItem.a status, Boolean justWifi) {
        rd.m.e(item, "item");
        rd.m.e(status, "status");
        if (justWifi != null) {
            item.q(justWifi.booleanValue());
        }
        item.s(status);
        io.objectbox.a aVar = this.box;
        if (aVar == null) {
            rd.m.o("box");
            aVar = null;
        }
        aVar.n(item);
        OfflineMapDownloadService.Companion companion = OfflineMapDownloadService.INSTANCE;
        Context contextK1 = k1();
        rd.m.b(contextK1);
        companion.e(contextK1);
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        String strP1;
        if (sender == null || (strP1 = sender.P1()) == null || strP1.hashCode() != -934594754 || !strP1.equals("rename")) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if (what != R.id.what_dialog_onclick || arg1 != -1) {
            return true;
        }
        Bundle bundleI1 = sender.i1();
        rd.m.b(bundleI1);
        long j10 = bundleI1.getLong("SatelliteOfflineMapItem.id");
        io.objectbox.a aVar = this.box;
        io.objectbox.a aVar2 = null;
        if (aVar == null) {
            rd.m.o("box");
            aVar = null;
        }
        SatelliteOfflineMapItem satelliteOfflineMapItem = (SatelliteOfflineMapItem) aVar.e(j10);
        if (satelliteOfflineMapItem == null) {
            return true;
        }
        rd.m.b(obj);
        satelliteOfflineMapItem.t(obj.toString());
        io.objectbox.a aVar3 = this.box;
        if (aVar3 == null) {
            rd.m.o("box");
        } else {
            aVar2 = aVar3;
        }
        aVar2.n(satelliteOfflineMapItem);
        return true;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(OfflineMapDownloadService.c event) {
        rd.m.e(event, "event");
        D4();
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        io.objectbox.a aVarK = com.dw.ht.j0.i().k(SatelliteOfflineMapItem.class);
        rd.m.d(aVarK, "boxFor(T::class.java)");
        this.box = aVarK;
        Bundle bundleI1 = i1();
        Serializable serializable = bundleI1 != null ? bundleI1.getSerializable("layer") : null;
        z4.j jVar = serializable instanceof z4.j ? (z4.j) serializable : null;
        if (jVar != null) {
            this.mapLayer = jVar;
        }
        z4(this.mapLayer.e());
        G3(true);
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.o_satellite_offline_map, menu);
    }

    @Override // v3.x
    public void H4(int position) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(DialogInterface dialogInterface, int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W4(DialogInterface dialogInterface, int i10) {
    }
}
