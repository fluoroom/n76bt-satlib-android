package g5;

import com.benshikj.ht.rpc.Im;
import d5.a;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a */
    public int f13550a;

    /* JADX INFO: renamed from: b */
    public int f13551b;

    /* JADX INFO: renamed from: c */
    public int f13552c;

    /* JADX INFO: renamed from: d */
    public int f13553d;

    /* JADX INFO: renamed from: e */
    public int f13554e;

    public void a(Im.RfChannelFields rfChannelFields) {
        this.f13554e = rfChannelFields.getBandwidth();
        this.f13550a = rfChannelFields.getTxFreq();
        this.f13551b = rfChannelFields.getRxFreq();
        this.f13552c = rfChannelFields.getTxSubAudio();
        this.f13553d = rfChannelFields.getRxSubAudio();
    }

    public d5.a b() {
        if (this.f13551b == 0 || this.f13550a == 0) {
            return null;
        }
        d5.a aVarN = d5.a.n();
        aVarN.f10573g = this.f13550a;
        aVarN.f10574h = this.f13551b;
        aVarN.f10582y = this.f13552c;
        aVarN.f10583z = this.f13553d;
        aVarN.B = this.f13554e;
        return aVarN;
    }

    public void c(d5.a aVar) {
        if (aVar != null) {
            this.f13550a = aVar.f10573g;
            this.f13551b = aVar.f10574h;
            this.f13552c = aVar.f10582y;
            this.f13553d = aVar.f10583z;
            this.f13554e = aVar.B;
            return;
        }
        this.f13550a = 0;
        this.f13551b = 0;
        this.f13552c = 0;
        this.f13553d = 0;
        this.f13554e = 0;
    }

    public Im.RfChannelFields d() {
        return Im.RfChannelFields.newBuilder().setBandwidth(this.f13554e).setRxFreq(this.f13551b).setTxFreq(this.f13550a).setRxSubAudio(this.f13553d).setTxSubAudio(this.f13552c).build();
    }

    public boolean e(r rVar) {
        int i10 = rVar.f30065a;
        int i11 = this.f13550a;
        if (i10 == i11 && rVar.f30066b == this.f13551b && rVar.f30069e == this.f13552c && rVar.f30070f == this.f13553d) {
            a.d dVar = rVar.f30067c;
            a.d dVar2 = a.d.FM;
            if (dVar == dVar2 && rVar.f30068d == dVar2) {
                if (rVar.f30074s == (this.f13554e == 25000)) {
                    return false;
                }
            }
        }
        rVar.f30065a = i11;
        rVar.f30066b = this.f13551b;
        rVar.f30069e = this.f13552c;
        rVar.f30070f = this.f13553d;
        rVar.f30074s = this.f13554e == 25000;
        a.d dVar3 = a.d.FM;
        rVar.f30067c = dVar3;
        rVar.f30068d = dVar3;
        return true;
    }

    public String toString() {
        return "RfChannelFields{txFreq=" + this.f13550a + ", rxFreq=" + this.f13551b + ", txSubAudio=" + this.f13552c + ", rxSubAudio=" + this.f13553d + ", bandwidth=" + this.f13554e + '}';
    }
}
