package g7;

import java.text.DateFormat;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public class h extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f13603f = new h();

    public h() {
        this(null, null);
    }

    protected long C(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void f(Calendar calendar, e6.g gVar, p6.d0 d0Var) {
        if (x(d0Var)) {
            gVar.I0(C(calendar));
        } else {
            z(calendar.getTime(), gVar, d0Var);
        }
    }

    @Override // g7.l
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public h A(Boolean bool, DateFormat dateFormat) {
        return new h(bool, dateFormat);
    }

    public h(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }
}
