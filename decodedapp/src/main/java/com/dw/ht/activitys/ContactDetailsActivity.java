package com.dw.ht.activitys;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.view.CSViewPager;
import androidx.fragment.app.w;
import androidx.viewpager.widget.ViewPager;
import com.benshikj.ht.R;
import com.dw.ht.activitys.ContactDetailsActivity;
import com.dw.ht.fragments.TalkListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import d5.l;
import kotlin.Metadata;
import rd.m;
import v4.u;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\u00060#R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/dw/ht/activitys/ContactDetailsActivity;", "Lv3/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lm4/c;", "i0", "Lm4/c;", "getBinding", "()Lm4/c;", "setBinding", "(Lm4/c;)V", "binding", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$c;", "j0", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$c;", "mOnNavigationItemSelectedListener", "", "k0", "Ljava/lang/String;", "contact", "Lcom/dw/ht/activitys/ContactDetailsActivity$a;", "l0", "Lcom/dw/ht/activitys/ContactDetailsActivity$a;", "adapter", "", "m0", "J", "uid", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContactDetailsActivity extends v3.b {

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private m4.c binding;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private final BottomNavigationView.c mOnNavigationItemSelectedListener = new BottomNavigationView.c() { // from class: j4.b
        @Override // com.google.android.material.navigation.l.c
        public final boolean a(MenuItem menuItem) {
            return ContactDetailsActivity.c2(this.f18414a, menuItem);
        }
    };

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private String contact;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private a adapter;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private long uid;

    private final class a extends o {

        /* JADX INFO: renamed from: h */
        private final int f5596h;

        /* JADX INFO: renamed from: i */
        private final int f5597i;

        /* JADX INFO: renamed from: j */
        final /* synthetic */ ContactDetailsActivity f5598j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ContactDetailsActivity contactDetailsActivity, w wVar) {
            super(wVar);
            m.e(wVar, "manager");
            this.f5598j = contactDetailsActivity;
            this.f5597i = 1;
        }

        @Override // androidx.viewpager.widget.a
        public int c() {
            return 2;
        }

        @Override // y0.o
        public androidx.fragment.app.o p(int i10) {
            if (i10 == this.f5596h) {
                TalkListFragment talkListFragmentB5 = TalkListFragment.B5(0L, this.f5598j.contact, this.f5598j.uid);
                m.d(talkListFragmentB5, "newInstance(...)");
                return talkListFragmentB5;
            }
            androidx.fragment.app.o oVarG = z4.m.g();
            m.d(oVarG, "getTrackFragment(...)");
            Bundle bundle = new Bundle();
            bundle.putString("com.dw.ht.intent.extras.FROM", this.f5598j.contact);
            bundle.putLong("com.dw.ht.intent.extras.UID", this.f5598j.uid);
            oVarG.E3(bundle);
            return oVarG;
        }

        public final int s() {
            return this.f5596h;
        }

        public final int t() {
            return this.f5597i;
        }
    }

    public static final class b implements ViewPager.j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m4.c f5599a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ContactDetailsActivity f5600b;

        b(m4.c cVar, ContactDetailsActivity contactDetailsActivity) {
            this.f5599a = cVar;
            this.f5600b = contactDetailsActivity;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void e(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void l0(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void n0(int i10) {
            BottomNavigationView bottomNavigationView = this.f5599a.f21005b;
            a aVar = this.f5600b.adapter;
            a aVar2 = null;
            if (aVar == null) {
                m.o("adapter");
                aVar = null;
            }
            bottomNavigationView.setSelectedItemId(i10 == aVar.s() ? R.id.forum : R.id.track);
            CSViewPager cSViewPager = this.f5599a.f21006c;
            a aVar3 = this.f5600b.adapter;
            if (aVar3 == null) {
                m.o("adapter");
            } else {
                aVar2 = aVar3;
            }
            cSViewPager.setDisableSlideSwitchingPagers(i10 == aVar2.t());
        }
    }

    public static final boolean c2(ContactDetailsActivity contactDetailsActivity, MenuItem menuItem) {
        CSViewPager cSViewPager;
        m4.c cVar;
        CSViewPager cSViewPager2;
        m.e(menuItem, "item");
        int itemId = menuItem.getItemId();
        a aVar = null;
        if (itemId != R.id.forum) {
            if (itemId != R.id.track || (cVar = contactDetailsActivity.binding) == null || (cSViewPager2 = cVar.f21006c) == null) {
                return true;
            }
            a aVar2 = contactDetailsActivity.adapter;
            if (aVar2 == null) {
                m.o("adapter");
            } else {
                aVar = aVar2;
            }
            cSViewPager2.setCurrentItem(aVar.t());
            return true;
        }
        m4.c cVar2 = contactDetailsActivity.binding;
        if (cVar2 == null || (cSViewPager = cVar2.f21006c) == null) {
            return true;
        }
        a aVar3 = contactDetailsActivity.adapter;
        if (aVar3 == null) {
            m.o("adapter");
        } else {
            aVar = aVar3;
        }
        cSViewPager.setCurrentItem(aVar.s());
        return true;
    }

    @Override // v3.b, androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.o(true);
        }
        m4.c cVarC = m4.c.c(getLayoutInflater());
        m.d(cVarC, "inflate(...)");
        this.binding = cVarC;
        setContentView(cVarC.b());
        this.contact = getIntent().getStringExtra("com.dw.ht.intent.extras.FROM");
        this.uid = getIntent().getLongExtra("com.dw.ht.intent.extras.UID", 0L);
        setTitle(this.contact);
        if (this.contact == null && this.uid != 0) {
            setTitle(l.g().f(this.uid));
        }
        w wVarN0 = N0();
        m.d(wVarN0, "getSupportFragmentManager(...)");
        a aVar = new a(this, wVarN0);
        this.adapter = aVar;
        cVarC.f21006c.setAdapter(aVar);
        cVarC.f21006c.d(new b(cVarC, this));
        cVarC.f21005b.setOnNavigationItemSelectedListener(this.mOnNavigationItemSelectedListener);
        if (getIntent().getBooleanExtra("com.dw.ht.intent.extras.SHOW_TRACK", false)) {
            cVarC.f21005b.setSelectedItemId(R.id.track);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        m.e(menu, "menu");
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.contact_details_o, menu);
        return true;
    }

    @Override // v3.b, v3.i, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }

    @Override // v3.b, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        m.e(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.call) {
            String str = this.contact;
            if (str != null) {
                u.e(this, str, null);
            } else {
                u.d(this, this.uid, null);
            }
        } else if (itemId == R.id.request_loc) {
            String str2 = this.contact;
            if (str2 != null) {
                u.g(this, str2, null);
            } else {
                u.f(this, this.uid, null);
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
