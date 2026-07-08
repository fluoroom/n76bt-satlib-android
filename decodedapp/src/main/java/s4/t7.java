package s4;

import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;
import com.benshikj.ht.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Ls4/t7;", "Lv3/q;", "<init>", "()V", "Landroid/widget/EditText;", "edittext", "Ldd/d0;", "r4", "(Landroid/widget/EditText;)V", "", "text", "", "n4", "(Ljava/lang/CharSequence;)Z", "", "v4", "()F", "value", "K0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t7 extends v3.q {

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float L0 = 67.0f;
    private static final float M0 = 254.1f;

    /* JADX INFO: renamed from: s4.t7$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public final t7 a(Context context, CharSequence charSequence, float f10, String str) {
            String str2;
            rd.m.e(context, "context");
            rd.m.e(charSequence, "title");
            rd.m.e(str, "hint");
            t7 t7Var = new t7();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getString(R.string.freq_range));
            sb2.append('\n');
            rd.g0 g0Var = rd.g0.f25951a;
            String str3 = String.format(Locale.getDefault(), "%.2fHz", Arrays.copyOf(new Object[]{Float.valueOf(t7.L0)}, 1));
            rd.m.d(str3, "format(...)");
            sb2.append(str3);
            sb2.append('-');
            String str4 = String.format(Locale.getDefault(), "%.2fHz", Arrays.copyOf(new Object[]{Float.valueOf(t7.M0)}, 1));
            rd.m.d(str4, "format(...)");
            sb2.append(str4);
            String string = sb2.toString();
            if (f10 > 0.0f) {
                str2 = String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f10)}, 1));
                rd.m.d(str2, "format(...)");
            } else {
                str2 = "";
            }
            q.b bVar = new q.b(context, charSequence, string, str2, str, 0);
            Bundle bundle = new Bundle();
            bundle.putParcelable("parameter", bVar);
            t7Var.E3(bundle);
            return t7Var;
        }

        private Companion() {
        }
    }

    @Override // v3.q
    protected boolean n4(CharSequence text) {
        rd.m.e(text, "text");
        float fV4 = v4();
        return fV4 <= M0 && L0 <= fV4;
    }

    @Override // v3.q
    protected void r4(EditText edittext) {
        super.r4(edittext);
        rd.m.b(edittext);
        edittext.setInputType(8194);
        edittext.setMaxLines(1);
        InputFilter[] filters = edittext.getFilters();
        InputFilter[] inputFilterArr = filters != null ? (InputFilter[]) Arrays.copyOf(filters, filters.length + 1) : new InputFilter[1];
        rd.m.b(inputFilterArr);
        inputFilterArr[inputFilterArr.length - 1] = new InputFilter.LengthFilter(6);
        edittext.setFilters(inputFilterArr);
    }

    public final float v4() {
        try {
            return Float.parseFloat(m4().toString());
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }
}
