package e2;

import com.facebook.stetho.websocket.CloseCodes;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    NOT_CONNECTED(CloseCodes.NORMAL_CLOSURE, "设备未连接"),
    NOT_INIT(1001, "未初始化"),
    NOT_FOUND_OTA_SERVICE(1003, "找不到OTA服务（FF12）"),
    NOT_FOUND_OTA_DATA_IN(1004, "设备没有找到dataInCharacteristic（FF14）"),
    NOT_FOUND_OTA_DATA_OUT(1005, "设备没有找到dataOutCharacteristic（FF15）"),
    NOT_FOUND_OTA_CHARACTERISTIC(CloseCodes.CLOSED_ABNORMALLY, "找不到dataInCharacteristic或者dataOutCharacteristic"),
    NOT_FOUND_CLIENT_CHARACTERISTIC_CONFIG(1007, "获取不到Client Characteristic config"),
    CAN_NOT_SUBSCRIBE_DATA_IN(1008, "订阅Data In不成功"),
    REPORT_FROM_DEVICE(2000, "有点问题，错误代码"),
    REFUSED_BY_DEVICE(2001, "设备拒绝了升级"),
    TIMEOUT_RECEIVE_RESPONSE(2002, "等待设备回复超时");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f11364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f11365c;

    c(int i10, String str) {
        this.f11363a = i10;
        this.f11364b = str;
    }

    public byte d() {
        return this.f11365c;
    }

    public void e(byte b10) {
        this.f11365c = b10;
    }
}
