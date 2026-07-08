package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;
import com.dw.widget.BottomLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DrawerLayout f20973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardView f20974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Group f20975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f20976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FragmentContainerView f20977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final NestedScrollView f20978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f20979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FrameLayout f20980h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FragmentContainerView f20981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DrawerLayout f20982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FragmentContainerView f20983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FragmentContainerView f20984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final FragmentContainerView f20985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FloatingActionButton f20986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final BottomLayout f20987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ViewStub f20988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FragmentContainerView f20989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TabLayout f20990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f20991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Toolbar f20992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ActionButton f20993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinearLayout f20994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ActionButton f20995w;

    private b(DrawerLayout drawerLayout, CardView cardView, Group group, FrameLayout frameLayout, FragmentContainerView fragmentContainerView, NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, FrameLayout frameLayout2, FragmentContainerView fragmentContainerView2, DrawerLayout drawerLayout2, FragmentContainerView fragmentContainerView3, FragmentContainerView fragmentContainerView4, FragmentContainerView fragmentContainerView5, FloatingActionButton floatingActionButton, BottomLayout bottomLayout, ViewStub viewStub, FragmentContainerView fragmentContainerView6, TabLayout tabLayout, View view, Toolbar toolbar, ActionButton actionButton, LinearLayout linearLayout, ActionButton actionButton2) {
        this.f20973a = drawerLayout;
        this.f20974b = cardView;
        this.f20975c = group;
        this.f20976d = frameLayout;
        this.f20977e = fragmentContainerView;
        this.f20978f = nestedScrollView;
        this.f20979g = constraintLayout;
        this.f20980h = frameLayout2;
        this.f20981i = fragmentContainerView2;
        this.f20982j = drawerLayout2;
        this.f20983k = fragmentContainerView3;
        this.f20984l = fragmentContainerView4;
        this.f20985m = fragmentContainerView5;
        this.f20986n = floatingActionButton;
        this.f20987o = bottomLayout;
        this.f20988p = viewStub;
        this.f20989q = fragmentContainerView6;
        this.f20990r = tabLayout;
        this.f20991s = view;
        this.f20992t = toolbar;
        this.f20993u = actionButton;
        this.f20994v = linearLayout;
        this.f20995w = actionButton2;
    }

    public static b a(View view) {
        int i10 = R.id.appbar;
        CardView cardView = (CardView) r1.a.a(view, R.id.appbar);
        if (cardView != null) {
            Group group = (Group) r1.a.a(view, R.id.appbar_padding);
            i10 = R.id.bmap;
            FrameLayout frameLayout = (FrameLayout) r1.a.a(view, R.id.bmap);
            if (frameLayout != null) {
                i10 = R.id.bottom_bar;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) r1.a.a(view, R.id.bottom_bar);
                if (fragmentContainerView != null) {
                    i10 = R.id.bottom_sheet;
                    NestedScrollView nestedScrollView = (NestedScrollView) r1.a.a(view, R.id.bottom_sheet);
                    if (nestedScrollView != null) {
                        i10 = R.id.cm;
                        ConstraintLayout constraintLayout = (ConstraintLayout) r1.a.a(view, R.id.cm);
                        if (constraintLayout != null) {
                            i10 = R.id.container;
                            FrameLayout frameLayout2 = (FrameLayout) r1.a.a(view, R.id.container);
                            if (frameLayout2 != null) {
                                i10 = R.id.dev_status;
                                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) r1.a.a(view, R.id.dev_status);
                                if (fragmentContainerView2 != null) {
                                    DrawerLayout drawerLayout = (DrawerLayout) view;
                                    i10 = R.id.map_tools_fragment;
                                    FragmentContainerView fragmentContainerView3 = (FragmentContainerView) r1.a.a(view, R.id.map_tools_fragment);
                                    if (fragmentContainerView3 != null) {
                                        i10 = R.id.mm_fragment;
                                        FragmentContainerView fragmentContainerView4 = (FragmentContainerView) r1.a.a(view, R.id.mm_fragment);
                                        if (fragmentContainerView4 != null) {
                                            i10 = R.id.navigation_drawer;
                                            FragmentContainerView fragmentContainerView5 = (FragmentContainerView) r1.a.a(view, R.id.navigation_drawer);
                                            if (fragmentContainerView5 != null) {
                                                i10 = R.id.pttButton;
                                                FloatingActionButton floatingActionButton = (FloatingActionButton) r1.a.a(view, R.id.pttButton);
                                                if (floatingActionButton != null) {
                                                    i10 = R.id.pttButton_help;
                                                    BottomLayout bottomLayout = (BottomLayout) r1.a.a(view, R.id.pttButton_help);
                                                    if (bottomLayout != null) {
                                                        i10 = R.id.search_bar;
                                                        ViewStub viewStub = (ViewStub) r1.a.a(view, R.id.search_bar);
                                                        if (viewStub != null) {
                                                            i10 = R.id.sm;
                                                            FragmentContainerView fragmentContainerView6 = (FragmentContainerView) r1.a.a(view, R.id.sm);
                                                            if (fragmentContainerView6 != null) {
                                                                i10 = R.id.tabBar;
                                                                TabLayout tabLayout = (TabLayout) r1.a.a(view, R.id.tabBar);
                                                                if (tabLayout != null) {
                                                                    i10 = R.id.tabBarDivider;
                                                                    View viewA = r1.a.a(view, R.id.tabBarDivider);
                                                                    if (viewA != null) {
                                                                        i10 = R.id.toolbar;
                                                                        Toolbar toolbar = (Toolbar) r1.a.a(view, R.id.toolbar);
                                                                        if (toolbar != null) {
                                                                            i10 = R.id.view_contacts;
                                                                            ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.view_contacts);
                                                                            if (actionButton != null) {
                                                                                i10 = R.id.view_select;
                                                                                LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.view_select);
                                                                                if (linearLayout != null) {
                                                                                    i10 = R.id.view_talk_list;
                                                                                    ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.view_talk_list);
                                                                                    if (actionButton2 != null) {
                                                                                        return new b(drawerLayout, cardView, group, frameLayout, fragmentContainerView, nestedScrollView, constraintLayout, frameLayout2, fragmentContainerView2, drawerLayout, fragmentContainerView3, fragmentContainerView4, fragmentContainerView5, floatingActionButton, bottomLayout, viewStub, fragmentContainerView6, tabLayout, viewA, toolbar, actionButton, linearLayout, actionButton2);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_bt, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public DrawerLayout b() {
        return this.f20973a;
    }
}
