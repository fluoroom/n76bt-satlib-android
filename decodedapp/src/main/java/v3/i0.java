package v3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.loader.app.a;
import com.dw.widget.TableView;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u0000 c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0003defB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\u0006J!\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030!2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030!2\b\u0010$\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\n2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030!H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010\u0006J;\u00104\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00100\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u001e2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\r2\u0006\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u000202H\u0014¢\u0006\u0004\b8\u00109J\u001f\u0010=\u001a\u00020\n2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u0016\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010AJ\u0011\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bC\u0010DR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010O\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001c\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR*\u0010_\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b¨\u0006g"}, d2 = {"Lv3/i0;", "Lv3/f0;", "Landroidx/loader/app/a$a;", "Landroid/database/Cursor;", "Lm0/u;", "<init>", "()V", "", "Q4", "()Ljava/lang/String;", "Ldd/d0;", "K4", "filePath", "", "showToast", "L4", "(Ljava/lang/String;Z)Z", "", "exclude", "I4", "(Ljava/util/Set;)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "arg0", "arg1", "Lg1/c;", "S", "(ILandroid/os/Bundle;)Lg1/c;", "cursor", "N4", "(Lg1/c;Landroid/database/Cursor;)V", "t0", "(Lg1/c;)V", "Landroid/view/MenuItem;", "item", "v", "(Landroid/view/MenuItem;)Z", "J4", "Landroidx/fragment/app/o;", "sender", "what", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "token", "result", "e4", "(ILjava/lang/Object;)Z", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "E0", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "newText", "D4", "(Ljava/lang/String;)V", "Lv3/e0;", "getSearchable", "()Lv3/e0;", "Lcom/dw/widget/TableView;", "I0", "Lcom/dw/widget/TableView;", "mTableView", "J0", "Landroid/database/Cursor;", "mCursor", "Lg1/b;", "K0", "Lg1/b;", "mLoader", "", "L0", "[Ljava/lang/String;", "mColumnNames", "Lv3/i0$a;", "M0", "Lv3/i0$a;", "mArgument", "Lf/c;", "N0", "Lf/c;", "createDocument", "value", "O0", "Z", "isCleanable", "()Z", "P4", "(Z)V", "P0", "a", "c", "b", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class i0 extends f0 implements a.InterfaceC0037a, m0.u {

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private TableView mTableView;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private Cursor mCursor;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private g1.b mLoader;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private String[] mColumnNames;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private a mArgument;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private final f.c createDocument = r3(new g.b("text/csv"), new f.b() { // from class: v3.h0
        @Override // f.b
        public final void a(Object obj) {
            i0.H4(this.f29561a, (Uri) obj);
        }
    });

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private boolean isCleanable;

    public static final class c extends CursorWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f29568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f29569b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Cursor cursor) {
            super(cursor);
            rd.m.e(cursor, "cursor");
            int columnIndex = cursor.getColumnIndex("_id");
            this.f29568a = columnIndex;
            if (columnIndex <= 0) {
                this.f29569b = null;
                return;
            }
            String[] columnNames = cursor.getColumnNames();
            int length = columnNames.length;
            String[] strArr = new String[length];
            strArr[0] = "_id";
            int length2 = columnNames.length;
            for (int i10 = 1; i10 < length2; i10++) {
                int i11 = this.f29568a;
                if (i10 <= i11) {
                    strArr[i10] = columnNames[i10 - 1];
                } else if (i10 > i11) {
                    strArr[i10] = columnNames[i10];
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i12 = 0; i12 < length; i12++) {
                String str = strArr[i12];
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            this.f29569b = (String[]) arrayList.toArray(new String[0]);
        }

        private final int a(int i10) {
            int i11 = this.f29568a;
            return i11 <= 0 ? i10 : i10 == 0 ? i11 : i10 <= i11 ? i10 - 1 : i10;
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public String getColumnName(int i10) {
            String str;
            String[] strArr = this.f29569b;
            if (strArr != null && (str = strArr[i10]) != null) {
                return str;
            }
            String columnName = super.getColumnName(i10);
            rd.m.d(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public String[] getColumnNames() {
            String[] strArr = this.f29569b;
            if (strArr != null) {
                return strArr;
            }
            String[] columnNames = super.getColumnNames();
            rd.m.d(columnNames, "getColumnNames(...)");
            return columnNames;
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public double getDouble(int i10) {
            return super.getDouble(a(i10));
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public float getFloat(int i10) {
            return super.getFloat(a(i10));
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public int getInt(int i10) {
            return super.getInt(a(i10));
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public long getLong(int i10) {
            return super.getLong(a(i10));
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public short getShort(int i10) {
            return super.getShort(a(i10));
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public String getString(int i10) {
            String string = super.getString(a(i10));
            rd.m.d(string, "getString(...)");
            return string;
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public int getType(int i10) {
            return super.getType(a(i10));
        }

        @Override // android.database.CursorWrapper, android.database.Cursor
        public boolean isNull(int i10) {
            return super.isNull(a(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H4(i0 i0Var, Uri uri) {
        Cursor cVar;
        if (uri == null) {
            return;
        }
        Context contextX3 = i0Var.x3();
        rd.m.d(contextX3, "requireContext(...)");
        Cursor cursorQuery = null;
        try {
            try {
                a aVar = i0Var.mArgument;
                if (aVar != null) {
                    ContentResolver contentResolver = contextX3.getContentResolver();
                    Uri uriF = aVar.f();
                    String[] strArrC = aVar.c();
                    g4.f fVarE = aVar.e();
                    String strN = fVarE != null ? fVarE.n() : null;
                    g4.f fVarE2 = aVar.e();
                    cursorQuery = contentResolver.query(uriF, strArrC, strN, fVarE2 != null ? fVarE2.k() : null, aVar.b());
                }
                if (cursorQuery != null) {
                    cVar = new c(cursorQuery);
                } else {
                    cVar = i0Var.mCursor;
                    if (cVar == null) {
                        if (rd.m.a(cursorQuery, cVar) || cursorQuery == null) {
                            return;
                        }
                        cursorQuery.close();
                        return;
                    }
                }
                cursorQuery = cVar;
                OutputStream outputStreamOpenOutputStream = contextX3.getContentResolver().openOutputStream(uri);
                if (outputStreamOpenOutputStream != null) {
                    f4.d dVar = new f4.d();
                    rd.m.b(cursorQuery);
                    dVar.i(outputStreamOpenOutputStream, cursorQuery);
                    Toast.makeText(contextX3, contextX3.getString(k3.j.f19242j, uri), 1).show();
                }
                if (rd.m.a(cursorQuery, i0Var.mCursor) || cursorQuery == null) {
                    return;
                }
                cursorQuery.close();
            } catch (Exception e10) {
                e10.printStackTrace();
                Toast.makeText(contextX3, e10.getLocalizedMessage(), 1).show();
                if (rd.m.a(cursorQuery, i0Var.mCursor) || cursorQuery == null) {
                    return;
                }
                cursorQuery.close();
            }
        } finally {
        }
    }

    private final String I4(Set exclude) {
        List listK;
        List listK2;
        String str = "% %";
        String[] strArr = this.mColumnNames;
        if (strArr == null || (listK = ed.j.d(strArr)) == null) {
            listK = ed.q.k();
        }
        HashSet hashSet = new HashSet(listK);
        hashSet.removeAll(exclude);
        String[] strArr2 = (String[]) hashSet.toArray(d4.c.f10567g);
        String[] strArr3 = new String[strArr2.length];
        String[] strArr4 = new String[strArr2.length];
        int length = strArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr2[i10];
            strArr3[i10] = str;
            strArr4[i10] = str2 + " LIKE ?";
        }
        g1.b bVar = this.mLoader;
        rd.m.b(bVar);
        bVar.R(TextUtils.join(" OR ", strArr4) + " AND 1=0");
        g1.b bVar2 = this.mLoader;
        rd.m.b(bVar2);
        bVar2.S(strArr3);
        try {
            g1.b bVar3 = this.mLoader;
            rd.m.b(bVar3);
            Cursor cursorH = bVar3.H();
            if (cursorH != null) {
                cursorH.close();
            }
            return null;
        } catch (SQLiteException e10) {
            String message = e10.getMessage();
            rd.m.b(message);
            if (!rg.q.J(message, "ambiguous column name: ", false, 2, null)) {
                throw e10;
            }
            String strSubstring = message.substring(23);
            rd.m.d(strSubstring, "substring(...)");
            List listE = new rg.o(" ").e(strSubstring, 0);
            if (listE.isEmpty()) {
                listK2 = ed.q.k();
            } else {
                ListIterator listIterator = listE.listIterator(listE.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listK2 = ed.q.C0(listE, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listK2 = ed.q.k();
            }
            return ((String[]) listK2.toArray(new String[0]))[0];
        }
    }

    private final void K4() {
        Cursor cursor = this.mCursor;
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        f.c cVar = this.createDocument;
        if (cVar != null) {
            cVar.a("");
            return;
        }
        q.p4(x3(), N1(k3.j.f19239g), null, Environment.getExternalStorageDirectory().getPath() + "/DW/data/" + System.currentTimeMillis() + ".csv", null, 1).g4(y3(), "SAVE_PATH");
    }

    private final boolean L4(String filePath, boolean showToast) {
        Cursor cVar;
        Context contextK1 = k1();
        if (contextK1 == null) {
            return false;
        }
        Cursor cursorQuery = null;
        try {
            try {
                a aVar = this.mArgument;
                if (aVar != null) {
                    ContentResolver contentResolver = contextK1.getContentResolver();
                    Uri uriF = aVar.f();
                    String[] strArrC = aVar.c();
                    g4.f fVarE = aVar.e();
                    String strN = fVarE != null ? fVarE.n() : null;
                    g4.f fVarE2 = aVar.e();
                    cursorQuery = contentResolver.query(uriF, strArrC, strN, fVarE2 != null ? fVarE2.k() : null, aVar.b());
                }
                if (cursorQuery != null) {
                    cVar = new c(cursorQuery);
                } else {
                    cVar = this.mCursor;
                    if (cVar == null) {
                        if (!rd.m.a(cursorQuery, cVar) && cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return false;
                    }
                }
                cursorQuery = cVar;
                new f4.d().m(cursorQuery, filePath);
                if (showToast) {
                    Toast.makeText(contextK1, contextK1.getString(k3.j.f19242j, filePath), 1).show();
                }
                if (!rd.m.a(cursorQuery, this.mCursor) && cursorQuery != null) {
                    cursorQuery.close();
                }
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
                if (showToast) {
                    Toast.makeText(contextK1, e10.getLocalizedMessage(), 1).show();
                }
                if (!rd.m.a(cursorQuery, this.mCursor) && cursorQuery != null) {
                    cursorQuery.close();
                }
                return false;
            }
        } finally {
        }
    }

    static /* synthetic */ boolean M4(i0 i0Var, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: doSave");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return i0Var.L4(str, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O4(i0 i0Var, Object obj) {
        rd.m.c(obj, "null cannot be cast to non-null type kotlin.String");
        M4(i0Var, (String) obj, false, 2, null);
        return null;
    }

    private final String Q4() {
        Cursor cursor = this.mCursor;
        if (cursor == null) {
            return null;
        }
        return new f4.d().h(cursor, null);
    }

    @Override // v3.f0
    protected void D4(String newText) {
        String[] strArr;
        a aVar;
        rd.m.e(newText, "newText");
        g1.b bVar = this.mLoader;
        if (bVar == null || (strArr = this.mColumnNames) == null || (aVar = this.mArgument) == null) {
            return;
        }
        if (TextUtils.isEmpty(newText)) {
            g4.f fVarE = aVar.e();
            bVar.R(fVarE != null ? fVarE.n() : null);
            g4.f fVarE2 = aVar.e();
            bVar.S(fVarE2 != null ? fVarE2.k() : null);
            bVar.h();
            return;
        }
        String str = "%" + newText + "%";
        HashSet hashSet = new HashSet(ed.j.d(strArr));
        HashSet hashSet2 = new HashSet();
        while (true) {
            String strI4 = I4(hashSet2);
            if (strI4 == null) {
                break;
            } else {
                hashSet2.add(strI4);
            }
        }
        hashSet.removeAll(hashSet2);
        String[] strArr2 = (String[]) hashSet.toArray(d4.c.f10567g);
        String[] strArr3 = new String[strArr2.length];
        String[] strArr4 = new String[strArr2.length];
        int length = strArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr2[i10];
            strArr3[i10] = str;
            strArr4[i10] = str2 + " LIKE ?";
        }
        g4.f fVar = new g4.f(TextUtils.join(" OR ", strArr4), strArr3);
        fVar.h(aVar.e());
        bVar.R(fVar.n());
        bVar.S(fVar.k());
        bVar.h();
    }

    @Override // m0.u
    public void E0(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        inflater.inflate(k3.h.f19229a, menu);
        menu.findItem(k3.f.f19185e).setVisible(this.isCleanable);
    }

    public void J4() {
        a aVar = this.mArgument;
        if (aVar != null) {
            ContentResolver contentResolver = x3().getContentResolver();
            Uri uriF = aVar.f();
            g4.f fVarE = aVar.e();
            String strN = fVarE != null ? fVarE.n() : null;
            g4.f fVarE2 = aVar.e();
            contentResolver.delete(uriF, strN, fVarE2 != null ? fVarE2.k() : null);
        }
    }

    @Override // m0.u
    public /* synthetic */ void K0(Menu menu) {
        m0.t.b(this, menu);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    /* JADX INFO: renamed from: N4, reason: merged with bridge method [inline-methods] */
    public void K(g1.c arg0, Cursor cursor) {
        rd.m.e(arg0, "arg0");
        if (cursor != null) {
            c cVar = new c(cursor);
            if (this.mColumnNames == null) {
                this.mColumnNames = cVar.getColumnNames();
            }
            cursor = cVar;
        }
        this.mCursor = cursor;
        TableView tableView = this.mTableView;
        if (tableView != null) {
            tableView.setCursor(cursor);
        }
    }

    public final void P4(boolean z10) {
        if (this.isCleanable == z10) {
            return;
        }
        this.isCleanable = z10;
        androidx.fragment.app.p pVarE1 = e1();
        if (pVarE1 != null) {
            pVarE1.C0();
        }
    }

    public g1.c S(int arg0, Bundle arg1) {
        g1.b bVar = new g1.b(x3());
        a aVar = this.mArgument;
        if (aVar != null) {
            bVar.U(aVar.f());
            bVar.T(aVar.b());
            bVar.Q(aVar.c());
            g4.f fVarE = aVar.e();
            if (fVarE != null) {
                bVar.R(fVarE.n());
                bVar.S(fVarE.k());
            }
        }
        return bVar;
    }

    @Override // v3.v
    protected boolean e4(int token, Object result) {
        rd.m.e(result, "result");
        if (token != 1) {
            return false;
        }
        Z3();
        return true;
    }

    @Override // v3.v
    public boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        if (sender == null || what != k3.f.T || !rd.m.a("SAVE_PATH", sender.P1())) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if (arg1 == -1) {
            j4();
            Y3().c(1, new a6.l() { // from class: v3.g0
                @Override // a6.l
                public final Object a(Object obj2) {
                    return i0.O4(this.f29555a, obj2);
                }
            }, obj);
        }
        return true;
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void t0(g1.c arg0) {
        rd.m.e(arg0, "arg0");
        TableView tableView = this.mTableView;
        if (tableView != null) {
            tableView.setCursor(null);
        }
    }

    @Override // m0.u
    public boolean v(MenuItem item) throws IOException {
        rd.m.e(item, "item");
        if (!b4()) {
            return false;
        }
        int itemId = item.getItemId();
        if (itemId == k3.f.f19186f) {
            String strQ4 = Q4();
            if (strQ4 == null) {
                strQ4 = "";
            }
            a6.e.a(x3(), strQ4, null, new String[]{"text/csv"});
            return true;
        }
        if (itemId != k3.f.f19188h) {
            if (itemId == k3.f.f19187g) {
                K4();
                return true;
            }
            if (itemId != k3.f.f19185e) {
                return false;
            }
            J4();
            return true;
        }
        File fileCreateTempFile = File.createTempFile(((Object) v3().getTitle()) + "-", ".csv");
        String path = fileCreateTempFile.getPath();
        rd.m.d(path, "getPath(...)");
        if (!L4(path, false)) {
            return true;
        }
        e4.a.c(x3(), fileCreateTempFile);
        return true;
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        View viewInflate = inflater.inflate(k3.g.f19225s, container, false);
        this.mTableView = (TableView) viewInflate.findViewById(k3.f.L);
        Bundle bundleI1 = i1();
        if (bundleI1 != null) {
            this.mArgument = (a) bundleI1.getParcelable("TableViewerFragment.argument");
        }
        g1.c cVarC = x1().c(0, null, this);
        rd.m.c(cVarC, "null cannot be cast to non-null type androidx.loader.content.CursorLoader");
        this.mLoader = (g1.b) cVarC;
        v3().q0(this, U1());
        return viewInflate;
    }

    @Override // m0.u
    public /* synthetic */ void z0(Menu menu) {
        m0.t.a(this, menu);
    }

    public static final class a implements Parcelable {
        public static final C0404a CREATOR = new C0404a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Uri f29564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f29565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private g4.f f29566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f29567d;

        /* JADX INFO: renamed from: v3.i0$a$a, reason: collision with other inner class name */
        public static final class C0404a implements Parcelable.Creator {
            public /* synthetic */ C0404a(rd.h hVar) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                rd.m.e(parcel, "parcel");
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }

            private C0404a() {
            }
        }

        public a(Uri uri, String[] strArr, g4.f fVar, String str) {
            rd.m.e(uri, "uri");
            this.f29564a = uri;
            this.f29565b = strArr;
            this.f29566c = fVar;
            this.f29567d = str;
        }

        public final String b() {
            return this.f29567d;
        }

        public final String[] c() {
            return this.f29565b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final g4.f e() {
            return this.f29566c;
        }

        public final Uri f() {
            return this.f29564a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            rd.m.e(parcel, "parcel");
            parcel.writeParcelable(this.f29564a, i10);
            parcel.writeStringArray(this.f29565b);
            parcel.writeParcelable(this.f29566c, i10);
            parcel.writeString(this.f29567d);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Parcel parcel) {
            rd.m.e(parcel, "parcel");
            Parcelable parcelable = parcel.readParcelable(Uri.class.getClassLoader());
            rd.m.b(parcelable);
            this((Uri) parcelable, parcel.createStringArray(), (g4.f) parcel.readParcelable(g4.f.class.getClassLoader()), parcel.readString());
        }
    }

    @Override // v3.f0, v3.e0
    public e0 getSearchable() {
        return this;
    }
}
