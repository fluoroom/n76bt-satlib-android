package mk;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Comparator {
    a() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        if (file.isDirectory() && !file2.isDirectory()) {
            return -1;
        }
        if (file.isDirectory() || !file2.isDirectory()) {
            return b(file, file2);
        }
        return 1;
    }

    abstract int b(File file, File file2);
}
