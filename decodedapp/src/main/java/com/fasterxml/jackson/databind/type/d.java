package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import i7.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public class d implements Serializable {

    /* JADX INFO: renamed from: a */
    protected final c f7135a;

    static final class a extends StringTokenizer {

        /* JADX INFO: renamed from: a */
        protected final String f7136a;

        /* JADX INFO: renamed from: b */
        protected int f7137b;

        /* JADX INFO: renamed from: c */
        protected String f7138c;

        public a(String str) {
            super(str, "<,>", true);
            this.f7136a = str;
        }

        public String a() {
            return this.f7136a;
        }

        public String b() {
            return this.f7136a.substring(this.f7137b);
        }

        public void c(String str) {
            this.f7138c = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this.f7138c != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this.f7138c;
            if (str != null) {
                this.f7138c = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this.f7137b += strNextToken.length();
            return strNextToken.trim();
        }
    }

    public d(c cVar) {
        this.f7135a = cVar;
    }

    protected IllegalArgumentException a(a aVar, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", aVar.a(), aVar.b(), str));
    }

    protected Class b(String str, a aVar) {
        try {
            return this.f7135a.W(str);
        } catch (Exception e10) {
            h.k0(e10);
            throw a(aVar, "Cannot locate class '" + str + "', problem: " + e10.getMessage());
        }
    }

    public JavaType c(String str) {
        a aVar = new a(str.trim());
        JavaType javaTypeD = d(aVar);
        if (aVar.hasMoreTokens()) {
            throw a(aVar, "Unexpected tokens after complete type");
        }
        return javaTypeD;
    }

    protected JavaType d(a aVar) {
        if (!aVar.hasMoreTokens()) {
            throw a(aVar, "Unexpected end-of-string");
        }
        Class clsB = b(aVar.nextToken(), aVar);
        if (aVar.hasMoreTokens()) {
            String strNextToken = aVar.nextToken();
            if ("<".equals(strNextToken)) {
                return this.f7135a.i(null, clsB, b.d(clsB, e(aVar)));
            }
            aVar.c(strNextToken);
        }
        return this.f7135a.i(null, clsB, b.i());
    }

    protected List e(a aVar) {
        ArrayList arrayList = new ArrayList();
        while (aVar.hasMoreTokens()) {
            arrayList.add(d(aVar));
            if (!aVar.hasMoreTokens()) {
                break;
            }
            String strNextToken = aVar.nextToken();
            if (">".equals(strNextToken)) {
                return arrayList;
            }
            if (!",".equals(strNextToken)) {
                throw a(aVar, "Unexpected token '" + strNextToken + "', expected ',' or '>')");
            }
        }
        throw a(aVar, "Unexpected end-of-string");
    }
}
