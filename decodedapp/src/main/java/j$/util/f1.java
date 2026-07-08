package j$.util;

import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f1 implements Iterator, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17802a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Spliterator f17804c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public f1(Spliterator spliterator) {
        this.f17804c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f17802a = true;
        this.f17803b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f17802a) {
            this.f17804c.tryAdvance(this);
        }
        return this.f17802a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f17802a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f17802a = false;
        return this.f17803b;
    }
}
