package j6;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends g {
    @Override // j6.g
    long d() {
        return Float.floatToRawIntBits(Float.NaN);
    }

    @Override // j6.g
    long e() {
        return Float.floatToRawIntBits(Float.NEGATIVE_INFINITY);
    }

    @Override // j6.g
    long j() {
        return Float.floatToRawIntBits(Float.POSITIVE_INFINITY);
    }

    @Override // j6.g
    long l(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) {
        float fB = l.b(z10, j10, i12, z11, i13);
        if (Float.isNaN(fB)) {
            fB = Float.parseFloat(charSequence.subSequence(i10, i11).toString());
        }
        return Float.floatToRawIntBits(fB);
    }

    @Override // j6.g
    long m(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) {
        float fD = l.d(z10, j10, i12, z11, i13);
        if (Float.isNaN(fD)) {
            fD = Float.parseFloat(charSequence.subSequence(i10, i11).toString());
        }
        return Float.floatToRawIntBits(fD);
    }
}
