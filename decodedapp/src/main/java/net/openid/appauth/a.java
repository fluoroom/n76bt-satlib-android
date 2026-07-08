package net.openid.appauth;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
abstract class a {
    static Set a(String... strArr) {
        return (strArr == null || strArr.length == 0) ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    static Map b(Map map, Set set) {
        if (map == null) {
            return Collections.EMPTY_MAP;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            ah.h.e(str, "additional parameter keys cannot be null");
            ah.h.e(str2, "additional parameter values cannot be null");
            ah.h.b(!set.contains(str), "Parameter %s is directly supported via the authorization request builder, use the builder method instead", str);
            linkedHashMap.put(str, str2);
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    static Map c(Uri uri, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!set.contains(str)) {
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return linkedHashMap;
    }

    static Map d(JSONObject jSONObject, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!set.contains(next)) {
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
        }
        return linkedHashMap;
    }
}
