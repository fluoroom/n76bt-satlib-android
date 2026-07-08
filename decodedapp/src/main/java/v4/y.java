package v4;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.dw.mdc.Packet;

/* JADX INFO: loaded from: classes.dex */
public class y extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30248a = "DataSaver";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l1 f30250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f30252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f30253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f30254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f30255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Bitmap f30256i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Packet[] f30257j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f30258k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w5.h[] f30259l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final s f30260m;

    public interface a {
        void discard();

        void r(long j10);
    }

    public y(l1 l1Var, int i10, a aVar, int i11, long j10, long j11, long j12, Bitmap bitmap, Packet[] packetArr, String str, w5.h[] hVarArr) {
        Packet[] packetArr2 = packetArr;
        w5.h[] hVarArr2 = hVarArr;
        s3.b.b("DataSaver", "创建");
        if (packetArr2 != null && packetArr2.length == 0) {
            packetArr2 = null;
        }
        if (hVarArr2 != null && hVarArr2.length == 0) {
            hVarArr2 = null;
        }
        this.f30250c = l1Var;
        this.f30249b = i10;
        this.f30252e = aVar;
        this.f30254g = j10;
        this.f30255h = j11;
        this.f30256i = bitmap;
        this.f30257j = packetArr2;
        this.f30258k = str;
        this.f30259l = hVarArr2;
        this.f30251d = j12;
        if (aVar == null) {
            this.f30253f = 0;
        } else {
            this.f30253f = i11;
        }
        if (l1Var instanceof c0) {
            this.f30260m = new s(((c0) l1Var).W1());
        } else {
            this.f30260m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:9:0x0019, B:11:0x001f, B:14:0x0033, B:16:0x0038, B:24:0x0058, B:19:0x004b, B:21:0x004f, B:26:0x005c, B:29:0x0062, B:31:0x0068, B:33:0x006e, B:34:0x0073, B:36:0x0079, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:44:0x008f, B:46:0x0095, B:47:0x009a, B:51:0x00af, B:53:0x00b9, B:55:0x00be, B:58:0x00c7, B:60:0x00d0, B:62:0x00d4, B:65:0x00de, B:69:0x00f5, B:71:0x00f9, B:73:0x00fd, B:66:0x00e7, B:68:0x00eb), top: B:78:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:9:0x0019, B:11:0x001f, B:14:0x0033, B:16:0x0038, B:24:0x0058, B:19:0x004b, B:21:0x004f, B:26:0x005c, B:29:0x0062, B:31:0x0068, B:33:0x006e, B:34:0x0073, B:36:0x0079, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:44:0x008f, B:46:0x0095, B:47:0x009a, B:51:0x00af, B:53:0x00b9, B:55:0x00be, B:58:0x00c7, B:60:0x00d0, B:62:0x00d4, B:65:0x00de, B:69:0x00f5, B:71:0x00f9, B:73:0x00fd, B:66:0x00e7, B:68:0x00eb), top: B:78:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:9:0x0019, B:11:0x001f, B:14:0x0033, B:16:0x0038, B:24:0x0058, B:19:0x004b, B:21:0x004f, B:26:0x005c, B:29:0x0062, B:31:0x0068, B:33:0x006e, B:34:0x0073, B:36:0x0079, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:44:0x008f, B:46:0x0095, B:47:0x009a, B:51:0x00af, B:53:0x00b9, B:55:0x00be, B:58:0x00c7, B:60:0x00d0, B:62:0x00d4, B:65:0x00de, B:69:0x00f5, B:71:0x00f9, B:73:0x00fd, B:66:0x00e7, B:68:0x00eb), top: B:78:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008f A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:9:0x0019, B:11:0x001f, B:14:0x0033, B:16:0x0038, B:24:0x0058, B:19:0x004b, B:21:0x004f, B:26:0x005c, B:29:0x0062, B:31:0x0068, B:33:0x006e, B:34:0x0073, B:36:0x0079, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:44:0x008f, B:46:0x0095, B:47:0x009a, B:51:0x00af, B:53:0x00b9, B:55:0x00be, B:58:0x00c7, B:60:0x00d0, B:62:0x00d4, B:65:0x00de, B:69:0x00f5, B:71:0x00f9, B:73:0x00fd, B:66:0x00e7, B:68:0x00eb), top: B:78:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:9:0x0019, B:11:0x001f, B:14:0x0033, B:16:0x0038, B:24:0x0058, B:19:0x004b, B:21:0x004f, B:26:0x005c, B:29:0x0062, B:31:0x0068, B:33:0x006e, B:34:0x0073, B:36:0x0079, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:44:0x008f, B:46:0x0095, B:47:0x009a, B:51:0x00af, B:53:0x00b9, B:55:0x00be, B:58:0x00c7, B:60:0x00d0, B:62:0x00d4, B:65:0x00de, B:69:0x00f5, B:71:0x00f9, B:73:0x00fd, B:66:0x00e7, B:68:0x00eb), top: B:78:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:9:0x0019, B:11:0x001f, B:14:0x0033, B:16:0x0038, B:24:0x0058, B:19:0x004b, B:21:0x004f, B:26:0x005c, B:29:0x0062, B:31:0x0068, B:33:0x006e, B:34:0x0073, B:36:0x0079, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:44:0x008f, B:46:0x0095, B:47:0x009a, B:51:0x00af, B:53:0x00b9, B:55:0x00be, B:58:0x00c7, B:60:0x00d0, B:62:0x00d4, B:65:0x00de, B:69:0x00f5, B:71:0x00f9, B:73:0x00fd, B:66:0x00e7, B:68:0x00eb), top: B:78:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:9:0x0019, B:11:0x001f, B:14:0x0033, B:16:0x0038, B:24:0x0058, B:19:0x004b, B:21:0x004f, B:26:0x005c, B:29:0x0062, B:31:0x0068, B:33:0x006e, B:34:0x0073, B:36:0x0079, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:44:0x008f, B:46:0x0095, B:47:0x009a, B:51:0x00af, B:53:0x00b9, B:55:0x00be, B:58:0x00c7, B:60:0x00d0, B:62:0x00d4, B:65:0x00de, B:69:0x00f5, B:71:0x00f9, B:73:0x00fd, B:66:0x00e7, B:68:0x00eb), top: B:78:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:3:0x0007, B:5:0x0012, B:7:0x0016, B:9:0x0019, B:11:0x001f, B:14:0x0033, B:16:0x0038, B:24:0x0058, B:19:0x004b, B:21:0x004f, B:26:0x005c, B:29:0x0062, B:31:0x0068, B:33:0x006e, B:34:0x0073, B:36:0x0079, B:38:0x0081, B:40:0x0085, B:42:0x0089, B:44:0x008f, B:46:0x0095, B:47:0x009a, B:51:0x00af, B:53:0x00b9, B:55:0x00be, B:58:0x00c7, B:60:0x00d0, B:62:0x00d4, B:65:0x00de, B:69:0x00f5, B:71:0x00f9, B:73:0x00fd, B:66:0x00e7, B:68:0x00eb), top: B:78:0x0007 }] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [w5.h] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r6v2, types: [v4.y$a] */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Void doInBackground(java.lang.Void... r20) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.y.doInBackground(java.lang.Void[]):java.lang.Void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Void r22) {
        a aVar = this.f30252e;
        if (aVar != null) {
            aVar.discard();
            s3.b.b("DataSaver", "丢弃音频");
        }
    }
}
