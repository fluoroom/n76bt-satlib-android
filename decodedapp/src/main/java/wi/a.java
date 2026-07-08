package wi;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum a implements ui.c {
    CANNOT_NORMALIZE_A_ZERO_NORM_VECTOR("cannot normalize a zero norm vector"),
    CLOSE_VERTICES("too close vertices near point ({0}, {1}, {2})"),
    CLOSEST_ORTHOGONAL_MATRIX_HAS_NEGATIVE_DETERMINANT("the closest orthogonal matrix has a negative determinant {0}"),
    CROSSING_BOUNDARY_LOOPS("some outline boundary loops cross each other"),
    EDGE_CONNECTED_TO_ONE_FACET("edge joining points ({0}, {1}, {2}) and ({3}, {4}, {5}) is connected to one facet only"),
    FACET_ORIENTATION_MISMATCH("facets orientation mismatch around edge joining points ({0}, {1}, {2}) and ({3}, {4}, {5})"),
    INCONSISTENT_STATE_AT_2_PI_WRAPPING("inconsistent state at 2π wrapping"),
    NON_INVERTIBLE_TRANSFORM("non-invertible affine transform collapses some lines into single points"),
    NOT_CONVEX("vertices do not form a convex hull in CCW winding"),
    NOT_CONVEX_HYPERPLANES("hyperplanes do not define a convex region"),
    NOT_SUPPORTED_IN_DIMENSION_N("method not supported in dimension {0}"),
    OUTLINE_BOUNDARY_LOOP_OPEN("an outline boundary loop is open"),
    FACET_WITH_SEVERAL_BOUNDARY_LOOPS("a facet has several boundary loops"),
    OUT_OF_PLANE("point ({0}, {1}, {2}) is out of plane"),
    ROTATION_MATRIX_DIMENSIONS("a {0}x{1} matrix cannot be a rotation matrix"),
    UNABLE_TO_ORTHOGONOLIZE_MATRIX("unable to orthogonalize matrix in {0} iterations"),
    ZERO_NORM_FOR_ROTATION_AXIS("zero norm for rotation axis"),
    ZERO_NORM_FOR_ROTATION_DEFINING_VECTOR("zero norm for rotation defining vector"),
    TOO_SMALL_TOLERANCE("tolerance {0,number,0.00000E00} is not computationally feasible, it is smaller than {1} ({2,number,0.00000E00})"),
    INVALID_ROTATION_ORDER_NAME("the value {0} does not correspond to a rotation order"),
    CANNOT_FIND_INSIDE_POINT("cannot find an inside point after {0} iterations");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31519a;

    a(String str) {
        this.f31519a = str;
    }

    @Override // ui.c
    public String F() {
        return this.f31519a;
    }

    public /* synthetic */ String a(String str, String str2, Locale locale) {
        return ui.b.a(this, str, str2, locale);
    }

    @Override // ui.c
    public String m(Locale locale) {
        return a("assets/" + a.class.getName().replaceAll("\\.", "/"), name(), locale);
    }
}
