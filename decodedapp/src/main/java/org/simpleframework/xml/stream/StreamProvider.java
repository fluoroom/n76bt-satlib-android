package org.simpleframework.xml.stream;

import ad.d;
import ad.e;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes3.dex */
class StreamProvider implements Provider {
    private final e factory;

    public StreamProvider() {
        e.a();
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(InputStream inputStream) throws Exception {
        throw null;
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(Reader reader) throws Exception {
        throw null;
    }

    private EventReader provide(d dVar) throws Exception {
        return new StreamReader(dVar);
    }
}
