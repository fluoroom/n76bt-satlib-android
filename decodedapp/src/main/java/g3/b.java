package g3;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Exception f13450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f13451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13452c;

    public enum a {
        ALREADY_CONNECTED,
        BLUETOOTH_NOT_SUPPORTED,
        DEVICE_UNKNOWN_ADDRESS,
        UNSUPPORTED_TRANSPORT,
        CONNECTION_FAILED,
        ILLEGAL_ARGUMENT,
        SENDING_FAILED,
        NOT_CONNECTED,
        RECEIVING_FAILED
    }

    public b(a aVar) {
        this.f13452c = -1;
        this.f13451b = aVar;
        this.f13450a = new Exception(a());
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Exception: ");
        switch (this.f13451b) {
            case ALREADY_CONNECTED:
                sb2.append("a device is already connected.");
                break;
            case BLUETOOTH_NOT_SUPPORTED:
                sb2.append("this device does not support Bluetooth.");
                break;
            case DEVICE_UNKNOWN_ADDRESS:
                sb2.append("the given device has a wrong address.");
                break;
            case UNSUPPORTED_TRANSPORT:
                sb2.append("the given transport is unsupported.");
                break;
            case CONNECTION_FAILED:
                sb2.append("connection to the device failed.");
                break;
            case ILLEGAL_ARGUMENT:
                sb2.append("at least one of the given arguments doesn't match with expectations.");
                break;
            case SENDING_FAILED:
                sb2.append("Sending a message to a device failed.");
                break;
            case NOT_CONNECTED:
                sb2.append("No connected device.");
                break;
        }
        return sb2.toString();
    }

    public String b() {
        return this.f13450a.toString();
    }

    public a c() {
        return this.f13451b;
    }

    public b(a aVar, Exception exc) {
        this.f13452c = -1;
        this.f13451b = aVar;
        this.f13450a = exc;
    }

    public b(a aVar, Exception exc, int i10) {
        this.f13451b = aVar;
        this.f13450a = exc;
        this.f13452c = i10;
    }
}
