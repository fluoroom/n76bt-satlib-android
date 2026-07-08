package uh;

import dd.d0;
import java.io.EOFException;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePack;
import rd.m;
import rg.d;
import rg.q;
import vh.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    private static final char[] f29153a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static final String a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        m.e(str, "<this>");
        m.e(str2, "encodeSet");
        return d(str, i10, i11, str2, z10, z11, z12, z13, null, 128, null);
    }

    public static /* synthetic */ String b(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        return a(str, i10, i11, str2, z10, z11, z12, z13);
    }

    public static final String c(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        m.e(str, "<this>");
        m.e(str2, "encodeSet");
        int iCharCount = i10;
        while (iCharCount < i11) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || q.O(str2, (char) iCodePointAt, false, 2, null) || ((iCodePointAt == 37 && (!z10 || (z11 && !e(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                e eVar = new e();
                eVar.M(str, i10, iCharCount);
                h(eVar, str, iCharCount, i11, str2, z10, z11, z12, z13, charset);
                return eVar.w0();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i10, i11);
        m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String d(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        if ((i12 & 32) != 0) {
            z12 = false;
        }
        if ((i12 & 64) != 0) {
            z13 = false;
        }
        if ((i12 & 128) != 0) {
            charset = null;
        }
        return c(str, i10, i11, str2, z10, z11, z12, z13, charset);
    }

    public static final boolean e(String str, int i10, int i11) {
        m.e(str, "<this>");
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && fh.m.z(str.charAt(i10 + 1)) != -1 && fh.m.z(str.charAt(i12)) != -1;
    }

    public static final String f(String str, int i10, int i11, boolean z10) {
        m.e(str, "<this>");
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (cCharAt == '+' && z10)) {
                e eVar = new e();
                eVar.M(str, i10, i12);
                i(eVar, str, i12, i11, z10);
                return eVar.w0();
            }
        }
        String strSubstring = str.substring(i10, i11);
        m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String g(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return f(str, i10, i11, z10);
    }

    public static final void h(e eVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) throws EOFException {
        m.e(eVar, "<this>");
        m.e(str, "input");
        m.e(str2, "encodeSet");
        e eVar2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (z10 && (iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13)) {
                d0 d0Var = d0.f10897a;
            } else {
                if (iCodePointAt == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                    eVar.J("+");
                } else if (iCodePointAt == 43 && z12) {
                    eVar.J(z10 ? "+" : "%2B");
                } else if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z13) || q.O(str2, (char) iCodePointAt, false, 2, null) || (iCodePointAt == 37 && (!z10 || (z11 && !e(str, i10, i11)))))) {
                    if (eVar2 == null) {
                        eVar2 = new e();
                    }
                    if (charset == null || m.a(charset, d.f26007b)) {
                        eVar2.t(iCodePointAt);
                    } else {
                        eVar2.L0(str, i10, Character.charCount(iCodePointAt) + i10, charset);
                    }
                    while (!eVar2.z()) {
                        byte b10 = eVar2.readByte();
                        int i12 = b10 & MessagePack.Code.EXT_TIMESTAMP;
                        eVar.writeByte(37);
                        char[] cArr = f29153a;
                        eVar.writeByte(cArr[(i12 >> 4) & 15]);
                        eVar.writeByte(cArr[b10 & 15]);
                    }
                    d0 d0Var2 = d0.f10897a;
                } else {
                    eVar.t(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    public static final void i(e eVar, String str, int i10, int i11, boolean z10) {
        int i12;
        m.e(eVar, "<this>");
        m.e(str, "encoded");
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (iCodePointAt == 37 && (i12 = i10 + 2) < i11) {
                int iZ = fh.m.z(str.charAt(i10 + 1));
                int iZ2 = fh.m.z(str.charAt(i12));
                if (iZ == -1 || iZ2 == -1) {
                    eVar.t(iCodePointAt);
                    i10 += Character.charCount(iCodePointAt);
                } else {
                    eVar.writeByte((iZ << 4) + iZ2);
                    i10 = Character.charCount(iCodePointAt) + i12;
                }
            } else if (iCodePointAt == 43 && z10) {
                eVar.writeByte(32);
                i10++;
            } else {
                eVar.t(iCodePointAt);
                i10 += Character.charCount(iCodePointAt);
            }
        }
    }
}
