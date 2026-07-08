package com.dw.android.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.a;
import androidx.fragment.app.o;
import l3.b;
import v3.j;
import v3.w;

/* JADX INFO: loaded from: classes.dex */
public class FragmentShowActivity extends b {
    public static Intent d2(Context context, String str, Class cls) {
        return f2(context, str, null, cls, null);
    }

    public static Intent e2(Context context, String str, Class cls, Bundle bundle) {
        return f2(context, str, null, cls, bundle);
    }

    public static Intent f2(Context context, String str, String str2, Class cls, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) FragmentShowActivity.class);
        intent.putExtra("android.intent.extra.TITLE", str);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("FragmentShowActivity.EXTRA_FRAGMENT_CLASS_NAME", cls.getName());
        if (bundle != null) {
            intent.putExtra("FragmentShowActivity.EXTRA_ARGUMENTS", bundle);
        }
        intent.setData(Uri.parse(intent.toUri(1)));
        return intent;
    }

    public static Intent g2(Context context, String str, int i10, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("encoding", str2);
        bundle.putInt("raw_res_id", i10);
        return e2(context, str, w.class, bundle);
    }

    public static void h2(Context context, String str, Class cls) {
        j.e(context, d2(context, str, cls));
    }

    public static void i2(Context context, String str, Class cls, Bundle bundle) {
        j.e(context, e2(context, str, cls, bundle));
    }

    public static void j2(Context context, String str, String str2, Class cls, Bundle bundle) {
        j.e(context, f2(context, str, str2, cls, bundle));
    }

    public static void k2(Context context, String str, int i10, String str2) {
        context.startActivity(g2(context, str, i10, str2));
    }

    @Override // l3.b
    protected o Z1() {
        Intent intent = getIntent();
        if (intent.getIntExtra("FragmentShowActivity.EXTRA_FRAGMENT_ID", 0) == 1) {
            return w.S3(intent.getStringExtra("android.intent.extra.TEXT"), intent.getStringExtra("encoding"));
        }
        String stringExtra = intent.getStringExtra("FragmentShowActivity.EXTRA_FRAGMENT_CLASS_NAME");
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        try {
            return o.Z1(this, stringExtra, intent.getBundleExtra("FragmentShowActivity.EXTRA_ARGUMENTS"));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Override // l3.b, v3.b, androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        a aVarY0;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("android.intent.extra.TITLE");
        if (!TextUtils.isEmpty(stringExtra)) {
            setTitle(stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("android.intent.extra.SUBJECT");
        if (TextUtils.isEmpty(stringExtra2) || (aVarY0 = Y0()) == null) {
            return;
        }
        aVarY0.w(stringExtra2);
    }
}
