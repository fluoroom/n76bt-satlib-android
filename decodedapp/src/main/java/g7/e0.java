package g7;

import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    public static class a extends h0 {
    }

    public static class b extends h0 {
    }

    public static class c extends h0 {
    }

    public static Collection a() {
        HashMap map = new HashMap();
        map.put(URL.class, new m0(URL.class));
        map.put(URI.class, new m0(URI.class));
        map.put(Currency.class, new m0(Currency.class));
        map.put(UUID.class, new p0());
        map.put(Pattern.class, new m0(Pattern.class));
        map.put(Locale.class, new m0(Locale.class));
        map.put(AtomicBoolean.class, a.class);
        map.put(AtomicInteger.class, b.class);
        map.put(AtomicLong.class, c.class);
        map.put(File.class, o.class);
        map.put(Class.class, i.class);
        u uVar = u.f13642c;
        map.put(Void.class, uVar);
        map.put(Void.TYPE, uVar);
        return map.entrySet();
    }
}
