package rg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class i implements Iterator, sd.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f26058f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f26059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26063e;

    private static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public i(CharSequence charSequence) {
        rd.m.e(charSequence, "string");
        this.f26059a = charSequence;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f26060b = 0;
        int i10 = this.f26062d;
        int i11 = this.f26061c;
        this.f26061c = this.f26063e + i10;
        return this.f26059a.subSequence(i11, i10).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10;
        int i11;
        int i12 = this.f26060b;
        if (i12 != 0) {
            return i12 == 1;
        }
        if (this.f26063e < 0) {
            this.f26060b = 2;
            return false;
        }
        int length = this.f26059a.length();
        int length2 = this.f26059a.length();
        for (int i13 = this.f26061c; i13 < length2; i13++) {
            char cCharAt = this.f26059a.charAt(i13);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i10 = (cCharAt == '\r' && (i11 = i13 + 1) < this.f26059a.length() && this.f26059a.charAt(i11) == '\n') ? 2 : 1;
                length = i13;
                this.f26060b = 1;
                this.f26063e = i10;
                this.f26062d = length;
                return true;
            }
        }
        i10 = -1;
        this.f26060b = 1;
        this.f26063e = i10;
        this.f26062d = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
