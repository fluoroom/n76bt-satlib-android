package net.openid.appauth;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
abstract class o {

    static final class a extends b {
        a(String str, boolean z10) {
            super(str, Boolean.valueOf(z10));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.o.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
    }

    static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f22896b;

        b(String str, Object obj) {
            this.f22895a = str;
            this.f22896b = obj;
        }

        abstract Object a(String str);
    }

    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f22898b;

        c(String str, List list) {
            this.f22897a = str;
            this.f22898b = list;
        }
    }

    static final class d extends b {
        d(String str, String str2) {
            super(str, str2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.o.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a(String str) {
            return str;
        }

        d(String str) {
            this(str, null);
        }
    }

    static final class e extends c {
        e(String str) {
            super(str, null);
        }

        e(String str, List list) {
            super(str, list);
        }
    }

    static final class f extends b {
        f(String str, Uri uri) {
            super(str, uri);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // net.openid.appauth.o.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Uri a(String str) {
            return Uri.parse(str);
        }

        f(String str) {
            this(str, null);
        }
    }

    public static Object a(JSONObject jSONObject, b bVar) {
        try {
            return !jSONObject.has(bVar.f22895a) ? bVar.f22896b : bVar.a(jSONObject.getString(bVar.f22895a));
        } catch (JSONException e10) {
            throw new IllegalStateException("unexpected JSONException", e10);
        }
    }

    public static JSONObject b(JSONObject jSONObject, String str) throws JSONException {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Long c(JSONObject jSONObject, String str) {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public static String d(JSONObject jSONObject, String str) throws JSONException {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            throw new JSONException("field \"" + str + "\" not found in json object");
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static String e(JSONObject jSONObject, String str) throws JSONException {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static List f(JSONObject jSONObject, String str) throws JSONException {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (jSONObject.has(str)) {
            return x(jSONObject.getJSONArray(str));
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    public static List g(JSONObject jSONObject, String str) throws JSONException {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        if (jSONArray != null) {
            return x(jSONArray);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Map h(JSONObject jSONObject, String str) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, (String) ah.h.e(jSONObject2.getString(next), "additional parameter values must not be null"));
            }
        }
        return linkedHashMap;
    }

    public static Uri i(JSONObject jSONObject, String str) throws JSONException {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static Uri j(JSONObject jSONObject, String str) throws JSONException {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException("field \"" + str + "\" is mapped to a null value");
    }

    public static List k(JSONObject jSONObject, String str) throws JSONException {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (jSONObject.has(str)) {
            return y(jSONObject.getJSONArray(str));
        }
        throw new JSONException("field \"" + str + "\" not found in json object");
    }

    public static JSONObject l(Map map) {
        ah.h.d(map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            ah.h.e((String) entry.getKey(), "map entries must not have null keys");
            ah.h.e((String) entry.getValue(), "map entries must not have null values");
            n(jSONObject, (String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject;
    }

    public static void m(JSONObject jSONObject, String str, int i10) {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        ah.h.e(Integer.valueOf(i10), "value must not be null");
        try {
            jSONObject.put(str, i10);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void n(JSONObject jSONObject, String str, String str2) {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        ah.h.e(str2, "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void o(JSONObject jSONObject, String str, JSONArray jSONArray) {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        ah.h.e(jSONArray, "value must not be null");
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void p(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        ah.h.e(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void q(JSONObject jSONObject, String str, Uri uri) {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (uri == null) {
            return;
        }
        try {
            jSONObject.put(str, uri.toString());
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void r(JSONObject jSONObject, String str, Long l10) {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (l10 == null) {
            return;
        }
        try {
            jSONObject.put(str, l10);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void s(JSONObject jSONObject, String str, String str2) {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static void t(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        ah.h.e(jSONObject, "json must not be null");
        ah.h.e(str, "field must not be null");
        if (jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e10) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e10);
        }
    }

    public static JSONArray u(Iterable iterable) {
        ah.h.e(iterable, "objects cannot be null");
        JSONArray jSONArray = new JSONArray();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toString());
        }
        return jSONArray;
    }

    public static List v(JSONArray jSONArray) throws JSONException {
        ah.h.e(jSONArray, "jsonArray must not be null");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objW = jSONArray.get(i10);
            if (objW instanceof JSONArray) {
                objW = v((JSONArray) objW);
            } else if (objW instanceof JSONObject) {
                objW = w((JSONObject) objW);
            }
            arrayList.add(objW);
        }
        return arrayList;
    }

    public static Map w(JSONObject jSONObject) throws JSONException {
        ah.h.e(jSONObject, "json must not be null");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objW = jSONObject.get(next);
            if (objW instanceof JSONArray) {
                objW = v((JSONArray) objW);
            } else if (objW instanceof JSONObject) {
                objW = w((JSONObject) objW);
            }
            map.put(next, objW);
        }
        return map;
    }

    public static List x(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(ah.h.d(jSONArray.get(i10)).toString());
            }
        }
        return arrayList;
    }

    public static List y(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(Uri.parse(ah.h.d(jSONArray.get(i10)).toString()));
            }
        }
        return arrayList;
    }
}
