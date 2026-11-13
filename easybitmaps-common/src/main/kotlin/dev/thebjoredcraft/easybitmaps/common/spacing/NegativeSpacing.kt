package dev.thebjoredcraft.easybitmaps.common.spacing

internal enum class NegativeSpacing(val char: Char, val size: Int) {
    NEGATIVE_SPACE_ONE('\uE101', -1),
    NEGATIVE_SPACE_TWO('\uE102', -2),
    NEGATIVE_SPACE_FOUR('\uE103', -4),
    NEGATIVE_SPACE_EIGHT('\uE104', -8),
    NEGATIVE_SPACE_SIXTEEN('\uE105', -16),
    NEGATIVE_SPACE_THIRTY_TWO('\uE106', -32),
    NEGATIVE_SPACE_SIXTY_FOUR('\uE107', -64),
    NEGATIVE_SPACE_ONE_TWENTY_EIGHT('\uE108', -128),
    NEGATIVE_SPACE_TWO_FIFTY_SIX('\uE109', -256),
    NEGATIVE_SPACE_FIVE_TWELVE('\uE110', -512);

    companion object {
        fun buildShifts(size: Int): String {
            if (size >= 0) {
                return ""
            }

            return buildString {
                var remainingSize = size
                while (remainingSize < 0) {
                    val shift =
                        entries.find { it.size >= remainingSize } ?: NEGATIVE_SPACE_FIVE_TWELVE
                    append(shift.char)
                    remainingSize -= shift.size
                }
            }
        }
    }
}