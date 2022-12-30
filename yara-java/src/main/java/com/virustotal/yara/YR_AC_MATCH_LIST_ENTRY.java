// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct YR_AC_MATCH_LIST_ENTRY {
 *     uint16_t backtrack;
 *     uint32_t string_idx;
 *     YR_ARENA_REF ref;
 *     YR_ARENA_REF forward_code_ref;
 *     YR_ARENA_REF backward_code_ref;
 *     YR_AC_MATCH_LIST_ENTRY* next;
 * };
 * }
 */
public class YR_AC_MATCH_LIST_ENTRY {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_SHORT$LAYOUT.withName("backtrack"),
        MemoryLayout.paddingLayout(16),
        Constants$root.C_INT$LAYOUT.withName("string_idx"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("buffer_id"),
            Constants$root.C_INT$LAYOUT.withName("offset")
        ).withName("ref"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("buffer_id"),
            Constants$root.C_INT$LAYOUT.withName("offset")
        ).withName("forward_code_ref"),
        MemoryLayout.structLayout(
            Constants$root.C_INT$LAYOUT.withName("buffer_id"),
            Constants$root.C_INT$LAYOUT.withName("offset")
        ).withName("backward_code_ref"),
        Constants$root.C_POINTER$LAYOUT.withName("next")
    ).withName("YR_AC_MATCH_LIST_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return YR_AC_MATCH_LIST_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle backtrack$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("backtrack"));
    public static VarHandle backtrack$VH() {
        return YR_AC_MATCH_LIST_ENTRY.backtrack$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint16_t backtrack;
     * }
     */
    public static short backtrack$get(MemorySegment seg) {
        return (short)YR_AC_MATCH_LIST_ENTRY.backtrack$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint16_t backtrack;
     * }
     */
    public static void backtrack$set(MemorySegment seg, short x) {
        YR_AC_MATCH_LIST_ENTRY.backtrack$VH.set(seg, x);
    }
    public static short backtrack$get(MemorySegment seg, long index) {
        return (short)YR_AC_MATCH_LIST_ENTRY.backtrack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void backtrack$set(MemorySegment seg, long index, short x) {
        YR_AC_MATCH_LIST_ENTRY.backtrack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle string_idx$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("string_idx"));
    public static VarHandle string_idx$VH() {
        return YR_AC_MATCH_LIST_ENTRY.string_idx$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t string_idx;
     * }
     */
    public static int string_idx$get(MemorySegment seg) {
        return (int)YR_AC_MATCH_LIST_ENTRY.string_idx$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t string_idx;
     * }
     */
    public static void string_idx$set(MemorySegment seg, int x) {
        YR_AC_MATCH_LIST_ENTRY.string_idx$VH.set(seg, x);
    }
    public static int string_idx$get(MemorySegment seg, long index) {
        return (int)YR_AC_MATCH_LIST_ENTRY.string_idx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void string_idx$set(MemorySegment seg, long index, int x) {
        YR_AC_MATCH_LIST_ENTRY.string_idx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ref$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment forward_code_ref$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment backward_code_ref$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    static final VarHandle next$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("next"));
    public static VarHandle next$VH() {
        return YR_AC_MATCH_LIST_ENTRY.next$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * YR_AC_MATCH_LIST_ENTRY* next;
     * }
     */
    public static MemorySegment next$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)YR_AC_MATCH_LIST_ENTRY.next$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * YR_AC_MATCH_LIST_ENTRY* next;
     * }
     */
    public static void next$set(MemorySegment seg, MemorySegment x) {
        YR_AC_MATCH_LIST_ENTRY.next$VH.set(seg, x);
    }
    public static MemorySegment next$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)YR_AC_MATCH_LIST_ENTRY.next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void next$set(MemorySegment seg, long index, MemorySegment x) {
        YR_AC_MATCH_LIST_ENTRY.next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

