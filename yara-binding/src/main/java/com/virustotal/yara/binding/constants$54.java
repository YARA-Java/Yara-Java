// Generated by jextract

package com.virustotal.yara.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$54 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$54() {}
    static final FunctionDescriptor ss_icompare$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ss_icompare$MH = RuntimeHelper.downcallHandle(
        "ss_icompare",
        constants$54.ss_icompare$FUNC
    );
    static final FunctionDescriptor ss_contains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ss_contains$MH = RuntimeHelper.downcallHandle(
        "ss_contains",
        constants$54.ss_contains$FUNC
    );
    static final FunctionDescriptor ss_icontains$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ss_icontains$MH = RuntimeHelper.downcallHandle(
        "ss_icontains",
        constants$54.ss_icontains$FUNC
    );
    static final FunctionDescriptor ss_startswith$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ss_startswith$MH = RuntimeHelper.downcallHandle(
        "ss_startswith",
        constants$54.ss_startswith$FUNC
    );
    static final FunctionDescriptor ss_istartswith$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ss_istartswith$MH = RuntimeHelper.downcallHandle(
        "ss_istartswith",
        constants$54.ss_istartswith$FUNC
    );
    static final FunctionDescriptor ss_endswith$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ss_endswith$MH = RuntimeHelper.downcallHandle(
        "ss_endswith",
        constants$54.ss_endswith$FUNC
    );
}

