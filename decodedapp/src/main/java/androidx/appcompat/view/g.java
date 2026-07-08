package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import m0.s;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e */
    static final Class[] f1107e;

    /* JADX INFO: renamed from: f */
    static final Class[] f1108f;

    /* JADX INFO: renamed from: a */
    final Object[] f1109a;

    /* JADX INFO: renamed from: b */
    final Object[] f1110b;

    /* JADX INFO: renamed from: c */
    Context f1111c;

    /* JADX INFO: renamed from: d */
    private Object f1112d;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        private static final Class[] f1113c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        private Object f1114a;

        /* JADX INFO: renamed from: b */
        private Method f1115b;

        public a(Object obj, String str) {
            this.f1114a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1115b = cls.getMethod(str, f1113c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1115b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1115b.invoke(this.f1114a, menuItem)).booleanValue();
                }
                this.f1115b.invoke(this.f1114a, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private class b {
        m0.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a */
        private Menu f1116a;

        /* JADX INFO: renamed from: b */
        private int f1117b;

        /* JADX INFO: renamed from: c */
        private int f1118c;

        /* JADX INFO: renamed from: d */
        private int f1119d;

        /* JADX INFO: renamed from: e */
        private int f1120e;

        /* JADX INFO: renamed from: f */
        private boolean f1121f;

        /* JADX INFO: renamed from: g */
        private boolean f1122g;

        /* JADX INFO: renamed from: h */
        private boolean f1123h;

        /* JADX INFO: renamed from: i */
        private int f1124i;

        /* JADX INFO: renamed from: j */
        private int f1125j;

        /* JADX INFO: renamed from: k */
        private CharSequence f1126k;

        /* JADX INFO: renamed from: l */
        private CharSequence f1127l;

        /* JADX INFO: renamed from: m */
        private int f1128m;

        /* JADX INFO: renamed from: n */
        private char f1129n;

        /* JADX INFO: renamed from: o */
        private int f1130o;

        /* JADX INFO: renamed from: p */
        private char f1131p;

        /* JADX INFO: renamed from: q */
        private int f1132q;

        /* JADX INFO: renamed from: r */
        private int f1133r;

        /* JADX INFO: renamed from: s */
        private boolean f1134s;

        /* JADX INFO: renamed from: t */
        private boolean f1135t;

        /* JADX INFO: renamed from: u */
        private boolean f1136u;

        /* JADX INFO: renamed from: v */
        private int f1137v;

        /* JADX INFO: renamed from: w */
        private int f1138w;

        /* JADX INFO: renamed from: x */
        private String f1139x;

        /* JADX INFO: renamed from: y */
        private String f1140y;

        /* JADX INFO: renamed from: z */
        private String f1141z;

        public b(Menu menu) {
            this.f1116a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f1111c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f1134s).setVisible(this.f1135t).setEnabled(this.f1136u).setCheckable(this.f1133r >= 1).setTitleCondensed(this.f1127l).setIcon(this.f1128m);
            int i10 = this.f1137v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f1141z != null) {
                if (g.this.f1111c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f1141z));
            }
            if (this.f1133r >= 2) {
                if (menuItem instanceof j) {
                    ((j) menuItem).t(true);
                } else if (menuItem instanceof k) {
                    ((k) menuItem).h(true);
                }
            }
            String str = this.f1139x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f1107e, g.this.f1109a));
                z10 = true;
            }
            int i11 = this.f1138w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            m0.b bVar = this.A;
            if (bVar != null) {
                s.a(menuItem, bVar);
            }
            s.c(menuItem, this.B);
            s.g(menuItem, this.C);
            s.b(menuItem, this.f1129n, this.f1130o);
            s.f(menuItem, this.f1131p, this.f1132q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                s.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                s.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f1123h = true;
            i(this.f1116a.add(this.f1117b, this.f1124i, this.f1125j, this.f1126k));
        }

        public SubMenu b() {
            this.f1123h = true;
            SubMenu subMenuAddSubMenu = this.f1116a.addSubMenu(this.f1117b, this.f1124i, this.f1125j, this.f1126k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.f1123h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f1111c.obtainStyledAttributes(attributeSet, h.j.f15043y1);
            this.f1117b = typedArrayObtainStyledAttributes.getResourceId(h.j.A1, 0);
            this.f1118c = typedArrayObtainStyledAttributes.getInt(h.j.C1, 0);
            this.f1119d = typedArrayObtainStyledAttributes.getInt(h.j.D1, 0);
            this.f1120e = typedArrayObtainStyledAttributes.getInt(h.j.E1, 0);
            this.f1121f = typedArrayObtainStyledAttributes.getBoolean(h.j.B1, true);
            this.f1122g = typedArrayObtainStyledAttributes.getBoolean(h.j.f15048z1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(g.this.f1111c, attributeSet, h.j.F1);
            this.f1124i = tintTypedArrayObtainStyledAttributes.getResourceId(h.j.I1, 0);
            this.f1125j = (tintTypedArrayObtainStyledAttributes.getInt(h.j.L1, this.f1118c) & (-65536)) | (tintTypedArrayObtainStyledAttributes.getInt(h.j.M1, this.f1119d) & 65535);
            this.f1126k = tintTypedArrayObtainStyledAttributes.getText(h.j.N1);
            this.f1127l = tintTypedArrayObtainStyledAttributes.getText(h.j.O1);
            this.f1128m = tintTypedArrayObtainStyledAttributes.getResourceId(h.j.G1, 0);
            this.f1129n = c(tintTypedArrayObtainStyledAttributes.getString(h.j.P1));
            this.f1130o = tintTypedArrayObtainStyledAttributes.getInt(h.j.W1, 4096);
            this.f1131p = c(tintTypedArrayObtainStyledAttributes.getString(h.j.Q1));
            this.f1132q = tintTypedArrayObtainStyledAttributes.getInt(h.j.f14916a2, 4096);
            int i10 = h.j.R1;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f1133r = tintTypedArrayObtainStyledAttributes.getBoolean(i10, false) ? 1 : 0;
            } else {
                this.f1133r = this.f1120e;
            }
            this.f1134s = tintTypedArrayObtainStyledAttributes.getBoolean(h.j.J1, false);
            this.f1135t = tintTypedArrayObtainStyledAttributes.getBoolean(h.j.K1, this.f1121f);
            this.f1136u = tintTypedArrayObtainStyledAttributes.getBoolean(h.j.H1, this.f1122g);
            this.f1137v = tintTypedArrayObtainStyledAttributes.getInt(h.j.f14922b2, -1);
            this.f1141z = tintTypedArrayObtainStyledAttributes.getString(h.j.S1);
            this.f1138w = tintTypedArrayObtainStyledAttributes.getResourceId(h.j.T1, 0);
            this.f1139x = tintTypedArrayObtainStyledAttributes.getString(h.j.V1);
            String string = tintTypedArrayObtainStyledAttributes.getString(h.j.U1);
            this.f1140y = string;
            boolean z10 = string != null;
            if (z10 && this.f1138w == 0 && this.f1139x == null) {
                this.A = (m0.b) e(string, g.f1108f, g.this.f1110b);
            } else {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = tintTypedArrayObtainStyledAttributes.getText(h.j.X1);
            this.C = tintTypedArrayObtainStyledAttributes.getText(h.j.f14928c2);
            int i11 = h.j.Z1;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                this.E = DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = h.j.Y1;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
                this.D = tintTypedArrayObtainStyledAttributes.getColorStateList(i12);
            } else {
                this.D = null;
            }
            tintTypedArrayObtainStyledAttributes.recycle();
            this.f1123h = false;
        }

        public void h() {
            this.f1117b = 0;
            this.f1118c = 0;
            this.f1119d = 0;
            this.f1120e = 0;
            this.f1121f = true;
            this.f1122g = true;
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f1107e = clsArr;
        f1108f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f1111c = context;
        Object[] objArr = {context};
        this.f1109a = objArr;
        this.f1110b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0072, code lost:
    
        if (r0.d() != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0074, code lost:
    
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0076, code lost:
    
        if (r15 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x007c, code lost:
    
        if (r15.hasSubMenu() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x007e, code lost:
    
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0082, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x008a, code lost:
    
        if (r15.equals("menu") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x008c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x008e, code lost:
    
        if (r7 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0091, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0099, code lost:
    
        if (r15.equals("group") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x009b, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00a3, code lost:
    
        if (r15.equals("item") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00a5, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00ad, code lost:
    
        if (r15.equals("menu") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00af, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00b7, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00b9, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c5, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x003b, code lost:
    
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0040, code lost:
    
        if (r6 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0042, code lost:
    
        if (r15 == 1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0048, code lost:
    
        if (r15 == 2) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x004b, code lost:
    
        if (r15 == 3) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0053, code lost:
    
        if (r7 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x005b, code lost:
    
        r8 = null;
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r12 = this;
            androidx.appcompat.view.g$b r0 = new androidx.appcompat.view.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r5
            r6 = 0
            r7 = 0
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r5
            r7 = 0
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            m0.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.hasSubMenu()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = 1
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = 1
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f1112d == null) {
            this.f1112d = a(this.f1111c);
        }
        return this.f1112d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof f0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f1111c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.h) {
                    androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) menu;
                    if (hVar.H()) {
                        hVar.i0();
                        z10 = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.h) menu).h0();
                }
                if (layout != null) {
                    layout.close();
                }
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((androidx.appcompat.view.menu.h) menu).h0();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
