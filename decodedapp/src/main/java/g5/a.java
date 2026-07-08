package g5;

import com.benshikj.ht.rpc.Im;

/* JADX INFO: loaded from: classes.dex */
public class a extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13536h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13538j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13537i = 24000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13539k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f13540l = "";

    public void f(Im.ChannelFields channelFields) {
        this.f13534f = channelFields.getChannelID();
        this.f13535g = channelFields.getName();
        this.f13536h = channelFields.getPasscode();
        this.f13537i = channelFields.getBitRates();
        this.f13539k = channelFields.getSearchable();
        this.f13540l = channelFields.getLocation();
        this.f13538j = channelFields.getMiniSpeakLevel();
        a(channelFields.getRf());
    }

    public Im.ChannelFields g() {
        return Im.ChannelFields.newBuilder().setChannelID(this.f13534f).setName(this.f13535g).setPasscode(this.f13536h).setBitRates(this.f13537i).setSearchable(this.f13539k).setLocation(this.f13540l).setMiniSpeakLevel(this.f13538j).setRf(d()).build();
    }
}
