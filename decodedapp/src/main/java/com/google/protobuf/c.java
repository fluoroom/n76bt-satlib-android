package com.google.protobuf;

import com.google.protobuf.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements z1 {
    private static final y EMPTY_REGISTRY = y.b();

    private l1 a(l1 l1Var) throws p0 {
        if (l1Var == null || l1Var.isInitialized()) {
            return l1Var;
        }
        throw b(l1Var).a().j(l1Var);
    }

    private r2 b(l1 l1Var) {
        return l1Var instanceof b ? ((b) l1Var).newUninitializedMessageException() : new r2(l1Var);
    }

    @Override // com.google.protobuf.z1
    public l1 parseDelimitedFrom(InputStream inputStream, y yVar) throws p0 {
        return a(mo1184parsePartialDelimitedFrom(inputStream, yVar));
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialDelimitedFrom */
    public l1 mo1184parsePartialDelimitedFrom(InputStream inputStream, y yVar) throws p0 {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return mo1189parsePartialFrom((InputStream) new b.a.C0133a(inputStream, m.D(i10, inputStream)), yVar);
        } catch (IOException e10) {
            throw new p0(e10);
        }
    }

    @Override // com.google.protobuf.z1
    public l1 parseDelimitedFrom(InputStream inputStream) throws p0 {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialDelimitedFrom */
    public l1 mo1183parsePartialDelimitedFrom(InputStream inputStream) throws p0 {
        return mo1184parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public l1 mo1187parsePartialFrom(m mVar) throws p0 {
        return (l1) parsePartialFrom(mVar, EMPTY_REGISTRY);
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public l1 mo1186parsePartialFrom(l lVar, y yVar) throws p0 {
        m mVarS = lVar.s();
        l1 l1Var = (l1) parsePartialFrom(mVarS, yVar);
        try {
            mVarS.a(0);
            return l1Var;
        } catch (p0 e10) {
            throw e10.j(l1Var);
        }
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(m mVar, y yVar) throws p0 {
        return a((l1) parsePartialFrom(mVar, yVar));
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(m mVar) throws p0 {
        return parseFrom(mVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(l lVar, y yVar) throws p0 {
        return a(mo1186parsePartialFrom(lVar, yVar));
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public l1 mo1185parsePartialFrom(l lVar) throws p0 {
        return mo1186parsePartialFrom(lVar, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(l lVar) throws p0 {
        return parseFrom(lVar, EMPTY_REGISTRY);
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public l1 mo1192parsePartialFrom(byte[] bArr, int i10, int i11, y yVar) throws p0 {
        m mVarM = m.m(bArr, i10, i11);
        l1 l1Var = (l1) parsePartialFrom(mVarM, yVar);
        try {
            mVarM.a(0);
            return l1Var;
        } catch (p0 e10) {
            throw e10.j(l1Var);
        }
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(ByteBuffer byteBuffer, y yVar) throws p0 {
        m mVarJ = m.j(byteBuffer);
        l1 l1Var = (l1) parsePartialFrom(mVarJ, yVar);
        try {
            mVarJ.a(0);
            return a(l1Var);
        } catch (p0 e10) {
            throw e10.j(l1Var);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public l1 mo1191parsePartialFrom(byte[] bArr, int i10, int i11) throws p0 {
        return mo1192parsePartialFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public l1 mo1193parsePartialFrom(byte[] bArr, y yVar) throws p0 {
        return mo1192parsePartialFrom(bArr, 0, bArr.length, yVar);
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(ByteBuffer byteBuffer) throws p0 {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public l1 mo1190parsePartialFrom(byte[] bArr) throws p0 {
        return mo1192parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // 
    /* JADX INFO: renamed from: parseFrom */
    public l1 mo1182parseFrom(byte[] bArr, int i10, int i11, y yVar) throws p0 {
        return a(mo1192parsePartialFrom(bArr, i10, i11, yVar));
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public l1 mo1189parsePartialFrom(InputStream inputStream, y yVar) throws p0 {
        m mVarH = m.h(inputStream);
        l1 l1Var = (l1) parsePartialFrom(mVarH, yVar);
        try {
            mVarH.a(0);
            return l1Var;
        } catch (p0 e10) {
            throw e10.j(l1Var);
        }
    }

    @Override // 
    /* JADX INFO: renamed from: parseFrom */
    public l1 mo1181parseFrom(byte[] bArr, int i10, int i11) throws p0 {
        return mo1182parseFrom(bArr, i10, i11, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(byte[] bArr, y yVar) throws p0 {
        return mo1182parseFrom(bArr, 0, bArr.length, yVar);
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(byte[] bArr) throws p0 {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(InputStream inputStream, y yVar) throws p0 {
        return a(mo1189parsePartialFrom(inputStream, yVar));
    }

    @Override // 
    /* JADX INFO: renamed from: parsePartialFrom */
    public l1 mo1188parsePartialFrom(InputStream inputStream) throws p0 {
        return mo1189parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // com.google.protobuf.z1
    public l1 parseFrom(InputStream inputStream) throws p0 {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }
}
