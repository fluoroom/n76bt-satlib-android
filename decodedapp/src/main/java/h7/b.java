package h7;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b f15154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Class f15155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList f15156c;

    public b(Class cls) {
        this(null, cls);
    }

    public void a(ResolvedRecursiveType resolvedRecursiveType) {
        if (this.f15156c == null) {
            this.f15156c = new ArrayList();
        }
        this.f15156c.add(resolvedRecursiveType);
    }

    public b b(Class cls) {
        return new b(this, cls);
    }

    public b c(Class cls) {
        if (this.f15155b == cls) {
            return this;
        }
        for (b bVar = this.f15154a; bVar != null; bVar = bVar.f15154a) {
            if (bVar.f15155b == cls) {
                return bVar;
            }
        }
        return null;
    }

    public void d(JavaType javaType) {
        ArrayList arrayList = this.f15156c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ResolvedRecursiveType) it.next()).o0(javaType);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ClassStack (self-refs: ");
        ArrayList arrayList = this.f15156c;
        sb2.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb2.append(')');
        for (b bVar = this; bVar != null; bVar = bVar.f15154a) {
            sb2.append(' ');
            sb2.append(bVar.f15155b.getName());
        }
        sb2.append(']');
        return sb2.toString();
    }

    private b(b bVar, Class cls) {
        this.f15154a = bVar;
        this.f15155b = cls;
    }
}
