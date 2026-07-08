package n6;

import e6.m;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f22546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f22547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f22548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f22549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f22550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f22551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22552g;

    public enum a {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean a() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public c(Object obj, m mVar) {
        this(obj, mVar, null);
    }

    public c(Object obj, m mVar, Object obj2) {
        this.f22546a = obj;
        this.f22548c = obj2;
        this.f22551f = mVar;
    }
}
