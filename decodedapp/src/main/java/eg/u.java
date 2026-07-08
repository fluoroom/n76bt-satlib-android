package eg;

import he.j1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final he.e f12202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f12203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Collection f12204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(he.e eVar, List list, Collection collection, dg.n nVar) {
        super(nVar);
        if (eVar == null) {
            H(0);
        }
        if (list == null) {
            H(1);
        }
        if (collection == null) {
            H(2);
        }
        if (nVar == null) {
            H(3);
        }
        this.f12202d = eVar;
        this.f12203e = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f12204f = DesugarCollections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // eg.v, eg.u1
    /* JADX INFO: renamed from: I */
    public he.e q() {
        he.e eVar = this.f12202d;
        if (eVar == null) {
            H(5);
        }
        return eVar;
    }

    @Override // eg.u1
    public List getParameters() {
        List list = this.f12203e;
        if (list == null) {
            H(4);
        }
        return list;
    }

    @Override // eg.p
    protected Collection m() {
        Collection collection = this.f12204f;
        if (collection == null) {
            H(6);
        }
        return collection;
    }

    @Override // eg.u1
    public boolean r() {
        return true;
    }

    public String toString() {
        return qf.i.m(this.f12202d).a();
    }

    @Override // eg.p
    protected he.j1 v() {
        j1.a aVar = j1.a.f15286a;
        if (aVar == null) {
            H(7);
        }
        return aVar;
    }
}
