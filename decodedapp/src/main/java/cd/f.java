package cd;

import j$.util.concurrent.ConcurrentHashMap;
import java.net.InetSocketAddress;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    o f4588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LinkedList f4589b = new LinkedList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ConcurrentHashMap f4590c = new ConcurrentHashMap();

    protected f(o oVar) {
        this.f4588a = null;
        this.f4588a = oVar;
    }

    private int b(int i10, e eVar) {
        if (i10 == 0) {
            System.out.println("ParticipantDatabase.addParticipant() doesnt expect application to add participants to multicast session.");
            return -1;
        }
        if (!this.f4590c.contains(Long.valueOf(eVar.f4567f))) {
            this.f4590c.put(Long.valueOf(eVar.f4567f), eVar);
            return 0;
        }
        System.out.println("ParticipantDatabase.addParticipant() SSRC already known " + Long.toString(eVar.f4567f));
        return -2;
    }

    private int c(int i10, e eVar) {
        InetSocketAddress inetSocketAddress;
        InetSocketAddress inetSocketAddress2;
        if (i10 != 0) {
            if (!this.f4590c.contains(Long.valueOf(eVar.f4567f))) {
                this.f4590c.put(Long.valueOf(eVar.f4567f), eVar);
                return 0;
            }
            System.out.println("ParticipantDatabase.addParticipant() SSRC already known " + Long.toString(eVar.f4567f));
            return -2;
        }
        Enumeration enumerationElements = this.f4590c.elements();
        boolean z10 = true;
        while (z10 && enumerationElements.hasMoreElements()) {
            e eVar2 = (e) enumerationElements.nextElement();
            if (eVar2.f4562a && (((inetSocketAddress = eVar2.f4566e) != null && eVar.f4564c != null && inetSocketAddress.getAddress().equals(eVar.f4564c.getAddress())) || ((inetSocketAddress2 = eVar2.f4565d) != null && eVar.f4563b != null && inetSocketAddress2.getAddress().equals(eVar.f4563b.getAddress())))) {
                eVar2.f4563b = eVar.f4563b;
                eVar2.f4564c = eVar.f4564c;
                eVar2.f4562a = false;
                this.f4588a.f4644r.b(5, new e[]{eVar2});
                eVar = eVar2;
                z10 = false;
            }
        }
        this.f4589b.add(eVar);
        return 0;
    }

    protected int a(int i10, e eVar) {
        return this.f4588a.f4631e ? b(i10, eVar) : c(i10, eVar);
    }

    public void d() {
        this.f4589b.clear();
        this.f4590c.clear();
    }

    protected e e(long j10) {
        return (e) this.f4590c.get(Long.valueOf(j10));
    }

    protected Enumeration f() {
        return this.f4590c.elements();
    }

    protected Iterator g() {
        if (!this.f4588a.f4631e) {
            return this.f4589b.iterator();
        }
        System.out.println("Request for ParticipantDatabase.getUnicastReceivers in multicast session");
        return null;
    }
}
