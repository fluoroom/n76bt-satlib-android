package g3;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Handler;
import android.util.Log;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import g3.a;
import g3.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f13463n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final UUID f13464o = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final UUID f13465p = UUID.fromString("00001107-D102-11E1-9B23-00025B00A5A5");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q5.b f13472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile b f13473h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f13474i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13466a = WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f13467b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13468c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BluetoothDevice f13470e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BluetoothSocket f13471f = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f13475j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Handler f13476k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private e f13477l = e.BT_GAIA;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f13478m = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final BluetoothAdapter f13469d = BluetoothAdapter.getDefaultAdapter();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13479a;

        static {
            int[] iArr = new int[a.EnumC0194a.values().length];
            f13479a = iArr;
            try {
                iArr[a.EnumC0194a.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13479a[a.EnumC0194a.DEVICE_STATE_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13479a[a.EnumC0194a.DEBUG_MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13479a[a.EnumC0194a.BATTERY_CHARGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13479a[a.EnumC0194a.CHARGER_CONNECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13479a[a.EnumC0194a.CAPSENSE_UPDATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13479a[a.EnumC0194a.USER_ACTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13479a[a.EnumC0194a.SPEECH_RECOGNITION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13479a[a.EnumC0194a.AV_COMMAND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13479a[a.EnumC0194a.REMOTE_BATTERY_LEVEL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13479a[a.EnumC0194a.VMU_PACKET.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13479a[a.EnumC0194a.RSSI_LOW_THRESHOLD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13479a[a.EnumC0194a.RSSI_HIGH_THRESHOLD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13479a[a.EnumC0194a.BATTERY_LOW_THRESHOLD.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13479a[a.EnumC0194a.BATTERY_HIGH_THRESHOLD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13479a[a.EnumC0194a.PIO_CHANGED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    private class b extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BluetoothSocket f13480a;

        /* synthetic */ b(c cVar, BluetoothSocket bluetoothSocket, a aVar) {
            this(bluetoothSocket);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        
            if (isInterrupted() == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        
            if (isInterrupted() == false) goto L10;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                r0 = 0
                g3.c r1 = g3.c.this     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
                android.bluetooth.BluetoothAdapter r1 = g3.c.a(r1)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
                r1.cancelDiscovery()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
                android.bluetooth.BluetoothSocket r1 = r6.f13480a     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
                r1.connect()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
                java.lang.Class<g3.c> r1 = g3.c.class
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
                boolean r2 = r6.isInterrupted()     // Catch: java.lang.Throwable -> L25
                if (r2 == 0) goto L27
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
                boolean r1 = r6.isInterrupted()
                if (r1 != 0) goto L7c
            L1f:
                g3.c r1 = g3.c.this
                g3.c.l(r1, r0)
                return
            L25:
                r2 = move-exception
                goto L63
            L27:
                g3.c r2 = g3.c.this     // Catch: java.lang.Throwable -> L25
                q5.b r2 = g3.c.b(r2)     // Catch: java.lang.Throwable -> L25
                g3.c.h(r2)     // Catch: java.lang.Throwable -> L25
                g3.c r2 = g3.c.this     // Catch: java.lang.Throwable -> L25
                q5.b r3 = new q5.b     // Catch: java.lang.Throwable -> L25
                android.bluetooth.BluetoothSocket r4 = r6.f13480a     // Catch: java.lang.Throwable -> L25
                java.io.OutputStream r4 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L25
                r5 = 100
                r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L25
                g3.c.d(r2, r3)     // Catch: java.lang.Throwable -> L25
                g3.c r2 = g3.c.this     // Catch: java.lang.Throwable -> L25
                g3.c$d r3 = new g3.c$d     // Catch: java.lang.Throwable -> L25
                android.bluetooth.BluetoothSocket r4 = r6.f13480a     // Catch: java.lang.Throwable -> L25
                java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L25
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L25
                g3.c.j(r2, r3)     // Catch: java.lang.Throwable -> L25
                g3.c r2 = g3.c.this     // Catch: java.lang.Throwable -> L25
                g3.c$d r2 = g3.c.i(r2)     // Catch: java.lang.Throwable -> L25
                r2.start()     // Catch: java.lang.Throwable -> L25
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
                boolean r1 = r6.isInterrupted()
                if (r1 != 0) goto L7c
                goto L1f
            L63:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L25
                throw r2     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L67
            L65:
                r1 = move-exception
                goto L7d
            L67:
                r1 = move-exception
                g3.c r2 = g3.c.this     // Catch: java.lang.Throwable -> L65
                java.lang.String r3 = "Connector"
                g3.b$a r4 = g3.b.a.CONNECTION_FAILED     // Catch: java.lang.Throwable -> L65
                g3.c.k(r2, r3, r4, r1)     // Catch: java.lang.Throwable -> L65
                boolean r1 = r6.isInterrupted()
                if (r1 != 0) goto L7c
                g3.c r1 = g3.c.this
                g3.c.l(r1, r0)
            L7c:
                return
            L7d:
                boolean r2 = r6.isInterrupted()
                if (r2 != 0) goto L88
                g3.c r2 = g3.c.this
                g3.c.l(r2, r0)
            L88:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g3.c.b.run():void");
        }

        private b(BluetoothSocket bluetoothSocket) {
            this.f13480a = bluetoothSocket;
        }
    }

    /* JADX INFO: renamed from: g3.c$c, reason: collision with other inner class name */
    public enum EnumC0195c {
        PACKET,
        CONNECTED,
        ERROR,
        DEBUG,
        DISCONNECTED,
        STREAM,
        UNKNOWN;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final EnumC0195c[] f13489h = values();

        public static EnumC0195c d(int i10) {
            if (i10 >= 0) {
                EnumC0195c[] enumC0195cArr = f13489h;
                if (i10 < enumC0195cArr.length) {
                    return enumC0195cArr[i10];
                }
            }
            return UNKNOWN;
        }
    }

    private class d extends Thread implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13492b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f13495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InputStream f13496f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final byte[] f13491a = new byte[270];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13493c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13494d = 254;

        d(InputStream inputStream) {
            this.f13496f = inputStream;
        }

        private void a() {
            byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
            Log.i("GaiaLink", "runSppReader start...");
            synchronized (c.this) {
                try {
                    if (c.this.f13471f == null) {
                        return;
                    }
                    c.this.f13478m = true;
                    this.f13495e = true;
                    c.this.f13475j.obtainMessage(EnumC0195c.CONNECTED.ordinal(), c.this.f13470e.getAddress()).sendToTarget();
                    while (this.f13495e) {
                        try {
                            int i10 = this.f13496f.read(bArr);
                            if (i10 < 0) {
                                this.f13495e = false;
                            } else {
                                e(bArr, i10);
                            }
                        } catch (IOException e10) {
                            c.this.C("RunSPPReader failed: " + e10.toString(), b.a.RECEIVING_FAILED);
                            this.f13495e = false;
                        }
                    }
                } finally {
                }
            }
        }

        private void c() {
            byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
            Log.i("GaiaLink", "runUsbReader start...");
            synchronized (c.this) {
                try {
                    if (c.this.f13472g == null) {
                        return;
                    }
                    c.this.f13478m = true;
                    this.f13495e = true;
                    c.this.f13475j.obtainMessage(EnumC0195c.CONNECTED.ordinal(), "").sendToTarget();
                    while (this.f13495e) {
                        try {
                            int i10 = this.f13496f.read(bArr);
                            if (i10 < 0) {
                                this.f13495e = false;
                            } else {
                                e(bArr, i10);
                            }
                        } catch (IOException e10) {
                            c.this.C("RunSPPReader failed: " + e10.toString(), b.a.RECEIVING_FAILED);
                            this.f13495e = false;
                        }
                    }
                } finally {
                }
            }
        }

        private void e(byte[] bArr, int i10) {
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = this.f13493c;
                if (i12 > 0 && i12 < 270) {
                    this.f13491a[i12] = bArr[i11];
                    if (i12 == 2) {
                        this.f13492b = bArr[i11];
                    } else if (i12 == 3) {
                        this.f13494d = (bArr[i11] & MessagePack.Code.EXT_TIMESTAMP) + 8 + ((this.f13492b & 1) != 0 ? 1 : 0);
                        if (c.this.f13467b) {
                            Log.d("GaiaLink", "expect " + this.f13494d);
                        }
                    }
                    int i13 = this.f13493c + 1;
                    this.f13493c = i13;
                    if (i13 == this.f13494d) {
                        if (c.this.f13467b) {
                            Log.d("GaiaLink", "got " + this.f13494d);
                        }
                        if (c.this.f13475j != null) {
                            g3.d dVar = new g3.d(this.f13491a, this.f13493c);
                            c.this.G(dVar);
                            if (dVar.g() != a.EnumC0194a.START || c.this.f13478m) {
                                if (c.f13463n) {
                                    Log.i("GaiaLink", "received command 0x" + g3.a.g(dVar.e()));
                                }
                                c.this.f13475j.obtainMessage(EnumC0195c.PACKET.ordinal(), dVar).sendToTarget();
                            } else {
                                if (c.f13463n) {
                                    Log.i("GaiaLink", "connection starts");
                                }
                                c.this.f13478m = true;
                                c.this.f13475j.obtainMessage(EnumC0195c.CONNECTED.ordinal(), c.this.f13470e.getAddress()).sendToTarget();
                            }
                        } else if (c.f13463n) {
                            Log.e("GaiaLink", "No receiver");
                        }
                        this.f13493c = 0;
                        this.f13494d = 254;
                    }
                } else if (bArr[i11] == -1) {
                    this.f13493c = 1;
                }
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.f13496f;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (c.this.f13477l.equals(e.BT_GAIA) || c.this.f13477l.equals(e.BT_SPP)) {
                a();
            } else if (c.this.f13477l == e.USB) {
                c();
            }
            if (c.this.f13475j == null) {
                Log.e("GaiaLink", "reader: no receive handler");
            } else {
                c.this.f13478m = false;
                c.this.f13475j.obtainMessage(EnumC0195c.DISCONNECTED.ordinal()).sendToTarget();
            }
        }
    }

    public enum e {
        BT_SPP,
        BT_GAIA,
        USB
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(String str, b.a aVar) {
        if (f13463n) {
            Log.e("GaiaLink", str);
        }
        if (this.f13475j != null) {
            this.f13475j.obtainMessage(EnumC0195c.ERROR.ordinal(), new g3.b(aVar)).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(String str, b.a aVar, Exception exc) {
        if (f13463n) {
            Log.e("GaiaLink", str + ": " + exc.toString());
        }
        if (this.f13475j != null) {
            this.f13475j.obtainMessage(EnumC0195c.ERROR.ordinal(), new g3.b(aVar, exc)).sendToTarget();
        }
    }

    private void E(String str, b.a aVar, Exception exc, int i10) {
        if (f13463n) {
            Log.e("GaiaLink", str + ": " + exc.toString());
        }
        if (this.f13475j != null) {
            this.f13475j.obtainMessage(EnumC0195c.ERROR.ordinal(), new g3.b(aVar, exc, i10)).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(g3.d dVar) {
        if (this.f13476k != null) {
            String str = "← " + g3.a.g(dVar.m()) + " " + g3.a.g(dVar.f());
            if (dVar.i() != null) {
                for (int i10 = 0; i10 < dVar.i().length; i10++) {
                    str = str + " " + g3.a.f(dVar.i()[i10]);
                }
            }
            if (f13463n) {
                Log.d("GaiaLink", str);
            }
            this.f13476k.obtainMessage(EnumC0195c.DEBUG.ordinal(), str).sendToTarget();
        }
    }

    public static c H() {
        return new c();
    }

    private synchronized void N(byte[] bArr, int i10) {
        try {
            if (!this.f13468c && (this.f13477l.equals(e.BT_SPP) || this.f13477l.equals(e.BT_GAIA) || this.f13477l == e.USB)) {
                if (this.f13472g == null) {
                    C("sendCommandData: not connected.", b.a.NOT_CONNECTED);
                }
                if (f13463n) {
                    Log.i("GaiaLink", "send command 0x" + g3.a.g(i10));
                }
                try {
                    try {
                        this.f13472g.write(bArr);
                    } catch (Exception e10) {
                        E("sendCommandData", b.a.SENDING_FAILED, e10, i10);
                    }
                } catch (IOException e11) {
                    if (this.f13477l == e.USB) {
                        Handler handler = this.f13475j;
                        if (handler != null) {
                            this.f13478m = false;
                            handler.obtainMessage(EnumC0195c.DISCONNECTED.ordinal()).sendToTarget();
                        }
                    } else {
                        E("sendCommandData", b.a.SENDING_FAILED, e11, i10);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    private synchronized void v(BluetoothDevice bluetoothDevice) {
        try {
            if (!z()) {
                C("connectBluetooth: Bluetooth not available.", b.a.BLUETOOTH_NOT_SUPPORTED);
            } else if (BluetoothAdapter.checkBluetoothAddress(bluetoothDevice.getAddress())) {
                if (f13463n) {
                    Log.i("GaiaLink", "connect BT " + bluetoothDevice.getAddress());
                }
                b bVar = this.f13473h;
                a aVar = null;
                if (bVar != null) {
                    BluetoothDevice bluetoothDevice2 = this.f13470e;
                    if (bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
                        Log.i("GaiaLink", bluetoothDevice.getAddress() + " is in connecting");
                        return;
                    }
                    bVar.interrupt();
                    this.f13473h = null;
                }
                s(this.f13472g);
                this.f13472g = null;
                s(this.f13471f);
                this.f13471f = null;
                this.f13470e = bluetoothDevice;
                int iOrdinal = this.f13477l.ordinal();
                if (iOrdinal == 0) {
                    this.f13471f = w(f13464o);
                } else {
                    if (iOrdinal != 1) {
                        C("connectBluetooth: unsupported transport.", b.a.UNSUPPORTED_TRANSPORT);
                        return;
                    }
                    this.f13471f = w(f13465p);
                }
                this.f13473h = new b(this, this.f13471f, aVar);
                this.f13473h.start();
            } else {
                C("connectBluetooth: the given device has a wrong address.", b.a.DEVICE_UNKNOWN_ADDRESS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private BluetoothSocket w(UUID uuid) {
        try {
            return this.f13470e.createRfcommSocketToServiceRecord(uuid);
        } catch (IOException e10) {
            if (f13463n) {
                Log.w("GaiaLink", "createSocket: " + e10.toString());
            }
            try {
                return (BluetoothSocket) this.f13470e.getClass().getMethod("createRfcommSocket", Integer.TYPE).invoke(this.f13470e, 1);
            } catch (Exception e11) {
                if (!f13463n) {
                    return null;
                }
                D("createSocket", b.a.CONNECTION_FAILED, e11);
                return null;
            }
        }
    }

    private synchronized void y() {
        try {
            if (f13463n) {
                Log.i("GaiaLink", "disconnect BT");
            }
            BluetoothSocket bluetoothSocket = this.f13471f;
            if (bluetoothSocket != null) {
                try {
                    this.f13474i = null;
                    bluetoothSocket.getInputStream().close();
                    this.f13471f.getOutputStream().close();
                    this.f13471f.close();
                    q5.b bVar = this.f13472g;
                    if (bVar != null) {
                        bVar.close();
                    }
                    this.f13471f = null;
                    this.f13470e = null;
                    this.f13472g = null;
                    this.f13478m = false;
                } catch (IOException e10) {
                    if (f13463n) {
                        Log.e("GaiaLink", e10.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean z() {
        return this.f13469d != null;
    }

    public BluetoothDevice A() {
        return this.f13470e;
    }

    public e B() {
        return this.f13477l;
    }

    public boolean F() {
        return this.f13478m;
    }

    public int I() {
        q5.b bVar = this.f13472g;
        if (bVar == null) {
            return 0;
        }
        return bVar.c();
    }

    public void J(int i10, a.EnumC0194a enumC0194a) {
        switch (a.f13479a[enumC0194a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                K(i10, 16385, new byte[]{(byte) enumC0194a.ordinal()});
                break;
            default:
                E("registerNotification", b.a.ILLEGAL_ARGUMENT, null, 16385);
                break;
        }
    }

    public void K(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            M(i10, i11, new int[0]);
        } else {
            L(i10, i11, bArr, bArr.length);
        }
    }

    public void L(int i10, int i11, byte[] bArr, int i12) {
        try {
            byte[] bArrD = g3.a.d(i10, i11, bArr, i12);
            if (this.f13476k != null) {
                String str = "→ " + g3.a.g(i10) + " " + g3.a.g(i11);
                for (byte b10 : bArr) {
                    str = str + " " + g3.a.f(b10);
                }
                if (f13463n) {
                    Log.d("GaiaLink", str);
                }
                this.f13476k.obtainMessage(EnumC0195c.DEBUG.ordinal(), str).sendToTarget();
            }
            N(bArrD, i11);
        } catch (h3.a e10) {
            E("sendCommand", b.a.SENDING_FAILED, e10, i11);
        }
    }

    public void M(int i10, int i11, int... iArr) {
        if (iArr != null && iArr.length != 0) {
            byte[] bArr = new byte[iArr.length];
            for (int i12 = 0; i12 < iArr.length; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
            K(i10, i11, bArr);
            return;
        }
        try {
            byte[] bArrA = g3.a.a(i10, i11);
            if (this.f13476k != null) {
                String str = "→ " + g3.a.g(i10) + " " + g3.a.g(i11);
                Log.d("GaiaLink", str);
                this.f13476k.obtainMessage(EnumC0195c.DEBUG.ordinal(), str).sendToTarget();
            }
            N(bArrA, i11);
        } catch (h3.a e10) {
            E("sendCommand", b.a.SENDING_FAILED, e10, i11);
        }
    }

    public void O(Handler handler) {
        this.f13475j = handler;
    }

    public void r(int i10, a.EnumC0194a enumC0194a) {
        K(i10, 16386, new byte[]{(byte) enumC0194a.ordinal()});
    }

    public synchronized void t(BluetoothDevice bluetoothDevice, e eVar) {
        try {
            if (this.f13478m) {
                C("connect: already connected.", b.a.ALREADY_CONNECTED);
            } else if (bluetoothDevice == null || eVar == null) {
                C("connect: at least one argument is null.", b.a.ILLEGAL_ARGUMENT);
            } else {
                this.f13477l = eVar;
                if (eVar.equals(e.BT_SPP) || this.f13477l.equals(e.BT_GAIA)) {
                    v(bluetoothDevice);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void u(InputStream inputStream, OutputStream outputStream, e eVar) {
        try {
            if (this.f13478m) {
                C("connect: already connected.", b.a.ALREADY_CONNECTED);
            } else if (inputStream == null || outputStream == null || eVar != e.USB) {
                C("connect: at least one argument is null.", b.a.ILLEGAL_ARGUMENT);
            } else {
                this.f13477l = eVar;
                s(this.f13472g);
                s(this.f13471f);
                this.f13471f = null;
                this.f13470e = null;
                this.f13472g = new q5.b(outputStream, 100);
                d dVar = new d(inputStream);
                this.f13474i = dVar;
                dVar.start();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void x() {
        this.f13478m = false;
        this.f13468c = false;
        if (this.f13477l.equals(e.BT_GAIA) || this.f13477l.equals(e.BT_SPP)) {
            y();
        } else if (this.f13477l == e.USB) {
            s(this.f13474i);
            this.f13474i = null;
            s(this.f13472g);
            this.f13472g = null;
        }
    }
}
