package ci;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4895a = 74;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4896b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4897c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4898d = "usage: ";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4899e = System.getProperty("line.separator");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4900f = "-";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4901g = "--";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4902h = "arg";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected Comparator f4903i = new a();

    private static class a implements Comparator {
        private a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((h) obj).h().compareToIgnoreCase(((h) obj2).h());
        }
    }

    protected String a(int i10) {
        StringBuffer stringBuffer = new StringBuffer(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    protected int b(String str, int i10, int i11) {
        char cCharAt;
        char cCharAt2;
        int iIndexOf = str.indexOf(10, i11);
        if ((iIndexOf != -1 && iIndexOf <= i10) || ((iIndexOf = str.indexOf(9, i11)) != -1 && iIndexOf <= i10)) {
            return iIndexOf + 1;
        }
        int i12 = i10 + i11;
        if (i12 >= str.length()) {
            return -1;
        }
        int i13 = i12;
        while (i13 >= i11 && (cCharAt2 = str.charAt(i13)) != ' ' && cCharAt2 != '\n' && cCharAt2 != '\r') {
            i13--;
        }
        if (i13 > i11) {
            return i13;
        }
        while (i12 <= str.length() && (cCharAt = str.charAt(i12)) != ' ' && cCharAt != '\n' && cCharAt != '\r') {
            i12++;
        }
        if (i12 == str.length()) {
            return -1;
        }
        return i12;
    }

    public int c() {
        return this.f4897c;
    }

    public int d() {
        return this.f4896b;
    }

    public Comparator e() {
        return this.f4903i;
    }

    public int f() {
        return this.f4895a;
    }

    public void g(PrintWriter printWriter, int i10, k kVar, int i11, int i12) {
        StringBuffer stringBuffer = new StringBuffer();
        h(stringBuffer, i10, kVar, i11, i12);
        printWriter.println(stringBuffer.toString());
    }

    protected StringBuffer h(StringBuffer stringBuffer, int i10, k kVar, int i11, int i12) {
        String strA = a(i11);
        String strA2 = a(i12);
        ArrayList arrayList = new ArrayList();
        List<h> listF = kVar.f();
        Collections.sort(listF, e());
        int i13 = 0;
        int length = 0;
        for (h hVar : listF) {
            StringBuffer stringBuffer2 = new StringBuffer(8);
            if (hVar.j() == null) {
                stringBuffer2.append(strA);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("   ");
                stringBuffer3.append(this.f4901g);
                stringBuffer2.append(stringBuffer3.toString());
                stringBuffer2.append(hVar.i());
            } else {
                stringBuffer2.append(strA);
                stringBuffer2.append(this.f4900f);
                stringBuffer2.append(hVar.j());
                if (hVar.t()) {
                    stringBuffer2.append(',');
                    stringBuffer2.append(this.f4901g);
                    stringBuffer2.append(hVar.i());
                }
            }
            if (hVar.o()) {
                if (hVar.p()) {
                    stringBuffer2.append(" <");
                    stringBuffer2.append(hVar.f());
                    stringBuffer2.append(">");
                } else {
                    stringBuffer2.append(' ');
                }
            }
            arrayList.add(stringBuffer2);
            if (stringBuffer2.length() > length) {
                length = stringBuffer2.length();
            }
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            h hVar2 = (h) it.next();
            int i14 = i13 + 1;
            StringBuffer stringBuffer4 = new StringBuffer(arrayList.get(i13).toString());
            if (stringBuffer4.length() < length) {
                stringBuffer4.append(a(length - stringBuffer4.length()));
            }
            stringBuffer4.append(strA2);
            int i15 = length + i12;
            if (hVar2.g() != null) {
                stringBuffer4.append(hVar2.g());
            }
            i(stringBuffer, i10, i15, stringBuffer4.toString());
            if (it.hasNext()) {
                stringBuffer.append(this.f4899e);
            }
            i13 = i14;
        }
        return stringBuffer;
    }

    protected StringBuffer i(StringBuffer stringBuffer, int i10, int i11, String str) {
        int iB = b(str, i10, 0);
        if (iB == -1) {
            stringBuffer.append(j(str));
            return stringBuffer;
        }
        stringBuffer.append(j(str.substring(0, iB)));
        stringBuffer.append(this.f4899e);
        if (i11 >= i10) {
            i11 = 1;
        }
        String strA = a(i11);
        while (true) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(strA);
            stringBuffer2.append(str.substring(iB).trim());
            str = stringBuffer2.toString();
            iB = b(str, i10, 0);
            if (iB == -1) {
                stringBuffer.append(str);
                return stringBuffer;
            }
            if (str.length() > i10 && iB == i11 - 1) {
                iB = i10;
            }
            stringBuffer.append(j(str.substring(0, iB)));
            stringBuffer.append(this.f4899e);
        }
    }

    protected String j(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        int length = str.length();
        while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
            length--;
        }
        return str.substring(0, length);
    }
}
