package ib;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16002a;

    public c(Bundle bundle) {
        this.f16002a = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f16002a.put(str, bundle.getString(str));
            }
        }
    }

    public String toString() {
        return "BaseData{time=" + ((String) this.f16002a.get("time")) + ", name=" + ((String) this.f16002a.get("interface_name")) + '}';
    }

    public c(HashMap map) {
        this.f16002a = new HashMap(map);
    }
}
