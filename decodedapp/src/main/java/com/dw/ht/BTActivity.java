package com.dw.ht;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.benshikj.ht.R;
import com.benshikj.ii.II;
import com.benshikj.ii.ReceiveStatus;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.SearchBar;
import com.dw.ht.Cfg;
import com.dw.ht.alarms.AlarmService;
import com.dw.ht.channels.ChannelEditorFragment;
import com.dw.ht.entitys.IIChannel;
import com.dw.ht.fragments.BDListFragment;
import com.dw.ht.fragments.BottomActionFragment;
import com.dw.ht.fragments.DeviceFragment;
import com.dw.ht.fragments.DeviceStatusFragment;
import com.dw.ht.fragments.MMFragment;
import com.dw.ht.fragments.MapToolbarFragment;
import com.dw.ht.fragments.j;
import com.dw.ht.utils.NotificationManager;
import com.ekito.simpleKML.model.Kml;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import k5.w0;
import kotlin.Metadata;
import m0.c1;
import m0.m1;
import org.greenrobot.eventbus.ThreadMode;
import org.simpleframework.xml.strategy.Name;
import s4.a4;
import s4.b1;
import s4.e6;
import s4.s7;
import v4.i0;
import v4.l1;
import v4.n0;
import v4.n1;
import v4.o0;
import v4.u;
import w5.d;
import z4.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ð\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 á\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0007â\u0001ã\u0001ä\u0001\\B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0005J\u0019\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0005J\u0019\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\u0005J\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b#\u0010\nJ\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0015¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020+2\u0006\u0010(\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010-J\u0019\u00101\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/H\u0007¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\bH\u0015¢\u0006\u0004\b3\u0010\u0005J\u000f\u00104\u001a\u00020\bH\u0014¢\u0006\u0004\b4\u0010\u0005J\u000f\u00105\u001a\u00020\bH\u0014¢\u0006\u0004\b5\u0010\u0005J\u000f\u00106\u001a\u00020\bH\u0004¢\u0006\u0004\b6\u0010\u0005J\u000f\u00107\u001a\u00020\bH\u0014¢\u0006\u0004\b7\u0010\u0005J\u0017\u00101\u001a\u00020\b2\u0006\u0010*\u001a\u000208H\u0007¢\u0006\u0004\b1\u00109J\u0017\u00101\u001a\u00020\b2\u0006\u0010*\u001a\u00020:H\u0007¢\u0006\u0004\b1\u0010;J\u0017\u00101\u001a\u00020\b2\u0006\u0010*\u001a\u00020<H\u0007¢\u0006\u0004\b1\u0010=J\u0017\u00101\u001a\u00020\b2\u0006\u0010*\u001a\u00020>H\u0007¢\u0006\u0004\b1\u0010?J\u0017\u00101\u001a\u00020\b2\u0006\u0010*\u001a\u00020@H\u0007¢\u0006\u0004\b1\u0010AJ\u0017\u00101\u001a\u00020\b2\u0006\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\b1\u0010DJ\u0017\u00101\u001a\u00020\b2\u0006\u0010F\u001a\u00020EH\u0007¢\u0006\u0004\b1\u0010GJ\u0017\u00101\u001a\u00020\b2\u0006\u0010*\u001a\u00020HH\u0007¢\u0006\u0004\b1\u0010IJ\u0017\u00101\u001a\u00020\b2\u0006\u0010*\u001a\u00020JH\u0007¢\u0006\u0004\b1\u0010KJ)\u0010N\u001a\u00020\b2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\bN\u0010OJ\u0015\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0PH\u0014¢\u0006\u0004\bR\u0010SJ\u0011\u0010T\u001a\u0004\u0018\u00010QH\u0014¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\bH\u0014¢\u0006\u0004\bV\u0010\u0005J\u0017\u0010Y\u001a\u00020\b2\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020+2\u0006\u0010[\u001a\u00020$H\u0016¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020+2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b`\u0010aJ\u0017\u0010b\u001a\u00020+2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\bb\u0010aJ\u001d\u0010f\u001a\u00020\b2\u000e\u0010e\u001a\n\u0012\u0006\b\u0001\u0012\u00020d0c¢\u0006\u0004\bf\u0010gJ\r\u0010h\u001a\u00020\b¢\u0006\u0004\bh\u0010\u0005J\u0015\u0010j\u001a\u00020\b2\u0006\u0010i\u001a\u00020$¢\u0006\u0004\bj\u0010'J\u0017\u0010m\u001a\u00020+2\u0006\u0010l\u001a\u00020kH\u0016¢\u0006\u0004\bm\u0010nJ\u000f\u0010o\u001a\u00020+H\u0014¢\u0006\u0004\bo\u0010pJ;\u0010w\u001a\u00020+2\b\u0010q\u001a\u0004\u0018\u00010d2\u0006\u0010r\u001a\u00020$2\u0006\u0010s\u001a\u00020$2\u0006\u0010t\u001a\u00020$2\b\u0010v\u001a\u0004\u0018\u00010uH\u0016¢\u0006\u0004\bw\u0010xJ\u0011\u0010z\u001a\u0004\u0018\u00010yH\u0014¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020\bH\u0016¢\u0006\u0004\b|\u0010\u0005J\u000f\u0010}\u001a\u00020\bH\u0016¢\u0006\u0004\b}\u0010\u0005J\r\u0010~\u001a\u00020\b¢\u0006\u0004\b~\u0010\u0005J\u000f\u0010\u007f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u007f\u0010\u0005J\u001c\u0010\u0082\u0001\u001a\u00020\b2\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0085\u0001\u001a\u00020\b2\u0007\u0010\u0084\u0001\u001a\u00020\u001fH\u0014¢\u0006\u0005\b\u0085\u0001\u0010\"J\u0019\u0010\u0086\u0001\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0005\b\u0086\u0001\u0010\"J\u001b\u0010\u0088\u0001\u001a\u00020\b2\u0007\u0010\u0016\u001a\u00030\u0087\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008c\u0001\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0095\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010\u009f\u0001\u001a\u00030\u009d\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u009e\u0001R\u0018\u0010£\u0001\u001a\u00030 \u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001c\u0010§\u0001\u001a\u0005\u0018\u00010¤\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001c\u0010¯\u0001\u001a\u0005\u0018\u00010¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0018\u0010µ\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010²\u0001R5\u0010º\u0001\u001a \u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020>0¶\u0001j\u000f\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020>`·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R*\u0010À\u0001\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b»\u0001\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0005\b¿\u0001\u0010\nR\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010Á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R)\u0010Í\u0001\u001a\u00020@2\u0007\u0010É\u0001\u001a\u00020@8\u0002@BX\u0082\u000e¢\u0006\u000f\n\u0006\bÊ\u0001\u0010Ë\u0001\"\u0005\bÌ\u0001\u0010AR/\u0010\u0016\u001a\u0005\u0018\u00010Î\u00012\n\u0010É\u0001\u001a\u0005\u0018\u00010Î\u00018\u0002@BX\u0082\u000e¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R8\u0010Ú\u0001\u001a\u0005\u0018\u00010Ó\u00012\n\u0010É\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R\u0016\u0010Ü\u0001\u001a\u00020+8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010pR\u001a\u0010à\u0001\u001a\u0005\u0018\u00010Ý\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÞ\u0001\u0010ß\u0001¨\u0006å\u0001"}, d2 = {"Lcom/dw/ht/BTActivity;", "Lj4/a;", "Lcom/dw/ht/fragments/BDListFragment$a;", "Lv4/n0$d;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Ldd/d0;", "v2", "(Landroid/content/Intent;)V", "P0", "y2", "M2", "K2", "L2", "n2", "Ld5/a;", "dc", "B2", "(Ld5/a;)V", "Lv4/c0;", "link", "C2", "(Ld5/a;Lv4/c0;)V", "A2", "Lv3/m0;", "titleFragment", "O2", "(Lv3/m0;)V", "J2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "", "newState", "B1", "(I)V", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onKeyUp", "Lcom/dw/ht/fragments/MapToolbarFragment$a;", "message", "onMessageEvent", "(Lcom/dw/ht/fragments/MapToolbarFragment$a;)V", "onResume", "onStart", "onStop", "finalize", "onDestroy", "Lp4/a;", "(Lp4/a;)V", "Lv4/u$c;", "(Lv4/u$c;)V", "Lv4/i0$b;", "(Lv4/i0$b;)V", "Lcom/benshikj/ii/ReceiveStatus;", "(Lcom/benshikj/ii/ReceiveStatus;)V", "Lcom/dw/ht/BTActivity$b;", "(Lcom/dw/ht/BTActivity$b;)V", "Lcom/dw/ht/fragments/j$f;", "focus", "(Lcom/dw/ht/fragments/j$f;)V", "Lz4/j;", "layer", "(Lz4/j;)V", "Lv4/l0;", "(Lv4/l0;)V", "Lcom/dw/ht/Cfg$a;", "(Lcom/dw/ht/Cfg$a;)V", "requestCode", "resultCode", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "z1", "()[Ljava/lang/String;", "A1", "()Ljava/lang/String;", "C1", "", "devId", "x2", "(J)V", Name.MARK, "a", "(I)Z", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "onPrepareOptionsMenu", "Ljava/lang/Class;", "Landroidx/fragment/app/o;", "fragmentClass", "I2", "(Ljava/lang/Class;)V", "o2", "level", "G2", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "T1", "()Z", "sender", "what", "arg1", "arg2", "", "obj", "N", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "Lcom/dw/android/widget/SearchBar;", "S1", "()Lcom/dw/android/widget/SearchBar;", "b2", "Y1", "N2", "onBackPressed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "outState", "onSaveInstanceState", "onRestoreInstanceState", "Lv4/n0;", "o0", "(Lv4/n0;)V", "j0", "I", "iID", "Lcom/dw/ht/fragments/MMFragment;", "k0", "Lcom/dw/ht/fragments/MMFragment;", "mmFragment", "Lcom/dw/ht/fragments/BottomActionFragment;", "l0", "Lcom/dw/ht/fragments/BottomActionFragment;", "bottomActionFragment", "Lcom/dw/ht/fragments/j;", "m0", "Lcom/dw/ht/fragments/j;", "mapFragment", "Lcom/dw/ht/fragments/BDListFragment;", "n0", "Lcom/dw/ht/fragments/BDListFragment;", "mBDListFragment", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "mPref", "Lv4/u;", "p0", "Lv4/u;", "connectionManager", "Lcom/dw/ht/BTActivity$c;", "q0", "Lcom/dw/ht/BTActivity$c;", "mRxPopupWindow", "Lcom/dw/ht/BTActivity$d;", "r0", "Lcom/dw/ht/BTActivity$d;", "mTxPopupWindow", "Landroidx/drawerlayout/widget/DrawerLayout;", "s0", "Landroidx/drawerlayout/widget/DrawerLayout;", "mDrawerLayout", "Lp4/c;", "t0", "Lp4/c;", "mEventDown", "u0", "mEventUp", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "v0", "Ljava/util/HashMap;", "mIIRXing", "w0", "Landroid/content/Intent;", "getNewIntent", "()Landroid/content/Intent;", "setNewIntent", "newIntent", "Lm4/b;", "x0", "Lm4/b;", "binding", "Landroid/view/View;", "y0", "Landroid/view/View;", "sm", "value", "z0", "Lcom/dw/ht/BTActivity$b;", "E2", "displayMode", "Lv4/l1;", "A0", "Lv4/l1;", "F2", "(Lv4/l1;)V", "", "B0", "Ljava/lang/CharSequence;", "getStatusText", "()Ljava/lang/CharSequence;", "H2", "(Ljava/lang/CharSequence;)V", "statusText", "q2", "needShowPTT", "Lcom/dw/ht/fragments/DeviceStatusFragment;", "p2", "()Lcom/dw/ht/fragments/DeviceStatusFragment;", "dev_status", "C0", "b", "c", "d", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BTActivity extends j4.a implements BDListFragment.a, n0.d {

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String D0 = "ACTION_HANDLE_CALL";
    private static CharSequence E0;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private l1 link;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private CharSequence statusText;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private final int iID;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private MMFragment mmFragment;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    private BottomActionFragment bottomActionFragment;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    private com.dw.ht.fragments.j mapFragment;

    /* JADX INFO: renamed from: n0, reason: from kotlin metadata */
    private BDListFragment mBDListFragment;

    /* JADX INFO: renamed from: o0, reason: from kotlin metadata */
    private SharedPreferences mPref;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private final v4.u connectionManager;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    private c mRxPopupWindow;

    /* JADX INFO: renamed from: r0, reason: from kotlin metadata */
    private d mTxPopupWindow;

    /* JADX INFO: renamed from: s0, reason: from kotlin metadata */
    private DrawerLayout mDrawerLayout;

    /* JADX INFO: renamed from: t0, reason: from kotlin metadata */
    private final p4.c mEventDown;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    private final p4.c mEventUp;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    private final HashMap mIIRXing;

    /* JADX INFO: renamed from: w0, reason: from kotlin metadata */
    private Intent newIntent;

    /* JADX INFO: renamed from: x0, reason: from kotlin metadata */
    private m4.b binding;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    private View sm;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    private b displayMode;

    /* JADX INFO: renamed from: com.dw.ht.BTActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public final String a() {
            return BTActivity.D0;
        }

        private Companion() {
        }
    }

    public static final class b extends Enum {

        /* JADX INFO: renamed from: a */
        public static final b f5458a = new b("Message", 0);

        /* JADX INFO: renamed from: b */
        public static final b f5459b = new b("Members", 1);

        /* JADX INFO: renamed from: c */
        public static final b f5460c = new b("Map", 2);

        /* JADX INFO: renamed from: d */
        public static final b f5461d = new b("SimpleMode", 3);

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ b[] f5462e;

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ kd.a f5463f;

        static {
            b[] bVarArrA = a();
            f5462e = bVarArrA;
            f5463f = kd.b.a(bVarArrA);
        }

        private b(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f5458a, f5459b, f5460c, f5461d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f5462e.clone();
        }
    }

    private static final class c extends PopupWindow {

        /* JADX INFO: renamed from: a */
        private final TextView f5464a;

        /* JADX INFO: renamed from: b */
        private final String f5465b;

        public c(Context context) {
            rd.m.e(context, "context");
            View viewInflate = View.inflate(context, R.layout.popup_rx_audio, null);
            View viewFindViewById = viewInflate.findViewById(R.id.message);
            rd.m.d(viewFindViewById, "findViewById(...)");
            this.f5464a = (TextView) viewFindViewById;
            setWidth(-2);
            setHeight(-2);
            setContentView(viewInflate);
            setTouchable(false);
            String string = context.getString(R.string.inSpeech);
            rd.m.d(string, "getString(...)");
            this.f5465b = string;
        }

        public final void a(String str) {
            rd.m.e(str, "message");
            this.f5464a.setText(str);
        }

        public final void b(View view) {
            showAtLocation(view, 17, 0, 0);
        }

        public final void c(Collection collection) {
            rd.m.e(collection, "values");
            ArrayList arrayListA = a6.o.a();
            ArrayList arrayListA2 = a6.o.a();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ReceiveStatus receiveStatus = (ReceiveStatus) it.next();
                arrayListA2.clear();
                IIChannel iIChannelK = u4.d0.k(receiveStatus.channelID);
                if (iIChannelK != null) {
                    arrayListA2.add(iIChannelK.k());
                }
                String strD = u4.y.d(receiveStatus);
                if (strD.length() > 0) {
                    arrayListA2.add(strD);
                }
                arrayListA.add(TextUtils.join(" | ", arrayListA2));
            }
            String strJoin = TextUtils.join("\n", arrayListA);
            rd.m.d(strJoin, "join(...)");
            a(strJoin);
        }
    }

    private static final class d extends PopupWindow {

        /* JADX INFO: renamed from: a */
        private final TextView f5466a;

        public d(Context context) {
            rd.m.e(context, "context");
            View viewInflate = View.inflate(context, R.layout.popup_rx_audio, null);
            View viewFindViewById = viewInflate.findViewById(R.id.message);
            rd.m.d(viewFindViewById, "findViewById(...)");
            this.f5466a = (TextView) viewFindViewById;
            setWidth(-2);
            setHeight(-2);
            setContentView(viewInflate);
            setTouchable(false);
        }

        public final void a(String str) {
            rd.m.e(str, "message");
            this.f5466a.setText(str);
        }

        public final void b(View view) {
            showAtLocation(view, 17, 0, 0);
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5467a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f5468b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f5469c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f5470d;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f5461d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f5460c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f5458a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f5459b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5467a = iArr;
            int[] iArr2 = new int[MapToolbarFragment.a.values().length];
            try {
                iArr2[MapToolbarFragment.a.f6182a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f5468b = iArr2;
            int[] iArr3 = new int[u.c.values().length];
            try {
                iArr3[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            f5469c = iArr3;
            int[] iArr4 = new int[Cfg.a.values().length];
            try {
                iArr4[Cfg.a.SimpleUIChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            f5470d = iArr4;
        }
    }

    public static final class f implements TabLayout.d {
        f() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void N0(TabLayout.g gVar) {
            rd.m.e(gVar, "tab");
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a0(TabLayout.g gVar) {
            rd.m.e(gVar, "tab");
            BTActivity bTActivity = BTActivity.this;
            int iG = gVar.g();
            bTActivity.E2(iG != 0 ? iG != 1 ? b.f5460c : b.f5459b : b.f5458a);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void t(TabLayout.g gVar) {
            rd.m.e(gVar, "tab");
        }
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ androidx.appcompat.app.c f5472a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ v4.c0 f5473b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ BTActivity f5474c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ d5.a f5475d;

        g(androidx.appcompat.app.c cVar, v4.c0 c0Var, BTActivity bTActivity, d5.a aVar) {
            this.f5472a = cVar;
            this.f5473b = c0Var;
            this.f5474c = bTActivity;
            this.f5475d = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar toolbar;
            if (this.f5472a.isShowing()) {
                if (this.f5473b.j2() && this.f5473b.n()) {
                    this.f5474c.C2(this.f5475d, this.f5473b);
                    this.f5472a.dismiss();
                }
                m4.b bVar = this.f5474c.binding;
                if (bVar == null || (toolbar = bVar.f20992t) == null) {
                    return;
                }
                toolbar.postDelayed(this, 1000L);
            }
        }
    }

    public BTActivity() {
        h.f6301e++;
        this.iID = h.f6301e;
        v4.u uVarW = v4.u.w();
        rd.m.d(uVarW, "getInstance(...)");
        this.connectionManager = uVarW;
        this.mEventDown = new p4.c(0L, 1);
        this.mEventUp = new p4.c(0L, 2);
        this.mIIRXing = new HashMap();
        this.displayMode = b.f5460c;
    }

    private final void A2() {
        if (Cfg.u() < 2) {
            return;
        }
        s3.b.b("LocationManager", "ACCESS_FINE_LOCATION=" + b0.b.a(this, "android.permission.ACCESS_FINE_LOCATION"));
        s3.b.b("LocationManager", "ACCESS_COARSE_LOCATION=" + b0.b.a(this, "android.permission.ACCESS_COARSE_LOCATION"));
        LocationManager locationManager = null;
        try {
            Object systemService = getSystemService("location");
            if (systemService instanceof LocationManager) {
                locationManager = (LocationManager) systemService;
            }
        } catch (Exception e10) {
            s3.b.c("LocationManager", "get LocationManager", e10);
        }
        if (locationManager == null) {
            s3.b.b("LocationManager", "无法获得 LocationManager");
            return;
        }
        s3.b.b("LocationManager", "GPS_PROVIDER Enabled=" + locationManager.isProviderEnabled("gps"));
        s3.b.b("LocationManager", "NETWORK_PROVIDER Enabled=" + locationManager.isProviderEnabled("network"));
        s3.b.b("LocationManager", "PASSIVE_PROVIDER Enabled=" + locationManager.isProviderEnabled("passive"));
    }

    private final void B2(d5.a dc2) {
        Toolbar toolbar;
        v4.u uVarW = v4.u.w();
        rd.m.d(uVarW, "getInstance(...)");
        l1 l1VarR = uVarW.r();
        if (!(l1VarR instanceof v4.c0)) {
            l1VarR = uVarW.o();
        }
        if (l1VarR instanceof v4.c0) {
            v4.c0 c0Var = (v4.c0) l1VarR;
            v4.c0 c0Var2 = (v4.c0) l1VarR;
            c0Var2.v(false);
            rd.m.b(c0Var);
            if (c0Var.j2() && c0Var2.n()) {
                C2(dc2, c0Var);
                return;
            }
            androidx.appcompat.app.c cVarA = new c.a(this).z(getString(R.string.saveToDevice, c0Var2.getName())).j(R.string.connecting).m(android.R.string.cancel, null).a();
            rd.m.d(cVarA, "create(...)");
            cVarA.show();
            m4.b bVar = this.binding;
            if (bVar == null || (toolbar = bVar.f20992t) == null) {
                return;
            }
            toolbar.postDelayed(new g(cVarA, c0Var, this, dc2), 1000L);
        }
    }

    public final void C2(final d5.a dc2, final v4.c0 link) {
        String strM;
        v4.r[] rVarArrM1 = link.M1();
        rd.m.d(rVarArrM1, "getChannels(...)");
        String[] strArr = new String[rVarArrM1.length];
        String string = getString(R.string.empty);
        rd.m.d(string, "getString(...)");
        int length = rVarArrM1.length;
        int i10 = 0;
        while (i10 < length) {
            v4.r rVar = rVarArrM1[i10];
            if (rVar != null) {
                strM = rVar.m();
                if (TextUtils.isEmpty(strM)) {
                    strM = rVar.o(link.k2());
                }
            } else {
                strM = string;
            }
            int i11 = i10 + 1;
            strArr[i10] = getString(R.string.channel_and_freq, Integer.valueOf(i11), strM);
            i10 = i11;
        }
        new c.a(this).z(getString(R.string.saveToDevice, link.getName())).x(strArr, 0, new DialogInterface.OnClickListener() { // from class: com.dw.ht.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i12) {
                BTActivity.D2(link, dc2, dialogInterface, i12);
            }
        }).m(android.R.string.cancel, null).C();
    }

    public static final void D2(v4.c0 c0Var, d5.a aVar, DialogInterface dialogInterface, int i10) {
        c0Var.d1(i10, aVar);
        dialogInterface.dismiss();
    }

    public final void E2(b bVar) {
        if (this.displayMode == bVar) {
            return;
        }
        this.displayMode = bVar;
        y2();
    }

    private final void F2(l1 l1Var) {
        if (rd.m.a(l1Var, this.link)) {
            return;
        }
        l1 l1Var2 = this.link;
        if (l1Var2 != null) {
            l1Var2.r(this);
        }
        if (l1Var != null) {
            l1Var.k(this);
        }
        this.link = l1Var;
        long jQ = l1Var != null ? l1Var.q() : 0L;
        BottomActionFragment bottomActionFragment = this.bottomActionFragment;
        if (bottomActionFragment != null) {
            bottomActionFragment.e5(jQ);
        }
        MMFragment mMFragment = this.mmFragment;
        if (mMFragment != null) {
            mMFragment.e5(jQ);
        }
        DeviceStatusFragment deviceStatusFragmentP2 = p2();
        if (!d.h0.a(deviceStatusFragmentP2)) {
            deviceStatusFragmentP2 = null;
        }
        if (deviceStatusFragmentP2 != null) {
            deviceStatusFragmentP2.e5(jQ);
        }
        K2();
        BDListFragment bDListFragment = this.mBDListFragment;
        if (bDListFragment != null) {
            bDListFragment.F4(jQ, 281474976710657L != jQ);
        }
        invalidateOptionsMenu();
        J2();
    }

    private final void J2() {
        DeviceStatusFragment deviceStatusFragmentP2 = p2();
        if (deviceStatusFragmentP2 == null) {
            return;
        }
        deviceStatusFragmentP2.G5(((this.link instanceof v4.c0) && this.displayMode == b.f5460c && !P1()) ? false : true);
    }

    private final void K2() {
        FloatingActionButton floatingActionButton;
        FloatingActionButton floatingActionButton2;
        if (q2()) {
            m4.b bVar = this.binding;
            if (bVar == null || (floatingActionButton2 = bVar.f20986n) == null) {
                return;
            }
            floatingActionButton2.m();
            return;
        }
        m4.b bVar2 = this.binding;
        if (bVar2 == null || (floatingActionButton = bVar2.f20986n) == null) {
            return;
        }
        floatingActionButton.h();
    }

    private final void L2() {
        if (this.mIIRXing.isEmpty()) {
            c cVar = this.mRxPopupWindow;
            if (cVar != null) {
                rd.m.b(cVar);
                cVar.dismiss();
                return;
            }
            return;
        }
        if (this.mRxPopupWindow == null) {
            this.mRxPopupWindow = new c(this);
        }
        c cVar2 = this.mRxPopupWindow;
        rd.m.b(cVar2);
        Collection collectionValues = this.mIIRXing.values();
        rd.m.d(collectionValues, "<get-values>(...)");
        cVar2.c(collectionValues);
        c cVar3 = this.mRxPopupWindow;
        if (cVar3 != null) {
            m4.b bVar = this.binding;
            cVar3.b(bVar != null ? bVar.f20992t : null);
        }
    }

    private final void M2() {
        m1 m1VarA = c1.a(getWindow(), getWindow().getDecorView());
        rd.m.d(m1VarA, "getInsetsController(...)");
        if (this.displayMode != b.f5460c) {
            m1VarA.b(true);
            m1VarA.a(true);
        } else if (Cfg.E().i()) {
            m1VarA.b(false);
            m1VarA.a(false);
        } else {
            m1VarA.b(true);
            m1VarA.a(true);
        }
    }

    private final void O2(v3.m0 titleFragment) {
        CharSequence subtitle;
        CharSequence string;
        if (titleFragment == null) {
            string = getString(R.string.app_name);
            subtitle = null;
        } else {
            CharSequence title = titleFragment.getTitle();
            subtitle = titleFragment.getSubtitle();
            string = title;
        }
        setTitle(string);
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.y(string);
        }
        H2(subtitle);
    }

    private final void P0() throws Throwable {
        if (this.mBDListFragment != null) {
            return;
        }
        s3.b.b("BTActivity", "init");
        Cfg.Settings settingsO = Cfg.O();
        if (!settingsO.runAtSystemStartup) {
            settingsO.runAtSystemStartup = true;
            Cfg.n0();
            s3.b.b("BTActivity", "runAtSystemStartup -> " + settingsO.runAtSystemStartup);
        }
        final m4.b bVarC = m4.b.c(getLayoutInflater());
        rd.m.d(bVarC, "inflate(...)");
        this.binding = bVarC;
        setContentView(bVarC.b());
        this.sm = bVarC.b().findViewById(R.id.sm);
        boolean z10 = Cfg.O().getSimpleUI() && this.sm != null;
        this.mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        h1(bVarC.f20992t);
        androidx.fragment.app.w wVarN0 = N0();
        rd.m.d(wVarN0, "getSupportFragmentManager(...)");
        BDListFragment bDListFragment = (BDListFragment) wVarN0.i0(R.id.navigation_drawer);
        this.mBDListFragment = bDListFragment;
        if (bDListFragment != null) {
            View viewFindViewById = findViewById(R.id.drawer_layout);
            rd.m.d(viewFindViewById, "findViewById(...)");
            bDListFragment.L4(R.id.navigation_drawer, (DrawerLayout) viewFindViewById);
        }
        v4.u uVarW = v4.u.w();
        rd.m.d(uVarW, "getInstance(...)");
        uVarW.H();
        this.mapFragment = (com.dw.ht.fragments.j) wVarN0.i0(R.id.bmap);
        this.mmFragment = (MMFragment) wVarN0.i0(R.id.mm_fragment);
        androidx.fragment.app.o oVarI0 = wVarN0.i0(R.id.bottom_bar);
        rd.m.c(oVarI0, "null cannot be cast to non-null type com.dw.ht.fragments.BottomActionFragment");
        this.bottomActionFragment = (BottomActionFragment) oVarI0;
        if (this.mapFragment == null) {
            this.mapFragment = com.dw.ht.fragments.j.y5(false, false);
            androidx.fragment.app.d0 d0VarO = wVarN0.o();
            com.dw.ht.fragments.j jVar = this.mapFragment;
            rd.m.b(jVar);
            d0VarO.b(R.id.bmap, jVar).h();
        }
        bVarC.f20974b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.dw.ht.d
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                BTActivity.r2(bVarC, this);
            }
        });
        bVarC.f20986n.setOnTouchListener(new View.OnTouchListener() { // from class: com.dw.ht.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return BTActivity.s2(this.f5651a, view, motionEvent);
            }
        });
        bVarC.f20995w.setOnClickListener(new View.OnClickListener() { // from class: com.dw.ht.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BTActivity.t2(this.f5828a, view);
            }
        });
        bVarC.f20993u.setOnClickListener(new View.OnClickListener() { // from class: com.dw.ht.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BTActivity.u2(this.f6296a, view);
            }
        });
        bVarC.f20990r.h(new f());
        long jT = Cfg.t();
        if (jT != 281474976710657L && (jT > 281474976710655L || (jT != 0 && Cfg.p(false).contains(v4.m0.j(jT))))) {
            x2(jT);
            BDListFragment bDListFragment2 = this.mBDListFragment;
            if (bDListFragment2 != null) {
                BDListFragment.G4(bDListFragment2, jT, false, 2, null);
            }
        } else if (!z10) {
            DrawerLayout drawerLayout = this.mDrawerLayout;
            if (drawerLayout != null) {
                drawerLayout.K(8388611);
            }
            x2(0L);
        }
        e5.d.a(this);
        v2(getIntent());
        O2(this.mmFragment);
        y2();
        v4.u.w().F(true);
        if (z10) {
            E2(b.f5461d);
        }
        r4.g.f25422z.b(this);
        r4.r.f25452h.b(this);
    }

    private final void n2() {
        ClipData primaryClip;
        Object systemService = getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null && primaryClip.getItemCount() >= 1) {
            CharSequence text = primaryClip.getItemAt(0).getText();
            if (!TextUtils.isEmpty(text) && !a6.q.d(text, E0)) {
                E0 = text;
                String string = text.toString();
                d5.e eVarT = d5.e.t(string);
                if (eVarT != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("region", eVarT);
                    FragmentShowActivity.i2(this, null, com.dw.ht.channels.a.class, bundle);
                    return;
                }
                d5.a aVarI = d5.a.I(string);
                if (aVarI != null) {
                    d5.a aVarP = d5.a.p(aVarI);
                    if (aVarP == null) {
                        startActivityForResult(ChannelEditorFragment.Companion.d(ChannelEditorFragment.INSTANCE, this, aVarI, null, null, 12, null), 1);
                    } else {
                        aVarI.i(aVarP.b());
                        B2(aVarI);
                    }
                }
            }
        }
    }

    private final DeviceStatusFragment p2() {
        return (DeviceStatusFragment) N0().i0(R.id.dev_status);
    }

    private final boolean q2() {
        return (this.displayMode != b.f5460c || (this.connectionManager.r() instanceof v4.g) || this.connectionManager.r() == null || P1()) ? false : true;
    }

    public static final void r2(m4.b bVar, BTActivity bTActivity) {
        int[] iArr = new int[2];
        bVar.f20974b.getLocationOnScreen(iArr);
        int iG = a6.k.g(bTActivity, 10.0f);
        int height = iArr[1] + bVar.f20974b.getHeight();
        com.dw.ht.fragments.j jVar = bTActivity.mapFragment;
        if (jVar != null) {
            jVar.L5(iG, height, iG, bVar.f20976d.getBottom() - bVar.f20986n.getTop());
        }
        FrameLayout frameLayout = bVar.f20976d;
        frameLayout.setPadding(0, 0, 0, Math.max(0, (frameLayout.getHeight() - bVar.f20978f.getTop()) - height));
    }

    public static final boolean s2(BTActivity bTActivity, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            mi.c.e().m(bTActivity.mEventDown);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        mi.c.e().m(bTActivity.mEventUp);
        return false;
    }

    public static final void t2(BTActivity bTActivity, View view) {
        bTActivity.E2(b.f5458a);
    }

    public static final void u2(BTActivity bTActivity, View view) {
        bTActivity.E2(b.f5459b);
    }

    private final void v2(Intent intent) throws Throwable {
        d5.d dVarK;
        long j10;
        LatLngBounds latLngBoundsA;
        if (intent == null) {
            return;
        }
        if (!y1()) {
            this.newIntent = intent;
            return;
        }
        this.newIntent = null;
        int i10 = 0;
        if (rd.m.a(D0, intent.getAction())) {
            d5.g gVarJ = d5.g.j(getContentResolver(), intent.getLongExtra("android.intent.extra.UID", 0L));
            NotificationManager.f6876a.a(this, intent.getStringExtra("android.intent.extra.TITLE"));
            if (gVarJ != null) {
                AlarmService.l(this, new k4.b(gVarJ));
            }
            v4.u uVarW = v4.u.w();
            rd.m.d(uVarW, "getInstance(...)");
            Collection<l1> collectionA = uVarW.A();
            rd.m.d(collectionA, "getLinks(...)");
            for (l1 l1Var : collectionA) {
                if (l1Var.n()) {
                    l1Var.a(v4.v.STOP_RINGING, new byte[0]);
                }
                if (gVarJ != null && l1Var.q() == gVarJ.f10633q) {
                    uVarW.G(l1Var);
                    E2(b.f5458a);
                }
            }
            return;
        }
        if (rd.m.a("application/vnd.google-earth.kml+xml", intent.getType())) {
            h.c cVarE = z4.h.i().e(intent.getData());
            if (cVarE == null) {
                Toast.makeText(this, getString(R.string.fileParsingFailed), 1).show();
                return;
            }
            rd.g0 g0Var = rd.g0.f25951a;
            Locale locale = Locale.getDefault();
            String string = getString(R.string.shasBeenImported);
            rd.m.d(string, "getString(...)");
            String str = String.format(locale, string, Arrays.copyOf(new Object[]{cVarE.e()}, 1));
            rd.m.d(str, "format(...)");
            Toast.makeText(this, str, 1).show();
            com.dw.ht.fragments.j jVar = this.mapFragment;
            if (jVar != null) {
                E2(b.f5460c);
                Kml kmlG = cVarE.g();
                if (kmlG == null || (latLngBoundsA = b5.a.a(kmlG)) == null) {
                    return;
                }
                jVar.G(latLngBoundsA, null);
                return;
            }
            return;
        }
        Uri data = intent.getData();
        if (data != null && (a6.q.d(data.getPath(), "/iich") || a6.q.d(data.getPath(), getString(R.string.ii_ch_share_path_prefix)))) {
            try {
                String queryParameter = data.getQueryParameter("cid");
                j10 = queryParameter != null ? Long.parseLong(queryParameter) : 0L;
                try {
                    String queryParameter2 = data.getQueryParameter("passcode");
                    if (queryParameter2 != null) {
                        i10 = Integer.parseInt(queryParameter2);
                    }
                } catch (NumberFormatException unused) {
                }
            } catch (NumberFormatException unused2) {
                j10 = 0;
            }
            if (j10 > 0) {
                if (u4.d0.k(j10) == null) {
                    u4.r.INSTANCE.a(this, j10, i10);
                } else {
                    v4.u uVarW2 = v4.u.w();
                    rd.m.d(uVarW2, "getInstance(...)");
                    uVarW2.G(uVarW2.m(j10));
                }
            }
        }
        long longExtra = intent.getLongExtra("showItemInMap", 0L);
        if (longExtra == 0 || (dVarK = d5.d.k(longExtra)) == null) {
            return;
        }
        mi.c.e().m(new j.f(dVarK, true));
    }

    public static final void w2(BTActivity bTActivity, View view) {
        bTActivity.onBackPressed();
    }

    private final void y2() {
        boolean z10;
        boolean zP1;
        boolean z11;
        m4.b bVar = this.binding;
        if (bVar == null || this.mBDListFragment == null) {
            return;
        }
        s3.b.b("BTActivity", "onDisplayModeChanged:" + this.displayMode);
        int i10 = e.f5467a[this.displayMode.ordinal()];
        if (i10 == 1) {
            if (N0().i0(R.id.sm) == null) {
                N0().o().b(R.id.sm, new s7()).i();
            }
            bVar.f20980h.setVisibility(8);
            bVar.f20976d.setVisibility(8);
            bVar.f20974b.setVisibility(8);
            View view = this.sm;
            if (view != null) {
                view.setVisibility(0);
            }
            z10 = false;
            zP1 = false;
            z11 = true;
        } else if (i10 == 2) {
            bVar.f20980h.setVisibility(8);
            bVar.f20976d.setVisibility(0);
            z10 = !P1();
            zP1 = false;
            z11 = false;
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new dd.o();
            }
            K1(5);
            bVar.f20980h.setVisibility(0);
            bVar.f20976d.setVisibility(8);
            MMFragment mMFragment = this.mmFragment;
            if (mMFragment != null) {
                mMFragment.e5(this.connectionManager.s());
            }
            zP1 = true ^ P1();
            z11 = zP1;
            z10 = false;
        }
        b bVar2 = this.displayMode;
        if (bVar2 != b.f5461d) {
            TabLayout.g gVarB = bVar.f20990r.B(bVar2.ordinal());
            if (gVarB != null) {
                gVarB.l();
            }
            MMFragment mMFragment2 = this.mmFragment;
            if (mMFragment2 != null) {
                mMFragment2.r5(this.displayMode.ordinal());
            }
            View view2 = this.sm;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            bVar.f20974b.setVisibility(0);
        }
        if (z10) {
            bVar.f20994v.setVisibility(0);
            bVar.f20983k.setVisibility(0);
            Group group = bVar.f20975c;
            if (group != null) {
                group.setVisibility(0);
            }
        } else {
            Group group2 = bVar.f20975c;
            if (group2 != null) {
                group2.setVisibility(8);
            }
            bVar.f20994v.setVisibility(8);
            bVar.f20983k.setVisibility(8);
        }
        K2();
        if (zP1) {
            bVar.f20991s.setVisibility(0);
            bVar.f20990r.setVisibility(0);
        } else {
            bVar.f20991s.setVisibility(8);
            bVar.f20990r.setVisibility(8);
        }
        bVar.f20977e.setVisibility(z11 ? 0 : 8);
        H2(this.statusText);
        J2();
        M2();
        invalidateOptionsMenu();
    }

    public static final void z2(BTActivity bTActivity) {
        bTActivity.n2();
    }

    @Override // v3.i
    protected String A1() {
        if (s1(new String[]{"android.permission.RECORD_AUDIO"})) {
            return null;
        }
        return getString(R.string.recordAudioPermissionDescription);
    }

    @Override // v3.i
    protected void B1(int newState) {
        super.B1(newState);
        m4.b bVar = this.binding;
        if (bVar == null) {
            return;
        }
        if (newState == 1 || newState == 2 || newState == 3) {
            ViewGroup.LayoutParams layoutParams = bVar.f20986n.getLayoutParams();
            rd.m.c(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) layoutParams;
            if (fVar.e() != R.id.bottom_sheet) {
                fVar.p(R.id.bottom_sheet);
                bVar.f20986n.requestLayout();
                K2();
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = bVar.f20986n.getLayoutParams();
        rd.m.c(layoutParams2, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.f fVar2 = (CoordinatorLayout.f) layoutParams2;
        if (fVar2.e() != R.id.pttButton_help) {
            fVar2.p(R.id.pttButton_help);
            bVar.f20986n.requestLayout();
            K2();
        }
    }

    @Override // v3.i
    protected void C1() throws Throwable {
        P0();
        r5.a.f25458j.j(this);
    }

    public final void G2(int level) {
        II iiA;
        II.ChannelManager channelManager;
        l1 l1VarR = this.connectionManager.r();
        n1 n1Var = l1VarR instanceof n1 ? (n1) l1VarR : null;
        if (n1Var == null || (iiA = com.dw.ht.ii.a.a()) == null || (channelManager = iiA.channelManager) == null) {
            return;
        }
        channelManager.setSpeakLevel(n1Var.T, level, null);
    }

    public final void H2(CharSequence charSequence) {
        this.statusText = charSequence;
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.w(charSequence);
        }
    }

    public final void I2(Class fragmentClass) {
        rd.m.e(fragmentClass, "fragmentClass");
        l1 l1VarR = this.connectionManager.r();
        if (l1VarR == null) {
            return;
        }
        DeviceFragment.j5(this, null, fragmentClass, l1VarR.q());
    }

    @Override // v4.n0.d
    public /* synthetic */ void M(v4.n0 n0Var, g3.d dVar) {
        o0.d(this, n0Var, dVar);
    }

    @Override // v3.i, v3.s
    public boolean N(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        switch (what) {
            case R.id.send_aprs_message /* 2131297350 */:
            case R.id.send_bss_message /* 2131297351 */:
                E2(b.f5458a);
                break;
            case R.id.what_title_changed /* 2131297688 */:
                if ((sender instanceof v3.m0) && sender == this.mmFragment) {
                    O2((v3.m0) sender);
                    return true;
                }
                break;
        }
        return super.N(sender, what, arg1, arg2, obj);
    }

    public final void N2() {
        TabLayout tabLayout;
        TabLayout.g gVarB;
        MMFragment mMFragment = this.mmFragment;
        if (mMFragment != null) {
            int iP5 = mMFragment.p5();
            E2(iP5 != 0 ? iP5 != 1 ? b.f5460c : b.f5459b : b.f5458a);
            m4.b bVar = this.binding;
            if (bVar == null || (tabLayout = bVar.f20990r) == null || (gVarB = tabLayout.B(iP5)) == null) {
                return;
            }
            gVarB.l();
        }
    }

    @Override // v3.b
    protected SearchBar S1() {
        View viewFindViewById = findViewById(R.id.search_bar);
        if (viewFindViewById == null) {
            return null;
        }
        View viewInflate = ((ViewStub) viewFindViewById).inflate();
        rd.m.c(viewInflate, "null cannot be cast to non-null type com.dw.android.widget.SearchBar");
        SearchBar searchBar = (SearchBar) viewInflate;
        searchBar.setBackOnClickListener(new View.OnClickListener() { // from class: com.dw.ht.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BTActivity.w2(this.f5640a, view);
            }
        });
        return searchBar;
    }

    @Override // v3.b
    protected boolean T1() {
        return false;
    }

    @Override // v4.n0.d
    public /* synthetic */ void W0(v4.n0 n0Var) {
        o0.c(this, n0Var);
    }

    @Override // j4.a
    public void Y1() {
        super.Y1();
        y2();
    }

    @Override // com.dw.ht.fragments.BDListFragment.a
    public boolean a(int i10) {
        if (i10 == R.id.audio) {
            x2(281474976710657L);
            return true;
        }
        Y1();
        return false;
    }

    @Override // j4.a
    public void b2() {
        super.b2();
        y2();
    }

    protected final void finalize() {
        System.out.println((Object) ("BTActivity:释放:finalize:" + this.iID));
    }

    @Override // v4.n0.d
    public /* synthetic */ void h0(v4.n0 n0Var) {
        o0.e(this, n0Var);
    }

    @Override // v4.n0.d
    public /* synthetic */ void i0(v4.n0 n0Var) {
        o0.f(this, n0Var);
    }

    @Override // v4.n0.d
    public /* synthetic */ void j0(v4.n0 n0Var, v4.k0 k0Var, v4.k0 k0Var2) {
        o0.b(this, n0Var, k0Var, k0Var2);
    }

    @Override // v4.n0.d
    public void o0(v4.n0 link) {
        rd.m.e(link, "link");
        invalidateOptionsMenu();
    }

    public final void o2() {
        finish();
        Main.f5555g.i();
    }

    @Override // j4.a, v3.b, androidx.fragment.app.p, d.q, android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode != 1) {
            super.onActivityResult(requestCode, resultCode, intent);
        } else {
            if (resultCode != -1) {
                return;
            }
            rd.m.b(intent);
            B2(d5.a.G(intent.getData()));
        }
    }

    @Override // j4.a, v3.b, v3.i, d.q, android.app.Activity
    public void onBackPressed() {
        BDListFragment bDListFragment = this.mBDListFragment;
        if (bDListFragment != null && bDListFragment.A4()) {
            bDListFragment.y4();
            return;
        }
        if (Cfg.O().getSimpleUI()) {
            b bVar = this.displayMode;
            b bVar2 = b.f5461d;
            if (bVar != bVar2) {
                E2(bVar2);
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.d, d.q, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        rd.m.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Cfg.i0(this);
        finish();
        startActivity(getIntent());
    }

    @Override // v3.b, androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws Throwable {
        k1(10);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        rd.m.d(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.mPref = defaultSharedPreferences;
        o.f6637b.a().m(this);
        super.onCreate(savedInstanceState);
        if (s1(z1())) {
            P0();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        rd.m.e(menu, "menu");
        getMenuInflater().inflate(R.menu.session_om, menu);
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.satelliteManager);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(com.dw.ht.satellite.b.f6691a.J());
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // v3.b, v3.i, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        F2(null);
        this.binding = null;
        this.sm = null;
        s3.b.b("BTActivity", "BTActivity:释放:onDestroy:" + this.iID);
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        rd.m.e(event, "event");
        if (keyCode != Cfg.f5513w && keyCode != 136) {
            return super.onKeyDown(keyCode, event);
        }
        n4.l.f22470a.d(true);
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        rd.m.e(event, "event");
        if (keyCode != Cfg.f5513w && keyCode != 136) {
            return super.onKeyUp(keyCode, event);
        }
        n4.l.f22470a.d(false);
        return true;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(MapToolbarFragment.a message) {
        if ((message == null ? -1 : e.f5468b[message.ordinal()]) != 1 || s1(new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
            return;
        }
        G1(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 0, null, false, getString(R.string.locationPermissionDescription));
    }

    @Override // d.q, android.app.Activity
    protected void onNewIntent(Intent intent) throws Throwable {
        rd.m.e(intent, "intent");
        super.onNewIntent(intent);
        v2(intent);
    }

    @Override // v3.b, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        rd.m.e(item, "item");
        int itemId = item.getItemId();
        l1 l1VarR = this.connectionManager.r();
        switch (itemId) {
            case R.id.connect_audio /* 2131296572 */:
                if (l1VarR != null) {
                    l1VarR.L(true);
                }
                break;
            case R.id.create_a_team /* 2131296597 */:
                I2(b1.class);
                return true;
            case R.id.dev_settings /* 2131296639 */:
                if (l1VarR != null) {
                    o.f6637b.a().j().e(this, l1VarR.q());
                }
                break;
            case R.id.disconnect_audio /* 2131296658 */:
                if (l1VarR != null) {
                    l1VarR.O(true);
                }
                break;
            case R.id.everyone /* 2131296735 */:
                G2(0);
                break;
            case R.id.exit /* 2131296736 */:
                o2();
                break;
            case R.id.hm_settings /* 2131296834 */:
                v4.i0 i0VarB = v4.i0.F.b();
                if (i0VarB != null) {
                    DeviceFragment.j5(this, "", k5.a0.class, i0VarB.q());
                }
                break;
            case R.id.join_a_team /* 2131296896 */:
                I2(a4.class);
                return true;
            case R.id.manager /* 2131296952 */:
                G2(1);
                break;
            case R.id.nearby_people /* 2131297082 */:
                if (l1VarR != null) {
                    v4.q qVarT = l1VarR.T();
                    rd.m.d(qVarT, "getBssConfig(...)");
                    l1VarR.O0(new d.c().i(qVarT.w()).k(qVarT.E()).f().c());
                }
                break;
            case R.id.owner /* 2131297153 */:
                G2(2);
                break;
            case R.id.satelliteManager /* 2131297299 */:
                FragmentShowActivity.h2(this, null, e6.class);
                break;
            case R.id.search /* 2131297322 */:
                if (e.f5467a[this.displayMode.ordinal()] != 2) {
                    MMFragment mMFragment = this.mmFragment;
                    if (mMFragment != null) {
                        mMFragment.Q();
                    }
                } else {
                    com.dw.ht.fragments.j jVar = this.mapFragment;
                    if (jVar != null) {
                        jVar.Q();
                    }
                }
                break;
            case R.id.settings /* 2131297370 */:
                FragmentShowActivity.h2(this, getString(R.string.settings), w0.class);
                break;
            case R.id.signal_gen /* 2131297388 */:
                I2(q4.z.class);
                break;
            case R.id.start_monitor /* 2131297448 */:
                if (l1VarR != null) {
                    l1VarR.i1(true);
                }
                if (l1VarR != null) {
                    l1VarR.L(true);
                }
                break;
            case R.id.stop_monitor /* 2131297457 */:
                if (l1VarR != null) {
                    l1VarR.i1(false);
                }
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        invalidateOptionsMenu();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x016b  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onPrepareOptionsMenu(android.view.Menu r14) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.BTActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        rd.m.e(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        b bVar = (b) savedInstanceState.getSerializable("displayMode");
        if (bVar != null) {
            E2(bVar);
        }
    }

    @Override // j4.a, v3.b, v3.i, androidx.fragment.app.p, android.app.Activity
    protected void onResume() {
        BTActivity bTActivity;
        super.onResume();
        A2();
        if (h.d()) {
            h.h(false);
            Main.q();
        }
        this.mIIRXing.clear();
        L2();
        if (s1(z1())) {
            if (h.e() || s1(new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
                bTActivity = this;
                if (Main.k() && Build.VERSION.SDK_INT >= 31 && !h.c() && !s1(new String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"})) {
                    h.g(true);
                    bTActivity.G1(new String[]{"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"}, 0, null, false, null);
                } else if (Build.VERSION.SDK_INT >= 31 && !h.f() && !s1(new String[]{"android.permission.READ_PHONE_STATE"})) {
                    h.j(true);
                    bTActivity.G1(new String[]{"android.permission.READ_PHONE_STATE"}, 0, null, false, getString(R.string.phonePermissionDescription));
                }
            } else {
                h.i(true);
                G1(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 0, null, false, getString(R.string.locationPermissionDescription));
                bTActivity = this;
            }
            k0.i();
            r5.a.f25458j.j(this);
            Cfg.T0();
            Cfg.g();
            String stringExtra = getIntent().getStringExtra("com.dw.ht.intent.extras.DEV_ADDRESS");
            long j10 = Cfg.M;
            if (j10 > 0) {
                x2(j10);
                BDListFragment bDListFragment = bTActivity.mBDListFragment;
                if (bDListFragment != null) {
                    bDListFragment.F4(Cfg.M, true);
                }
                Cfg.M = 0L;
            } else if (stringExtra != null) {
                x2(l1.W(stringExtra));
                BDListFragment bDListFragment2 = bTActivity.mBDListFragment;
                if (bDListFragment2 != null) {
                    BDListFragment.G4(bDListFragment2, l1.W(stringExtra), false, 2, null);
                }
            }
            F2(bTActivity.connectionManager.r());
            getWindow().getDecorView().post(new Runnable() { // from class: com.dw.ht.b
                @Override // java.lang.Runnable
                public final void run() {
                    BTActivity.z2(this.f5639a);
                }
            });
            getWindow().getDecorView().setKeepScreenOn(Cfg.d0());
            z4.j jVarE = Cfg.E();
            rd.m.d(jVarE, "getMapLayer(...)");
            onMessageEvent(jVarE);
            if (bTActivity.displayMode != b.f5461d || Cfg.O().getSimpleUI()) {
                return;
            }
            E2(b.f5460c);
        }
    }

    @Override // j4.a, d.q, a0.g, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        rd.m.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable("displayMode", this.displayMode);
    }

    @Override // v3.i, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onStart() throws Throwable {
        super.onStart();
        this.connectionManager.F(true);
        mi.c.e().q(this);
        v2(this.newIntent);
    }

    @Override // v3.i, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.connectionManager.F(false);
        mi.c.e().t(this);
    }

    public void x2(long devId) {
        Y1();
        if (devId == 0) {
            F2(null);
            return;
        }
        l1 l1VarY = this.connectionManager.y(devId);
        this.connectionManager.G(l1VarY);
        F2(l1VarY);
    }

    @Override // v3.i
    protected String[] z1() {
        String[] strArr = Main.f5553e;
        rd.m.d(strArr, "RPS");
        return strArr;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(p4.a event) {
        BDListFragment bDListFragment;
        rd.m.e(event, "event");
        x2(event.f23903a);
        if (event.f23903a <= 28147497671065500L || (bDListFragment = this.mBDListFragment) == null) {
            return;
        }
        bDListFragment.y4();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c event) {
        rd.m.e(event, "event");
        if (e.f5469c[event.ordinal()] == 1) {
            F2(this.connectionManager.r());
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(i0.b event) {
        rd.m.e(event, "event");
        if (event == i0.b.f29899a) {
            invalidateOptionsMenu();
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(ReceiveStatus event) {
        rd.m.e(event, "event");
        if (event.rxing) {
            this.mIIRXing.put(Long.valueOf(event.f5073id), event);
        } else {
            this.mIIRXing.remove(Long.valueOf(event.f5073id));
        }
        L2();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(b event) {
        rd.m.e(event, "event");
        E2(event);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(j.f focus) {
        rd.m.e(focus, "focus");
        E2(b.f5460c);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(z4.j layer) {
        rd.m.e(layer, "layer");
        M2();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(v4.l0 event) {
        rd.m.e(event, "event");
        if (event.f29942b == 0) {
            if (this.mTxPopupWindow == null) {
                this.mTxPopupWindow = new d(this);
            }
            d dVar = this.mTxPopupWindow;
            rd.m.b(dVar);
            dVar.a(event.f29941a.getName() + '\n' + getString(R.string.sending));
            d dVar2 = this.mTxPopupWindow;
            if (dVar2 != null) {
                m4.b bVar = this.binding;
                dVar2.b(bVar != null ? bVar.f20992t : null);
                return;
            }
            return;
        }
        d dVar3 = this.mTxPopupWindow;
        if (dVar3 != null) {
            rd.m.b(dVar3);
            dVar3.dismiss();
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(Cfg.a event) {
        rd.m.e(event, "event");
        if (e.f5470d[event.ordinal()] == 1 && !Cfg.O().getSimpleUI() && this.displayMode == b.f5461d) {
            E2(b.f5460c);
        }
    }
}
