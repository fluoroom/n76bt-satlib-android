package a0;

import a0.r;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f30a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f31b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final t[] f32c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final t[] f33d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f34e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f35f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f36g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f37h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f38i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f39j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f40k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f41l;

        public a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i10 != 0 ? IconCompat.b(null, "", i10) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f40k;
        }

        public boolean b() {
            return this.f34e;
        }

        public Bundle c() {
            return this.f30a;
        }

        public IconCompat d() {
            int i10;
            if (this.f31b == null && (i10 = this.f38i) != 0) {
                this.f31b = IconCompat.b(null, "", i10);
            }
            return this.f31b;
        }

        public t[] e() {
            return this.f32c;
        }

        public int f() {
            return this.f36g;
        }

        public boolean g() {
            return this.f35f;
        }

        public CharSequence h() {
            return this.f39j;
        }

        public boolean i() {
            return this.f41l;
        }

        public boolean j() {
            return this.f37h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, t[] tVarArr, t[] tVarArr2, boolean z10, int i10, boolean z11, boolean z12, boolean z13) {
            this.f35f = true;
            this.f31b = iconCompat;
            if (iconCompat != null && iconCompat.f() == 2) {
                this.f38i = iconCompat.d();
            }
            this.f39j = d.f(charSequence);
            this.f40k = pendingIntent;
            this.f30a = bundle == null ? new Bundle() : bundle;
            this.f32c = tVarArr;
            this.f33d = tVarArr2;
            this.f34e = z10;
            this.f36g = i10;
            this.f35f = z11;
            this.f37h = z12;
            this.f41l = z13;
        }
    }

    public static class b extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f42e;

        @Override // a0.k.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // a0.k.f
        public void b(j jVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(jVar.a()).setBigContentTitle(this.f81b).bigText(this.f42e);
            if (this.f83d) {
                bigTextStyleBigText.setSummaryText(this.f82c);
            }
        }

        @Override // a0.k.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f42e = d.f(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f69e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f70f = new ArrayList();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private r f71g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f72h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f73i;

        static class a {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class c {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z10) {
                return messagingStyle.setGroupConversation(z10);
            }
        }

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CharSequence f74a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f75b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final r f76c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f77d = new Bundle();

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private String f78e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private Uri f79f;

            static class a {
                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j10, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            static class b {
                static Parcelable a(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j10, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j10, person);
                }
            }

            public d(CharSequence charSequence, long j10, r rVar) {
                this.f74a = charSequence;
                this.f75b = j10;
                this.f76c = rVar;
            }

            static Bundle[] a(List list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bundleArr[i10] = ((d) list.get(i10)).h();
                }
                return bundleArr;
            }

            private Bundle h() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f74a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f75b);
                r rVar = this.f76c;
                if (rVar != null) {
                    bundle.putCharSequence("sender", rVar.c());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f76c.h()));
                    } else {
                        bundle.putBundle("person", this.f76c.i());
                    }
                }
                String str = this.f78e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f79f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f77d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f78e;
            }

            public Uri c() {
                return this.f79f;
            }

            public r d() {
                return this.f76c;
            }

            public CharSequence e() {
                return this.f74a;
            }

            public long f() {
                return this.f75b;
            }

            Notification.MessagingStyle.Message g() {
                Notification.MessagingStyle.Message messageA;
                r rVarD = d();
                if (Build.VERSION.SDK_INT >= 28) {
                    messageA = b.b(e(), f(), rVarD != null ? rVarD.h() : null);
                } else {
                    messageA = a.a(e(), f(), rVarD != null ? rVarD.c() : null);
                }
                if (b() != null) {
                    a.b(messageA, b(), c());
                }
                return messageA;
            }
        }

        public e(CharSequence charSequence) {
            this.f71g = new r.b().b(charSequence).a();
        }

        private d i() {
            for (int size = this.f69e.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f69e.get(size);
                if (dVar.d() != null && !TextUtils.isEmpty(dVar.d().c())) {
                    return dVar;
                }
            }
            if (this.f69e.isEmpty()) {
                return null;
            }
            return (d) this.f69e.get(r0.size() - 1);
        }

        private boolean j() {
            for (int size = this.f69e.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f69e.get(size);
                if (dVar.d() != null && dVar.d().c() == null) {
                    return true;
                }
            }
            return false;
        }

        private TextAppearanceSpan l(int i10) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i10), null);
        }

        private CharSequence m(d dVar) {
            k0.a aVarC = k0.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence charSequenceC = dVar.d() == null ? "" : dVar.d().c();
            int iD = -16777216;
            if (TextUtils.isEmpty(charSequenceC)) {
                charSequenceC = this.f71g.c();
                if (this.f80a.d() != 0) {
                    iD = this.f80a.d();
                }
            }
            CharSequence charSequenceH = aVarC.h(charSequenceC);
            spannableStringBuilder.append(charSequenceH);
            spannableStringBuilder.setSpan(l(iD), spannableStringBuilder.length() - charSequenceH.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(aVarC.h(dVar.e() != null ? dVar.e() : ""));
            return spannableStringBuilder;
        }

        @Override // a0.k.f
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f71g.c());
            bundle.putBundle("android.messagingStyleUser", this.f71g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f72h);
            if (this.f72h != null && this.f73i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f72h);
            }
            if (!this.f69e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f69e));
            }
            if (!this.f70f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f70f));
            }
            Boolean bool = this.f73i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // a0.k.f
        public void b(j jVar) {
            n(k());
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                Notification.MessagingStyle messagingStyleA = i10 >= 28 ? c.a(this.f71g.h()) : a.b(this.f71g.c());
                Iterator it = this.f69e.iterator();
                while (it.hasNext()) {
                    a.a(messagingStyleA, ((d) it.next()).g());
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    Iterator it2 = this.f70f.iterator();
                    while (it2.hasNext()) {
                        b.a(messagingStyleA, ((d) it2.next()).g());
                    }
                }
                if (this.f73i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                    a.c(messagingStyleA, this.f72h);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    c.b(messagingStyleA, this.f73i.booleanValue());
                }
                messagingStyleA.setBuilder(jVar.a());
                return;
            }
            d dVarI = i();
            if (this.f72h != null && this.f73i.booleanValue()) {
                jVar.a().setContentTitle(this.f72h);
            } else if (dVarI != null) {
                jVar.a().setContentTitle("");
                if (dVarI.d() != null) {
                    jVar.a().setContentTitle(dVarI.d().c());
                }
            }
            if (dVarI != null) {
                jVar.a().setContentText(this.f72h != null ? m(dVarI) : dVarI.e());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z10 = this.f72h != null || j();
            for (int size = this.f69e.size() - 1; size >= 0; size--) {
                d dVar = (d) this.f69e.get(size);
                CharSequence charSequenceM = z10 ? m(dVar) : dVar.e();
                if (size != this.f69e.size() - 1) {
                    spannableStringBuilder.insert(0, (CharSequence) "\n");
                }
                spannableStringBuilder.insert(0, charSequenceM);
            }
            new Notification.BigTextStyle(jVar.a()).setBigContentTitle(null).bigText(spannableStringBuilder);
        }

        @Override // a0.k.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public e h(CharSequence charSequence, long j10, CharSequence charSequence2) {
            this.f69e.add(new d(charSequence, j10, new r.b().b(charSequence2).a()));
            if (this.f69e.size() > 25) {
                this.f69e.remove(0);
            }
            return this;
        }

        public boolean k() {
            d dVar = this.f80a;
            if (dVar != null && dVar.f43a.getApplicationInfo().targetSdkVersion < 28 && this.f73i == null) {
                return this.f72h != null;
            }
            Boolean bool = this.f73i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public e n(boolean z10) {
            this.f73i = Boolean.valueOf(z10);
            return this;
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d f80a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f81b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f82c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f83d = false;

        public void a(Bundle bundle) {
            if (this.f83d) {
                bundle.putCharSequence("android.summaryText", this.f82c);
            }
            CharSequence charSequence = this.f81b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(j jVar);

        protected abstract String c();

        public RemoteViews d(j jVar) {
            return null;
        }

        public RemoteViews e(j jVar) {
            return null;
        }

        public RemoteViews f(j jVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f80a != dVar) {
                this.f80a = dVar;
                if (dVar != null) {
                    dVar.t(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static class d {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        long O;
        int P;
        int Q;
        boolean R;
        Notification S;
        boolean T;
        Object U;
        public ArrayList V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f43a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f44b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f45c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f46d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f47e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f48f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        String f49g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f50h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        PendingIntent f51i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        RemoteViews f52j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        IconCompat f53k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        CharSequence f54l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f55m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f56n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f57o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        boolean f58p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        f f59q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f60r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence f61s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        CharSequence[] f62t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f63u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f64v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        boolean f65w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        String f66x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        boolean f67y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        String f68z;

        public d(Context context, String str) {
            this.f44b = new ArrayList();
            this.f45c = new ArrayList();
            this.f46d = new ArrayList();
            this.f57o = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.P = 0;
            this.Q = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.f43a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.f56n = 0;
            this.V = new ArrayList();
            this.R = true;
        }

        protected static CharSequence f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void m(int i10, boolean z10) {
            if (z10) {
                Notification notification = this.S;
                notification.flags = i10 | notification.flags;
            } else {
                Notification notification2 = this.S;
                notification2.flags = (~i10) & notification2.flags;
            }
        }

        public d a(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f44b.add(new a(i10, charSequence, pendingIntent));
            return this;
        }

        public d b(a aVar) {
            if (aVar != null) {
                this.f44b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new l(this).c();
        }

        public int d() {
            return this.F;
        }

        public Bundle e() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public d g(boolean z10) {
            m(16, z10);
            return this;
        }

        public d h(String str) {
            this.L = str;
            return this;
        }

        public d i(PendingIntent pendingIntent) {
            this.f50h = pendingIntent;
            return this;
        }

        public d j(CharSequence charSequence) {
            this.f48f = f(charSequence);
            return this;
        }

        public d k(CharSequence charSequence) {
            this.f47e = f(charSequence);
            return this;
        }

        public d l(int i10) {
            Notification notification = this.S;
            notification.defaults = i10;
            if ((i10 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public d n(PendingIntent pendingIntent, boolean z10) {
            this.f51i = pendingIntent;
            m(128, z10);
            return this;
        }

        public d o(boolean z10) {
            this.A = z10;
            return this;
        }

        public d p(boolean z10) {
            m(2, z10);
            return this;
        }

        public d q(int i10) {
            this.f56n = i10;
            return this;
        }

        public d r(int i10, int i11, boolean z10) {
            this.f63u = i10;
            this.f64v = i11;
            this.f65w = z10;
            return this;
        }

        public d s(int i10) {
            this.S.icon = i10;
            return this;
        }

        public d t(f fVar) {
            if (this.f59q != fVar) {
                this.f59q = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public d u(CharSequence charSequence) {
            this.S.tickerText = f(charSequence);
            return this;
        }

        public d v(long j10) {
            this.S.when = j10;
            return this;
        }

        public d(Context context) {
            this(context, null);
        }
    }
}
