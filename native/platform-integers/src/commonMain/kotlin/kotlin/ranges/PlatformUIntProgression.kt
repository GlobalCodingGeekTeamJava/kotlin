@file:Suppress("NO_ACTUAL_FOR_EXPECT")

package kotlin.ranges

expect open class PlatformUIntProgression : Iterable<PlatformUInt> {
    val first: PlatformUInt
    val last: PlatformUInt
    val step: PlatformInt

    open fun isEmpty(): Boolean

    companion object {
        fun fromClosedRange(
            rangeStart: PlatformUInt,
            rangeEnd: PlatformUInt,
            step: PlatformInt
        ): PlatformUIntProgression
    }
}
