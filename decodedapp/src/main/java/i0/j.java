package i0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocaleList f15659a;

    j(Object obj) {
        this.f15659a = i.a(obj);
    }

    @Override // i0.h
    public String a() {
        return this.f15659a.toLanguageTags();
    }

    @Override // i0.h
    public Object b() {
        return this.f15659a;
    }

    public boolean equals(Object obj) {
        return this.f15659a.equals(((h) obj).b());
    }

    @Override // i0.h
    public Locale get(int i10) {
        return this.f15659a.get(i10);
    }

    public int hashCode() {
        return this.f15659a.hashCode();
    }

    @Override // i0.h
    public boolean isEmpty() {
        return this.f15659a.isEmpty();
    }

    @Override // i0.h
    public int size() {
        return this.f15659a.size();
    }

    public String toString() {
        return this.f15659a.toString();
    }
}
