package sf;

import eg.r0;
import he.h0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r0 f27357c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(List list, r0 r0Var) {
        super(list, new y(r0Var));
        rd.m.e(list, "value");
        rd.m.e(r0Var, "type");
        this.f27357c = r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 c(r0 r0Var, h0 h0Var) {
        rd.m.e(h0Var, "it");
        return r0Var;
    }

    public final r0 e() {
        return this.f27357c;
    }
}
