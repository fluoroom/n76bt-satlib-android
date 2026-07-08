package j6;

/* JADX INFO: loaded from: classes.dex */
final class y extends g {
    @Override // j6.g
    long d() {
        return Double.doubleToRawLongBits(Double.NaN);
    }

    @Override // j6.g
    long e() {
        return Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY);
    }

    @Override // j6.g
    long j() {
        return Double.doubleToRawLongBits(Double.POSITIVE_INFINITY);
    }

    @Override // j6.g
    long l(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) {
        double dB = j.b(z10, j10, i12, z11, i13);
        if (Double.isNaN(dB)) {
            dB = Double.parseDouble(charSequence.subSequence(i10, i11).toString());
        }
        return Double.doubleToRawLongBits(dB);
    }

    @Override // j6.g
    long m(CharSequence charSequence, int i10, int i11, boolean z10, long j10, int i12, boolean z11, int i13) {
        double d10 = j.d(z10, j10, i12, z11, i13);
        if (Double.isNaN(d10)) {
            d10 = Double.parseDouble(charSequence.subSequence(i10, i11).toString());
        }
        return Double.doubleToRawLongBits(d10);
    }
}
