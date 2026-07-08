package jb;

import java.io.Writer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class h implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentLinkedQueue f18625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f18626b;

    public h() {
        this.f18625a = null;
        this.f18626b = null;
        this.f18625a = new ConcurrentLinkedQueue();
        this.f18626b = new AtomicInteger(0);
    }

    public int b() {
        return this.f18626b.get();
    }

    public int c(String str) {
        int length = str.length();
        this.f18625a.add(str);
        return this.f18626b.addAndGet(length);
    }

    public void d(Writer writer, char[] cArr) {
        if (writer == null || cArr == null || cArr.length == 0) {
            return;
        }
        int length = cArr.length;
        Iterator it = iterator();
        int i10 = length;
        int i11 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            int length2 = str.length();
            int i12 = 0;
            while (length2 > 0) {
                int i13 = i10 > length2 ? length2 : i10;
                int i14 = i12 + i13;
                str.getChars(i12, i14, cArr, i11);
                i10 -= i13;
                i11 += i13;
                length2 -= i13;
                if (i10 == 0) {
                    try {
                        writer.write(cArr, 0, length);
                    } catch (Exception unused) {
                    }
                    i10 = length;
                    i12 = i14;
                    i11 = 0;
                } else {
                    i12 = i14;
                }
            }
        }
        if (i11 > 0) {
            try {
                writer.write(cArr, 0, i11);
            } catch (Exception unused2) {
            }
        }
        try {
            writer.flush();
        } catch (Exception unused3) {
        }
    }

    public void e() {
        this.f18625a.clear();
        this.f18626b.set(0);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f18625a.iterator();
    }
}
