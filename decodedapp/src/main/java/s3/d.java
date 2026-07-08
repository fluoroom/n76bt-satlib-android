package s3;

import a6.f;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static d f26342h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26343a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextToSpeech f26346d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C0364d f26349g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f26344b = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f26347e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextToSpeech.OnInitListener f26348f = new a();

    class a implements TextToSpeech.OnInitListener {
        a() {
        }

        @Override // android.speech.tts.TextToSpeech.OnInitListener
        public void onInit(int i10) {
            synchronized (d.this) {
                try {
                    if (d.this.f26346d == null) {
                        return;
                    }
                    if (i10 == 0) {
                        d.this.f26346d.setOnUtteranceProgressListener(new b());
                        d.this.f26345c = true;
                        d.this.j();
                        s3.b.h("TTSManager", "init");
                        return;
                    }
                    d.this.f26344b = false;
                    d.this.f26347e.clear();
                    d.this.f26346d.shutdown();
                    d.this.f26346d = null;
                    s3.b.h("TTSManager", "init error");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private class b extends UtteranceProgressListener {
        @Override // android.speech.tts.UtteranceProgressListener
        public void onDone(String str) {
            d.this.f26345c = true;
            d.this.j();
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onError(String str) {
            d.this.f26345c = true;
            d.this.j();
        }

        private b() {
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onStart(String str) {
        }
    }

    private static class c extends C0364d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f26352c;

        public c(String str) {
            this.f26352c = str;
        }

        @Override // s3.d.C0364d
        void b(TextToSpeech textToSpeech) {
            super.b(textToSpeech);
            textToSpeech.speak(this.f26352c, this.f26353a, this.f26354b);
        }
    }

    public d(Context context) {
        this.f26343a = context.getApplicationContext();
    }

    private void h() {
        if (this.f26346d != null) {
            return;
        }
        s3.b.h("TTSManager", "create");
        this.f26346d = new TextToSpeech(this.f26343a, this.f26348f);
    }

    public static d i(Context context) {
        if (f26342h == null) {
            synchronized (d.class) {
                try {
                    if (f26342h == null) {
                        f26342h = new d(context);
                    }
                } finally {
                }
            }
        }
        return f26342h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean j() {
        try {
            if (!this.f26345c) {
                return true;
            }
            C0364d c0364d = this.f26349g;
            if (c0364d != null) {
                c0364d.a();
                this.f26349g = null;
            }
            if (this.f26347e.size() != 0) {
                C0364d c0364d2 = (C0364d) this.f26347e.remove(0);
                this.f26349g = c0364d2;
                c0364d2.b(this.f26346d);
                this.f26345c = false;
                return true;
            }
            this.f26345c = false;
            this.f26346d.stop();
            this.f26346d.shutdown();
            this.f26346d = null;
            s3.b.h("TTSManager", "shutdown");
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void g(C0364d c0364d) {
        if (this.f26344b) {
            h();
            this.f26347e.add(c0364d);
            j();
        }
    }

    public void k(String str) {
        if (f.f328a) {
            s3.b.b("TTSManager", str);
        }
        if (this.f26344b) {
            g(new c(str));
        }
    }

    /* JADX INFO: renamed from: s3.d$d, reason: collision with other inner class name */
    public static class C0364d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f26353a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected HashMap f26354b;

        void b(TextToSpeech textToSpeech) {
            if (this.f26354b == null) {
                this.f26354b = new HashMap(1);
            }
            this.f26354b.put("utteranceId", "TTSManager");
        }

        void a() {
        }
    }
}
