package fa;

import com.google.android.gms.maps.model.CameraPosition;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class g extends a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f12911b;

    public g(b bVar) {
        this.f12911b = bVar;
    }

    @Override // fa.b
    public Set b(float f10) {
        return this.f12911b.b(f10);
    }

    @Override // fa.b
    public boolean c(Collection collection) {
        return this.f12911b.c(collection);
    }

    @Override // fa.b
    public void d() {
        this.f12911b.d();
    }

    @Override // fa.b
    public int e() {
        return this.f12911b.e();
    }

    @Override // fa.f
    public boolean f() {
        return false;
    }

    @Override // fa.f
    public void a(CameraPosition cameraPosition) {
    }
}
