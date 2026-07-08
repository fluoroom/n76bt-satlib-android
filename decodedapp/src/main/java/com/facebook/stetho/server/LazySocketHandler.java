package com.facebook.stetho.server;

import android.net.LocalSocket;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class LazySocketHandler implements SocketHandler {
    private SocketHandler mSocketHandler;
    private final SocketHandlerFactory mSocketHandlerFactory;

    public LazySocketHandler(SocketHandlerFactory socketHandlerFactory) {
        this.mSocketHandlerFactory = socketHandlerFactory;
    }

    private synchronized SocketHandler getSocketHandler() {
        try {
            if (this.mSocketHandler == null) {
                this.mSocketHandler = this.mSocketHandlerFactory.create();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.mSocketHandler;
    }

    @Override // com.facebook.stetho.server.SocketHandler
    public void onAccepted(LocalSocket localSocket) throws IOException {
        getSocketHandler().onAccepted(localSocket);
    }
}
