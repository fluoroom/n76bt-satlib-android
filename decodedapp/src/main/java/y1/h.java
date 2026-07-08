package y1;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] A;
    private static final /* synthetic */ kd.a B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f32338c = new h("UNKNOWN", 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f32339d = new h("GET_SEQID", 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h f32340e = new h("SET_INCOMING_ID", 2, 6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h f32341f = new h("SET_NET_STATUS", 3, 8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f32342g = new h("SET_SESSION_NAME", 4, 9);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f32343h = new h("PLAY_TONE", 5, 10);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f32344r = new h("SET_INCOMING_SESSION_NAME", 6, 12);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f32345s = new h("READ_SETTINGS", 7, 13);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final h f32346t = new h("WRITE_SETTINGS", 8, 14);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final h f32347u = new h("SET_BLE_AUDIO", 9, 15);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h f32348v = new h("TONE_PLAY_DONE_IND", 10, 256);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f32349w = new h("KEY_EVENT_IND", 11, 257);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final h f32350x = new h("TX_OPUS_AUDIO", 12, WXMediaMessage.TITLE_LENGTH_LIMIT);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f32351y = new h("PLAY_OPUS_EVENT", 13, 513);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final h f32352z = new h("PLAY_OPUS_AUDIO", 14, 514);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32353a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final h a(int i10) {
            for (h hVar : h.d()) {
                if (hVar.e() == i10) {
                    return hVar;
                }
            }
            return h.f32338c;
        }

        private a() {
        }
    }

    static {
        h[] hVarArrA = a();
        A = hVarArrA;
        B = kd.b.a(hVarArrA);
        f32337b = new a(null);
    }

    private h(String str, int i10, int i11) {
        this.f32353a = i11;
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f32338c, f32339d, f32340e, f32341f, f32342g, f32343h, f32344r, f32345s, f32346t, f32347u, f32348v, f32349w, f32350x, f32351y, f32352z};
    }

    public static kd.a d() {
        return B;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) A.clone();
    }

    public final int e() {
        return this.f32353a;
    }
}
