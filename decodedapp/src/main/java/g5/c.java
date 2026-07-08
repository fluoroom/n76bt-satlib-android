package g5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f13549e;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.benshikj.ht.rpc.Im.SendMessageRequest a() {
        /*
            r4 = this;
            com.benshikj.ht.rpc.Im$Message$Builder r0 = com.benshikj.ht.rpc.Im.Message.newBuilder()
            int r1 = r4.f13545a
            r2 = 1
            if (r1 == r2) goto Ld
            r2 = 2
            if (r1 == r2) goto L1c
            goto L2b
        Ld:
            com.benshikj.ht.rpc.Im$Message$Type r1 = com.benshikj.ht.rpc.Im.Message.Type.Text
            com.benshikj.ht.rpc.Im$Message$Builder r1 = r0.setType(r1)
            byte[] r2 = r4.f13549e
            com.google.protobuf.l r2 = com.google.protobuf.l.g(r2)
            r1.setRaw(r2)
        L1c:
            com.benshikj.ht.rpc.Im$Message$Type r1 = com.benshikj.ht.rpc.Im.Message.Type.AFSK
            com.benshikj.ht.rpc.Im$Message$Builder r1 = r0.setType(r1)
            byte[] r2 = r4.f13549e
            com.google.protobuf.l r2 = com.google.protobuf.l.g(r2)
            r1.setRaw(r2)
        L2b:
            com.benshikj.ht.rpc.Im$SendMessageRequest$Builder r1 = com.benshikj.ht.rpc.Im.SendMessageRequest.newBuilder()
            long r2 = r4.f13547c
            com.benshikj.ht.rpc.Im$SendMessageRequest$Builder r1 = r1.setTarget(r2)
            boolean r2 = r4.f13548d
            if (r2 == 0) goto L3c
            com.benshikj.ht.rpc.Im$IdentifyType r2 = com.benshikj.ht.rpc.Im.IdentifyType.GroupID
            goto L3e
        L3c:
            com.benshikj.ht.rpc.Im$IdentifyType r2 = com.benshikj.ht.rpc.Im.IdentifyType.UserID
        L3e:
            com.benshikj.ht.rpc.Im$SendMessageRequest$Builder r1 = r1.setTargetType(r2)
            com.benshikj.ht.rpc.Im$Message r0 = r0.build()
            com.benshikj.ht.rpc.Im$SendMessageRequest$Builder r0 = r1.setData(r0)
            com.benshikj.ht.rpc.Im$SendMessageRequest r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.c.a():com.benshikj.ht.rpc.Im$SendMessageRequest");
    }

    public String toString() {
        return "Message{from=" + this.f13546b + ", to=" + this.f13547c + ", toGroup=" + this.f13548d + ", type=" + this.f13545a + ", data=" + Arrays.toString(this.f13549e) + '}';
    }
}
