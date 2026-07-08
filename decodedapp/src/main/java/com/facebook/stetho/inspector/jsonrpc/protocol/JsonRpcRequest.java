package com.facebook.stetho.inspector.jsonrpc.protocol;

import com.facebook.stetho.json.annotation.JsonProperty;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JsonRpcRequest {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @JsonProperty
    public Long f7069id;

    @JsonProperty(required = true)
    public String method;

    @JsonProperty
    public JSONObject params;

    public JsonRpcRequest() {
    }

    public JsonRpcRequest(Long l10, String str, JSONObject jSONObject) {
        this.f7069id = l10;
        this.method = str;
        this.params = jSONObject;
    }
}
