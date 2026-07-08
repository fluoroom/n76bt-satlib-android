package qb;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qb.a;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.c f24822d = a.c.a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.c f24823e = a.c.a("io.grpc.EquivalentAddressGroup.LOCALITY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f24824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f24825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24826c;

    public y(List list, a aVar) {
        r9.l.e(!list.isEmpty(), "addrs is empty");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f24824a = listUnmodifiableList;
        this.f24825b = (a) r9.l.o(aVar, "attrs");
        this.f24826c = listUnmodifiableList.hashCode();
    }

    public List a() {
        return this.f24824a;
    }

    public a b() {
        return this.f24825b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f24824a.size() != yVar.f24824a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f24824a.size(); i10++) {
            if (!((SocketAddress) this.f24824a.get(i10)).equals(yVar.f24824a.get(i10))) {
                return false;
            }
        }
        return this.f24825b.equals(yVar.f24825b);
    }

    public int hashCode() {
        return this.f24826c;
    }

    public String toString() {
        return "[" + this.f24824a + "/" + this.f24825b + "]";
    }

    public y(SocketAddress socketAddress) {
        this(socketAddress, a.f24506c);
    }

    public y(SocketAddress socketAddress, a aVar) {
        this(Collections.singletonList(socketAddress), aVar);
    }
}
