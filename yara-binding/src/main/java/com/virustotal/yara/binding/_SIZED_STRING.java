// Generated by jextract

package com.virustotal.yara.binding;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _SIZED_STRING {
 *     uint32_t length;
 *     uint32_t flags;
 *     char c_string[1];
 * };
 * }
 */
public class _SIZED_STRING {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("length"),
        Constants$root.C_INT$LAYOUT.withName("flags"),
        MemoryLayout.sequenceLayout(1, Constants$root.C_CHAR$LAYOUT).withName("c_string")
    ).withName("_SIZED_STRING");
    public static MemoryLayout $LAYOUT() {
        return _SIZED_STRING.$struct$LAYOUT;
    }
    static final VarHandle length$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("length"));
    public static VarHandle length$VH() {
        return _SIZED_STRING.length$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t length;
     * }
     */
    public static int length$get(MemorySegment seg) {
        return (int)_SIZED_STRING.length$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t length;
     * }
     */
    public static void length$set(MemorySegment seg, int x) {
        _SIZED_STRING.length$VH.set(seg, x);
    }
    public static int length$get(MemorySegment seg, long index) {
        return (int)_SIZED_STRING.length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void length$set(MemorySegment seg, long index, int x) {
        _SIZED_STRING.length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle flags$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("flags"));
    public static VarHandle flags$VH() {
        return _SIZED_STRING.flags$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * uint32_t flags;
     * }
     */
    public static int flags$get(MemorySegment seg) {
        return (int)_SIZED_STRING.flags$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * uint32_t flags;
     * }
     */
    public static void flags$set(MemorySegment seg, int x) {
        _SIZED_STRING.flags$VH.set(seg, x);
    }
    public static int flags$get(MemorySegment seg, long index) {
        return (int)_SIZED_STRING.flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void flags$set(MemorySegment seg, long index, int x) {
        _SIZED_STRING.flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment c_string$slice(MemorySegment seg) {
        return seg.asSlice(8, 1);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

