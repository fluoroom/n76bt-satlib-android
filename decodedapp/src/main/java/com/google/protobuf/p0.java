package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class p0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l1 f9274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9275b;

    public static class a extends p0 {
        public a(String str) {
            super(str);
        }
    }

    public p0(String str) {
        super(str);
        this.f9274a = null;
    }

    static p0 a() {
        return new p0("Protocol message end-group tag did not match expected tag.");
    }

    static p0 b() {
        return new p0("Protocol message contained an invalid tag (zero).");
    }

    static p0 c() {
        return new p0("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static p0 e() {
        return new p0("CodedInputStream encountered a malformed varint.");
    }

    static p0 f() {
        return new p0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static p0 g() {
        return new p0("Failed to parse the message.");
    }

    static p0 h() {
        return new p0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static p0 k() {
        return new p0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static p0 l() {
        return new p0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    void i() {
        this.f9275b = true;
    }

    public p0 j(l1 l1Var) {
        this.f9274a = l1Var;
        return this;
    }

    public IOException n() {
        return getCause() instanceof IOException ? (IOException) getCause() : this;
    }

    public p0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f9274a = null;
    }
}
