package rb;

import io.grpc.internal.g3;
import io.grpc.internal.h3;

/* JADX INFO: loaded from: classes3.dex */
class r implements h3 {
    r() {
    }

    @Override // io.grpc.internal.h3
    public g3 a(int i10) {
        return new q(new vh.e(), Math.min(1048576, ((i10 + 8191) / 8192) * 8192));
    }
}
