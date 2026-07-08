package o5;

import android.location.Location;
import android.text.TextUtils;
import com.dw.ht.Cfg;
import java.util.LinkedList;
import v4.c0;
import v4.l1;
import v4.r;
import v4.u;
import v4.w;
import w5.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static w5.a a(Location location, l1 l1Var) {
        if (l1Var == null) {
            l1Var = u.u();
        }
        a.C0414a c0414aH = new a.C0414a().c(location.getLatitude(), location.getLongitude(), Cfg.m()).d(b(l1Var)).h(Cfg.s());
        if (l1Var != null) {
            c0414aH.g(l1Var.Q());
            String strL = l1Var.T().l();
            if (!strL.isEmpty()) {
                c0414aH.h(strL);
            }
        }
        if (location.hasSpeed()) {
            c0414aH.i(location.getSpeed());
        }
        if (location.hasBearing()) {
            c0414aH.b(location.getBearing());
        }
        return c0414aH.a();
    }

    public static String b(l1 l1Var) {
        r rVarO1;
        String strK = Cfg.k();
        if (l1Var == null) {
            return strK;
        }
        c0 c0Var = l1Var instanceof c0 ? (c0) l1Var : null;
        LinkedList linkedList = new LinkedList();
        if (!TextUtils.isEmpty(strK)) {
            linkedList.add(strK);
        }
        if (Cfg.e0() && c0Var != null && (rVarO1 = c0Var.O1()) != null && rVarO1.f30066b != 0) {
            linkedList.add(rVarO1.n() + "MHz");
        }
        if (Cfg.f0()) {
            String strD = l1Var.d().d();
            if (strD != null) {
                linkedList.add(strD);
            } else if (l1Var.n() && c0Var != null) {
                c0Var.x2(w.BATTERY_VOLTAGE);
            }
        }
        while (true) {
            String strJoin = TextUtils.join(" ", linkedList);
            int i10 = 43;
            if (strJoin.getBytes(w5.a.f31149x).length <= 43) {
                return strJoin;
            }
            int length = strJoin.length();
            if (length <= 43) {
                i10 = length - 1;
            }
            strK = strK.substring(0, strK.length() - (strJoin.length() - i10));
            linkedList.remove(0);
            linkedList.add(0, strK);
        }
    }
}
