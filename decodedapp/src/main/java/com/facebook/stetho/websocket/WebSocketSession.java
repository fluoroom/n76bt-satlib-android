package com.facebook.stetho.websocket;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
class WebSocketSession implements SimpleSession {
    private final SimpleEndpoint mEndpoint;
    private final ReadHandler mReadHandler;
    private volatile boolean mSentClose;
    private final WriteHandler mWriteHandler;
    private AtomicBoolean mIsOpen = new AtomicBoolean(false);
    private final ReadCallback mReadCallback = new ReadCallback() { // from class: com.facebook.stetho.websocket.WebSocketSession.1
        private void handleBinaryFrame(byte[] bArr, int i10) {
            WebSocketSession.this.mEndpoint.onMessage(WebSocketSession.this, bArr, i10);
        }

        private void handleClose(byte[] bArr, int i10) {
            int i11;
            String str;
            if (i10 >= 2) {
                i11 = ((bArr[0] & MessagePack.Code.EXT_TIMESTAMP) << 8) | (bArr[1] & MessagePack.Code.EXT_TIMESTAMP);
                str = i10 > 2 ? new String(bArr, 2, i10 - 2) : null;
            } else {
                i11 = CloseCodes.CLOSED_ABNORMALLY;
                str = "Unparseable close frame";
            }
            if (!WebSocketSession.this.mSentClose) {
                WebSocketSession.this.sendClose(CloseCodes.NORMAL_CLOSURE, "Received close frame");
            }
            WebSocketSession.this.markAndSignalClosed(i11, str);
        }

        private void handlePing(byte[] bArr, int i10) {
            WebSocketSession.this.doWrite(FrameHelper.createPongFrame(bArr, i10));
        }

        private void handlePong(byte[] bArr, int i10) {
        }

        private void handleTextFrame(byte[] bArr, int i10) {
            WebSocketSession.this.mEndpoint.onMessage(WebSocketSession.this, new String(bArr, 0, i10));
        }

        @Override // com.facebook.stetho.websocket.ReadCallback
        public void onCompleteFrame(byte b10, byte[] bArr, int i10) {
            if (b10 == 1) {
                handleTextFrame(bArr, i10);
                return;
            }
            if (b10 == 2) {
                handleBinaryFrame(bArr, i10);
                return;
            }
            switch (b10) {
                case 8:
                    handleClose(bArr, i10);
                    break;
                case 9:
                    handlePing(bArr, i10);
                    break;
                case 10:
                    handlePong(bArr, i10);
                    break;
                default:
                    WebSocketSession.this.signalError(new IOException("Unsupported frame opcode=" + ((int) b10)));
                    break;
            }
        }
    };
    private final WriteCallback mErrorForwardingWriteCallback = new WriteCallback() { // from class: com.facebook.stetho.websocket.WebSocketSession.2
        @Override // com.facebook.stetho.websocket.WriteCallback
        public void onFailure(IOException iOException) {
            WebSocketSession.this.signalError(iOException);
        }

        @Override // com.facebook.stetho.websocket.WriteCallback
        public void onSuccess() {
        }
    };

    public WebSocketSession(InputStream inputStream, OutputStream outputStream, SimpleEndpoint simpleEndpoint) {
        this.mReadHandler = new ReadHandler(inputStream, simpleEndpoint);
        this.mWriteHandler = new WriteHandler(outputStream);
        this.mEndpoint = simpleEndpoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doWrite(Frame frame) {
        if (signalErrorIfNotOpen()) {
            return;
        }
        this.mWriteHandler.write(frame, this.mErrorForwardingWriteCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendClose(int i10, String str) {
        doWrite(FrameHelper.createCloseFrame(i10, str));
        markSentClose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalError(IOException iOException) {
        this.mEndpoint.onError(this, iOException);
    }

    private boolean signalErrorIfNotOpen() {
        if (isOpen()) {
            return false;
        }
        signalError(new IOException("Session is closed"));
        return true;
    }

    @Override // com.facebook.stetho.websocket.SimpleSession
    public void close(int i10, String str) {
        sendClose(i10, str);
        markAndSignalClosed(i10, str);
    }

    public void handle() throws IOException {
        markAndSignalOpen();
        try {
            this.mReadHandler.readLoop(this.mReadCallback);
        } catch (EOFException unused) {
            markAndSignalClosed(CloseCodes.UNEXPECTED_CONDITION, "EOF while reading");
        } catch (IOException e10) {
            markAndSignalClosed(CloseCodes.CLOSED_ABNORMALLY, null);
            throw e10;
        }
    }

    @Override // com.facebook.stetho.websocket.SimpleSession
    public boolean isOpen() {
        return this.mIsOpen.get();
    }

    void markAndSignalClosed(int i10, String str) {
        if (this.mIsOpen.getAndSet(false)) {
            this.mEndpoint.onClose(this, i10, str);
        }
    }

    void markAndSignalOpen() {
        if (this.mIsOpen.getAndSet(true)) {
            return;
        }
        this.mEndpoint.onOpen(this);
    }

    void markSentClose() {
        this.mSentClose = true;
    }

    @Override // com.facebook.stetho.websocket.SimpleSession
    public void sendBinary(byte[] bArr) {
        doWrite(FrameHelper.createBinaryFrame(bArr));
    }

    @Override // com.facebook.stetho.websocket.SimpleSession
    public void sendText(String str) {
        doWrite(FrameHelper.createTextFrame(str));
    }
}
