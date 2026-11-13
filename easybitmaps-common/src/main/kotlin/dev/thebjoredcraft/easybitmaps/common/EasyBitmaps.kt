package dev.thebjoredcraft.easybitmaps.common

import dev.thebjoredcraft.easybitmaps.common.spacing.NegativeSpacing
import dev.thebjoredcraft.easybitmaps.common.spacing.chars.BACKGROUND_GLYPH
import dev.thebjoredcraft.easybitmaps.common.spacing.chars.CharMap
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor
import net.kyori.adventure.text.format.ShadowColor
import net.kyori.adventure.text.format.TextColor

object EasyBitmaps {

    fun render(
        text: String,
        foregroundColor: TextColor = NamedTextColor.RED,
        backgroundColor: TextColor = NamedTextColor.WHITE,
        shadowColor: ShadowColor = ShadowColor.none(),
        padding: Int = 2,
    ): Component {
        val normalizedText = text.lowercase()
        val charMapping = normalizedText.map(CharMap::byChar)
        val totalWidth = charMapping.sumOf { it.width }
        val backgroundString = charMapping
            .joinToString(NegativeSpacing.NEGATIVE_SPACE_ONE.char.toString()) {
                it.generateBackground()
            }

        val glyphs = charMapping.joinToString("") { it.glyph.toString() }

        if (padding < 0) {
            error("Padding cannot be negative. Received: $padding")
        }

        return buildList {
            repeat(padding) {
                add(Component.text(BACKGROUND_GLYPH, backgroundColor))
                add(Component.text(NegativeSpacing.NEGATIVE_SPACE_ONE.char, backgroundColor))
            }

            add(Component.text(backgroundString, backgroundColor))

            repeat(padding) {
                add(Component.text(NegativeSpacing.NEGATIVE_SPACE_ONE.char, backgroundColor))
                add(Component.text(BACKGROUND_GLYPH, backgroundColor))
            }

            add(
                Component.text(
                    NegativeSpacing.buildShifts(-totalWidth - padding),
                    foregroundColor
                ).shadowColor(shadowColor)
            )

            add(Component.text(glyphs, foregroundColor).shadowColor(shadowColor))

            add(Component.text(NegativeSpacing.buildShifts(-totalWidth - padding)))
        }.fold(Component.empty()) { parent, child ->
            parent.append(child)
        }
    }
}