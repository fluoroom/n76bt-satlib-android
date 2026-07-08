package com.dw.ht.entitys;

import a6.o;
import a6.w;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import d5.a;
import io.objectbox.annotation.Entity;
import java.util.ArrayList;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import rd.m;
import rg.q;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018B\t\b\u0016¢\u0006\u0004\b\u0017\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ²\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\"\"\u0004\b/\u00100R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010$\"\u0004\b3\u00104R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010-\u001a\u0004\b5\u0010\"\"\u0004\b6\u00100R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010-\u001a\u0004\b7\u0010\"\"\u0004\b8\u00100R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00109\u001a\u0004\b>\u0010;\"\u0004\b?\u0010=R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010-\u001a\u0004\b@\u0010\"\"\u0004\bA\u00100R\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\bB\u0010$\"\u0004\b1\u00104R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\bC\u0010$\"\u0004\bD\u00104R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010G\"\u0004\b(\u0010HR\"\u0010\u0012\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010E\u001a\u0004\bI\u0010G\"\u0004\bJ\u0010HR\"\u0010\u0013\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00101\u001a\u0004\bK\u0010$\"\u0004\bL\u00104R\"\u0010\u0014\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00101\u001a\u0004\bM\u0010$\"\u0004\bN\u00104R\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00101\u001a\u0004\bO\u0010$\"\u0004\bP\u00104R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010(\u001a\u0004\bQ\u0010*\"\u0004\bR\u0010,R\u0011\u0010T\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bS\u0010\"R$\u0010[\u001a\u00020U2\u0006\u0010V\u001a\u00020U8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0011\u0010]\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\\\u0010$R\u0011\u0010_\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b^\u0010$¨\u0006`"}, d2 = {"Lcom/dw/ht/entitys/Satellite;", "", "", Name.MARK, "", "name", "", "noradCatID", "tleLine1", "tleLine2", "", "starred", "showTrack", "rfConfigName", "txFreq", "rxFreq", "Ld5/a$d;", "txModulation", "rxModulation", "txSubAudio", "rxSubAudio", "bandwidth", "updatedAt", "<init>", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;IILd5/a$d;Ld5/a$d;IIIJ)V", "()V", "Lcom/dw/ht/entitys/SatelliteRadioConfiguration;", "gp", "always", "M", "(Lcom/dw/ht/entitys/SatelliteRadioConfiguration;Z)Z", "a", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;IILd5/a$d;Ld5/a$d;IIIJ)Lcom/dw/ht/entitys/Satellite;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "d", "()J", "x", "(J)V", "Ljava/lang/String;", "e", "y", "(Ljava/lang/String;)V", "I", "f", "z", "(I)V", "p", "G", "q", "H", "Z", "n", "()Z", "F", "(Z)V", "m", "E", "h", "setRfConfigName", "r", "i", "B", "Ld5/a$d;", "t", "()Ld5/a$d;", "(Ld5/a$d;)V", "k", "C", "u", "K", "l", "D", "c", "w", "v", "L", "o", "tle", "Lo4/d;", "value", "g", "()Lo4/d;", "A", "(Lo4/d;)V", "radioInfo", "j", "rxModFreq", "s", "txModFreq", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final /* data */ class Satellite {
    private int bandwidth;
    private long id;
    private String name;
    private int noradCatID;
    private String rfConfigName;
    private int rxFreq;
    private a.d rxModulation;
    private int rxSubAudio;
    private boolean showTrack;
    private boolean starred;
    private String tleLine1;
    private String tleLine2;
    private int txFreq;
    private a.d txModulation;
    private int txSubAudio;
    private long updatedAt;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3) {
        this(j10, str, i10, str2, str3, false, false, null, 0, 0, null, null, 0, 0, 0, 0L, 65504, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
    }

    public static /* synthetic */ boolean N(Satellite satellite, SatelliteRadioConfiguration satelliteRadioConfiguration, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return satellite.M(satelliteRadioConfiguration, z10);
    }

    public static /* synthetic */ Satellite b(Satellite satellite, long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11, int i12, a.d dVar, a.d dVar2, int i13, int i14, int i15, long j11, int i16, Object obj) {
        long j12;
        int i17;
        long j13 = (i16 & 1) != 0 ? satellite.id : j10;
        String str5 = (i16 & 2) != 0 ? satellite.name : str;
        int i18 = (i16 & 4) != 0 ? satellite.noradCatID : i10;
        String str6 = (i16 & 8) != 0 ? satellite.tleLine1 : str2;
        String str7 = (i16 & 16) != 0 ? satellite.tleLine2 : str3;
        boolean z12 = (i16 & 32) != 0 ? satellite.starred : z10;
        boolean z13 = (i16 & 64) != 0 ? satellite.showTrack : z11;
        String str8 = (i16 & 128) != 0 ? satellite.rfConfigName : str4;
        int i19 = (i16 & 256) != 0 ? satellite.txFreq : i11;
        int i20 = (i16 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 ? satellite.rxFreq : i12;
        a.d dVar3 = (i16 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? satellite.txModulation : dVar;
        a.d dVar4 = (i16 & 2048) != 0 ? satellite.rxModulation : dVar2;
        int i21 = (i16 & 4096) != 0 ? satellite.txSubAudio : i13;
        long j14 = j13;
        int i22 = (i16 & 8192) != 0 ? satellite.rxSubAudio : i14;
        int i23 = (i16 & 16384) != 0 ? satellite.bandwidth : i15;
        if ((i16 & 32768) != 0) {
            i17 = i22;
            j12 = satellite.updatedAt;
        } else {
            j12 = j11;
            i17 = i22;
        }
        return satellite.a(j14, str5, i18, str6, str7, z12, z13, str8, i19, i20, dVar3, dVar4, i21, i17, i23, j12);
    }

    public final void A(o4.d dVar) {
        m.e(dVar, "value");
        this.txFreq = dVar.f();
        this.rxFreq = dVar.b();
        this.txModulation = dVar.h();
        this.rxModulation = dVar.d();
        this.txSubAudio = dVar.i();
        this.rxSubAudio = dVar.e();
    }

    public final void B(int i10) {
        this.rxFreq = i10;
    }

    public final void C(a.d dVar) {
        m.e(dVar, "<set-?>");
        this.rxModulation = dVar;
    }

    public final void D(int i10) {
        this.rxSubAudio = i10;
    }

    public final void E(boolean z10) {
        this.showTrack = z10;
    }

    public final void F(boolean z10) {
        this.starred = z10;
    }

    public final void G(String str) {
        m.e(str, "<set-?>");
        this.tleLine1 = str;
    }

    public final void H(String str) {
        m.e(str, "<set-?>");
        this.tleLine2 = str;
    }

    public final void I(int i10) {
        this.txFreq = i10;
    }

    public final void J(a.d dVar) {
        m.e(dVar, "<set-?>");
        this.txModulation = dVar;
    }

    public final void K(int i10) {
        this.txSubAudio = i10;
    }

    public final void L(long j10) {
        this.updatedAt = j10;
    }

    public final boolean M(SatelliteRadioConfiguration gp, boolean always) {
        boolean z10;
        m.e(gp, "gp");
        boolean z11 = true;
        if (this.rxFreq == 0 || always) {
            this.rxFreq = gp.getDownlinkFreq();
            this.rxSubAudio = gp.getDownlinkSubAudio();
            this.rxModulation = gp.getDownlinkMod();
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.txFreq == 0 || always) {
            this.txFreq = gp.getUplinkFreq();
            this.txSubAudio = gp.getUplinkSubAudio();
            this.txModulation = gp.getUplinkMod();
            z10 = true;
        }
        if ((z10 || always) && !m.a(this.rfConfigName, gp.getName())) {
            this.rfConfigName = gp.getName();
        } else {
            z11 = z10;
        }
        if (z11) {
            this.bandwidth = gp.getBandwidth();
        }
        return z11;
    }

    public final Satellite a(long id2, String name, int noradCatID, String tleLine1, String tleLine2, boolean starred, boolean showTrack, String rfConfigName, int txFreq, int rxFreq, a.d txModulation, a.d rxModulation, int txSubAudio, int rxSubAudio, int bandwidth, long updatedAt) {
        m.e(name, "name");
        m.e(tleLine1, "tleLine1");
        m.e(tleLine2, "tleLine2");
        m.e(txModulation, "txModulation");
        m.e(rxModulation, "rxModulation");
        return new Satellite(id2, name, noradCatID, tleLine1, tleLine2, starred, showTrack, rfConfigName, txFreq, rxFreq, txModulation, rxModulation, txSubAudio, rxSubAudio, bandwidth, updatedAt);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getBandwidth() {
        return this.bandwidth;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Satellite)) {
            return false;
        }
        Satellite satellite = (Satellite) other;
        return this.id == satellite.id && m.a(this.name, satellite.name) && this.noradCatID == satellite.noradCatID && m.a(this.tleLine1, satellite.tleLine1) && m.a(this.tleLine2, satellite.tleLine2) && this.starred == satellite.starred && this.showTrack == satellite.showTrack && m.a(this.rfConfigName, satellite.rfConfigName) && this.txFreq == satellite.txFreq && this.rxFreq == satellite.rxFreq && this.txModulation == satellite.txModulation && this.rxModulation == satellite.rxModulation && this.txSubAudio == satellite.txSubAudio && this.rxSubAudio == satellite.rxSubAudio && this.bandwidth == satellite.bandwidth && this.updatedAt == satellite.updatedAt;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getNoradCatID() {
        return this.noradCatID;
    }

    public final o4.d g() {
        return new o4.d(this.txFreq, this.rxFreq, this.txModulation, this.rxModulation, this.txSubAudio, this.rxSubAudio, 0, 64, null);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRfConfigName() {
        return this.rfConfigName;
    }

    public int hashCode() {
        int iA = ((((((((((((o4.a.a(this.id) * 31) + this.name.hashCode()) * 31) + this.noradCatID) * 31) + this.tleLine1.hashCode()) * 31) + this.tleLine2.hashCode()) * 31) + o4.b.a(this.starred)) * 31) + o4.b.a(this.showTrack)) * 31;
        String str = this.rfConfigName;
        return ((((((((((((((((iA + (str == null ? 0 : str.hashCode())) * 31) + this.txFreq) * 31) + this.rxFreq) * 31) + this.txModulation.hashCode()) * 31) + this.rxModulation.hashCode()) * 31) + this.txSubAudio) * 31) + this.rxSubAudio) * 31) + this.bandwidth) * 31) + o4.a.a(this.updatedAt);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getRxFreq() {
        return this.rxFreq;
    }

    public final int j() {
        int i10 = this.rxFreq;
        if (i10 == 0) {
            return 0;
        }
        return r.I(this.rxModulation, i10);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final a.d getRxModulation() {
        return this.rxModulation;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getRxSubAudio() {
        return this.rxSubAudio;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getShowTrack() {
        return this.showTrack;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getStarred() {
        return this.starred;
    }

    public final String o() {
        ArrayList arrayListA = o.a();
        if (!q.e0(this.tleLine1)) {
            arrayListA.add(this.tleLine1);
        }
        if (!q.e0(this.tleLine2)) {
            arrayListA.add(this.tleLine2);
        }
        String strC = w.c("\n", arrayListA);
        m.d(strC, "join(...)");
        return strC;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getTleLine1() {
        return this.tleLine1;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getTleLine2() {
        return this.tleLine2;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getTxFreq() {
        return this.txFreq;
    }

    public final int s() {
        int i10 = this.txFreq;
        if (i10 == 0) {
            return 0;
        }
        return r.I(this.txModulation, i10);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final a.d getTxModulation() {
        return this.txModulation;
    }

    public String toString() {
        return "Satellite(id=" + this.id + ", name=" + this.name + ", noradCatID=" + this.noradCatID + ", tleLine1=" + this.tleLine1 + ", tleLine2=" + this.tleLine2 + ", starred=" + this.starred + ", showTrack=" + this.showTrack + ", rfConfigName=" + this.rfConfigName + ", txFreq=" + this.txFreq + ", rxFreq=" + this.rxFreq + ", txModulation=" + this.txModulation + ", rxModulation=" + this.rxModulation + ", txSubAudio=" + this.txSubAudio + ", rxSubAudio=" + this.rxSubAudio + ", bandwidth=" + this.bandwidth + ", updatedAt=" + this.updatedAt + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getTxSubAudio() {
        return this.txSubAudio;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final void w(int i10) {
        this.bandwidth = i10;
    }

    public final void x(long j10) {
        this.id = j10;
    }

    public final void y(String str) {
        m.e(str, "<set-?>");
        this.name = str;
    }

    public final void z(int i10) {
        this.noradCatID = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10) {
        this(j10, str, i10, str2, str3, z10, false, null, 0, 0, null, null, 0, 0, 0, 0L, 65472, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11) {
        this(j10, str, i10, str2, str3, z10, z11, null, 0, 0, null, null, 0, 0, 0, 0L, 65408, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4) {
        this(j10, str, i10, str2, str3, z10, z11, str4, 0, 0, null, null, 0, 0, 0, 0L, 65280, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11) {
        this(j10, str, i10, str2, str3, z10, z11, str4, i11, 0, null, null, 0, 0, 0, 0L, 65024, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11, int i12) {
        this(j10, str, i10, str2, str3, z10, z11, str4, i11, i12, null, null, 0, 0, 0, 0L, 64512, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11, int i12, a.d dVar) {
        this(j10, str, i10, str2, str3, z10, z11, str4, i11, i12, dVar, null, 0, 0, 0, 0L, 63488, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
        m.e(dVar, "txModulation");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11, int i12, a.d dVar, a.d dVar2) {
        this(j10, str, i10, str2, str3, z10, z11, str4, i11, i12, dVar, dVar2, 0, 0, 0, 0L, 61440, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
        m.e(dVar, "txModulation");
        m.e(dVar2, "rxModulation");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11, int i12, a.d dVar, a.d dVar2, int i13) {
        this(j10, str, i10, str2, str3, z10, z11, str4, i11, i12, dVar, dVar2, i13, 0, 0, 0L, 57344, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
        m.e(dVar, "txModulation");
        m.e(dVar2, "rxModulation");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11, int i12, a.d dVar, a.d dVar2, int i13, int i14) {
        this(j10, str, i10, str2, str3, z10, z11, str4, i11, i12, dVar, dVar2, i13, i14, 0, 0L, 49152, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
        m.e(dVar, "txModulation");
        m.e(dVar2, "rxModulation");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11, int i12, a.d dVar, a.d dVar2, int i13, int i14, int i15) {
        this(j10, str, i10, str2, str3, z10, z11, str4, i11, i12, dVar, dVar2, i13, i14, i15, 0L, 32768, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
        m.e(dVar, "txModulation");
        m.e(dVar2, "rxModulation");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Satellite(String str, int i10, String str2, String str3) {
        this(0L, str, i10, str2, str3, false, false, null, 0, 0, null, null, 0, 0, 0, 0L, 65505, null);
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
    }

    public Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11, int i12, a.d dVar, a.d dVar2, int i13, int i14, int i15, long j11) {
        m.e(str, "name");
        m.e(str2, "tleLine1");
        m.e(str3, "tleLine2");
        m.e(dVar, "txModulation");
        m.e(dVar2, "rxModulation");
        this.id = j10;
        this.name = str;
        this.noradCatID = i10;
        this.tleLine1 = str2;
        this.tleLine2 = str3;
        this.starred = z10;
        this.showTrack = z11;
        this.rfConfigName = str4;
        this.txFreq = i11;
        this.rxFreq = i12;
        this.txModulation = dVar;
        this.rxModulation = dVar2;
        this.txSubAudio = i13;
        this.rxSubAudio = i14;
        this.bandwidth = i15;
        this.updatedAt = j11;
    }

    public /* synthetic */ Satellite(long j10, String str, int i10, String str2, String str3, boolean z10, boolean z11, String str4, int i11, int i12, a.d dVar, a.d dVar2, int i13, int i14, int i15, long j11, int i16, rd.h hVar) {
        this((i16 & 1) != 0 ? 0L : j10, str, i10, str2, str3, (i16 & 32) != 0 ? false : z10, (i16 & 64) != 0 ? false : z11, (i16 & 128) != 0 ? "" : str4, (i16 & 256) != 0 ? 0 : i11, (i16 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 ? 0 : i12, (i16 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? a.d.FM : dVar, (i16 & 2048) != 0 ? a.d.FM : dVar2, (i16 & 4096) != 0 ? 0 : i13, (i16 & 8192) != 0 ? 0 : i14, (i16 & 16384) != 0 ? 25000 : i15, (i16 & 32768) != 0 ? 0L : j11);
    }

    public Satellite() {
        this(0L, "", 0, "", "", false, false, null, 0, 0, null, null, 0, 0, 0, 0L, 65504, null);
    }
}
