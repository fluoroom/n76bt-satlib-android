package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes3.dex */
class HyphenBuilder implements Style {

    private class Parser extends Splitter {
        @Override // org.simpleframework.xml.stream.Splitter
        protected void commit(char[] cArr, int i10, int i11) {
            this.builder.append(cArr, i10, i11);
            if (i10 + i11 < this.count) {
                this.builder.append('-');
            }
        }

        @Override // org.simpleframework.xml.stream.Splitter
        protected void parse(char[] cArr, int i10, int i11) {
            cArr[i10] = toLower(cArr[i10]);
        }

        private Parser(String str) {
            super(str);
        }
    }

    HyphenBuilder() {
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getAttribute(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }

    @Override // org.simpleframework.xml.stream.Style
    public String getElement(String str) {
        if (str != null) {
            return new Parser(str).process();
        }
        return null;
    }
}
