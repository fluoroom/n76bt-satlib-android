package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.InputStream;
import r2.f0;

/* JADX INFO: loaded from: classes.dex */
public final class k implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f5199a;

    public static final class a implements e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l2.b f5200a;

        public a(l2.b bVar) {
            this.f5200a = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e b(InputStream inputStream) {
            return new k(inputStream, this.f5200a);
        }
    }

    public k(InputStream inputStream, l2.b bVar) {
        f0 f0Var = new f0(inputStream, bVar);
        this.f5199a = f0Var;
        f0Var.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
        this.f5199a.e();
    }

    public void c() {
        this.f5199a.c();
    }

    @Override // com.bumptech.glide.load.data.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f5199a.reset();
        return this.f5199a;
    }
}
