package com.facebook.stetho.server;

import android.content.Context;
import android.net.LocalSocket;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ProtocolDetectingSocketHandler extends SecureSocketHandler {
    private static final int SENSING_BUFFER_SIZE = 256;
    private final ArrayList<HandlerInfo> mHandlers;

    public static class AlwaysMatchMatcher implements MagicMatcher {
        @Override // com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher
        public boolean matches(InputStream inputStream) throws IOException {
            return true;
        }
    }

    public static class ExactMagicMatcher implements MagicMatcher {
        private final byte[] mMagic;

        public ExactMagicMatcher(byte[] bArr) {
            this.mMagic = bArr;
        }

        @Override // com.facebook.stetho.server.ProtocolDetectingSocketHandler.MagicMatcher
        public boolean matches(InputStream inputStream) throws IOException {
            int length = this.mMagic.length;
            byte[] bArr = new byte[length];
            return inputStream.read(bArr) == length && Arrays.equals(bArr, this.mMagic);
        }
    }

    private static class HandlerInfo {
        public final SocketLikeHandler handler;
        public final MagicMatcher magicMatcher;

        private HandlerInfo(MagicMatcher magicMatcher, SocketLikeHandler socketLikeHandler) {
            this.magicMatcher = magicMatcher;
            this.handler = socketLikeHandler;
        }
    }

    public interface MagicMatcher {
        boolean matches(InputStream inputStream) throws IOException;
    }

    public ProtocolDetectingSocketHandler(Context context) {
        super(context);
        this.mHandlers = new ArrayList<>(2);
    }

    public void addHandler(MagicMatcher magicMatcher, SocketLikeHandler socketLikeHandler) {
        this.mHandlers.add(new HandlerInfo(magicMatcher, socketLikeHandler));
    }

    @Override // com.facebook.stetho.server.SecureSocketHandler
    protected void onSecured(LocalSocket localSocket) throws IOException {
        LeakyBufferedInputStream leakyBufferedInputStream = new LeakyBufferedInputStream(localSocket.getInputStream(), SENSING_BUFFER_SIZE);
        if (this.mHandlers.isEmpty()) {
            throw new IllegalStateException("No handlers added");
        }
        int size = this.mHandlers.size();
        for (int i10 = 0; i10 < size; i10++) {
            HandlerInfo handlerInfo = this.mHandlers.get(i10);
            leakyBufferedInputStream.mark(SENSING_BUFFER_SIZE);
            boolean zMatches = handlerInfo.magicMatcher.matches(leakyBufferedInputStream);
            leakyBufferedInputStream.reset();
            if (zMatches) {
                handlerInfo.handler.onAccepted(new SocketLike(localSocket, leakyBufferedInputStream));
                return;
            }
        }
        throw new IOException("No matching handler, firstByte=" + leakyBufferedInputStream.read());
    }
}
