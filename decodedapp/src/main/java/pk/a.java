package pk;

import android.renderscript.Allocation;
import android.renderscript.FieldPacker;
import android.renderscript.RenderScript;
import android.renderscript.ScriptC;

/* JADX INFO: loaded from: classes3.dex */
public class a extends ScriptC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Allocation f24257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Allocation f24258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Allocation f24259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Allocation f24260d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Allocation f24261e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Allocation f24262f;

    public a(RenderScript renderScript) {
        super(renderScript, "decoder", d.a(), d.c());
    }

    public void a(Allocation allocation) {
        this.f24257a = allocation;
        if (allocation == null) {
            bindAllocation(null, 0);
        } else {
            bindAllocation(allocation, 0);
        }
    }

    public void b(Allocation allocation) {
        this.f24259c = allocation;
        if (allocation == null) {
            bindAllocation(null, 2);
        } else {
            bindAllocation(allocation, 2);
        }
    }

    public void c(Allocation allocation) {
        this.f24260d = allocation;
        if (allocation == null) {
            bindAllocation(null, 5);
        } else {
            bindAllocation(allocation, 5);
        }
    }

    public void d(Allocation allocation) {
        this.f24262f = allocation;
        if (allocation == null) {
            bindAllocation(null, 7);
        } else {
            bindAllocation(allocation, 7);
        }
    }

    public void e(Allocation allocation) {
        this.f24258b = allocation;
        if (allocation == null) {
            bindAllocation(null, 1);
        } else {
            bindAllocation(allocation, 1);
        }
    }

    public void f(Allocation allocation) {
        this.f24261e = allocation;
        if (allocation == null) {
            bindAllocation(null, 6);
        } else {
            bindAllocation(allocation, 6);
        }
    }

    public void g(int i10) {
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i10);
        invoke(23, fieldPacker);
    }

    public void h(int i10) {
        FieldPacker fieldPacker = new FieldPacker(4);
        fieldPacker.addI32(i10);
        invoke(18, fieldPacker);
    }

    public void i(float f10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        FieldPacker fieldPacker = new FieldPacker(32);
        fieldPacker.addF32(f10);
        fieldPacker.addI32(i10);
        fieldPacker.addI32(i11);
        fieldPacker.addI32(i12);
        fieldPacker.addI32(i13);
        fieldPacker.addI32(i14);
        fieldPacker.addI32(i15);
        fieldPacker.addI32(i16);
        invoke(19, fieldPacker);
    }

    public void j() {
        invoke(22);
    }
}
