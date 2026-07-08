package mk;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class d extends a {
    d() {
    }

    @Override // mk.a
    int b(File file, File file2) {
        return Long.valueOf(file2.lastModified()).compareTo(Long.valueOf(file.lastModified()));
    }
}
