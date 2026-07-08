package mk;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class g extends a {
    g() {
    }

    @Override // mk.a
    int b(File file, File file2) {
        return Long.valueOf(file.length()).compareTo(Long.valueOf(file2.length()));
    }
}
