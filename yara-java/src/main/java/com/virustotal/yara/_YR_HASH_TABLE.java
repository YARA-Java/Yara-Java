// Generated by jextract

package com.virustotal.yara;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _YR_HASH_TABLE {
 *     int size;
 *     YR_HASH_TABLE_ENTRY* buckets[1];
 * };
 * }
 */
public class _YR_HASH_TABLE {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("size"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.sequenceLayout(1, Constants$root.C_POINTER$LAYOUT).withName("buckets")
    ).withName("_YR_HASH_TABLE");
    public static MemoryLayout $LAYOUT() {
        return _YR_HASH_TABLE.$struct$LAYOUT;
    }
    static final VarHandle size$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("size"));
    public static VarHandle size$VH() {
        return _YR_HASH_TABLE.size$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int size;
     * }
     */
    public static int size$get(MemorySegment seg) {
        return (int)_YR_HASH_TABLE.size$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int size;
     * }
     */
    public static void size$set(MemorySegment seg, int x) {
        _YR_HASH_TABLE.size$VH.set(seg, x);
    }
    public static int size$get(MemorySegment seg, long index) {
        return (int)_YR_HASH_TABLE.size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void size$set(MemorySegment seg, long index, int x) {
        _YR_HASH_TABLE.size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment buckets$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}

