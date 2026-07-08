package v4;

/* JADX INFO: loaded from: classes.dex */
public enum c1 {
    UNKNOWN,
    TX_AUDIO,
    TX_AUDIO_STOP,
    RX_AUDIO,
    RX_AUDIO_STOP,
    SET_SIGN_DATA;

    public static c1 d(int i10) {
        return (i10 < 0 || i10 >= values().length) ? UNKNOWN : values()[i10];
    }
}
