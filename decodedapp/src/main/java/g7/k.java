package g7;

import java.text.DateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class k extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f13606f = new k();

    public k() {
        this(null, null);
    }

    protected long C(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void f(Date date, e6.g gVar, p6.d0 d0Var) {
        if (x(d0Var)) {
            gVar.I0(C(date));
        } else {
            z(date, gVar, d0Var);
        }
    }

    @Override // g7.l
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public k A(Boolean bool, DateFormat dateFormat) {
        return new k(bool, dateFormat);
    }

    public k(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }
}
