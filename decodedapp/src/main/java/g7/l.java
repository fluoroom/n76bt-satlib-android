package g7;

import d6.k;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends h0 implements e7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Boolean f13607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final DateFormat f13608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final AtomicReference f13609e;

    protected l(Class cls, Boolean bool, DateFormat dateFormat) {
        super(cls);
        this.f13607c = bool;
        this.f13608d = dateFormat;
        this.f13609e = dateFormat == null ? null : new AtomicReference();
    }

    public abstract l A(Boolean bool, DateFormat dateFormat);

    @Override // e7.i
    public p6.p a(p6.d0 d0Var, p6.d dVar) {
        k.d dVarQ = q(d0Var, dVar, c());
        if (dVarQ != null) {
            k.c cVarI = dVarQ.i();
            if (cVarI.a()) {
                return A(Boolean.TRUE, null);
            }
            if (dVarQ.n()) {
                DateFormat simpleDateFormat = new SimpleDateFormat(dVarQ.h(), dVarQ.l() ? dVarQ.g() : d0Var.q0());
                simpleDateFormat.setTimeZone(dVarQ.p() ? dVarQ.j() : d0Var.r0());
                return A(Boolean.FALSE, simpleDateFormat);
            }
            boolean zL = dVarQ.l();
            boolean zP = dVarQ.p();
            boolean z10 = cVarI == k.c.STRING;
            if (zL || zP || z10) {
                DateFormat dateFormatK = d0Var.k().k();
                if (dateFormatK instanceof i7.a0) {
                    i7.a0 a0VarG = (i7.a0) dateFormatK;
                    if (dVarQ.l()) {
                        a0VarG = a0VarG.D(dVarQ.g());
                    }
                    if (dVarQ.p()) {
                        a0VarG = a0VarG.G(dVarQ.j());
                    }
                    return A(Boolean.FALSE, a0VarG);
                }
                if (!(dateFormatK instanceof SimpleDateFormat)) {
                    d0Var.r(c(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", dateFormatK.getClass().getName()));
                }
                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) dateFormatK;
                DateFormat simpleDateFormat3 = zL ? new SimpleDateFormat(simpleDateFormat2.toPattern(), dVarQ.g()) : (SimpleDateFormat) simpleDateFormat2.clone();
                TimeZone timeZoneJ = dVarQ.j();
                if (timeZoneJ != null && !timeZoneJ.equals(simpleDateFormat3.getTimeZone())) {
                    simpleDateFormat3.setTimeZone(timeZoneJ);
                }
                return A(Boolean.FALSE, simpleDateFormat3);
            }
        }
        return this;
    }

    @Override // p6.p
    public boolean d(p6.d0 d0Var, Object obj) {
        return false;
    }

    protected boolean x(p6.d0 d0Var) {
        Boolean bool = this.f13607c;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.f13608d != null) {
            return false;
        }
        if (d0Var != null) {
            return d0Var.y0(p6.c0.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + c().getName());
    }

    protected void z(Date date, e6.g gVar, p6.d0 d0Var) {
        if (this.f13608d == null) {
            d0Var.L(date, gVar);
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f13609e.getAndSet(null);
        if (dateFormat == null) {
            dateFormat = (DateFormat) this.f13608d.clone();
        }
        gVar.d1(dateFormat.format(date));
        androidx.lifecycle.b.a(this.f13609e, null, dateFormat);
    }
}
