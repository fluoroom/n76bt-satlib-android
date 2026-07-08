package kh;

import eh.e0;
import java.net.ProtocolException;
import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f19956d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f19957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19959c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final k a(String str) throws ProtocolException {
            e0 e0Var;
            int i10;
            String strSubstring;
            m.e(str, "statusLine");
            if (q.J(str, "HTTP/1.", false, 2, null)) {
                i10 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int iCharAt = str.charAt(7) - '0';
                if (iCharAt == 0) {
                    e0Var = e0.f12387c;
                } else {
                    if (iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    e0Var = e0.f12388d;
                }
            } else if (q.J(str, "ICY ", false, 2, null)) {
                e0Var = e0.f12387c;
                i10 = 4;
            } else {
                if (!q.J(str, "SOURCETABLE ", false, 2, null)) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                e0Var = e0.f12388d;
                i10 = 12;
            }
            int i11 = i10 + 3;
            if (str.length() < i11) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            String strSubstring2 = str.substring(i10, i11);
            m.d(strSubstring2, "substring(...)");
            Integer numP = q.p(strSubstring2);
            if (numP == null) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iIntValue = numP.intValue();
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i10 + 4);
                m.d(strSubstring, "substring(...)");
            }
            return new k(e0Var, iIntValue, strSubstring);
        }

        private a() {
        }
    }

    public k(e0 e0Var, int i10, String str) {
        m.e(e0Var, "protocol");
        m.e(str, "message");
        this.f19957a = e0Var;
        this.f19958b = i10;
        this.f19959c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f19957a == e0.f12387c) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f19958b);
        sb2.append(' ');
        sb2.append(this.f19959c);
        return sb2.toString();
    }
}
