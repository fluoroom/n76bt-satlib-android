package z4;

import com.dw.ht.d0;
import eh.i0;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final dk.a0 f33001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f33002c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f33000a = new y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f33003d = "https://api.tianditu.gov.cn";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.gson.f f33004e = new com.google.gson.f();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lz4/y$a;", "", "", "postStr", "Ldk/d;", "Leh/i0;", "a", "(Ljava/lang/String;)Ldk/d;", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        @ek.f("v2/search")
        dk.d<i0> a(@ek.t("postStr") String postStr);
    }

    public interface b {
    }

    public static final class c {
    }

    static {
        dk.a0 a0VarC = d0.f5647a.c(f33003d);
        f33001b = a0VarC;
        Object objB = a0VarC.b(a.class);
        rd.m.d(objB, "create(...)");
        f33002c = (a) objB;
    }

    private y() {
    }

    public final c a(String str) throws JSONException {
        rd.m.e(str, "keyWord");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("keyWord", str);
        jSONObject.put("mapBound", "-180,-90,180,90");
        jSONObject.put("level", "18");
        jSONObject.put("queryType", "1");
        jSONObject.put("start", "0");
        jSONObject.put("count", "20");
        a aVar = f33002c;
        String string = jSONObject.toString();
        rd.m.d(string, "toString(...)");
        i0 i0Var = (i0) aVar.a(string).l().a();
        if (i0Var == null) {
            return null;
        }
        String str2 = new String(i0Var.bytes(), rg.d.f26007b);
        System.out.println((Object) ("搜索" + str + "\n---------------\n" + str2));
        android.support.v4.media.session.b.a(f33004e.j(str2, c.class));
        return null;
    }
}
