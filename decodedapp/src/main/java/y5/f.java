package y5;

import android.content.SharedPreferences;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f32435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f32436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SharedPreferences.Editor f32437c = null;

    private class a implements SharedPreferences.Editor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SharedPreferences.Editor f32438a;

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            this.f32438a.apply();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            return this.f32438a.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return this.f32438a.commit();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            return putString(str, String.valueOf(z10));
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            return putString(str, String.valueOf(f10));
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            return putString(str, String.valueOf(i10));
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            return putString(str, String.valueOf(j10));
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.f32438a.putString(str, f.this.f32436b.b(str2, str));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            throw new UnsupportedOperationException();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            return this.f32438a.remove(str);
        }

        private a() {
            this.f32438a = f.this.f32435a.edit();
        }
    }

    public f(SharedPreferences sharedPreferences, c cVar) {
        this.f32435a = sharedPreferences;
        this.f32436b = cVar;
    }

    public SharedPreferences.Editor c() {
        return new a();
    }

    public int d(String str, int i10) {
        String strE = e(str, null);
        if (strE == null) {
            return i10;
        }
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public String e(String str, String str2) {
        String string = this.f32435a.getString(str, null);
        if (string != null) {
            try {
                return this.f32436b.a(string, str);
            } catch (h unused) {
            }
        }
        return str2;
    }
}
