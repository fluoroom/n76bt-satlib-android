package com.facebook.stetho.okhttp3;

import com.facebook.stetho.inspector.network.DefaultResponseHandler;
import com.facebook.stetho.inspector.network.NetworkEventReporter;
import com.facebook.stetho.inspector.network.NetworkEventReporterImpl;
import com.facebook.stetho.inspector.network.RequestBodyHelper;
import eh.a0;
import eh.b0;
import eh.f0;
import eh.g0;
import eh.h0;
import eh.i0;
import eh.k;
import java.io.IOException;
import java.io.InputStream;
import vh.f;
import vh.g;
import vh.z;

/* JADX INFO: loaded from: classes.dex */
public class StethoInterceptor implements a0 {
    private final NetworkEventReporter mEventReporter = NetworkEventReporterImpl.get();

    private static class ForwardingResponseBody extends i0 {
        private final i0 mBody;
        private final g mInterceptedSource;

        public ForwardingResponseBody(i0 i0Var, InputStream inputStream) {
            this.mBody = i0Var;
            this.mInterceptedSource = z.c(z.j(inputStream));
        }

        @Override // eh.i0
        public long contentLength() {
            return this.mBody.contentLength();
        }

        @Override // eh.i0
        public b0 contentType() {
            return this.mBody.contentType();
        }

        @Override // eh.i0
        public g source() {
            return this.mInterceptedSource;
        }
    }

    private static class OkHttpInspectorRequest implements NetworkEventReporter.InspectorRequest {
        private final f0 mRequest;
        private RequestBodyHelper mRequestBodyHelper;
        private final String mRequestId;

        public OkHttpInspectorRequest(String str, f0 f0Var, RequestBodyHelper requestBodyHelper) {
            this.mRequestId = str;
            this.mRequest = f0Var;
            this.mRequestBodyHelper = requestBodyHelper;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
        public byte[] body() throws IOException {
            g0 g0VarA = this.mRequest.a();
            if (g0VarA == null) {
                return null;
            }
            f fVarB = z.b(z.e(this.mRequestBodyHelper.createBodySink(firstHeaderValue("Content-Encoding"))));
            try {
                g0VarA.f(fVarB);
                fVarB.close();
                return this.mRequestBodyHelper.getDisplayBody();
            } catch (Throwable th2) {
                fVarB.close();
                throw th2;
            }
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String firstHeaderValue(String str) {
            return this.mRequest.e(str);
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequestCommon
        public String friendlyName() {
            return null;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
        public Integer friendlyNameExtra() {
            return null;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public int headerCount() {
            return this.mRequest.f().size();
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String headerName(int i10) {
            return this.mRequest.f().d(i10);
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String headerValue(int i10) {
            return this.mRequest.f().g(i10);
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequestCommon
        public String id() {
            return this.mRequestId;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
        public String method() {
            return this.mRequest.i();
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorRequest
        public String url() {
            return this.mRequest.m().toString();
        }
    }

    private static class OkHttpInspectorResponse implements NetworkEventReporter.InspectorResponse {
        private final k mConnection;
        private final f0 mRequest;
        private final String mRequestId;
        private final h0 mResponse;

        public OkHttpInspectorResponse(String str, f0 f0Var, h0 h0Var, k kVar) {
            this.mRequestId = str;
            this.mRequest = f0Var;
            this.mResponse = h0Var;
            this.mConnection = kVar;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
        public int connectionId() {
            k kVar = this.mConnection;
            if (kVar == null) {
                return 0;
            }
            return kVar.hashCode();
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
        public boolean connectionReused() {
            return false;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String firstHeaderValue(String str) {
            return this.mResponse.s(str);
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
        public boolean fromDiskCache() {
            return this.mResponse.k() != null;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public int headerCount() {
            return this.mResponse.x().size();
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String headerName(int i10) {
            return this.mResponse.x().d(i10);
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorHeaders
        public String headerValue(int i10) {
            return this.mResponse.x().g(i10);
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponseCommon
        public String reasonPhrase() {
            return this.mResponse.H();
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponseCommon
        public String requestId() {
            return this.mRequestId;
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponseCommon
        public int statusCode() {
            return this.mResponse.n();
        }

        @Override // com.facebook.stetho.inspector.network.NetworkEventReporter.InspectorResponse
        public String url() {
            return this.mRequest.m().toString();
        }
    }

    @Override // eh.a0
    public h0 intercept(a0.a aVar) throws IOException {
        RequestBodyHelper requestBodyHelper;
        b0 b0VarContentType;
        InputStream inputStreamByteStream;
        String strNextRequestId = this.mEventReporter.nextRequestId();
        f0 f0VarE = aVar.e();
        if (this.mEventReporter.isEnabled()) {
            requestBodyHelper = new RequestBodyHelper(this.mEventReporter, strNextRequestId);
            this.mEventReporter.requestWillBeSent(new OkHttpInspectorRequest(strNextRequestId, f0VarE, requestBodyHelper));
        } else {
            requestBodyHelper = null;
        }
        try {
            h0 h0VarA = aVar.a(f0VarE);
            if (this.mEventReporter.isEnabled()) {
                if (requestBodyHelper != null && requestBodyHelper.hasBody()) {
                    requestBodyHelper.reportDataSent();
                }
                k kVarB = aVar.b();
                if (kVarB == null) {
                    throw new IllegalStateException("No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?");
                }
                this.mEventReporter.responseHeadersReceived(new OkHttpInspectorResponse(strNextRequestId, f0VarE, h0VarA, kVarB));
                i0 i0VarC = h0VarA.c();
                if (i0VarC != null) {
                    b0VarContentType = i0VarC.contentType();
                    inputStreamByteStream = i0VarC.byteStream();
                } else {
                    b0VarContentType = null;
                    inputStreamByteStream = null;
                }
                InputStream inputStreamInterpretResponseStream = this.mEventReporter.interpretResponseStream(strNextRequestId, b0VarContentType != null ? b0VarContentType.toString() : null, h0VarA.s("Content-Encoding"), inputStreamByteStream, new DefaultResponseHandler(this.mEventReporter, strNextRequestId));
                if (inputStreamInterpretResponseStream != null) {
                    return h0VarA.T().b(new ForwardingResponseBody(i0VarC, inputStreamInterpretResponseStream)).c();
                }
            }
            return h0VarA;
        } catch (IOException e10) {
            if (!this.mEventReporter.isEnabled()) {
                throw e10;
            }
            this.mEventReporter.httpExchangeFailed(strNextRequestId, e10.toString());
            throw e10;
        }
    }
}
