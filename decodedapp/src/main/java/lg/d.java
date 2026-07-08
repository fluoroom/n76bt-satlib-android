package lg;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20579c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f20580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20581b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends ed.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20582c = -1;

        b() {
        }

        @Override // ed.c
        protected void c() {
            do {
                int i10 = this.f20582c + 1;
                this.f20582c = i10;
                if (i10 >= d.this.f20580a.length) {
                    break;
                }
            } while (d.this.f20580a[this.f20582c] == null);
            if (this.f20582c >= d.this.f20580a.length) {
                d();
                return;
            }
            Object obj = d.this.f20580a[this.f20582c];
            rd.m.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
            e(obj);
        }
    }

    private d(Object[] objArr, int i10) {
        super(null);
        this.f20580a = objArr;
        this.f20581b = i10;
    }

    private final void e(int i10) {
        Object[] objArr = this.f20580a;
        if (objArr.length > i10) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i10);
        Object[] objArrCopyOf = Arrays.copyOf(this.f20580a, length);
        rd.m.d(objArrCopyOf, "copyOf(...)");
        this.f20580a = objArrCopyOf;
    }

    @Override // lg.c
    public int b() {
        return this.f20581b;
    }

    @Override // lg.c
    public void c(int i10, Object obj) {
        rd.m.e(obj, "value");
        e(i10);
        if (this.f20580a[i10] == null) {
            this.f20581b = b() + 1;
        }
        this.f20580a[i10] = obj;
    }

    @Override // lg.c
    public Object get(int i10) {
        return ed.j.J(this.f20580a, i10);
    }

    @Override // lg.c, java.lang.Iterable
    public Iterator iterator() {
        return new b();
    }

    public d() {
        this(new Object[20], 0);
    }
}
