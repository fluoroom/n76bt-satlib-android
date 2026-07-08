package com.google.gson.internal.bind;

import com.google.gson.p;
import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends ca.c {
    private static final Writer A = new a();
    private static final p B = new p("closed");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final List f8705x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f8706y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private com.google.gson.k f8707z;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public g() {
        super(A);
        this.f8705x = new ArrayList();
        this.f8707z = com.google.gson.m.f8816a;
    }

    private com.google.gson.k F0() {
        return (com.google.gson.k) this.f8705x.get(r0.size() - 1);
    }

    private void G0(com.google.gson.k kVar) {
        if (this.f8706y != null) {
            if (!kVar.h() || s()) {
                ((com.google.gson.n) F0()).l(this.f8706y, kVar);
            }
            this.f8706y = null;
            return;
        }
        if (this.f8705x.isEmpty()) {
            this.f8707z = kVar;
            return;
        }
        com.google.gson.k kVarF0 = F0();
        if (!(kVarF0 instanceof com.google.gson.h)) {
            throw new IllegalStateException();
        }
        ((com.google.gson.h) kVarF0).l(kVar);
    }

    @Override // ca.c
    public ca.c A0(Number number) {
        if (number == null) {
            return S();
        }
        if (!x()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        G0(new p(number));
        return this;
    }

    @Override // ca.c
    public ca.c B0(String str) {
        if (str == null) {
            return S();
        }
        G0(new p(str));
        return this;
    }

    @Override // ca.c
    public ca.c C0(boolean z10) {
        G0(new p(Boolean.valueOf(z10)));
        return this;
    }

    public com.google.gson.k E0() {
        if (this.f8705x.isEmpty()) {
            return this.f8707z;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f8705x);
    }

    @Override // ca.c
    public ca.c G(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f8705x.isEmpty() || this.f8706y != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(F0() instanceof com.google.gson.n)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f8706y = str;
        return this;
    }

    @Override // ca.c
    public ca.c S() {
        G0(com.google.gson.m.f8816a);
        return this;
    }

    @Override // ca.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f8705x.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f8705x.add(B);
    }

    @Override // ca.c, java.io.Flushable
    public void flush() {
    }

    @Override // ca.c
    public ca.c k() {
        com.google.gson.h hVar = new com.google.gson.h();
        G0(hVar);
        this.f8705x.add(hVar);
        return this;
    }

    @Override // ca.c
    public ca.c l() {
        com.google.gson.n nVar = new com.google.gson.n();
        G0(nVar);
        this.f8705x.add(nVar);
        return this;
    }

    @Override // ca.c
    public ca.c q() {
        if (this.f8705x.isEmpty() || this.f8706y != null) {
            throw new IllegalStateException();
        }
        if (!(F0() instanceof com.google.gson.h)) {
            throw new IllegalStateException();
        }
        this.f8705x.remove(r0.size() - 1);
        return this;
    }

    @Override // ca.c
    public ca.c r() {
        if (this.f8705x.isEmpty() || this.f8706y != null) {
            throw new IllegalStateException();
        }
        if (!(F0() instanceof com.google.gson.n)) {
            throw new IllegalStateException();
        }
        this.f8705x.remove(r0.size() - 1);
        return this;
    }

    @Override // ca.c
    public ca.c x0(double d10) {
        if (x() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            G0(new p(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // ca.c
    public ca.c y0(long j10) {
        G0(new p(Long.valueOf(j10)));
        return this;
    }

    @Override // ca.c
    public ca.c z0(Boolean bool) {
        if (bool == null) {
            return S();
        }
        G0(new p(bool));
        return this;
    }
}
