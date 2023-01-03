// Generated by jextract

package com.virustotal.yara.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct YR_SCAN_CONTEXT {
 *     uint64_t file_size;
 *     uint64_t entry_point;
 *     int flags;
 *     int canary;
 *     uint64_t timeout;
 *     void* user_data;
 *     YR_CALLBACK_FUNC callback;
 *     YR_RULES* rules;
 *     YR_STRING* last_error_string;
 *     YR_MEMORY_BLOCK_ITERATOR* iterator;
 *     YR_HASH_TABLE* objects_table;
 *     YR_NOTEBOOK* matches_notebook;
 *     YR_STOPWATCH stopwatch;
 *     RE_FIBER_POOL re_fiber_pool;
 *     unsigned long* rule_matches_flags;
 *     unsigned long* ns_unsatisfied_flags;
 *     unsigned long* strings_temp_disabled;
 *     YR_MATCHES* matches;
 *     YR_MATCHES* unconfirmed_matches;
 *     YR_PROFILING_INFO* profiling_info;
 * };
 * }
 */
public class YR_SCAN_CONTEXT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_LONG_LONG$LAYOUT.withName("file_size"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("entry_point"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        Constants$root.C_INT$LAYOUT.withName("canary"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("timeout"),
        Constants$root.C_POINTER$LAYOUT.withName("user_data"),
        Constants$root.C_POINTER$LAYOUT.withName("callback"),
        Constants$root.C_POINTER$LAYOUT.withName("rules"),
        Constants$root.C_POINTER$LAYOUT.withName("last_error_string"),
        Constants$root.C_POINTER$LAYOUT.withName("iterator"),
        Constants$root.C_POINTER$LAYOUT.withName("objects_table"),
        Constants$root.C_POINTER$LAYOUT.withName("matches_notebook"),
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("tv_usec")
                ).withName("tv_start"),
                MemoryLayout.structLayout(
                    Constants$root.C_LONG_LONG$LAYOUT.withName("tv_sec"),
                    Constants$root.C_LONG_LONG$LAYOUT.withName("tv_nsec")
                ).withName("ts_start")
            ).withName("$anon$0")
        ).withName("stopwatch"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("fiber_count"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.structLayout(
                Constants$root.C_POINTER$LAYOUT.withName("head"),
                Constants$root.C_POINTER$LAYOUT.withName("tail")
            ).withName("fibers")
        ).withName("re_fiber_pool"),
        Constants$root.C_POINTER$LAYOUT.withName("rule_matches_flags"),
        Constants$root.C_POINTER$LAYOUT.withName("ns_unsatisfied_flags"),
        Constants$root.C_POINTER$LAYOUT.withName("strings_temp_disabled"),
        Constants$root.C_POINTER$LAYOUT.withName("matches"),
        Constants$root.C_POINTER$LAYOUT.withName("unconfirmed_matches"),
        Constants$root.C_POINTER$LAYOUT.withName("profiling_info")
    ).withName("YR_SCAN_CONTEXT");
    public static MemoryLayout $LAYOUT() {
        return YR_SCAN_CONTEXT.$struct$LAYOUT;
    }
    static final VarHandle file_size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("file_size"));
    public static VarHandle file_size$VH() {
        return YR_SCAN_CONTEXT.file_size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint64_t file_size;
     * }
     */
    public static long file_size$get(MemorySegment seg) {
        return (long)YR_SCAN_CONTEXT.file_size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint64_t file_size;
     * }
     */
    public static void file_size$set(MemorySegment seg, long x) {
        YR_SCAN_CONTEXT.file_size$VH.set(seg, x);
    }
    public static long file_size$get(MemorySegment seg, long index) {
        return (long)YR_SCAN_CONTEXT.file_size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void file_size$set(MemorySegment seg, long index, long x) {
        YR_SCAN_CONTEXT.file_size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle entry_point$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("entry_point"));
    public static VarHandle entry_point$VH() {
        return YR_SCAN_CONTEXT.entry_point$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint64_t entry_point;
     * }
     */
    public static long entry_point$get(MemorySegment seg) {
        return (long)YR_SCAN_CONTEXT.entry_point$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint64_t entry_point;
     * }
     */
    public static void entry_point$set(MemorySegment seg, long x) {
        YR_SCAN_CONTEXT.entry_point$VH.set(seg, x);
    }
    public static long entry_point$get(MemorySegment seg, long index) {
        return (long)YR_SCAN_CONTEXT.entry_point$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void entry_point$set(MemorySegment seg, long index, long x) {
        YR_SCAN_CONTEXT.entry_point$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return YR_SCAN_CONTEXT.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)YR_SCAN_CONTEXT.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        YR_SCAN_CONTEXT.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)YR_SCAN_CONTEXT.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        YR_SCAN_CONTEXT.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle canary$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("canary"));
    public static VarHandle canary$VH() {
        return YR_SCAN_CONTEXT.canary$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int canary;
     * }
     */
    public static int canary$get(MemorySegment seg) {
        return (int)YR_SCAN_CONTEXT.canary$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int canary;
     * }
     */
    public static void canary$set(MemorySegment seg, int x) {
        YR_SCAN_CONTEXT.canary$VH.set(seg, x);
    }
    public static int canary$get(MemorySegment seg, long index) {
        return (int)YR_SCAN_CONTEXT.canary$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void canary$set(MemorySegment seg, long index, int x) {
        YR_SCAN_CONTEXT.canary$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle timeout$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("timeout"));
    public static VarHandle timeout$VH() {
        return YR_SCAN_CONTEXT.timeout$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint64_t timeout;
     * }
     */
    public static long timeout$get(MemorySegment seg) {
        return (long)YR_SCAN_CONTEXT.timeout$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint64_t timeout;
     * }
     */
    public static void timeout$set(MemorySegment seg, long x) {
        YR_SCAN_CONTEXT.timeout$VH.set(seg, x);
    }
    public static long timeout$get(MemorySegment seg, long index) {
        return (long)YR_SCAN_CONTEXT.timeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void timeout$set(MemorySegment seg, long index, long x) {
        YR_SCAN_CONTEXT.timeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle user_data$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("user_data"));
    public static VarHandle user_data$VH() {
        return YR_SCAN_CONTEXT.user_data$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* user_data;
     * }
     */
    public static MemorySegment user_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.user_data$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* user_data;
     * }
     */
    public static void user_data$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.user_data$VH.set(seg, x);
    }
    public static MemorySegment user_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.user_data$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void user_data$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.user_data$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle callback$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("callback"));
    public static VarHandle callback$VH() {
        return YR_SCAN_CONTEXT.callback$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_CALLBACK_FUNC callback;
     * }
     */
    public static MemorySegment callback$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.callback$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_CALLBACK_FUNC callback;
     * }
     */
    public static void callback$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.callback$VH.set(seg, x);
    }
    public static MemorySegment callback$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.callback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void callback$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.callback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static YR_CALLBACK_FUNC callback(MemorySegment segment, SegmentScope scope) {
        return YR_CALLBACK_FUNC.ofAddress(callback$get(segment), scope);
    }
    static final VarHandle rules$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rules"));
    public static VarHandle rules$VH() {
        return YR_SCAN_CONTEXT.rules$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_RULES* rules;
     * }
     */
    public static MemorySegment rules$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.rules$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_RULES* rules;
     * }
     */
    public static void rules$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.rules$VH.set(seg, x);
    }
    public static MemorySegment rules$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.rules$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rules$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.rules$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle last_error_string$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("last_error_string"));
    public static VarHandle last_error_string$VH() {
        return YR_SCAN_CONTEXT.last_error_string$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_STRING* last_error_string;
     * }
     */
    public static MemorySegment last_error_string$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.last_error_string$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_STRING* last_error_string;
     * }
     */
    public static void last_error_string$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.last_error_string$VH.set(seg, x);
    }
    public static MemorySegment last_error_string$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.last_error_string$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void last_error_string$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.last_error_string$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iterator$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("iterator"));
    public static VarHandle iterator$VH() {
        return YR_SCAN_CONTEXT.iterator$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_MEMORY_BLOCK_ITERATOR* iterator;
     * }
     */
    public static MemorySegment iterator$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.iterator$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_MEMORY_BLOCK_ITERATOR* iterator;
     * }
     */
    public static void iterator$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.iterator$VH.set(seg, x);
    }
    public static MemorySegment iterator$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.iterator$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iterator$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.iterator$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle objects_table$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("objects_table"));
    public static VarHandle objects_table$VH() {
        return YR_SCAN_CONTEXT.objects_table$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_HASH_TABLE* objects_table;
     * }
     */
    public static MemorySegment objects_table$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.objects_table$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_HASH_TABLE* objects_table;
     * }
     */
    public static void objects_table$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.objects_table$VH.set(seg, x);
    }
    public static MemorySegment objects_table$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.objects_table$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void objects_table$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.objects_table$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle matches_notebook$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("matches_notebook"));
    public static VarHandle matches_notebook$VH() {
        return YR_SCAN_CONTEXT.matches_notebook$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_NOTEBOOK* matches_notebook;
     * }
     */
    public static MemorySegment matches_notebook$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.matches_notebook$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_NOTEBOOK* matches_notebook;
     * }
     */
    public static void matches_notebook$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.matches_notebook$VH.set(seg, x);
    }
    public static MemorySegment matches_notebook$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.matches_notebook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void matches_notebook$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.matches_notebook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment stopwatch$slice(MemorySegment seg) {
        return seg.asSlice(88, 16);
    }
    public static MemorySegment re_fiber_pool$slice(MemorySegment seg) {
        return seg.asSlice(104, 24);
    }
    static final VarHandle rule_matches_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rule_matches_flags"));
    public static VarHandle rule_matches_flags$VH() {
        return YR_SCAN_CONTEXT.rule_matches_flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long* rule_matches_flags;
     * }
     */
    public static MemorySegment rule_matches_flags$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.rule_matches_flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long* rule_matches_flags;
     * }
     */
    public static void rule_matches_flags$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.rule_matches_flags$VH.set(seg, x);
    }
    public static MemorySegment rule_matches_flags$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.rule_matches_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rule_matches_flags$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.rule_matches_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ns_unsatisfied_flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("ns_unsatisfied_flags"));
    public static VarHandle ns_unsatisfied_flags$VH() {
        return YR_SCAN_CONTEXT.ns_unsatisfied_flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long* ns_unsatisfied_flags;
     * }
     */
    public static MemorySegment ns_unsatisfied_flags$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.ns_unsatisfied_flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long* ns_unsatisfied_flags;
     * }
     */
    public static void ns_unsatisfied_flags$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.ns_unsatisfied_flags$VH.set(seg, x);
    }
    public static MemorySegment ns_unsatisfied_flags$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.ns_unsatisfied_flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ns_unsatisfied_flags$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.ns_unsatisfied_flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle strings_temp_disabled$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("strings_temp_disabled"));
    public static VarHandle strings_temp_disabled$VH() {
        return YR_SCAN_CONTEXT.strings_temp_disabled$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long* strings_temp_disabled;
     * }
     */
    public static MemorySegment strings_temp_disabled$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.strings_temp_disabled$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long* strings_temp_disabled;
     * }
     */
    public static void strings_temp_disabled$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.strings_temp_disabled$VH.set(seg, x);
    }
    public static MemorySegment strings_temp_disabled$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.strings_temp_disabled$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void strings_temp_disabled$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.strings_temp_disabled$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle matches$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("matches"));
    public static VarHandle matches$VH() {
        return YR_SCAN_CONTEXT.matches$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_MATCHES* matches;
     * }
     */
    public static MemorySegment matches$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.matches$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_MATCHES* matches;
     * }
     */
    public static void matches$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.matches$VH.set(seg, x);
    }
    public static MemorySegment matches$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.matches$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void matches$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.matches$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle unconfirmed_matches$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("unconfirmed_matches"));
    public static VarHandle unconfirmed_matches$VH() {
        return YR_SCAN_CONTEXT.unconfirmed_matches$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_MATCHES* unconfirmed_matches;
     * }
     */
    public static MemorySegment unconfirmed_matches$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.unconfirmed_matches$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_MATCHES* unconfirmed_matches;
     * }
     */
    public static void unconfirmed_matches$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.unconfirmed_matches$VH.set(seg, x);
    }
    public static MemorySegment unconfirmed_matches$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.unconfirmed_matches$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void unconfirmed_matches$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.unconfirmed_matches$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle profiling_info$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("profiling_info"));
    public static VarHandle profiling_info$VH() {
        return YR_SCAN_CONTEXT.profiling_info$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_PROFILING_INFO* profiling_info;
     * }
     */
    public static MemorySegment profiling_info$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.profiling_info$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_PROFILING_INFO* profiling_info;
     * }
     */
    public static void profiling_info$set(MemorySegment seg, MemorySegment x) {
        YR_SCAN_CONTEXT.profiling_info$VH.set(seg, x);
    }
    public static MemorySegment profiling_info$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_SCAN_CONTEXT.profiling_info$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void profiling_info$set(MemorySegment seg, long index, MemorySegment x) {
        YR_SCAN_CONTEXT.profiling_info$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

