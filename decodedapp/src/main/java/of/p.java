package of;

/* JADX INFO: loaded from: classes3.dex */
public interface p extends q {

    public interface a extends Cloneable, q {
        a S(e eVar, g gVar);

        p build();
    }

    void a(f fVar);

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();
}
