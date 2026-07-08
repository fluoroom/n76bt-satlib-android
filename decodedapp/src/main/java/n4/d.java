package n4;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.Bundle;
import com.dw.ht.entitys.IIChannel;
import com.dw.ht.fragments.TalkListFragment;
import com.dw.ht.provider.a;
import ed.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import u4.d0;
import v4.c0;
import v4.i0;
import v4.l1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f22437a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f22438b = new a();

    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            rd.m.e(context, "context");
            rd.m.e(intent, "intent");
            String action = intent.getAction();
            if (action != null && action.hashCode() == 1772843706 && action.equals("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT")) {
                Bundle extras = intent.getExtras();
                Object[] objArr = (Object[]) (extras != null ? extras.get("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_ARGS") : null);
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                String stringExtra = intent.getStringExtra("android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_CMD");
                if (stringExtra == null || stringExtra.hashCode() != 2093671693 || !stringExtra.equals("+XEVENT") || objArr == null || objArr.length == 0) {
                    return;
                }
                d.f22437a.d(context, bluetoothDevice, String.valueOf(objArr[0]));
            }
        }
    }

    private d() {
    }

    private final void e(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(a.d.f6668a.buildUpon().appendQueryParameter("LIMIT", "1").build(), new String[]{"_id"}, "duration>0 AND type=1", null, "date DESC");
        if (cursorQuery == null) {
            return;
        }
        if (cursorQuery.moveToFirst()) {
            new TalkListFragment.d(context.getContentResolver(), cursorQuery.getLong(0), 0).start();
        }
        cursorQuery.close();
    }

    public final void a(Context context) {
        rd.m.e(context, "context");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT");
        intentFilter.addCategory("android.bluetooth.headset.intent.category.companyid.85");
        b0.b.j(context, f22438b, intentFilter, 2);
    }

    public final void b(Context context) {
        l1 l1Var;
        String name;
        rd.m.e(context, "context");
        u uVarW = u.w();
        rd.m.d(uVarW, "getInstance(...)");
        Iterator it = uVarW.A().iterator();
        while (true) {
            if (!it.hasNext()) {
                l1Var = null;
                break;
            } else {
                l1Var = (l1) it.next();
                if (l1Var.j0()) {
                    break;
                }
            }
        }
        if (l1Var != null) {
            uVarW.G(l1Var);
        }
        l1 l1VarR = uVarW.r();
        if (l1VarR == null || (name = l1VarR.getName()) == null) {
            return;
        }
        s3.d.i(context).k(name);
    }

    public final void c(Context context, boolean z10) {
        Long l10;
        String name;
        rd.m.e(context, "context");
        u uVarW = u.w();
        rd.m.d(uVarW, "getInstance(...)");
        ArrayList arrayList = new ArrayList();
        Collection<l1> collectionA = uVarW.A();
        rd.m.d(collectionA, "getLinks(...)");
        for (l1 l1Var : collectionA) {
            if (l1Var.n() || l1Var.i()) {
                if (l1Var instanceof c0) {
                    arrayList.add(Long.valueOf(((c0) l1Var).q()));
                }
            }
        }
        for (IIChannel iIChannel : d0.f28046a.l()) {
            if (iIChannel.getAutoConnect()) {
                arrayList.add(Long.valueOf(iIChannel.g()));
            }
        }
        if (arrayList.size() < 2) {
            return;
        }
        l1 l1VarR = uVarW.r();
        long jQ = l1VarR != null ? l1VarR.q() : 0L;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                l10 = null;
                break;
            } else if (((Number) arrayList.get(i10)).longValue() == jQ) {
                l10 = z10 ? (Long) arrayList.get((i10 + 1) % arrayList.size()) : (Long) arrayList.get(((i10 - 1) + arrayList.size()) % arrayList.size());
            } else {
                i10++;
            }
        }
        if (l10 == null) {
            l10 = z10 ? (Long) q.Z(arrayList) : (Long) q.k0(arrayList);
        }
        uVarW.G(uVarW.y(l10.longValue()));
        l1 l1VarR2 = uVarW.r();
        if (l1VarR2 == null || (name = l1VarR2.getName()) == null) {
            return;
        }
        s3.d.i(context).k(name);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void d(Context context, BluetoothDevice bluetoothDevice, String str) {
        rd.m.e(context, "context");
        rd.m.e(str, "arg");
        s3.b.b("XEVENT", str);
        switch (str.hashCode()) {
            case -1924462998:
                if (str.equals("PTT_UP")) {
                    mi.c.e().m(new p4.c(bluetoothDevice, 2));
                    return;
                }
                break;
            case -1729879759:
                if (str.equals("NEXT_CH")) {
                    c(context, true);
                    return;
                }
                break;
            case 65851:
                if (str.equals("BLE")) {
                    if (bluetoothDevice != null) {
                        i0.F.f(bluetoothDevice, bluetoothDevice).B();
                        return;
                    }
                    return;
                }
                break;
            case 2282794:
                if (str.equals("JOIN")) {
                    b(context);
                    return;
                }
                break;
            case 399819249:
                if (str.equals("PREV_CH")) {
                    c(context, false);
                    return;
                }
                break;
            case 938385601:
                if (str.equals("PLAY_LAST")) {
                    e(context);
                    return;
                }
                break;
            case 1721458865:
                if (str.equals("PTT_DOWN")) {
                    mi.c.e().m(new p4.c(bluetoothDevice, 1));
                    return;
                }
                break;
        }
        if (bluetoothDevice != null) {
            if (rg.q.J(str, "BSHM:", false, 2, null)) {
                List listC0 = rg.q.C0(str, new String[]{":"}, false, 0, 6, null);
                i0.F.f(bluetoothDevice, listC0.size() >= 3 ? rg.q.x("LE", (String) listC0.get(2), true) : false ? bluetoothDevice : null).B();
            }
        }
    }
}
