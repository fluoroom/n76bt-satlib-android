package y7;

import android.util.Log;
import java.util.Locale;
import v7.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f32455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32456d;

    public a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f32454b = string;
        this.f32453a = str;
        this.f32455c = new j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f32453a, i10)) {
            i10++;
        }
        this.f32456d = i10;
    }

    public void a(String str, Object... objArr) {
        if (d(3)) {
            Log.d(this.f32453a, c(str, objArr));
        }
    }

    public void b(String str, Object... objArr) {
        Log.e(this.f32453a, c(str, objArr));
    }

    protected String c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f32454b.concat(str);
    }

    public boolean d(int i10) {
        return this.f32456d <= i10;
    }
}
