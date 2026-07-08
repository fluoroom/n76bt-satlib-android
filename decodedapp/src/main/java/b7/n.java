package b7;

import com.fasterxml.jackson.databind.JavaType;

/* JADX INFO: loaded from: classes.dex */
public class n extends l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f3705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f3706e;

    protected n(JavaType javaType, com.fasterxml.jackson.databind.type.c cVar, a7.c cVar2) {
        super(javaType, cVar, cVar2);
        String name = javaType.r().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.f3705d = "";
            this.f3706e = ".";
        } else {
            this.f3706e = name.substring(0, iLastIndexOf + 1);
            this.f3705d = name.substring(0, iLastIndexOf);
        }
    }

    public static n j(JavaType javaType, r6.q qVar, a7.c cVar) {
        return new n(javaType, qVar.D(), cVar);
    }

    @Override // b7.l, a7.f
    public String a(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.f3706e) ? name.substring(this.f3706e.length() - 1) : name;
    }

    @Override // b7.l
    protected JavaType h(String str, p6.e eVar) {
        if (str.startsWith(".")) {
            StringBuilder sb2 = new StringBuilder(str.length() + this.f3705d.length());
            if (this.f3705d.isEmpty()) {
                sb2.append(str.substring(1));
            } else {
                sb2.append(this.f3705d);
                sb2.append(str);
            }
            str = sb2.toString();
        }
        return super.h(str, eVar);
    }
}
