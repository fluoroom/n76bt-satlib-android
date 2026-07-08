package o2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f23080b;

    private static final class a implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23081a;

        a(Context context) {
            this.f23081a = context;
        }

        @Override // o2.f.e
        public Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // o2.o
        public n d(r rVar) {
            return new f(this.f23081a, this);
        }

        @Override // o2.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // o2.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    private static final class c implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23083a;

        c(Context context) {
            this.f23083a = context;
        }

        @Override // o2.f.e
        public Class a() {
            return InputStream.class;
        }

        @Override // o2.o
        public n d(r rVar) {
            return new f(this.f23083a, this);
        }

        @Override // o2.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // o2.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    private interface e {
        Class a();

        void b(Object obj);

        Object c(Resources.Theme theme, Resources resources, int i10);
    }

    f(Context context, e eVar) {
        this.f23079a = context.getApplicationContext();
        this.f23080b = eVar;
    }

    public static o c(Context context) {
        return new a(context);
    }

    public static o e(Context context) {
        return new b(context);
    }

    public static o g(Context context) {
        return new c(context);
    }

    @Override // o2.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public n.a b(Integer num, int i10, int i11, i2.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.c(t2.g.f27461b);
        return new n.a(new d3.b(num), new d(theme, theme != null ? theme.getResources() : this.f23079a.getResources(), this.f23080b, num.intValue()));
    }

    @Override // o2.n
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    private static final class d implements com.bumptech.glide.load.data.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources.Theme f23084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Resources f23085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e f23086c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f23087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f23088e;

        d(Resources.Theme theme, Resources resources, e eVar, int i10) {
            this.f23084a = theme;
            this.f23085b = resources;
            this.f23086c = eVar;
            this.f23087d = i10;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return this.f23086c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Object obj = this.f23088e;
            if (obj != null) {
                try {
                    this.f23086c.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public i2.a d() {
            return i2.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            try {
                Object objC = this.f23086c.c(this.f23084a, this.f23085b, this.f23087d);
                this.f23088e = objC;
                aVar.f(objC);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }

    private static final class b implements o, e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f23082a;

        b(Context context) {
            this.f23082a = context;
        }

        @Override // o2.f.e
        public Class a() {
            return Drawable.class;
        }

        @Override // o2.o
        public n d(r rVar) {
            return new f(this.f23082a, this);
        }

        @Override // o2.f.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return t2.d.a(this.f23082a, i10, theme);
        }

        @Override // o2.f.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) {
        }
    }
}
