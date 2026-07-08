package v4;

/* JADX INFO: loaded from: classes.dex */
public enum x {
    UNKNOWN,
    HT_STATUS_CHANGED,
    DATA_RXD,
    NEW_INQUIRY_DATA,
    RESTORE_FACTORY_SETTINGS,
    HT_CH_CHANGED,
    HT_SETTINGS_CHANGED,
    RINGING_STOPPED,
    RADIO_STATUS_CHANGED,
    USER_ACTION,
    SYSTEM_EVENT,
    BSS_SETTINGS_CHANGED,
    DATA_TXD,
    POSITION_CHANGED,
    FREQ_SCAN_STATUS_CHANGED;

    public static x d(int i10) {
        return (i10 < 0 || i10 >= values().length) ? UNKNOWN : values()[i10];
    }
}
