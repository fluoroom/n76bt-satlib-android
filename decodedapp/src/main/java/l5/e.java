package l5;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import d5.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends AsyncTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f20422b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f20424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ProgressDialog f20425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f20426f;

    public e(Context context, int i10) {
        this.f20421a = context;
        this.f20423c = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        g gVar = this.f20426f;
        if (gVar != null) {
            gVar.x(this.f20421a.getContentResolver(), str);
        }
    }

    protected abstract String c(short[] sArr);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String doInBackground(g... gVarArr) throws Throwable {
        g gVar = gVarArr[0];
        this.f20426f = gVar;
        if (gVar.f10634r > 10000) {
            publishProgress(new Void[0]);
        }
        short[] sArrA = o5.e.a(Cfg.n(this.f20426f.f10611m));
        if (sArrA == null) {
            return null;
        }
        return c(sArrA);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(final String str) {
        if (this.f20425e != null) {
            if (System.currentTimeMillis() - this.f20424d < 2000) {
                this.f20422b.postDelayed(new Runnable() { // from class: l5.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20417a.onPostExecute(str);
                    }
                }, Math.max(2000 - (System.currentTimeMillis() - this.f20424d), 2000L));
                return;
            }
            this.f20425e.dismiss();
        }
        if (TextUtils.isEmpty(str)) {
            Toast.makeText(this.f20421a, R.string.decodingFailed, 0).show();
        } else {
            new c.a(this.f20421a).y(this.f20423c).k(str).t(R.string.save, new DialogInterface.OnClickListener() { // from class: l5.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f20419a.g(str);
                }
            }).C();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Void... voidArr) {
        this.f20424d = System.currentTimeMillis();
        Context context = this.f20421a;
        this.f20425e = ProgressDialog.show(context, context.getString(R.string.decoding), this.f20421a.getString(R.string.pleaseWait));
    }
}
