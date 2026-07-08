package s4;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Bundle;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.mdc.Decoder;
import com.dw.mdc.Packet;

/* JADX INFO: loaded from: classes.dex */
public class b4 extends v3.m0 implements View.OnClickListener {
    private Button F0;
    private c4 G0;
    private RecyclerView H0;
    private a I0 = null;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f26372a;

        public a() {
            super("MDC Monitor Thread");
        }

        public void a() {
            this.f26372a = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Packet packetA;
            Process.setThreadPriority(-16);
            Thread.currentThread().setPriority(10);
            int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
            if (minBufferSize <= 0) {
                return;
            }
            AudioRecord audioRecord = new AudioRecord(1, 44100, 16, 2, minBufferSize);
            audioRecord.startRecording();
            Decoder decoder = new Decoder(44100);
            try {
                short[] sArr = new short[minBufferSize];
                while (!this.f26372a) {
                    if (decoder.b(sArr, 0, audioRecord.read(sArr, 0, minBufferSize)) != 0 && (packetA = decoder.a()) != null) {
                        b4.this.C4(packetA);
                    }
                }
            } finally {
                audioRecord.release();
                decoder.c();
            }
        }
    }

    public interface b {
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Packet f26374a;

        c(Packet packet) {
            this.f26374a = packet;
        }

        @Override // java.lang.Runnable
        public void run() {
            b4.this.G0.E(this.f26374a);
            b4.this.H0.v1(b4.this.G0.f() - 1);
        }
    }

    public void C4(Packet packet) {
        this.H0.post(new c(packet));
    }

    @Override // androidx.fragment.app.o
    public void o2(Context context) {
        super.o2(context);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.I0;
        if (aVar != null) {
            aVar.a();
            this.I0 = null;
            this.F0.setText(R.string.start_monitor);
        } else {
            a aVar2 = new a();
            this.I0 = aVar2;
            aVar2.start();
            this.F0.setText(R.string.stop_monitor);
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        z4(N1(R.string.mdcMonitor));
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mdc_decode_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext()));
        c4 c4Var = new c4(null);
        this.G0 = c4Var;
        recyclerView.setAdapter(c4Var);
        this.H0 = recyclerView;
        Button button = (Button) viewInflate.findViewById(R.id.start);
        this.F0 = button;
        button.setOnClickListener(this);
        return viewInflate;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        a aVar = this.I0;
        if (aVar != null) {
            aVar.a();
            this.I0 = null;
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void z2() {
        super.z2();
    }
}
