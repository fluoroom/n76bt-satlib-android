package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
class h extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f7748d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f7749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7751c;

    static {
        f7748d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public h() {
        Calendar calendarK = u.k();
        this.f7749a = calendarK;
        this.f7750b = calendarK.getMaximum(7);
        this.f7751c = calendarK.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f7751c;
        int i12 = this.f7750b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f7750b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7750b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(u8.h.f28690s, viewGroup, false);
        }
        this.f7749a.set(7, b(i10));
        textView.setText(this.f7749a.getDisplayName(7, f7748d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(u8.j.f28715q), this.f7749a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i10) {
        Calendar calendarK = u.k();
        this.f7749a = calendarK;
        this.f7750b = calendarK.getMaximum(7);
        this.f7751c = i10;
    }
}
