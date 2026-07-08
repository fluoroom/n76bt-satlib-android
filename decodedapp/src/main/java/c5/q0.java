package c5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.FrameLayout;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.TrackRecordingService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import m4.r1;
import org.greenrobot.eventbus.ThreadMode;
import z4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0006J!\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J)\u0010(\u001a\u00020\t2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\u00020 2\n\u0010\u001f\u001a\u00060\u0003R\u00020\u00042\u0006\u0010*\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010,J;\u00104\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u000102H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\tH\u0016¢\u0006\u0004\b:\u0010\u0006J\u000f\u0010;\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\tH\u0016¢\u0006\u0004\b<\u0010\u0006J\u0017\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020=H\u0014¢\u0006\u0004\b?\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010P\u001a\n M*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lc5/q0;", "Lv3/c;", "Lc6/i;", "Lz4/h$c;", "Lz4/h;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "J2", "(Landroid/view/Menu;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/MenuItem;", "item", "", "F2", "(Landroid/view/MenuItem;)Z", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m2", "(IILandroid/content/Intent;)V", "action", "Q4", "(Lz4/h$c;I)Z", "Landroidx/fragment/app/o;", "sender", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "Lz4/h$b;", "event", "onMessageEvent", "(Lz4/h$b;)V", "O2", "P2", "M2", "", "newText", "D4", "(Ljava/lang/String;)V", "Lm4/r1;", "J0", "Lm4/r1;", "binding", "Lc5/r0;", "K0", "Lc5/r0;", "mAdapter", "Landroidx/recyclerview/widget/LinearLayoutManager;", "L0", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mLinearLayoutManager", "kotlin.jvm.PlatformType", "M0", "Lz4/h;", "kmlFileManager", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q0 extends v3.c implements c6.i {

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private r1 binding;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private r0 mAdapter;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private LinearLayoutManager mLinearLayoutManager;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private final z4.h kmlFileManager = z4.h.i();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4356a;

        static {
            int[] iArr = new int[h.b.values().length];
            try {
                iArr[h.b.ItemsChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4356a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R4(h.c cVar, DialogInterface dialogInterface, int i10) {
        cVar.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S4(DialogInterface dialogInterface, int i10) {
        rd.m.e(dialogInterface, "<unused var>");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(q0 q0Var, DialogInterface dialogInterface, int i10) {
        rd.m.e(dialogInterface, "<unused var>");
        TrackRecordingService.INSTANCE.g(false);
        q0Var.a4();
    }

    @Override // v3.f0
    protected void D4(String newText) {
        rd.m.e(newText, "newText");
        if (newText.length() <= 0) {
            r0 r0Var = this.mAdapter;
            if (r0Var != null) {
                Collection collectionH = this.kmlFileManager.h();
                rd.m.d(collectionH, "getAllKmls(...)");
                r0Var.F(ed.q.H0(collectionH));
                return;
            }
            return;
        }
        r0 r0Var2 = this.mAdapter;
        if (r0Var2 != null) {
            Collection collectionH2 = this.kmlFileManager.h();
            rd.m.d(collectionH2, "getAllKmls(...)");
            List listH0 = ed.q.H0(collectionH2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH0) {
                String str = ((h.c) obj).f32925a;
                rd.m.d(str, "fileName");
                if (rg.q.N(str, newText, true)) {
                    arrayList.add(obj);
                }
            }
            r0Var2.F(arrayList);
        }
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        switch (item.getItemId()) {
            case R.id._import /* 2131296280 */:
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.setType("application/vnd.google-earth.kml+xml");
                intent.addFlags(1);
                startActivityForResult(intent, 1);
                return true;
            case R.id.add_mark /* 2131296372 */:
                v3.q.o4(x3(), item.getTitle(), null, null, N1(R.string.title)).g4(j1(), "add_mark");
                return true;
            case R.id.search /* 2131297322 */:
                Q();
                break;
            case R.id.start /* 2131297442 */:
                TrackRecordingService.INSTANCE.g(true);
                a4();
                return true;
            case R.id.stop /* 2131297456 */:
                new c.a(x3()).j(R.string.stop_recording).m(R.string.no, new DialogInterface.OnClickListener() { // from class: c5.o0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        q0.S4(dialogInterface, i10);
                    }
                }).t(R.string.yes, new DialogInterface.OnClickListener() { // from class: c5.p0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        q0.T4(this.f4354a, dialogInterface, i10);
                    }
                }).C();
                return true;
        }
        return super.F2(item);
    }

    @Override // androidx.fragment.app.o
    public void J2(Menu menu) {
        rd.m.e(menu, "menu");
        boolean z10 = Cfg.O().recordingTrack;
        menu.findItem(R.id.start).setVisible(!z10);
        menu.findItem(R.id.stop).setVisible(z10);
        menu.findItem(R.id.add_mark).setVisible(z10);
        if (Cfg.f5482d) {
            menu.findItem(R.id._import).setShowAsAction(2);
        }
        super.J2(menu);
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        if (Cfg.f5482d) {
            z4.h.i().l();
        }
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        mi.c.e().q(this);
        r0 r0Var = this.mAdapter;
        if (r0Var != null) {
            Collection collectionH = this.kmlFileManager.h();
            rd.m.d(collectionH, "getAllKmls(...)");
            r0Var.F(ed.q.H0(collectionH));
        }
        super.O2();
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        mi.c.e().t(this);
        super.P2();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        r1 r1Var = this.binding;
        if (r1Var == null) {
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        this.mLinearLayoutManager = linearLayoutManager;
        r1Var.f21508c.setLayoutManager(linearLayoutManager);
        r1Var.f21508c.l(new c6.m(k1(), 0));
        r0 r0Var = new r0(k1(), this);
        this.mAdapter = r0Var;
        r1Var.f21508c.setAdapter(r0Var);
        g4(r1Var.f21508c);
    }

    @Override // c6.i
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public boolean V0(final h.c item, int action) {
        rd.m.e(item, "item");
        Context contextK1 = k1();
        if (contextK1 == null) {
            return true;
        }
        switch (action) {
            case R.id.del_btn /* 2131296621 */:
                new c.a(contextK1).k(contextK1.getString(R.string.prompt_del, item.e())).t(R.string.delete, new DialogInterface.OnClickListener() { // from class: c5.n0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        q0.R4(item, dialogInterface, i10);
                    }
                }).m(android.R.string.cancel, null).C();
                break;
            case R.id.edit /* 2131296696 */:
                v3.q qVarO4 = v3.q.o4(contextK1, null, null, item.e(), null);
                qVarO4.w3().putString("old_name", item.f32925a);
                qVarO4.g4(j1(), "edit_name");
                break;
            case R.id.share /* 2131297371 */:
                Uri uriH = FileProvider.h(contextK1, "com.benshikj.ht.files", item.b());
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("application/vnd.google-earth.kml+xml");
                intent.addFlags(1);
                intent.putExtra("android.intent.extra.STREAM", uriH);
                Intent intentCreateChooser = Intent.createChooser(intent, null);
                rd.m.d(intentCreateChooser, "createChooser(...)");
                v3.j.e(contextK1, intentCreateChooser);
                break;
            case R.id.visibility /* 2131297668 */:
                item.k();
                break;
            default:
                Intent intent2 = new Intent();
                intent2.putExtra("android.intent.extra.TEXT", item.f32925a);
                item.j(true);
                androidx.fragment.app.p pVarE1 = e1();
                if (pVarE1 != null) {
                    pVarE1.setResult(-1, intent2);
                }
                androidx.fragment.app.p pVarE12 = e1();
                if (pVarE12 != null) {
                    pVarE12.finish();
                }
                break;
        }
        return true;
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        String string;
        h.c cVarG;
        boolean z10 = sender instanceof v3.q;
        if (z10) {
            v3.q qVar = (v3.q) sender;
            if (a6.q.d("edit_name", qVar.P1())) {
                if (arg1 == -1) {
                    Bundle bundleI1 = qVar.i1();
                    if (bundleI1 == null || (string = bundleI1.getString("old_name")) == null) {
                        string = "";
                    }
                    rd.m.c(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    if (!rd.m.a(string, str) && (cVarG = z4.h.i().g(string)) != null) {
                        cVarG.i(str);
                    }
                }
                return true;
            }
        }
        if (!z10 || !a6.q.d("add_mark", ((v3.q) sender).P1())) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if (arg1 == -1) {
            rd.m.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            TrackRecordingService trackRecordingServiceB = TrackRecordingService.INSTANCE.b();
            if (trackRecordingServiceB != null && trackRecordingServiceB.p(str2)) {
                Toast.makeText(x3(), N1(R.string.markAdded), 0).show();
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            super.m2(requestCode, resultCode, data);
        } else {
            if (resultCode != -1) {
                return;
            }
            if (this.kmlFileManager.e(data != null ? data.getData() : null) == null) {
                Toast.makeText(k1(), N1(R.string.fileParsingFailed), 0).show();
            }
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(h.b event) {
        rd.m.e(event, "event");
        if (a.f4356a[event.ordinal()] != 1) {
            throw new dd.o();
        }
        r0 r0Var = this.mAdapter;
        if (r0Var != null) {
            Collection collectionH = this.kmlFileManager.h();
            rd.m.d(collectionH, "getAllKmls(...)");
            r0Var.F(ed.q.H0(collectionH));
        }
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        G3(true);
        z4(N1(R.string.trackManager));
        boolean z10 = Cfg.f5476a;
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.o_track_list, menu);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        r1 r1VarC = r1.c(inflater, container, false);
        this.binding = r1VarC;
        rd.m.b(r1VarC);
        FrameLayout frameLayoutB = r1VarC.b();
        rd.m.d(frameLayoutB, "getRoot(...)");
        return frameLayoutB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
