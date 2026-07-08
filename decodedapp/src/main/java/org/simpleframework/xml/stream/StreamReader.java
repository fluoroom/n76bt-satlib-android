package org.simpleframework.xml.stream;

import ad.d;
import bd.a;
import bd.b;
import bd.c;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class StreamReader implements EventReader {
    private EventNode peek;
    private d reader;

    private static class End extends EventToken {
        private End() {
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isEnd() {
            return true;
        }
    }

    private static class Entry extends EventAttribute {
        private final a entry;

        public Entry(a aVar) {
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getName() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getPrefix() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public String getReference() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public Object getSource() {
            return null;
        }

        @Override // org.simpleframework.xml.stream.Attribute
        public String getValue() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventAttribute, org.simpleframework.xml.stream.Attribute
        public boolean isReserved() {
            return false;
        }
    }

    private static class Start extends EventElement {
        private final c element;
        private final ad.c location;

        public Start(bd.d dVar) {
            dVar.b();
            dVar.getLocation();
        }

        public Iterator<a> getAttributes() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventElement, org.simpleframework.xml.stream.EventNode
        public int getLine() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getName() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getPrefix() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public String getReference() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return null;
        }
    }

    private static class Text extends EventToken {
        private final b text;

        public Text(bd.d dVar) {
            dVar.a();
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public Object getSource() {
            return null;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public String getValue() {
            throw null;
        }

        @Override // org.simpleframework.xml.stream.EventToken, org.simpleframework.xml.stream.EventNode
        public boolean isText() {
            return true;
        }
    }

    public StreamReader(d dVar) {
    }

    private Entry attribute(a aVar) {
        return new Entry(aVar);
    }

    private Start build(Start start) {
        Iterator<a> attributes = start.getAttributes();
        while (attributes.hasNext()) {
            android.support.v4.media.session.b.a(attributes.next());
            Entry entryAttribute = attribute(null);
            if (!entryAttribute.isReserved()) {
                start.add(entryAttribute);
            }
        }
        return start;
    }

    private End end() {
        return new End();
    }

    private EventNode read() throws Exception {
        throw null;
    }

    private Start start(bd.d dVar) {
        Start start = new Start(dVar);
        return start.isEmpty() ? build(start) : start;
    }

    private Text text(bd.d dVar) {
        return new Text(dVar);
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode next() throws Exception {
        EventNode eventNode = this.peek;
        if (eventNode == null) {
            return read();
        }
        this.peek = null;
        return eventNode;
    }

    @Override // org.simpleframework.xml.stream.EventReader
    public EventNode peek() throws Exception {
        if (this.peek == null) {
            this.peek = next();
        }
        return this.peek;
    }
}
