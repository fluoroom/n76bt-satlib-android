package hf;

import ed.j0;
import ed.q;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends jf.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0215a f15342g = new C0215a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f15343h = new a(1, 0, 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f15344i = new a(new int[0]);

    /* JADX INFO: renamed from: hf.a$a, reason: collision with other inner class name */
    public static final class C0215a {
        public /* synthetic */ C0215a(h hVar) {
            this();
        }

        public final a a(InputStream inputStream) {
            m.e(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            xd.c cVar = new xd.c(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(q.v(cVar, 10));
            Iterator it = cVar.iterator();
            while (it.hasNext()) {
                ((j0) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrG0 = q.G0(arrayList);
            return new a(Arrays.copyOf(iArrG0, iArrG0.length));
        }

        private C0215a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        m.e(iArr, "numbers");
    }

    public boolean h() {
        return f(f15343h);
    }
}
