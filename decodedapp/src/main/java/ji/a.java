package ji;

import hi.b;
import hi.c;
import hi.e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f18869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f18870f;

    public a(e eVar, int i10) {
        super(eVar);
        this.f18870f = new HashMap();
        byte[] bArrA = eVar.a();
        int iF = f(bArrA, i10);
        int i11 = i10 + 4;
        this.f18869e = c.h(bArrA, i11, iF);
        int i12 = i11 + iF;
        int iF2 = f(bArrA, i12);
        int i13 = i12 + 4;
        for (int i14 = 0; i14 < iF2; i14++) {
            int iF3 = f(bArrA, i13);
            int i15 = i13 + 4;
            String strH = c.h(bArrA, i15, iF3);
            i13 = i15 + iF3;
            int iIndexOf = strH.indexOf(61);
            if (iIndexOf == -1) {
                System.err.println("Warning - unable to parse comment '" + strH + "'");
            } else {
                d(h(strH.substring(0, iIndexOf)), strH.substring(iIndexOf + 1));
            }
        }
        if (i13 < bArrA.length && g() && bArrA[i13] == 0) {
            throw new IllegalArgumentException("Framing bit not set, invalid");
        }
    }

    protected static String h(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (char c10 : str.toLowerCase(Locale.ROOT).toCharArray()) {
            if (c10 >= ' ' && c10 <= '}' && c10 != '=') {
                stringBuffer.append(c10);
            }
        }
        return stringBuffer.toString();
    }

    @Override // hi.b
    public e c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(new byte[e()]);
            c.r(byteArrayOutputStream, this.f18869e);
            Iterator it = this.f18870f.values().iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((List) it.next()).size();
            }
            c.q(byteArrayOutputStream, size);
            String[] strArr = (String[]) this.f18870f.keySet().toArray(new String[this.f18870f.size()]);
            Arrays.sort(strArr);
            for (String str : strArr) {
                Iterator it2 = ((List) this.f18870f.get(str)).iterator();
                while (it2.hasNext()) {
                    c.r(byteArrayOutputStream, str + '=' + ((String) it2.next()));
                }
            }
            i(byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            j(byteArray, byteArray.length);
            b(byteArray);
            return super.c();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void d(String str, String str2) {
        String strH = h(str);
        if (!this.f18870f.containsKey(strH)) {
            this.f18870f.put(strH, new ArrayList());
        }
        ((List) this.f18870f.get(strH)).add(str2);
    }

    protected abstract int e();

    protected int f(byte[] bArr, int i10) {
        return (int) c.g(bArr, i10);
    }

    protected abstract boolean g();

    protected abstract void i(OutputStream outputStream);

    protected abstract void j(byte[] bArr, int i10);

    public void k(String str) {
        this.f18869e = str;
    }

    public a() {
        this.f18870f = new HashMap();
        this.f18869e = "Gagravarr.org Java Vorbis Tools v0.8 20160217";
    }
}
