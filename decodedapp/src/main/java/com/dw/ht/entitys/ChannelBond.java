package com.dw.ht.entitys;

import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010#\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b*\u0010\u0012\"\u0004\b+\u0010\"¨\u0006,"}, d2 = {"Lcom/dw/ht/entitys/ChannelBond;", "", "", Name.MARK, "networkChannelId", "devId", "", "devChannel", "", "routing", "syncRfConfig", "devRegion", "<init>", "(JJJIZZI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "d", "()J", "h", "(J)V", "e", "setNetworkChannelId", "b", "setDevId", "I", "a", "setDevChannel", "(I)V", "Z", "f", "()Z", "i", "(Z)V", "g", "j", "c", "setDevRegion", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final /* data */ class ChannelBond {
    private int devChannel;
    private long devId;
    private int devRegion;
    private long id;
    private long networkChannelId;
    private boolean routing;
    private boolean syncRfConfig;

    public ChannelBond() {
        this(0L, 0L, 0L, 0, false, false, 0, 127, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDevChannel() {
        return this.devChannel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getDevId() {
        return this.devId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getDevRegion() {
        return this.devRegion;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getNetworkChannelId() {
        return this.networkChannelId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelBond)) {
            return false;
        }
        ChannelBond channelBond = (ChannelBond) other;
        return this.id == channelBond.id && this.networkChannelId == channelBond.networkChannelId && this.devId == channelBond.devId && this.devChannel == channelBond.devChannel && this.routing == channelBond.routing && this.syncRfConfig == channelBond.syncRfConfig && this.devRegion == channelBond.devRegion;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRouting() {
        return this.routing;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getSyncRfConfig() {
        return this.syncRfConfig;
    }

    public final void h(long j10) {
        this.id = j10;
    }

    public int hashCode() {
        return (((((((((((o4.a.a(this.id) * 31) + o4.a.a(this.networkChannelId)) * 31) + o4.a.a(this.devId)) * 31) + this.devChannel) * 31) + o4.b.a(this.routing)) * 31) + o4.b.a(this.syncRfConfig)) * 31) + this.devRegion;
    }

    public final void i(boolean z10) {
        this.routing = z10;
    }

    public final void j(boolean z10) {
        this.syncRfConfig = z10;
    }

    public String toString() {
        return "ChannelBond(id=" + this.id + ", networkChannelId=" + this.networkChannelId + ", devId=" + this.devId + ", devChannel=" + this.devChannel + ", routing=" + this.routing + ", syncRfConfig=" + this.syncRfConfig + ", devRegion=" + this.devRegion + ')';
    }

    public ChannelBond(long j10) {
        this(j10, 0L, 0L, 0, false, false, 0, 126, null);
    }

    public ChannelBond(long j10, long j11) {
        this(j10, j11, 0L, 0, false, false, 0, 124, null);
    }

    public ChannelBond(long j10, long j11, long j12) {
        this(j10, j11, j12, 0, false, false, 0, 120, null);
    }

    public ChannelBond(long j10, long j11, long j12, int i10) {
        this(j10, j11, j12, i10, false, false, 0, 112, null);
    }

    public ChannelBond(long j10, long j11, long j12, int i10, boolean z10) {
        this(j10, j11, j12, i10, z10, false, 0, 96, null);
    }

    public ChannelBond(long j10, long j11, long j12, int i10, boolean z10, boolean z11) {
        this(j10, j11, j12, i10, z10, z11, 0, 64, null);
    }

    public ChannelBond(long j10, long j11, long j12, int i10, boolean z10, boolean z11, int i11) {
        this.id = j10;
        this.networkChannelId = j11;
        this.devId = j12;
        this.devChannel = i10;
        this.routing = z10;
        this.syncRfConfig = z11;
        this.devRegion = i11;
    }

    public /* synthetic */ ChannelBond(long j10, long j11, long j12, int i10, boolean z10, boolean z11, int i11, int i12, rd.h hVar) {
        this((i12 & 1) != 0 ? 0L : j10, (i12 & 2) != 0 ? 0L : j11, (i12 & 4) != 0 ? 0L : j12, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? false : z10, (i12 & 32) != 0 ? true : z11, (i12 & 64) != 0 ? -1 : i11);
    }
}
