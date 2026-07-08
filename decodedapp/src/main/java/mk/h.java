package mk;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class h extends a {
    h() {
    }

    @Override // mk.a
    int b(File file, File file2) {
        return Long.valueOf(file2.length()).compareTo(Long.valueOf(file.length()));
    }
}
