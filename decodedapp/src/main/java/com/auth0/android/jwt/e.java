package com.auth0.android.jwt;

import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class e implements j {
    e() {
    }

    private Date c(n nVar, String str) {
        if (nVar.p(str)) {
            return new Date(nVar.o(str).e() * 1000);
        }
        return null;
    }

    private String d(n nVar, String str) {
        if (nVar.p(str)) {
            return nVar.o(str).f();
        }
        return null;
    }

    private List e(n nVar, String str) {
        List list = Collections.EMPTY_LIST;
        if (!nVar.p(str)) {
            return list;
        }
        k kVarO = nVar.o(str);
        if (!kVarO.g()) {
            return Collections.singletonList(kVarO.f());
        }
        h hVarB = kVarO.b();
        ArrayList arrayList = new ArrayList(hVarB.size());
        for (int i10 = 0; i10 < hVarB.size(); i10++) {
            arrayList.add(hVarB.m(i10).f());
        }
        return arrayList;
    }

    @Override // com.google.gson.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f a(k kVar, Type type, i iVar) {
        if (kVar.h() || !kVar.i()) {
            throw new d("The token's payload had an invalid JSON format.");
        }
        n nVarC = kVar.c();
        String strD = d(nVarC, "iss");
        String strD2 = d(nVarC, "sub");
        Date dateC = c(nVarC, "exp");
        Date dateC2 = c(nVarC, "nbf");
        Date dateC3 = c(nVarC, "iat");
        String strD3 = d(nVarC, "jti");
        List listE = e(nVarC, "aud");
        HashMap map = new HashMap();
        for (Map.Entry entry : nVarC.m()) {
            map.put(entry.getKey(), new c((k) entry.getValue()));
        }
        return new f(strD, strD2, dateC, dateC2, dateC3, strD3, listE, map);
    }
}
