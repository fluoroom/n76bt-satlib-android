package u7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final i f28429a;

    protected h(i iVar) {
        this.f28429a = iVar;
    }

    public static i c(Activity activity) {
        return d(new g(activity));
    }

    protected static i d(g gVar) {
        if (gVar.d()) {
            return t1.S3(gVar.b());
        }
        if (gVar.c()) {
            return q1.a(gVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public Activity b() {
        Activity activityW = this.f28429a.W();
        v7.q.i(activityW);
        return activityW;
    }

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
