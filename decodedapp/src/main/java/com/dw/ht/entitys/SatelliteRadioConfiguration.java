package com.dw.ht.entitys;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import d5.a;
import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import rd.m;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001Bs\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010#R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010'R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010'R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010$\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010'R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010'R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010$\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010'R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u000e\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u00104R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010$\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010'R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0011\u0010?\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b>\u0010\u0015R\u0011\u0010A\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b@\u0010\u0017R\u0011\u0010C\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bB\u0010\u0017¨\u0006D"}, d2 = {"Lcom/dw/ht/entitys/SatelliteRadioConfiguration;", "", "", Name.MARK, "", "name", "", "noradCatID", "downlinkFreq", "uplinkFreq", "downlinkSubAudio", "uplinkSubAudio", "Ld5/a$d;", "downlinkMod", "uplinkMod", "bandwidth", "", "isCreatedByUser", "<init>", "(JLjava/lang/String;IIIIILd5/a$d;Ld5/a$d;IZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "e", "()J", "o", "(J)V", "Ljava/lang/String;", "g", "setName", "(Ljava/lang/String;)V", "I", "h", "setNoradCatID", "(I)V", "b", "setDownlinkFreq", "k", "setUplinkFreq", "d", "setDownlinkSubAudio", "m", "setUplinkSubAudio", "Ld5/a$d;", "c", "()Ld5/a$d;", "setDownlinkMod", "(Ld5/a$d;)V", "l", "setUplinkMod", "a", "setBandwidth", "Z", "n", "()Z", "setCreatedByUser", "(Z)V", "f", "key", "i", "rxModFreq", "j", "txModFreq", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final /* data */ class SatelliteRadioConfiguration {
    private int bandwidth;
    private int downlinkFreq;
    private a.d downlinkMod;
    private int downlinkSubAudio;
    private long id;
    private boolean isCreatedByUser;
    private String name;
    private int noradCatID;
    private int uplinkFreq;
    private a.d uplinkMod;
    private int uplinkSubAudio;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SatelliteRadioConfiguration(long j10, String str, int i10) {
        this(j10, str, i10, 0, 0, 0, 0, null, null, 0, false, 2040, null);
        m.e(str, "name");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBandwidth() {
        return this.bandwidth;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDownlinkFreq() {
        return this.downlinkFreq;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a.d getDownlinkMod() {
        return this.downlinkMod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getDownlinkSubAudio() {
        return this.downlinkSubAudio;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SatelliteRadioConfiguration)) {
            return false;
        }
        SatelliteRadioConfiguration satelliteRadioConfiguration = (SatelliteRadioConfiguration) other;
        return this.id == satelliteRadioConfiguration.id && m.a(this.name, satelliteRadioConfiguration.name) && this.noradCatID == satelliteRadioConfiguration.noradCatID && this.downlinkFreq == satelliteRadioConfiguration.downlinkFreq && this.uplinkFreq == satelliteRadioConfiguration.uplinkFreq && this.downlinkSubAudio == satelliteRadioConfiguration.downlinkSubAudio && this.uplinkSubAudio == satelliteRadioConfiguration.uplinkSubAudio && this.downlinkMod == satelliteRadioConfiguration.downlinkMod && this.uplinkMod == satelliteRadioConfiguration.uplinkMod && this.bandwidth == satelliteRadioConfiguration.bandwidth && this.isCreatedByUser == satelliteRadioConfiguration.isCreatedByUser;
    }

    public final String f() {
        if (this.isCreatedByUser) {
            return Name.MARK + this.id;
        }
        return this.noradCatID + this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getNoradCatID() {
        return this.noradCatID;
    }

    public int hashCode() {
        return (((((((((((((((((((o4.a.a(this.id) * 31) + this.name.hashCode()) * 31) + this.noradCatID) * 31) + this.downlinkFreq) * 31) + this.uplinkFreq) * 31) + this.downlinkSubAudio) * 31) + this.uplinkSubAudio) * 31) + this.downlinkMod.hashCode()) * 31) + this.uplinkMod.hashCode()) * 31) + this.bandwidth) * 31) + o4.b.a(this.isCreatedByUser);
    }

    public final int i() {
        int i10 = this.downlinkFreq;
        if (i10 == 0) {
            return 0;
        }
        return r.I(this.downlinkMod, i10);
    }

    public final int j() {
        int i10 = this.uplinkFreq;
        if (i10 == 0) {
            return 0;
        }
        return r.I(this.uplinkMod, i10);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getUplinkFreq() {
        return this.uplinkFreq;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final a.d getUplinkMod() {
        return this.uplinkMod;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getUplinkSubAudio() {
        return this.uplinkSubAudio;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final boolean getIsCreatedByUser() {
        return this.isCreatedByUser;
    }

    public final void o(long j10) {
        this.id = j10;
    }

    public String toString() {
        return "SatelliteRadioConfiguration(id=" + this.id + ", name=" + this.name + ", noradCatID=" + this.noradCatID + ", downlinkFreq=" + this.downlinkFreq + ", uplinkFreq=" + this.uplinkFreq + ", downlinkSubAudio=" + this.downlinkSubAudio + ", uplinkSubAudio=" + this.uplinkSubAudio + ", downlinkMod=" + this.downlinkMod + ", uplinkMod=" + this.uplinkMod + ", bandwidth=" + this.bandwidth + ", isCreatedByUser=" + this.isCreatedByUser + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SatelliteRadioConfiguration(long j10, String str, int i10, int i11) {
        this(j10, str, i10, i11, 0, 0, 0, null, null, 0, false, 2032, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SatelliteRadioConfiguration(long j10, String str, int i10, int i11, int i12) {
        this(j10, str, i10, i11, i12, 0, 0, null, null, 0, false, 2016, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SatelliteRadioConfiguration(long j10, String str, int i10, int i11, int i12, int i13) {
        this(j10, str, i10, i11, i12, i13, 0, null, null, 0, false, 1984, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SatelliteRadioConfiguration(long j10, String str, int i10, int i11, int i12, int i13, int i14) {
        this(j10, str, i10, i11, i12, i13, i14, null, null, 0, false, 1920, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SatelliteRadioConfiguration(long j10, String str, int i10, int i11, int i12, int i13, int i14, a.d dVar) {
        this(j10, str, i10, i11, i12, i13, i14, dVar, null, 0, false, 1792, null);
        m.e(str, "name");
        m.e(dVar, "downlinkMod");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SatelliteRadioConfiguration(long j10, String str, int i10, int i11, int i12, int i13, int i14, a.d dVar, a.d dVar2) {
        this(j10, str, i10, i11, i12, i13, i14, dVar, dVar2, 0, false, 1536, null);
        m.e(str, "name");
        m.e(dVar, "downlinkMod");
        m.e(dVar2, "uplinkMod");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SatelliteRadioConfiguration(long j10, String str, int i10, int i11, int i12, int i13, int i14, a.d dVar, a.d dVar2, int i15) {
        this(j10, str, i10, i11, i12, i13, i14, dVar, dVar2, i15, false, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, null);
        m.e(str, "name");
        m.e(dVar, "downlinkMod");
        m.e(dVar2, "uplinkMod");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SatelliteRadioConfiguration(String str, int i10) {
        this(0L, str, i10, 0, 0, 0, 0, null, null, 0, false, 2041, null);
        m.e(str, "name");
    }

    public SatelliteRadioConfiguration(long j10, String str, int i10, int i11, int i12, int i13, int i14, a.d dVar, a.d dVar2, int i15, boolean z10) {
        m.e(str, "name");
        m.e(dVar, "downlinkMod");
        m.e(dVar2, "uplinkMod");
        this.id = j10;
        this.name = str;
        this.noradCatID = i10;
        this.downlinkFreq = i11;
        this.uplinkFreq = i12;
        this.downlinkSubAudio = i13;
        this.uplinkSubAudio = i14;
        this.downlinkMod = dVar;
        this.uplinkMod = dVar2;
        this.bandwidth = i15;
        this.isCreatedByUser = z10;
    }

    public /* synthetic */ SatelliteRadioConfiguration(long j10, String str, int i10, int i11, int i12, int i13, int i14, a.d dVar, a.d dVar2, int i15, boolean z10, int i16, rd.h hVar) {
        this((i16 & 1) != 0 ? 0L : j10, str, i10, (i16 & 8) != 0 ? 0 : i11, (i16 & 16) != 0 ? 0 : i12, (i16 & 32) != 0 ? 0 : i13, (i16 & 64) != 0 ? 0 : i14, (i16 & 128) != 0 ? a.d.FM : dVar, (i16 & 256) != 0 ? a.d.FM : dVar2, (i16 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 ? 25000 : i15, (i16 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? false : z10);
    }
}
