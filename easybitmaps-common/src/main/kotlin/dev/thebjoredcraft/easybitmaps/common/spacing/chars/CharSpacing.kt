package dev.thebjoredcraft.easybitmaps.common.spacing.chars

import dev.thebjoredcraft.easybitmaps.common.spacing.NegativeSpacing


internal const val BACKGROUND_GLYPH = '\uF0FF'

internal data class CharSpacing(
    val glyph: Char,
    val width: Int,
) {
    fun generateBackground() = buildString {
        repeat(width) {
            if (it > 0) {
                append(NegativeSpacing.NEGATIVE_SPACE_ONE.char)
            }

            append(BACKGROUND_GLYPH)
        }
    }
}
