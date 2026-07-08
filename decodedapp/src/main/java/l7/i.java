package l7;

import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20505a = 1179403647;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileChannel f20506b;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f20506b = new FileInputStream(file).getChannel();
    }

    private long a(d dVar, long j10, long j11) {
        for (long j12 = 0; j12 < j10; j12++) {
            e eVarB = dVar.b(j12);
            if (eVarB.f20498a == 1) {
                long j13 = eVarB.f20500c;
                if (j13 <= j11 && j11 <= eVarB.f20501d + j13) {
                    return (j11 - j13) + eVarB.f20499b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public d c() throws IOException {
        this.f20506b.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (s(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sL = l(byteBufferAllocate, 4L);
        boolean z10 = l(byteBufferAllocate, 5L) == 2;
        if (sL == 1) {
            return new g(z10, this);
        }
        if (sL == 2) {
            return new h(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20506b.close();
    }

    public List e() throws IOException {
        long j10;
        long j11;
        this.f20506b.position(0L);
        ArrayList arrayList = new ArrayList();
        d dVarC = c();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVarC.f20489a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = dVarC.f20494f;
        int i10 = 0;
        if (j12 == 65535) {
            j12 = dVarC.c(0).f20502a;
        }
        long j13 = 0;
        while (true) {
            j10 = 1;
            if (j13 >= j12) {
                j11 = 0;
                break;
            }
            e eVarB = dVarC.b(j13);
            if (eVarB.f20498a == 2) {
                j11 = eVarB.f20499b;
                break;
            }
            j13++;
        }
        if (j11 == 0) {
            return DesugarCollections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j14 = 0;
        while (true) {
            c cVarA = dVarC.a(j11, i10);
            long j15 = j10;
            long j16 = cVarA.f20487a;
            if (j16 == j15) {
                arrayList2.add(Long.valueOf(cVarA.f20488b));
            } else if (j16 == 5) {
                j14 = cVarA.f20488b;
            }
            i10++;
            if (cVarA.f20487a == 0) {
                break;
            }
            j10 = j15;
            j12 = j12;
        }
        if (j14 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(dVarC, j12, j14);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(r(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    protected void k(ByteBuffer byteBuffer, long j10, int i10) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int i11 = this.f20506b.read(byteBuffer, j10 + j11);
            if (i11 == -1) {
                throw new EOFException();
            }
            j11 += (long) i11;
        }
        byteBuffer.position(0);
    }

    protected short l(ByteBuffer byteBuffer, long j10) throws IOException {
        k(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & MessagePack.Code.EXT_TIMESTAMP);
    }

    protected int n(ByteBuffer byteBuffer, long j10) throws IOException {
        k(byteBuffer, j10, 2);
        return byteBuffer.getShort() & 65535;
    }

    protected long q(ByteBuffer byteBuffer, long j10) throws IOException {
        k(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    protected String r(ByteBuffer byteBuffer, long j10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short sL = l(byteBuffer, j10);
            if (sL == 0) {
                return sb2.toString();
            }
            sb2.append((char) sL);
            j10 = j11;
        }
    }

    protected long s(ByteBuffer byteBuffer, long j10) throws IOException {
        k(byteBuffer, j10, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
