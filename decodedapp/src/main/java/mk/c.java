package mk;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {
    @Override // mk.a
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ int compare(File file, File file2) {
        return super.compare(file, file2);
    }

    @Override // mk.a
    int b(File file, File file2) {
        return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
    }
}
