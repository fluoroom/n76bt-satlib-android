package i7;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f15919a = new e();

    static class a extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15920b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15921c;

        a(String str, String str2) {
            this.f15920b = str;
            this.f15921c = str2;
        }

        @Override // i7.s
        public String c(String str) {
            return this.f15920b + str + this.f15921c;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.f15920b + "','" + this.f15921c + "')]";
        }
    }

    static class b extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15922b;

        b(String str) {
            this.f15922b = str;
        }

        @Override // i7.s
        public String c(String str) {
            return this.f15922b + str;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.f15922b + "')]";
        }
    }

    static class c extends s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f15923b;

        c(String str) {
            this.f15923b = str;
        }

        @Override // i7.s
        public String c(String str) {
            return str + this.f15923b;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.f15923b + "')]";
        }
    }

    public static class d extends s implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final s f15924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final s f15925c;

        public d(s sVar, s sVar2) {
            this.f15924b = sVar;
            this.f15925c = sVar2;
        }

        @Override // i7.s
        public String c(String str) {
            return this.f15924b.c(this.f15925c.c(str));
        }

        public String toString() {
            return "[ChainedTransformer(" + this.f15924b + ", " + this.f15925c + ")]";
        }
    }

    protected s() {
    }

    public static s a(s sVar, s sVar2) {
        return new d(sVar, sVar2);
    }

    public static s b(String str, String str2) {
        boolean z10 = false;
        boolean z11 = (str == null || str.isEmpty()) ? false : true;
        if (str2 != null && !str2.isEmpty()) {
            z10 = true;
        }
        return z11 ? z10 ? new a(str, str2) : new b(str) : z10 ? new c(str2) : f15919a;
    }

    public abstract String c(String str);

    protected static final class e extends s implements Serializable {
        protected e() {
        }

        @Override // i7.s
        public String c(String str) {
            return str;
        }
    }
}
