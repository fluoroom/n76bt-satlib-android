package com.benshikj.ii;

import com.benshikj.ht.rpc.Im;
import qb.z0;

/* JADX INFO: loaded from: classes.dex */
public interface CallBack {
    void applyRequestMetadata(z0 z0Var);

    AudioPlayer createAudioPlayer();

    IILink createLink(II ii2, long j10);

    boolean isCanPlay();

    void onChannelChanged(II ii2);

    void onChannelConnectionParmLoaded(long j10, Im.GetChannelConnectionParmResult getChannelConnectionParmResult);

    void onChannelMembersChanged(IILink iILink);

    void onCurrentLinkChanged(II ii2, IILink iILink);

    void onError(Throwable th2);

    void onLinkCreated(II ii2, IILink iILink);

    void onLinkStatusChanged(IILink iILink);

    void onMessageReceived(Im.ReceiveMessageResult receiveMessageResult);

    void onOnlineUserChanged(IILink iILink);

    void onReceiveStatusChanged(ReceiveStatus receiveStatus);
}
