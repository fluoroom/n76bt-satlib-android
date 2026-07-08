package j$.util;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class Optional<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Optional f17694b = new Optional();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17695a;

    public Optional() {
        this.f17695a = null;
    }

    public Optional(Object obj) {
        this.f17695a = Objects.requireNonNull(obj);
    }

    public static <T> Optional<T> ofNullable(T t10) {
        if (t10 != null) {
            return new Optional<>(t10);
        }
        return f17694b;
    }

    public T get() {
        T t10 = (T) this.f17695a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public boolean isPresent() {
        return this.f17695a != null;
    }

    public T orElse(T t10) {
        T t11 = (T) this.f17695a;
        return t11 != null ? t11 : t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.f17695a, ((Optional) obj).f17695a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f17695a);
    }

    public final String toString() {
        Object obj = this.f17695a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
