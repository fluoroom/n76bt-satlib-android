package t0;

import android.util.AndroidRuntimeException;
import t0.e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e {
    private j B;
    private float C;
    private boolean D;

    public i(g gVar) {
        super(gVar);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }

    private void w() {
        j jVar = this.B;
        if (jVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dB = jVar.b();
        if (dB > this.f27427g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dB < this.f27428h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    @Override // t0.e
    public void q() {
        w();
        this.B.i(g());
        super.q();
    }

    @Override // t0.e
    boolean s(long j10) {
        if (this.D) {
            float f10 = this.C;
            if (f10 != Float.MAX_VALUE) {
                this.B.g(f10);
                this.C = Float.MAX_VALUE;
            }
            this.f27422b = this.B.b();
            this.f27421a = 0.0f;
            this.D = false;
            return true;
        }
        if (this.C != Float.MAX_VALUE) {
            long j11 = j10 / 2;
            e.p pVarJ = this.B.j(this.f27422b, this.f27421a, j11);
            this.B.g(this.C);
            this.C = Float.MAX_VALUE;
            e.p pVarJ2 = this.B.j(pVarJ.f27436a, pVarJ.f27437b, j11);
            this.f27422b = pVarJ2.f27436a;
            this.f27421a = pVarJ2.f27437b;
        } else {
            e.p pVarJ3 = this.B.j(this.f27422b, this.f27421a, j10);
            this.f27422b = pVarJ3.f27436a;
            this.f27421a = pVarJ3.f27437b;
        }
        float fMax = Math.max(this.f27422b, this.f27428h);
        this.f27422b = fMax;
        float fMin = Math.min(fMax, this.f27427g);
        this.f27422b = fMin;
        if (!v(fMin, this.f27421a)) {
            return false;
        }
        this.f27422b = this.B.b();
        this.f27421a = 0.0f;
        return true;
    }

    public void t(float f10) {
        if (h()) {
            this.C = f10;
            return;
        }
        if (this.B == null) {
            this.B = new j(f10);
        }
        this.B.g(f10);
        q();
    }

    public boolean u() {
        return this.B.f27441b > 0.0d;
    }

    boolean v(float f10, float f11) {
        return this.B.e(f10, f11);
    }

    public i x(j jVar) {
        this.B = jVar;
        return this;
    }

    public void y() {
        if (!u()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f27426f) {
            this.D = true;
        }
    }

    public i(Object obj, f fVar) {
        super(obj, fVar);
        this.B = null;
        this.C = Float.MAX_VALUE;
        this.D = false;
    }

    @Override // t0.e
    void p(float f10) {
    }
}
