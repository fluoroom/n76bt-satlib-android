package he;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends he.a, d0 {

    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean a() {
            return this != FAKE_OVERRIDE;
        }
    }

    b Q(m mVar, e0 e0Var, u uVar, a aVar, boolean z10);

    @Override // he.a, he.m
    b a();

    @Override // he.a
    Collection e();

    a j();

    void x0(Collection collection);
}
