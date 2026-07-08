package com.dw.ht.entitys;

import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017¨\u0006 "}, d2 = {"Lcom/dw/ht/entitys/RegionBind;", "", "", Name.MARK, "devID", "", "devRegion", "regionID", "<init>", "(JJIJ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "c", "()J", "e", "(J)V", "a", "setDevID", "I", "b", "setDevRegion", "(I)V", "d", "f", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final /* data */ class RegionBind {
    private long devID;
    private int devRegion;
    private long id;
    private long regionID;

    public RegionBind() {
        this(0L, 0L, 0, 0L, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getDevID() {
        return this.devID;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDevRegion() {
        return this.devRegion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getRegionID() {
        return this.regionID;
    }

    public final void e(long j10) {
        this.id = j10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegionBind)) {
            return false;
        }
        RegionBind regionBind = (RegionBind) other;
        return this.id == regionBind.id && this.devID == regionBind.devID && this.devRegion == regionBind.devRegion && this.regionID == regionBind.regionID;
    }

    public final void f(long j10) {
        this.regionID = j10;
    }

    public int hashCode() {
        return (((((o4.a.a(this.id) * 31) + o4.a.a(this.devID)) * 31) + this.devRegion) * 31) + o4.a.a(this.regionID);
    }

    public String toString() {
        return "RegionBind(id=" + this.id + ", devID=" + this.devID + ", devRegion=" + this.devRegion + ", regionID=" + this.regionID + ')';
    }

    public RegionBind(long j10) {
        this(j10, 0L, 0, 0L, 14, null);
    }

    public RegionBind(long j10, long j11) {
        this(j10, j11, 0, 0L, 12, null);
    }

    public RegionBind(long j10, long j11, int i10) {
        this(j10, j11, i10, 0L, 8, null);
    }

    public RegionBind(long j10, long j11, int i10, long j12) {
        this.id = j10;
        this.devID = j11;
        this.devRegion = i10;
        this.regionID = j12;
    }

    public /* synthetic */ RegionBind(long j10, long j11, int i10, long j12, int i11, rd.h hVar) {
        this((i11 & 1) != 0 ? 0L : j10, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) != 0 ? -1 : i10, (i11 & 8) != 0 ? 0L : j12);
    }
}
