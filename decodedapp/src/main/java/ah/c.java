package ah;

import android.content.Intent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public abstract String a();

    public abstract JSONObject b();

    public String c() {
        return b().toString();
    }

    public abstract Intent d();
}
