package mk;

import java.io.File;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
class f extends a {
    f() {
    }

    @Override // mk.a
    int b(File file, File file2) {
        return file2.getName().toLowerCase(Locale.getDefault()).compareTo(file.getName().toLowerCase(Locale.getDefault()));
    }
}
