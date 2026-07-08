package pa;

import com.google.protobuf.g;
import com.google.protobuf.k0;
import com.google.protobuf.r;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final r.b f24099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final k0.f f24100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static r.h f24101c = r.h.s(new String[]{"\n\u0017google/rpc/status.proto\u0012\ngoogle.rpc\u001a\u0019google/protobuf/any.proto\"N\n\u0006Status\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007message\u0018\u0002 \u0001(\t\u0012%\n\u0007details\u0018\u0003 \u0003(\u000b2\u0014.google.protobuf.AnyBa\n\u000ecom.google.rpcB\u000bStatusProtoP\u0001Z7google.golang.org/genproto/googleapis/rpc/status;statusø\u0001\u0001¢\u0002\u0003RPCb\u0006proto3"}, new r.h[]{g.a()});

    static {
        r.b bVar = (r.b) a().l().get(0);
        f24099a = bVar;
        f24100b = new k0.f(bVar, new String[]{"Code", "Message", "Details"});
        g.a();
    }

    public static r.h a() {
        return f24101c;
    }
}
