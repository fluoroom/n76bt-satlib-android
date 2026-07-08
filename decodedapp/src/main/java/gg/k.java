package gg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final k E0;
    public static final k G;
    public static final k M0;
    public static final k O;
    private static final /* synthetic */ k[] Q0;
    private static final /* synthetic */ kd.a R0;
    public static final k W;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final k f14465e0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final k f14478o0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final k f14492w0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final k f14495y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f14500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f14460c = new k("UNRESOLVED_TYPE", 0, "Unresolved type for %s", true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f14462d = new k("UNRESOLVED_TYPE_PARAMETER_TYPE", 1, "Unresolved type parameter type", true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f14464e = new k("UNRESOLVED_CLASS_TYPE", 2, "Unresolved class %s", true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f14466f = new k("UNRESOLVED_JAVA_CLASS", 3, "Unresolved java class %s", true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f14468g = new k("UNRESOLVED_DECLARATION", 4, "Unresolved declaration %s", true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f14470h = new k("UNRESOLVED_KCLASS_CONSTANT_VALUE", 5, "Unresolved type for %s (arrayDimensions=%s)", true);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f14481r = new k("UNRESOLVED_TYPE_ALIAS", 6, "Unresolved type alias %s", false, 2, null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f14483s = new k("RETURN_TYPE", 7, "Return type for %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f14485t = new k("RETURN_TYPE_FOR_FUNCTION", 8, "Return type for function cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f14487u = new k("RETURN_TYPE_FOR_PROPERTY", 9, "Return type for property %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f14489v = new k("RETURN_TYPE_FOR_CONSTRUCTOR", 10, "Return type for constructor %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k f14491w = new k("IMPLICIT_RETURN_TYPE_FOR_FUNCTION", 11, "Implicit return type for function %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f14493x = new k("IMPLICIT_RETURN_TYPE_FOR_PROPERTY", 12, "Implicit return type for property %s cannot be resolved", false, 2, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final k f14497z = new k("ERROR_TYPE_FOR_DESTRUCTURING_COMPONENT", 14, "%s() return type", false, 2, null);
    public static final k A = new k("RECURSIVE_TYPE", 15, "Recursive type", false, 2, null);
    public static final k B = new k("RECURSIVE_TYPE_ALIAS", 16, "Recursive type alias %s", false, 2, null);
    public static final k C = new k("RECURSIVE_ANNOTATION_TYPE", 17, "Recursive annotation's type", false, 2, null);
    public static final k D = new k("CYCLIC_UPPER_BOUNDS", 18, "Cyclic upper bounds", false, 2, null);
    public static final k E = new k("CYCLIC_SUPERTYPES", 19, "Cyclic supertypes", false, 2, null);
    public static final k F = new k("UNINFERRED_LAMBDA_CONTEXT_RECEIVER_TYPE", 20, "Cannot infer a lambda context receiver type", false, 2, null);
    public static final k H = new k("UNINFERRED_TYPE_VARIABLE", 22, "Cannot infer a type variable %s", false, 2, null);
    public static final k I = new k("RESOLUTION_ERROR_TYPE", 23, "Resolution error type (%s)", false, 2, null);
    public static final k J = new k("ERROR_EXPECTED_TYPE", 24, "Error expected type", false, 2, null);
    public static final k K = new k("ERROR_DATA_FLOW_TYPE", 25, "Error type for data flow", false, 2, null);
    public static final k L = new k("ERROR_WHILE_RECONSTRUCTING_BARE_TYPE", 26, "Failed to reconstruct type %s", false, 2, null);
    public static final k M = new k("UNABLE_TO_SUBSTITUTE_TYPE", 27, "Unable to substitute type (%s)", false, 2, null);
    public static final k N = new k("DONT_CARE", 28, "Special DONT_CARE type", false, 2, null);
    public static final k P = new k("FUNCTION_PLACEHOLDER_TYPE", 30, "Function placeholder type (arguments: %s)", false, 2, null);
    public static final k Q = new k("TYPE_FOR_COMPILER_EXCEPTION", 31, "Error type for a compiler exception while analyzing %s", false, 2, null);
    public static final k R = new k("ERROR_FLEXIBLE_TYPE", 32, "Error java flexible type with id %s. (%s..%s)", false, 2, null);
    public static final k S = new k("ERROR_RAW_TYPE", 33, "Error raw type %s", false, 2, null);
    public static final k T = new k("TYPE_WITH_MISMATCHED_TYPE_ARGUMENTS_AND_PARAMETERS", 34, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false, 2, null);
    public static final k U = new k("ILLEGAL_TYPE_RANGE_FOR_DYNAMIC", 35, "Illegal type range for dynamic type %s..%s", false, 2, null);
    public static final k V = new k("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER", 36, "Unknown type parameter %s. Please try recompiling module containing \"%s\"", false, 2, null);
    public static final k X = new k("INCONSISTENT_SUSPEND_FUNCTION", 38, "Inconsistent suspend function type in metadata with constructor %s", false, 2, null);
    public static final k Y = new k("UNEXPECTED_FLEXIBLE_TYPE_ID", 39, "Unexpected id of a flexible type %s. (%s..%s)", false, 2, null);
    public static final k Z = new k("UNKNOWN_TYPE", 40, "Unknown type", false, 2, null);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final k f14458a0 = new k("NO_TYPE_SPECIFIED", 41, "No type specified for %s", false, 2, null);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final k f14459b0 = new k("NO_TYPE_FOR_LOOP_RANGE", 42, "Loop range has no type", false, 2, null);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final k f14461c0 = new k("NO_TYPE_FOR_LOOP_PARAMETER", 43, "Loop parameter has no type", false, 2, null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final k f14463d0 = new k("MISSED_TYPE_FOR_PARAMETER", 44, "Missed a type for a value parameter %s", false, 2, null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final k f14467f0 = new k("PARSE_ERROR_ARGUMENT", 46, "Error type for parse error argument %s", false, 2, null);

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final k f14469g0 = new k("STAR_PROJECTION_IN_CALL", 47, "Error type for star projection directly passing as a call type argument", false, 2, null);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final k f14471h0 = new k("PROHIBITED_DYNAMIC_TYPE", 48, "Dynamic type in a not allowed context", false, 2, null);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final k f14472i0 = new k("NOT_ANNOTATION_TYPE_IN_ANNOTATION_CONTEXT", 49, "Not an annotation type %s in the annotation context", false, 2, null);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final k f14473j0 = new k("UNIT_RETURN_TYPE_FOR_INC_DEC", 50, "Unit type returned by inc or dec", false, 2, null);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final k f14474k0 = new k("RETURN_NOT_ALLOWED", 51, "Return not allowed", false, 2, null);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final k f14475l0 = new k("UNRESOLVED_PARCEL_TYPE", 52, "Unresolved 'Parcel' type", true);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final k f14476m0 = new k("KAPT_ERROR_TYPE", 53, "Kapt error type", false, 2, null);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final k f14477n0 = new k("SYNTHETIC_ELEMENT_ERROR_TYPE", 54, "Error type for synthetic element", false, 2, null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final k f14479p0 = new k("ERROR_EXPRESSION_TYPE", 56, "Error expression type", false, 2, null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final k f14480q0 = new k("ERROR_RECEIVER_TYPE", 57, "Error receiver type for %s", false, 2, null);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final k f14482r0 = new k("ERROR_CONSTANT_VALUE", 58, "Error constant value %s", false, 2, null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final k f14484s0 = new k("EMPTY_CALLABLE_REFERENCE", 59, "Empty callable reference", false, 2, null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final k f14486t0 = new k("UNSUPPORTED_CALLABLE_REFERENCE_TYPE", 60, "Unsupported callable reference type %s", false, 2, null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final k f14488u0 = new k("TYPE_FOR_DELEGATION", 61, "Error delegation type for %s", false, 2, null);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final k f14490v0 = new k("UNAVAILABLE_TYPE_FOR_DECLARATION", 62, "Type is unavailable for declaration %s", false, 2, null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final k f14494x0 = new k("ERROR_TYPE_PROJECTION", 64, "Error type projection", false, 2, null);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final k f14496y0 = new k("ERROR_SUPER_TYPE", 65, "Error super type", false, 2, null);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final k f14498z0 = new k("SUPER_TYPE_FOR_ERROR_TYPE", 66, "Supertype of error type %s", false, 2, null);
    public static final k A0 = new k("ERROR_PROPERTY_TYPE", 67, "Error property type", false, 2, null);
    public static final k B0 = new k("ERROR_CLASS", 68, "Error class", false, 2, null);
    public static final k C0 = new k("TYPE_FOR_ERROR_TYPE_CONSTRUCTOR", 69, "Type for error type constructor (%s)", false, 2, null);
    public static final k D0 = new k("INTERSECTION_OF_ERROR_TYPES", 70, "Intersection of error types %s", false, 2, null);
    public static final k F0 = new k("NOT_FOUND_UNSIGNED_TYPE", 72, "Unsigned type %s not found", false, 2, null);
    public static final k G0 = new k("ERROR_ENUM_TYPE", 73, "Not found the corresponding enum class for given enum entry %s.%s", false, 2, null);
    public static final k H0 = new k("NO_RECORDED_TYPE", 74, "Not found recorded type for %s", false, 2, null);
    public static final k I0 = new k("NOT_FOUND_DESCRIPTOR_FOR_FUNCTION", 75, "Descriptor not found for function %s", false, 2, null);
    public static final k J0 = new k("NOT_FOUND_DESCRIPTOR_FOR_CLASS", 76, "Cannot build class type, descriptor not found for builder %s", false, 2, null);
    public static final k K0 = new k("NOT_FOUND_DESCRIPTOR_FOR_TYPE_PARAMETER", 77, "Cannot build type parameter type, descriptor not found for builder %s", false, 2, null);
    public static final k L0 = new k("UNMAPPED_ANNOTATION_TARGET_TYPE", 78, "Type for unmapped Java annotation target to Kotlin one", false, 2, null);
    public static final k N0 = new k("NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION", 80, "No fqName for annotation %s", false, 2, null);
    public static final k O0 = new k("NOT_FOUND_FQNAME", 81, "No fqName for %s", false, 2, null);
    public static final k P0 = new k("TYPE_FOR_GENERATED_ERROR_EXPRESSION", 82, "Type for generated error expression", false, 2, null);

    static {
        rd.h hVar = null;
        f14495y = new k("IMPLICIT_RETURN_TYPE_FOR_PROPERTY_ACCESSOR", 13, "Implicit return type for property accessor %s cannot be resolved", false, 2, hVar);
        G = new k("UNINFERRED_LAMBDA_PARAMETER_TYPE", 21, "Cannot infer a lambda parameter type", false, 2, hVar);
        O = new k("STUB_TYPE", 29, "Stub type %s", false, 2, hVar);
        W = new k("CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME", 37, "Couldn't deserialize type parameter %s in %s", false, 2, hVar);
        f14465e0 = new k("MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER", 45, "Missed a type argument for a type parameter %s", false, 2, hVar);
        rd.h hVar2 = null;
        f14478o0 = new k("AD_HOC_ERROR_TYPE_FOR_LIGHTER_CLASSES_RESOLVE", 55, "Error type in ad hoc resolve for lighter classes", false, 2, hVar2);
        f14492w0 = new k("ERROR_TYPE_PARAMETER", 63, "Error type parameter", false, 2, hVar2);
        E0 = new k("CANNOT_COMPUTE_ERASED_BOUND", 71, "Cannot compute erased upper bound of a type parameter %s", false, 2, hVar2);
        M0 = new k("UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT", 79, "Unknown type for an array element of a java annotation argument", false, 2, hVar2);
        k[] kVarArrA = a();
        Q0 = kVarArrA;
        R0 = kd.b.a(kVarArrA);
    }

    private k(String str, int i10, String str2, boolean z10) {
        this.f14499a = str2;
        this.f14500b = z10;
    }

    private static final /* synthetic */ k[] a() {
        return new k[]{f14460c, f14462d, f14464e, f14466f, f14468g, f14470h, f14481r, f14483s, f14485t, f14487u, f14489v, f14491w, f14493x, f14495y, f14497z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, f14458a0, f14459b0, f14461c0, f14463d0, f14465e0, f14467f0, f14469g0, f14471h0, f14472i0, f14473j0, f14474k0, f14475l0, f14476m0, f14477n0, f14478o0, f14479p0, f14480q0, f14482r0, f14484s0, f14486t0, f14488u0, f14490v0, f14492w0, f14494x0, f14496y0, f14498z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, O0, P0};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) Q0.clone();
    }

    public final String d() {
        return this.f14499a;
    }

    public final boolean e() {
        return this.f14500b;
    }

    /* synthetic */ k(String str, int i10, String str2, boolean z10, int i11, rd.h hVar) {
        this(str, i10, str2, (i11 & 2) != 0 ? false : z10);
    }
}
