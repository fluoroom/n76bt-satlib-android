package qf;

/* JADX INFO: loaded from: classes3.dex */
public interface j {

    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    a a();

    b b(he.a aVar, he.a aVar2, he.e eVar);
}
