package ke;

import eg.d2;
import eg.f2;
import eg.m2;
import he.a;
import he.b;
import he.b1;
import he.g1;
import he.l1;
import he.s1;
import he.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ke.u0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends n implements he.z {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private Collection H;
    private volatile qd.a I;
    private final he.z J;
    private final b.a K;
    private he.z L;
    protected Map M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f19757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f19758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private eg.r0 f19759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f19760h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b1 f19761r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b1 f19762s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private he.e0 f19763t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private he.u f19764u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f19765v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f19766w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f19767x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f19768y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f19769z;

    class a implements qd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f2 f19770a;

        a(f2 f2Var) {
            this.f19770a = f2Var;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Collection a() {
            og.j jVar = new og.j();
            Iterator it = s.this.e().iterator();
            while (it.hasNext()) {
                jVar.add(((he.z) it.next()).c(this.f19770a));
            }
            return jVar;
        }
    }

    static class b implements qd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f19772a;

        b(List list) {
            this.f19772a = list;
        }

        @Override // qd.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a() {
            return this.f19772a;
        }
    }

    public class c implements z.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d2 f19773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected he.m f19774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected he.e0 f19775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected he.u f19776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected he.z f19777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected b.a f19778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected List f19779g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected List f19780h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected b1 f19781i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        protected b1 f19782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected eg.r0 f19783k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        protected mf.f f19784l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        protected boolean f19785m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        protected boolean f19786n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        protected boolean f19787o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        protected boolean f19788p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f19789q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List f19790r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private ie.h f19791s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f19792t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Map f19793u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Boolean f19794v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        protected boolean f19795w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final /* synthetic */ s f19796x;

        public c(s sVar, d2 d2Var, he.m mVar, he.e0 e0Var, he.u uVar, b.a aVar, List list, List list2, b1 b1Var, eg.r0 r0Var, mf.f fVar) {
            if (d2Var == null) {
                u(0);
            }
            if (mVar == null) {
                u(1);
            }
            if (e0Var == null) {
                u(2);
            }
            if (uVar == null) {
                u(3);
            }
            if (aVar == null) {
                u(4);
            }
            if (list == null) {
                u(5);
            }
            if (list2 == null) {
                u(6);
            }
            if (r0Var == null) {
                u(7);
            }
            this.f19796x = sVar;
            this.f19777e = null;
            this.f19782j = sVar.f19762s;
            this.f19785m = true;
            this.f19786n = false;
            this.f19787o = false;
            this.f19788p = false;
            this.f19789q = sVar.w0();
            this.f19790r = null;
            this.f19791s = null;
            this.f19792t = sVar.D0();
            this.f19793u = new LinkedHashMap();
            this.f19794v = null;
            this.f19795w = false;
            this.f19773a = d2Var;
            this.f19774b = mVar;
            this.f19775c = e0Var;
            this.f19776d = uVar;
            this.f19778f = aVar;
            this.f19779g = list;
            this.f19780h = list2;
            this.f19781i = b1Var;
            this.f19783k = r0Var;
            this.f19784l = fVar;
        }

        private static /* synthetic */ void u(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case 22:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 32:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case 22:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public c n(ie.h hVar) {
            if (hVar == null) {
                u(35);
            }
            this.f19791s = hVar;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public c l(boolean z10) {
            this.f19785m = z10;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public c d(b1 b1Var) {
            this.f19782j = b1Var;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public c a() {
            this.f19788p = true;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public c p(b1 b1Var) {
            this.f19781i = b1Var;
            return this;
        }

        public c G(boolean z10) {
            this.f19794v = Boolean.valueOf(z10);
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public c k() {
            this.f19792t = true;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public c q() {
            this.f19789q = true;
            return this;
        }

        public c J(boolean z10) {
            this.f19795w = z10;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public c s(b.a aVar) {
            if (aVar == null) {
                u(14);
            }
            this.f19778f = aVar;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public c e(he.e0 e0Var) {
            if (e0Var == null) {
                u(10);
            }
            this.f19775c = e0Var;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public c r(mf.f fVar) {
            if (fVar == null) {
                u(17);
            }
            this.f19784l = fVar;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public c b(he.b bVar) {
            this.f19777e = (he.z) bVar;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public c j(he.m mVar) {
            if (mVar == null) {
                u(8);
            }
            this.f19774b = mVar;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public c g() {
            this.f19787o = true;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public c i(eg.r0 r0Var) {
            if (r0Var == null) {
                u(23);
            }
            this.f19783k = r0Var;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public c t() {
            this.f19786n = true;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public c f(d2 d2Var) {
            if (d2Var == null) {
                u(37);
            }
            this.f19773a = d2Var;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public c o(List list) {
            if (list == null) {
                u(21);
            }
            this.f19790r = list;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public c c(List list) {
            if (list == null) {
                u(19);
            }
            this.f19779g = list;
            return this;
        }

        @Override // he.z.a
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public c h(he.u uVar) {
            if (uVar == null) {
                u(12);
            }
            this.f19776d = uVar;
            return this;
        }

        @Override // he.z.a
        public he.z build() {
            return this.f19796x.M0(this);
        }

        @Override // he.z.a
        public z.a m(a.InterfaceC0214a interfaceC0214a, Object obj) {
            if (interfaceC0214a == null) {
                u(39);
            }
            this.f19793u.put(interfaceC0214a, obj);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected s(he.m mVar, he.z zVar, ie.h hVar, mf.f fVar, b.a aVar, g1 g1Var) {
        super(mVar, hVar, fVar, g1Var);
        if (mVar == null) {
            K(0);
        }
        if (hVar == null) {
            K(1);
        }
        if (fVar == null) {
            K(2);
        }
        if (aVar == null) {
            K(3);
        }
        if (g1Var == null) {
            K(4);
        }
        this.f19764u = he.t.f15313i;
        this.f19765v = false;
        this.f19766w = false;
        this.f19767x = false;
        this.f19768y = false;
        this.f19769z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = false;
        this.H = null;
        this.I = null;
        this.L = null;
        this.M = null;
        this.J = zVar == null ? this : zVar;
        this.K = aVar;
    }

    private static /* synthetic */ void K(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    private g1 N0(boolean z10, he.z zVar) {
        g1 source;
        if (z10) {
            if (zVar == null) {
                zVar = a();
            }
            source = zVar.getSource();
        } else {
            source = g1.f15281a;
        }
        if (source == null) {
            K(27);
        }
        return source;
    }

    public static List O0(he.z zVar, List list, f2 f2Var) {
        if (list == null) {
            K(28);
        }
        if (f2Var == null) {
            K(29);
        }
        return P0(zVar, list, f2Var, false, false, null);
    }

    public static List P0(he.z zVar, List list, f2 f2Var, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            K(30);
        }
        if (f2Var == null) {
            K(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s1 s1Var = (s1) it.next();
            eg.r0 type = s1Var.getType();
            m2 m2Var = m2.f12141f;
            eg.r0 r0VarP = f2Var.p(type, m2Var);
            eg.r0 r0VarK0 = s1Var.k0();
            eg.r0 r0VarP2 = r0VarK0 == null ? null : f2Var.p(r0VarK0, m2Var);
            if (r0VarP == null) {
                return null;
            }
            if ((r0VarP != s1Var.getType() || r0VarK0 != r0VarP2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(u0.K0(zVar, z10 ? null : s1Var, s1Var.getIndex(), s1Var.getAnnotations(), s1Var.getName(), r0VarP, s1Var.u0(), s1Var.b0(), s1Var.Z(), r0VarP2, z11 ? s1Var.getSource() : g1.f15281a, s1Var instanceof u0.b ? new b(((u0.b) s1Var).P0()) : null));
        }
        return arrayList;
    }

    private void T0() {
        qd.a aVar = this.I;
        if (aVar != null) {
            this.H = (Collection) aVar.a();
            this.I = null;
        }
    }

    private void a1(boolean z10) {
        this.D = z10;
    }

    private void b1(boolean z10) {
        this.C = z10;
    }

    private void d1(he.z zVar) {
        this.L = zVar;
    }

    public boolean A() {
        return this.f19767x;
    }

    @Override // he.z
    public boolean D0() {
        return this.D;
    }

    @Override // he.d0
    public boolean F0() {
        return this.B;
    }

    @Override // he.z
    public boolean I0() {
        if (this.f19766w) {
            return true;
        }
        Iterator it = a().e().iterator();
        while (it.hasNext()) {
            if (((he.z) it.next()).I0()) {
                return true;
            }
        }
        return false;
    }

    @Override // he.a
    public boolean J() {
        return this.G;
    }

    public he.z K0(he.m mVar, he.e0 e0Var, he.u uVar, b.a aVar, boolean z10) {
        he.z zVarBuild = u().j(mVar).e(e0Var).h(uVar).s(aVar).l(z10).build();
        if (zVarBuild == null) {
            K(26);
        }
        return zVarBuild;
    }

    /* JADX INFO: renamed from: L0 */
    protected abstract s o1(he.m mVar, he.z zVar, b.a aVar, mf.f fVar, ie.h hVar, g1 g1Var);

    @Override // he.d0
    public boolean M() {
        return this.A;
    }

    protected he.z M0(c cVar) {
        n0 n0Var;
        he.z zVar;
        eg.r0 r0VarP;
        if (cVar == null) {
            K(25);
        }
        boolean[] zArr = new boolean[1];
        ie.h hVarA = cVar.f19791s != null ? ie.j.a(getAnnotations(), cVar.f19791s) : getAnnotations();
        he.m mVar = cVar.f19774b;
        he.z zVar2 = cVar.f19777e;
        s sVarL0 = o1(mVar, zVar2, cVar.f19778f, cVar.f19784l, hVarA, N0(cVar.f19787o, zVar2));
        List typeParameters = cVar.f19790r == null ? getTypeParameters() : cVar.f19790r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        f2 f2VarC = eg.c0.c(typeParameters, cVar.f19773a, sVarL0, arrayList, zArr);
        b1 b1Var = null;
        if (f2VarC == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!cVar.f19780h.isEmpty()) {
            int i10 = 0;
            for (b1 b1Var2 : cVar.f19780h) {
                eg.r0 r0VarP2 = f2VarC.p(b1Var2.getType(), m2.f12141f);
                if (r0VarP2 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(qf.h.b(sVarL0, r0VarP2, ((yf.f) b1Var2.getValue()).a(), b1Var2.getAnnotations(), i10));
                zArr[0] = zArr[0] | (r0VarP2 != b1Var2.getType());
                i10 = i11;
            }
        }
        b1 b1Var3 = cVar.f19781i;
        if (b1Var3 != null) {
            eg.r0 r0VarP3 = f2VarC.p(b1Var3.getType(), m2.f12141f);
            if (r0VarP3 == null) {
                return null;
            }
            n0 n0Var2 = new n0(sVarL0, new yf.d(sVarL0, r0VarP3, cVar.f19781i.getValue()), cVar.f19781i.getAnnotations());
            zArr[0] = (r0VarP3 != cVar.f19781i.getType()) | zArr[0];
            n0Var = n0Var2;
        } else {
            n0Var = null;
        }
        b1 b1Var4 = cVar.f19782j;
        if (b1Var4 != null) {
            b1 b1VarC = b1Var4.c(f2VarC);
            if (b1VarC == null) {
                return null;
            }
            zArr[0] = zArr[0] | (b1VarC != cVar.f19782j);
            zVar = null;
            b1Var = b1VarC;
        } else {
            zVar = null;
        }
        List listP0 = P0(sVarL0, cVar.f19779g, f2VarC, cVar.f19788p, cVar.f19787o, zArr);
        if (listP0 == null || (r0VarP = f2VarC.p(cVar.f19783k, m2.f12142g)) == null) {
            return zVar;
        }
        boolean z10 = zArr[0] | (r0VarP != cVar.f19783k);
        zArr[0] = z10;
        if (!z10 && cVar.f19795w) {
            return this;
        }
        sVarL0.R0(n0Var, b1Var, arrayList2, arrayList, listP0, r0VarP, cVar.f19775c, cVar.f19776d);
        sVarL0.f1(this.f19765v);
        sVarL0.c1(this.f19766w);
        sVarL0.X0(this.f19767x);
        sVarL0.e1(this.f19768y);
        sVarL0.i1(this.f19769z);
        sVarL0.h1(this.E);
        sVarL0.W0(this.A);
        sVarL0.V0(this.B);
        sVarL0.Y0(this.F);
        sVarL0.b1(cVar.f19789q);
        sVarL0.a1(cVar.f19792t);
        sVarL0.Z0(cVar.f19794v != null ? cVar.f19794v.booleanValue() : this.G);
        if (!cVar.f19793u.isEmpty() || this.M != null) {
            Map map = cVar.f19793u;
            Map map2 = this.M;
            if (map2 != null) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                sVarL0.M = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                sVarL0.M = map;
            }
        }
        if (cVar.f19786n || e0() != null) {
            sVarL0.d1((e0() != null ? e0() : this).c(f2VarC));
        }
        if (cVar.f19785m && !a().e().isEmpty()) {
            if (cVar.f19773a.f()) {
                qd.a aVar = this.I;
                if (aVar != null) {
                    sVarL0.I = aVar;
                    return sVarL0;
                }
                sVarL0.x0(e());
                return sVarL0;
            }
            sVarL0.I = new a(f2VarC);
        }
        return sVarL0;
    }

    public boolean Q0() {
        return this.F;
    }

    public boolean R() {
        return this.f19769z;
    }

    public s R0(b1 b1Var, b1 b1Var2, List list, List list2, List list3, eg.r0 r0Var, he.e0 e0Var, he.u uVar) {
        if (list == null) {
            K(5);
        }
        if (list2 == null) {
            K(6);
        }
        if (list3 == null) {
            K(7);
        }
        if (uVar == null) {
            K(8);
        }
        this.f19757e = ed.q.H0(list2);
        this.f19758f = ed.q.H0(list3);
        this.f19759g = r0Var;
        this.f19763t = e0Var;
        this.f19764u = uVar;
        this.f19761r = b1Var;
        this.f19762s = b1Var2;
        this.f19760h = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            l1 l1Var = (l1) list2.get(i10);
            if (l1Var.getIndex() != i10) {
                throw new IllegalStateException(l1Var + " index is " + l1Var.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            s1 s1Var = (s1) list3.get(i11);
            if (s1Var.getIndex() != i11) {
                throw new IllegalStateException(s1Var + "index is " + s1Var.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    @Override // he.z
    public boolean S() {
        if (this.f19765v) {
            return true;
        }
        Iterator it = a().e().iterator();
        while (it.hasNext()) {
            if (((he.z) it.next()).S()) {
                return true;
            }
        }
        return false;
    }

    protected c S0(f2 f2Var) {
        if (f2Var == null) {
            K(24);
        }
        return new c(this, f2Var.j(), b(), l(), getVisibility(), j(), i(), q0(), l0(), g(), null);
    }

    public void U0(a.InterfaceC0214a interfaceC0214a, Object obj) {
        if (this.M == null) {
            this.M = new LinkedHashMap();
        }
        this.M.put(interfaceC0214a, obj);
    }

    public void V0(boolean z10) {
        this.B = z10;
    }

    public void W0(boolean z10) {
        this.A = z10;
    }

    public void X0(boolean z10) {
        this.f19767x = z10;
    }

    public void Y0(boolean z10) {
        this.F = z10;
    }

    public void Z0(boolean z10) {
        this.G = z10;
    }

    @Override // ke.n, ke.m, he.m
    public he.z a() {
        he.z zVar = this.J;
        he.z zVarA = zVar == this ? this : zVar.a();
        if (zVarA == null) {
            K(20);
        }
        return zVarA;
    }

    public void c1(boolean z10) {
        this.f19766w = z10;
    }

    public Object d0(a.InterfaceC0214a interfaceC0214a) {
        Map map = this.M;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC0214a);
    }

    public Collection e() {
        T0();
        Collection collection = this.H;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            K(14);
        }
        return collection;
    }

    @Override // he.z
    public he.z e0() {
        return this.L;
    }

    public void e1(boolean z10) {
        this.f19768y = z10;
    }

    public void f1(boolean z10) {
        this.f19765v = z10;
    }

    @Override // he.a
    public eg.r0 g() {
        return this.f19759g;
    }

    @Override // he.a
    public b1 g0() {
        return this.f19762s;
    }

    public void g1(eg.r0 r0Var) {
        if (r0Var == null) {
            K(11);
        }
        this.f19759g = r0Var;
    }

    @Override // he.a
    public List getTypeParameters() {
        List list = this.f19757e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // he.q
    public he.u getVisibility() {
        he.u uVar = this.f19764u;
        if (uVar == null) {
            K(16);
        }
        return uVar;
    }

    public void h1(boolean z10) {
        this.E = z10;
    }

    @Override // he.a
    public List i() {
        List list = this.f19758f;
        if (list == null) {
            K(19);
        }
        return list;
    }

    public void i1(boolean z10) {
        this.f19769z = z10;
    }

    public boolean isInline() {
        return this.f19768y;
    }

    @Override // he.b
    public b.a j() {
        b.a aVar = this.K;
        if (aVar == null) {
            K(21);
        }
        return aVar;
    }

    public void j1(he.u uVar) {
        if (uVar == null) {
            K(10);
        }
        this.f19764u = uVar;
    }

    @Override // he.d0
    public he.e0 l() {
        he.e0 e0Var = this.f19763t;
        if (e0Var == null) {
            K(15);
        }
        return e0Var;
    }

    @Override // he.a
    public b1 l0() {
        return this.f19761r;
    }

    @Override // he.a
    public List q0() {
        List list = this.f19760h;
        if (list == null) {
            K(13);
        }
        return list;
    }

    public boolean t() {
        return this.E;
    }

    public Object t0(he.o oVar, Object obj) {
        return oVar.a(this, obj);
    }

    public z.a u() {
        c cVarS0 = S0(f2.f12087b);
        if (cVarS0 == null) {
            K(23);
        }
        return cVarS0;
    }

    @Override // he.z
    public boolean w0() {
        return this.C;
    }

    public void x0(Collection collection) {
        if (collection == null) {
            K(17);
        }
        this.H = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((he.z) it.next()).D0()) {
                this.D = true;
                return;
            }
        }
    }

    @Override // he.z, he.i1
    public he.z c(f2 f2Var) {
        if (f2Var == null) {
            K(22);
        }
        return f2Var.k() ? this : S0(f2Var).b(a()).g().J(true).build();
    }
}
