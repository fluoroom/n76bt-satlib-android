package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
abstract class o2 {

    class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f9252a;

        a(l lVar) {
            this.f9252a = lVar;
        }

        @Override // com.google.protobuf.o2.c
        public byte a(int i10) {
            return this.f9252a.d(i10);
        }

        @Override // com.google.protobuf.o2.c
        public int size() {
            return this.f9252a.size();
        }
    }

    class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f9253a;

        b(byte[] bArr) {
            this.f9253a = bArr;
        }

        @Override // com.google.protobuf.o2.c
        public byte a(int i10) {
            return this.f9253a[i10];
        }

        @Override // com.google.protobuf.o2.c
        public int size() {
            return this.f9253a.length;
        }
    }

    private interface c {
        byte a(int i10);

        int size();
    }

    static String a(l lVar) {
        return b(new a(lVar));
    }

    static String b(c cVar) {
        StringBuilder sb2 = new StringBuilder(cVar.size());
        for (int i10 = 0; i10 < cVar.size(); i10++) {
            byte bA = cVar.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    static String c(byte[] bArr) {
        return b(new b(bArr));
    }

    static String d(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String e(String str) {
        return a(l.i(str));
    }
}
