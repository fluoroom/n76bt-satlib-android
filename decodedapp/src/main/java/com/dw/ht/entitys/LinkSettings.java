package com.dw.ht.entitys;

import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/dw/ht/entitys/LinkSettings;", "", "", Name.MARK, "linkId", "", "syncSignalingSettings", "monitor", "<init>", "(JJLjava/lang/Boolean;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "a", "()J", "e", "(J)V", "b", "setLinkId", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "g", "(Ljava/lang/Boolean;)V", "Z", "c", "()Z", "f", "(Z)V", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final /* data */ class LinkSettings {
    private long id;
    private long linkId;
    private boolean monitor;
    private Boolean syncSignalingSettings;

    public LinkSettings() {
        this(0L, 0L, null, false, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLinkId() {
        return this.linkId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getMonitor() {
        return this.monitor;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getSyncSignalingSettings() {
        return this.syncSignalingSettings;
    }

    public final void e(long j10) {
        this.id = j10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkSettings)) {
            return false;
        }
        LinkSettings linkSettings = (LinkSettings) other;
        return this.id == linkSettings.id && this.linkId == linkSettings.linkId && m.a(this.syncSignalingSettings, linkSettings.syncSignalingSettings) && this.monitor == linkSettings.monitor;
    }

    public final void f(boolean z10) {
        this.monitor = z10;
    }

    public final void g(Boolean bool) {
        this.syncSignalingSettings = bool;
    }

    public int hashCode() {
        int iA = ((o4.a.a(this.id) * 31) + o4.a.a(this.linkId)) * 31;
        Boolean bool = this.syncSignalingSettings;
        return ((iA + (bool == null ? 0 : bool.hashCode())) * 31) + o4.b.a(this.monitor);
    }

    public String toString() {
        return "LinkSettings(id=" + this.id + ", linkId=" + this.linkId + ", syncSignalingSettings=" + this.syncSignalingSettings + ", monitor=" + this.monitor + ')';
    }

    public LinkSettings(long j10) {
        this(j10, 0L, null, false, 14, null);
    }

    public LinkSettings(long j10, long j11) {
        this(j10, j11, null, false, 12, null);
    }

    public LinkSettings(long j10, long j11, Boolean bool) {
        this(j10, j11, bool, false, 8, null);
    }

    public LinkSettings(long j10, long j11, Boolean bool, boolean z10) {
        this.id = j10;
        this.linkId = j11;
        this.syncSignalingSettings = bool;
        this.monitor = z10;
    }

    public /* synthetic */ LinkSettings(long j10, long j11, Boolean bool, boolean z10, int i10, rd.h hVar) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? false : z10);
    }
}
