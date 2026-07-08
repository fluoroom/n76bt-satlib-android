package com.dw.ht.map.entitys;

import com.dw.ht.j0;
import com.dw.ht.map.entitys.ETag;
import dd.j;
import dd.k;
import io.objectbox.annotation.Entity;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0001-BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010#R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010#R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010#R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/dw/ht/map/entitys/ETag;", "", "", Name.MARK, "Lz4/j;", "mapLayer", "", "x", "y", "z", "", "tag", "<init>", "(JLz4/j;IIILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "d", "()J", "j", "(J)V", "Lz4/j;", "e", "()Lz4/j;", "setMapLayer", "(Lz4/j;)V", "I", "g", "setX", "(I)V", "h", "setY", "i", "setZ", "Ljava/lang/String;", "f", "k", "(Ljava/lang/String;)V", "Companion", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final /* data */ class ETag {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final j box$delegate = k.b(new qd.a() { // from class: a5.a
        @Override // qd.a
        public final Object a() {
            return ETag.c();
        }
    });
    private long id;
    private z4.j mapLayer;
    private String tag;
    private int x;
    private int y;
    private int z;

    /* JADX INFO: renamed from: com.dw.ht.map.entitys.ETag$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final ETag a(z4.j jVar, int i10, int i11, int i12) {
            m.e(jVar, "mapLayer");
            QueryBuilder queryBuilderQ = b().q();
            m.d(queryBuilderQ, "builder");
            queryBuilderQ.e(a.f6571f, jVar.ordinal());
            queryBuilderQ.e(a.f6572g, i10);
            queryBuilderQ.e(a.f6573h, i11);
            queryBuilderQ.e(a.f6574r, i12);
            Query queryA = queryBuilderQ.a();
            m.d(queryA, "builder.build()");
            ETag eTag = (ETag) queryA.H();
            if (eTag != null) {
                return eTag;
            }
            return new ETag(0L, jVar, i10, i11, i12, null, 33, null);
        }

        public final io.objectbox.a b() {
            Object value = ETag.box$delegate.getValue();
            m.d(value, "getValue(...)");
            return (io.objectbox.a) value;
        }

        private Companion() {
        }
    }

    public ETag() {
        this(0L, null, 0, 0, 0, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final io.objectbox.a c() {
        return j0.i().k(ETag.class);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final z4.j getMapLayer() {
        return this.mapLayer;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ETag)) {
            return false;
        }
        ETag eTag = (ETag) other;
        return this.id == eTag.id && this.mapLayer == eTag.mapLayer && this.x == eTag.x && this.y == eTag.y && this.z == eTag.z && m.a(this.tag, eTag.tag);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        return (((((((((o4.a.a(this.id) * 31) + this.mapLayer.hashCode()) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.tag.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getZ() {
        return this.z;
    }

    public final void j(long j10) {
        this.id = j10;
    }

    public final void k(String str) {
        m.e(str, "<set-?>");
        this.tag = str;
    }

    public String toString() {
        return "ETag(id=" + this.id + ", mapLayer=" + this.mapLayer + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", tag=" + this.tag + ')';
    }

    public ETag(long j10, z4.j jVar, int i10, int i11, int i12, String str) {
        m.e(jVar, "mapLayer");
        m.e(str, "tag");
        this.id = j10;
        this.mapLayer = jVar;
        this.x = i10;
        this.y = i11;
        this.z = i12;
        this.tag = str;
    }

    public /* synthetic */ ETag(long j10, z4.j jVar, int i10, int i11, int i12, String str, int i13, h hVar) {
        this((i13 & 1) != 0 ? 0L : j10, (i13 & 2) != 0 ? z4.j.f32938b : jVar, (i13 & 4) != 0 ? 0 : i10, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) == 0 ? i12 : 0, (i13 & 32) != 0 ? "" : str);
    }
}
