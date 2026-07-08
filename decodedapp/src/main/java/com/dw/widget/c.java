package com.dw.widget;

import android.graphics.PointF;
import android.view.MotionEvent;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointF[] f7057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PointF[] f7058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7059c;

    public interface a {
    }

    public c(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("points must than 0");
        }
        this.f7057a = new PointF[i10];
        this.f7058b = new PointF[i10];
        this.f7059c = i10;
        n();
    }

    public float a() {
        PointF pointF;
        PointF pointF2;
        if (this.f7059c == 1) {
            PointF pointF3 = this.f7057a[0];
            if (pointF3 == null || (pointF2 = this.f7058b[0]) == null) {
                return 0.0f;
            }
            return pointF2.x - pointF3.x;
        }
        PointF[] pointFArr = this.f7057a;
        PointF pointF4 = pointFArr[0];
        if (pointF4 != null) {
            PointF[] pointFArr2 = this.f7058b;
            if (pointFArr2[0] != null && (pointF = pointFArr[1]) != null && pointFArr2[1] != null) {
                if (Math.abs(pointF4.x - pointF.x) > Math.abs(pointF4.y - pointF.y)) {
                    return 0.0f;
                }
                PointF[] pointFArr3 = this.f7058b;
                float f10 = pointFArr3[0].x;
                PointF[] pointFArr4 = this.f7057a;
                float f11 = f10 - pointFArr4[0].x;
                float f12 = pointFArr3[1].x - pointFArr4[1].x;
                if (f11 > 0.0f) {
                    if (f12 < 0.0f) {
                        return 0.0f;
                    }
                } else if (f12 > 0.0f) {
                    return 0.0f;
                }
                return Math.abs(f11) < Math.abs(f12) ? f11 : f12;
            }
        }
        return 0.0f;
    }

    public float b() {
        PointF pointF;
        PointF pointF2;
        if (this.f7059c == 1) {
            PointF pointF3 = this.f7057a[0];
            if (pointF3 == null || (pointF2 = this.f7058b[0]) == null) {
                return 0.0f;
            }
            return pointF2.y - pointF3.y;
        }
        PointF[] pointFArr = this.f7057a;
        PointF pointF4 = pointFArr[0];
        if (pointF4 != null) {
            PointF[] pointFArr2 = this.f7058b;
            if (pointFArr2[0] != null && (pointF = pointFArr[1]) != null && pointFArr2[1] != null) {
                if (Math.abs(pointF4.x - pointF.x) < Math.abs(pointF4.y - pointF.y)) {
                    return 0.0f;
                }
                PointF[] pointFArr3 = this.f7058b;
                float f10 = pointFArr3[0].y;
                PointF[] pointFArr4 = this.f7057a;
                float f11 = f10 - pointFArr4[0].y;
                float f12 = pointFArr3[1].y - pointFArr4[1].y;
                if (f11 > 0.0f) {
                    if (f12 < 0.0f) {
                        return 0.0f;
                    }
                } else if (f12 > 0.0f) {
                    return 0.0f;
                }
                return Math.abs(f11) < Math.abs(f12) ? f11 : f12;
            }
        }
        return 0.0f;
    }

    public double c() {
        PointF[] pointFArr;
        PointF pointF;
        PointF pointF2;
        if (this.f7059c == 1) {
            return 0.0d;
        }
        PointF[] pointFArr2 = this.f7057a;
        if (pointFArr2[0] == null || (pointF = (pointFArr = this.f7058b)[0]) == null || pointFArr2[1] == null || (pointF2 = pointFArr[1]) == null) {
            return 0.0d;
        }
        double dHypot = Math.hypot(pointF.y - pointF2.y, pointF.x - pointF2.x);
        PointF[] pointFArr3 = this.f7057a;
        float f10 = pointFArr3[0].y;
        PointF pointF3 = pointFArr3[1];
        return dHypot - Math.hypot(f10 - pointF3.y, r4.x - pointF3.x);
    }

    public float d() {
        PointF[] pointFArr;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        if (this.f7059c == 1) {
            PointF pointF4 = this.f7057a[0];
            if (pointF4 == null || (pointF3 = this.f7058b[0]) == null) {
                return 0.0f;
            }
            return pointF3.x - pointF4.x;
        }
        PointF[] pointFArr2 = this.f7057a;
        if (pointFArr2[0] == null || (pointF = (pointFArr = this.f7058b)[0]) == null || pointFArr2[1] == null || (pointF2 = pointFArr[1]) == null) {
            return 0.0f;
        }
        float fAbs = Math.abs(pointF.x - pointF2.x);
        PointF[] pointFArr3 = this.f7057a;
        return fAbs - Math.abs(pointFArr3[0].x - pointFArr3[1].x);
    }

    public float e() {
        PointF[] pointFArr;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        if (this.f7059c == 1) {
            PointF pointF4 = this.f7057a[0];
            if (pointF4 == null || (pointF3 = this.f7058b[0]) == null) {
                return 0.0f;
            }
            return pointF3.y - pointF4.y;
        }
        PointF[] pointFArr2 = this.f7057a;
        if (pointFArr2[0] == null || (pointF = (pointFArr = this.f7058b)[0]) == null || pointFArr2[1] == null || (pointF2 = pointFArr[1]) == null) {
            return 0.0f;
        }
        float fAbs = Math.abs(pointF.y - pointF2.y);
        PointF[] pointFArr3 = this.f7057a;
        return fAbs - Math.abs(pointFArr3[0].y - pointFArr3[1].y);
    }

    public PointF f() {
        if (this.f7059c == 1) {
            return this.f7057a[0];
        }
        PointF[] pointFArr = this.f7057a;
        if (pointFArr[0] == null || pointFArr[1] == null) {
            return null;
        }
        PointF pointF = this.f7057a[0];
        float f10 = pointF.x;
        float f11 = pointF.y;
        return new PointF((f10 + f10) / 2.0f, (f11 + f11) / 2.0f);
    }

    public PointF g() {
        return f();
    }

    public float h() {
        PointF[] pointFArr;
        PointF pointF;
        PointF pointF2;
        if (this.f7059c != 1 && (pointF = (pointFArr = this.f7057a)[0]) != null) {
            PointF[] pointFArr2 = this.f7058b;
            if (pointFArr2[0] != null && (pointF2 = pointFArr[1]) != null && pointFArr2[1] != null) {
                return Math.abs(pointF.x - pointF2.x);
            }
        }
        return 0.0f;
    }

    public float i() {
        PointF[] pointFArr;
        PointF pointF;
        PointF pointF2;
        if (this.f7059c != 1 && (pointF = (pointFArr = this.f7057a)[0]) != null) {
            PointF[] pointFArr2 = this.f7058b;
            if (pointFArr2[0] != null && (pointF2 = pointFArr[1]) != null && pointFArr2[1] != null) {
                return Math.abs(pointF.y - pointF2.y);
            }
        }
        return 0.0f;
    }

    public float j() {
        PointF[] pointFArr;
        PointF pointF;
        PointF pointF2;
        PointF[] pointFArr2 = this.f7057a;
        PointF pointF3 = pointFArr2[0];
        if (pointF3 != null && (pointF = (pointFArr = this.f7058b)[0]) != null) {
            if (this.f7059c == 1) {
                return pointF.x - pointF3.x;
            }
            PointF pointF4 = pointFArr2[1];
            if (pointF4 != null && (pointF2 = pointFArr[1]) != null) {
                return ((pointF.x + pointF2.x) - (pointF3.x + pointF4.x)) / 2.0f;
            }
        }
        return 0.0f;
    }

    public float k() {
        PointF[] pointFArr;
        PointF pointF;
        PointF[] pointFArr2;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        if (this.f7059c != 1 && (pointF = (pointFArr = this.f7057a)[0]) != null && (pointF2 = (pointFArr2 = this.f7058b)[0]) != null && (pointF3 = pointFArr[1]) != null && (pointF4 = pointFArr2[1]) != null) {
            float f10 = pointF2.x - pointF4.x;
            float f11 = pointF.x - pointF3.x;
            if (f10 != 0.0f && f11 != 0.0f) {
                return f10 / f11;
            }
        }
        return 0.0f;
    }

    public float l() {
        PointF[] pointFArr;
        PointF pointF;
        PointF[] pointFArr2;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        if (this.f7059c != 1 && (pointF = (pointFArr = this.f7057a)[0]) != null && (pointF2 = (pointFArr2 = this.f7058b)[0]) != null && (pointF3 = pointFArr[1]) != null && (pointF4 = pointFArr2[1]) != null) {
            float f10 = pointF2.y - pointF4.y;
            float f11 = pointF.y - pointF3.y;
            if (f10 != 0.0f && f11 != 0.0f) {
                return f10 / f11;
            }
        }
        return 0.0f;
    }

    public void m(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int i10 = this.f7059c;
        int action = motionEvent.getAction() & 255;
        int i11 = 0;
        if (action == 0) {
            n();
            while (i11 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i11);
                if (pointerId < i10) {
                    PointF[] pointFArr = this.f7058b;
                    PointF[] pointFArr2 = this.f7057a;
                    PointF pointF = new PointF(motionEvent.getX(i11), motionEvent.getY(i11));
                    pointFArr2[pointerId] = pointF;
                    pointFArr[pointerId] = pointF;
                }
                i11++;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        while (i11 < pointerCount) {
            int pointerId2 = motionEvent.getPointerId(i11);
            if (pointerId2 < i10) {
                PointF pointF2 = new PointF(motionEvent.getX(i11), motionEvent.getY(i11));
                PointF[] pointFArr3 = this.f7057a;
                if (pointFArr3[pointerId2] == null) {
                    pointFArr3[pointerId2] = pointF2;
                }
                this.f7058b[pointerId2] = pointF2;
            }
            i11++;
        }
    }

    public void n() {
        for (int i10 = 0; i10 < this.f7059c; i10++) {
            this.f7057a[i10] = null;
            this.f7058b[i10] = null;
        }
    }

    public String toString() {
        return "MultiTouch [start=" + Arrays.toString(this.f7057a) + ", end=" + Arrays.toString(this.f7058b) + ", points=" + this.f7059c + ", getChangeX()=" + a() + ", getDistanceChangeX()=" + d() + ", getChangeY()=" + b() + ", getDistanceChangeY()=" + e() + ", getDistanceChange()=" + c() + ", getStartCenterP()=" + g() + "]";
    }
}
