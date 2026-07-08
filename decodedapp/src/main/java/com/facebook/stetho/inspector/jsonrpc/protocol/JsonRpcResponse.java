package com.facebook.stetho.inspector.jsonrpc.protocol;

import com.facebook.stetho.json.annotation.JsonProperty;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class JsonRpcResponse {

    @JsonProperty
    public JSONObject error;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @JsonProperty(required = true)
    public long f7070id;

    @JsonProperty
    public JSONObject result;
}
