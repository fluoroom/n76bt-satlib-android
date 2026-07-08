package z2;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32871a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f32871a.add(imageHeaderParser);
    }

    public synchronized List b() {
        return this.f32871a;
    }
}
