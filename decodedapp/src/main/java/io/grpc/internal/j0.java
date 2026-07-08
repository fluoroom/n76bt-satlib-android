package io.grpc.internal;

import io.grpc.internal.j;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Random f16645a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f16646b = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f16647c = TimeUnit.MINUTES.toNanos(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f16648d = 1.6d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f16649e = 0.2d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f16650f = this.f16646b;

    public static final class a implements j.a {
        @Override // io.grpc.internal.j.a
        public j get() {
            return new j0();
        }
    }

    private long b(double d10, double d11) {
        r9.l.d(d11 >= d10);
        return (long) ((this.f16645a.nextDouble() * (d11 - d10)) + d10);
    }

    @Override // io.grpc.internal.j
    public long a() {
        long j10 = this.f16650f;
        double d10 = j10;
        this.f16650f = Math.min((long) (this.f16648d * d10), this.f16647c);
        double d11 = this.f16649e;
        return j10 + b((-d11) * d10, d11 * d10);
    }
}
