# EasyBitmaps Resourcepack

## Verzeichnisstruktur

```
assets/
  easybitmaps/
    font/
      bitmap.json          ← Font-Definition (Glyph-Chars → PNGs)
    textures/
      font/
        bitmap.png         ← Spritesheet 6×6 für a–z und 0–9
        background.png     ← Hintergrund-Glyph (1px breit oder Vollblock)
        plus.png
        underscore.png
        percent.png
        equals.png
        hash.png
        asterisk.png
        acute_accent.png
        ampersand.png
        bracket_close.png
        bracket_open.png
        circumflex.png
        colon.png
        comma.png
        curly_bracket_close.png
        curly_bracket_open.png
        degree.png
        dollar.png
        dot.png
        double_quote.png
        euro.png
        exclamation_mark.png
        grave_accent.png
        greater_than.png
        hyphen.png
        less_than.png
        pipe.png
        question_mark.png
        section.png
        semicolon.png
        single_quote.png
        square_bracket_close.png
        square_bracket_open.png
        tilde.png
        slash.png
        backslash.png
        at.png
        copyright.png
        registered.png
        trademark.png
        pilcrow.png
        dagger.png
        double_dagger.png
        bullet.png
        ellipsis.png
        en_dash.png
        em_dash.png
        low_double_quote.png
        left_double_quote.png
        right_double_quote.png
        low_single_quote.png
        left_single_quote.png
        right_single_quote.png
        left_guillemet.png
        right_guillemet.png
        left_single_guillemet.png
        right_single_guillemet.png
        inverted_question_mark.png
        inverted_exclamation_mark.png
        multiplication.png
        division.png
        plus_minus.png
        not_equal.png
        less_equal.png
        greater_equal.png
        approximately_equal.png
        infinity.png
        square_root.png
        summation.png
        product.png
        integral.png
        delta.png
        partial_derivative.png
        pi.png
        micro.png
        omega.png
        cent.png
        pound.png
        yen.png
        won.png
        ruble.png
        rupee.png
        bitcoin.png
        reference_mark.png
        check_mark_light.png
        check_mark_heavy.png
        cross_mark_light.png
        cross_mark_heavy.png
        star_filled.png
        star_outline.png
        heart_outline.png
        heart_filled.png
        arrow_right.png
        arrow_left.png
        arrow_up.png
        arrow_down.png
        arrow_horizontal.png
        arrow_vertical.png
        smallcap_a.png … smallcap_z.png
  minecraft/
    font/
      default.json         ← Nur Negative-Spacing Advances
```

## bitmap.png — Spritesheet-Layout

Das Spritesheet ist **6 Spalten × 6 Zeilen** (je Zelle 1 Zeichen):

| Zeile | Chars |
|-------|-------|
| 1     | a b c d e f |
| 2     | g h i j k l |
| 3     | m n o p q r |
| 4     | s t u v w x |
| 5     | y z 0 1 2 3 |
| 6     | 4 5 6 7 8 9 |

Empfohlene Größe: **48×42 px** (8px × 7px pro Zelle) bei `height: 7, ascent: 7`.

## Glyph-Zeichen (Private Use Area \uF0xx)

| Zeichen | Glyph-Char | Datei |
|---------|------------|-------|
| a–z     | \uF001–\uF01A | bitmap.png (Zeilen 1–5) |
| 0–9     | \uF01B–\uF024 | bitmap.png (Zeilen 5–6) |
| Sonderz.| \uF025–\uF09F | individuelle PNGs |
| BG      | \uF0FF     | background.png |

## Font-Key

Die Font-ID lautet `easybitmaps:bitmap`. Beim Rendern wird sie automatisch
durch `EasyBitmaps.render(...)` gesetzt — Spieler können die Chars nicht
im Chat eingeben, da sie nicht in `minecraft:default` registriert sind.

## Negative-Spacing

Die Spacing-Chars `\uE101`–`\uE110` liegen in `minecraft:default` und
müssen dort als Space-Advances eingetragen sein (bereits in `default.json`).
