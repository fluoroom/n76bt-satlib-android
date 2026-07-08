package r2;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements i2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f25338a;

    public e0(s sVar) {
        this.f25338a = sVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // i2.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, i2.h hVar) {
        return this.f25338a.d(parcelFileDescriptor, i10, i11, hVar);
    }

    @Override // i2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, i2.h hVar) {
        return e(parcelFileDescriptor) && this.f25338a.o(parcelFileDescriptor);
    }
}
