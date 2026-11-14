package dev.thebjoredcraft.easybitmaps.common.spacing.chars

import java.util.concurrent.ConcurrentHashMap
import java.util.logging.Logger

object CharMap {
    private val logger = Logger.getLogger("EasyBitmaps")
    private val chars = ConcurrentHashMap<Char, CharSpacing>()

    init {
        add('\u0020', '\u0020', 4) // Space
        add('\u0021', '\u0021', 2) // !
        add('\u0022', '\u0022', 4) // "
        add('\u0023', '\u0023', 6) // #
        add('\u0024', '\u0024', 6) // $
        add('\u0025', '\u0025', 6) // %
        add('\u0026', '\u0026', 6) // &
        add('\u0027', '\u0027', 2) // '
        add('\u0028', '\u0028', 4) // (
        add('\u0029', '\u0029', 4) // )
        add('\u002A', '\u002A', 4) // *
        add('\u002B', '\u002B', 6) // +
        add('\u002C', '\u002C', 2) // ,
        add('\u002D', '\u002D', 6) // -
        add('\u002E', '\u002E', 2) // .
        add('\u002F', '\u002F', 6) // /
        add('\u0030', '\u0030', 6) // 0
        add('\u0031', '\u0031', 6) // 1
        add('\u0032', '\u0032', 6) // 2
        add('\u0033', '\u0033', 6) // 3
        add('\u0034', '\u0034', 6) // 4
        add('\u0035', '\u0035', 6) // 5
        add('\u0036', '\u0036', 6) // 6
        add('\u0037', '\u0037', 6) // 7
        add('\u0038', '\u0038', 6) // 8
        add('\u0039', '\u0039', 6) // 9
        add('\u003A', '\u003A', 2) // :
        add('\u003B', '\u003B', 2) // ;
        add('\u003C', '\u003C', 5) // <
        add('\u003D', '\u003D', 6) // =
        add('\u003E', '\u003E', 5) // >
        add('\u003F', '\u003F', 6) // ?
        add('\u0040', '\u0040', 7) // @
        add('\u0041', '\u0041', 6) // A
        add('\u0042', '\u0042', 6) // B
        add('\u0043', '\u0043', 6) // C
        add('\u0044', '\u0044', 6) // D
        add('\u0045', '\u0045', 6) // E
        add('\u0046', '\u0046', 6) // F
        add('\u0047', '\u0047', 6) // G
        add('\u0048', '\u0048', 6) // H
        add('\u0049', '\u0049', 4) // I
        add('\u004A', '\u004A', 6) // J
        add('\u004B', '\u004B', 6) // K
        add('\u004C', '\u004C', 6) // L
        add('\u004D', '\u004D', 6) // M
        add('\u004E', '\u004E', 6) // N
        add('\u004F', '\u004F', 6) // O
        add('\u0050', '\u0050', 6) // P
        add('\u0051', '\u0051', 6) // Q
        add('\u0052', '\u0052', 6) // R
        add('\u0053', '\u0053', 6) // S
        add('\u0054', '\u0054', 6) // T
        add('\u0055', '\u0055', 6) // U
        add('\u0056', '\u0056', 6) // V
        add('\u0057', '\u0057', 6) // W
        add('\u0058', '\u0058', 6) // X
        add('\u0059', '\u0059', 6) // Y
        add('\u005A', '\u005A', 6) // Z
        add('\u005B', '\u005B', 4) // [
        add('\u005C', '\u005C', 6) // \
        add('\u005D', '\u005D', 4) // ]
        add('\u005E', '\u005E', 6) // ^
        add('\u005F', '\u005F', 6) // _
        add('\u0060', '\u0060', 3) // `
        add('\u0061', '\u0061', 6) // a
        add('\u0062', '\u0062', 6) // b
        add('\u0063', '\u0063', 6) // c
        add('\u0064', '\u0064', 6) // d
        add('\u0065', '\u0065', 6) // e
        add('\u0066', '\u0066', 5) // f
        add('\u0067', '\u0067', 6) // g
        add('\u0068', '\u0068', 6) // h
        add('\u0069', '\u0069', 2) // i
        add('\u006A', '\u006A', 6) // j
        add('\u006B', '\u006B', 5) // k
        add('\u006C', '\u006C', 3) // l
        add('\u006D', '\u006D', 6) // m
        add('\u006E', '\u006E', 6) // n
        add('\u006F', '\u006F', 6) // o
        add('\u0070', '\u0070', 6) // p
        add('\u0071', '\u0071', 6) // q
        add('\u0072', '\u0072', 6) // r
        add('\u0073', '\u0073', 6) // s
        add('\u0074', '\u0074', 4) // t
        add('\u0075', '\u0075', 6) // u
        add('\u0076', '\u0076', 6) // v
        add('\u0077', '\u0077', 6) // w
        add('\u0078', '\u0078', 6) // x
        add('\u0079', '\u0079', 6) // y
        add('\u007A', '\u007A', 6) // z
        add('\u007B', '\u007B', 4) // {
        add('\u007C', '\u007C', 2) // |
        add('\u007D', '\u007D', 4) // }
        add('\u007E', '\u007E', 7) // ~
        add('\u00A1', '\u00A1', 2) // Inverted Exclamation Mark
        add('\u00A2', '\u00A2', 6) // Cent Sign
        add('\u00A3', '\u00A3', 6) // Pound Sign
        add('\u00A4', '\u00A4', 8) // Currency Sign
        add('\u00A5', '\u00A5', 6) // Yen Sign
        add('\u00A6', '\u00A6', 2) // Broken Bar
        add('\u00A7', '\u00A7', 6) // Section Sign
        add('\u00A8', '\u00A8', 4) // Diaeresis
        add('\u00A9', '\u00A9', 8) // Copyright Sign
        add('\u00AA', '\u00AA', 5) // Feminine Ordinal Indicator
        add('\u00AB', '\u00AB', 7) // Left-Pointing Double Angle Quotation Mark
        add('\u00AC', '\u00AC', 6) // Not Sign
        add('\u00AD', '\u00AD', 4) // Soft Hyphen
        add('\u00AE', '\u00AE', 8) // Registered Sign
        add('\u00AF', '\u00AF', 6) // Macron
        add('\u00B0', '\u00B0', 5) // Degree Sign
        add('\u00B1', '\u00B1', 6) // Plus-Minus Sign
        add('\u00B2', '\u00B2', 5) // Superscript Two
        add('\u00B3', '\u00B3', 5) // Superscript Three
        add('\u00B4', '\u00B4', 3) // Acute Accent
        add('\u00B5', '\u00B5', 6) // Micro Sign
        add('\u00B6', '\u00B6', 7) // Pilcrow Sign
        add('\u00B7', '\u00B7', 2) // Middle Dot
        add('\u00B9', '\u00B9', 4) // Superscript One
        add('\u00BA', '\u00BA', 5) // Masculine Ordinal Indicator
        add('\u00BB', '\u00BB', 7) // Right-Pointing Double Angle Quotation Mark
        add('\u00BC', '\u00BC', 8) // Vulgar Fraction One Quarter
        add('\u00BD', '\u00BD', 8) // Vulgar Fraction One Half
        add('\u00BE', '\u00BE', 8) // Vulgar Fraction Three Quarters
        add('\u00BF', '\u00BF', 6) // Inverted Question Mark
        add('\u00D7', '\u00D7', 6) // Multiplication Sign
        add('\u00D8', '\u00D8', 6) // O With Stroke
        add('\u00DE', '\u00DE', 6) // Thorn
        add('\u00DF', '\u00DF', 6) // Sharp S
        add('\u00F0', '\u00F0', 6) // Eth
        add('\u00F7', '\u00F7', 6) // Division Sign
        add('\u00F8', '\u00F8', 6) // O With Stroke
        add('\u00FE', '\u00FE', 6) // Thorn
        add('\u0132', '\u0132', 6) // Latin Capital Ligature Ij
        add('\u0133', '\u0133', 5) // Latin Small Ligature Ij
        add('\u0138', '\u0138', 5) // Kra
        add('\u017F', '\u017F', 4) // Long S
        add('\u0181', '\u0181', 8) // B With Hook
        add('\u0184', '\u0184', 7) // Tone Six
        add('\u0185', '\u0185', 7) // Tone Six
        add('\u0186', '\u0186', 6) // Open O
        add('\u0189', '\u0189', 7) // African D
        add('\u018E', '\u018E', 6) // Reversed E
        add('\u018F', '\u018F', 6) // Schwa
        add('\u0190', '\u0190', 6) // Open E
        add('\u0191', '\u0191', 7) // F With Hook
        add('\u0192', '\u0192', 6) // F With Hook
        add('\u019A', '\u019A', 4) // L With Bar
        add('\u019B', '\u019B', 6) // Lambda With Stroke
        add('\u019E', '\u019E', 6) // N With Long Right Leg
        add('\u019F', '\u019F', 6) // O With Middle Tilde
        add('\u01A7', '\u01A7', 6) // Tone Two
        add('\u01A8', '\u01A8', 6) // Tone Two
        add('\u01A9', '\u01A9', 6) // Esh
        add('\u01AA', '\u01AA', 6) // Latin Letter Reversed Esh Loop
        add('\u01B2', '\u01B2', 6) // V With Hook
        add('\u01B7', '\u01B7', 6) // Ezh
        add('\u01B8', '\u01B8', 6) // Ezh Reversed
        add('\u01B9', '\u01B9', 6) // Ezh Reversed
        add('\u01BB', '\u01BB', 6) // Latin Letter Two With Stroke
        add('\u01BC', '\u01BC', 6) // Tone Five
        add('\u01BD', '\u01BD', 6) // Tone Five
        add('\u01BE', '\u01BE', 6) // Latin Letter Inverted Glottal Stop With Stroke
        add('\u01BF', '\u01BF', 6) // Latin Letter Wynn
        add('\u01C0', '\u01C0', 2) // Latin Letter Dental Click
        add('\u01C1', '\u01C1', 4) // Latin Letter Lateral Click
        add('\u01C2', '\u01C2', 6) // Latin Letter Alveolar Click
        add('\u01C3', '\u01C3', 2) // Latin Letter Retroflex Click
        add('\u01C9', '\u01C9', 8) // Lj
        add('\u01DD', '\u01DD', 6) // Turned E
        add('\u01F7', '\u01F7', 6) // Wynn
        add('\u021C', '\u021C', 6) // Yogh
        add('\u021D', '\u021D', 6) // Yogh
        add('\u0220', '\u0220', 6) // N With Long Right Leg
        add('\u0221', '\u0221', 8) // D With Curl
        add('\u0224', '\u0224', 6) // Z With Hook
        add('\u0225', '\u0225', 6) // Z With Hook
        add('\u0234', '\u0234', 4) // L With Curl
        add('\u0235', '\u0235', 8) // N With Curl
        add('\u0236', '\u0236', 5) // T With Curl
        add('\u023A', '\u023A', 6) // A With Stroke
        add('\u023B', '\u023B', 6) // C With Stroke
        add('\u023C', '\u023C', 6) // C With Stroke
        add('\u023D', '\u023D', 7) // L With Bar
        add('\u023E', '\u023E', 6) // T With Diagonal Stroke
        add('\u0241', '\u0241', 6) // Glottal Stop
        add('\u0242', '\u0242', 6) // Glottal Stop
        add('\u0243', '\u0243', 7) // B With Stroke
        add('\u0244', '\u0244', 8) // U Bar
        add('\u0245', '\u0245', 6) // Turned V
        add('\u0246', '\u0246', 6) // E With Stroke
        add('\u0247', '\u0247', 7) // E With Stroke
        add('\u0248', '\u0248', 7) // J With Stroke
        add('\u0249', '\u0249', 7) // J With Stroke
        add('\u024A', '\u024A', 7) // Small Q With Hook Tail
        add('\u024B', '\u024B', 7) // Q With Hook Tail
        add('\u024C', '\u024C', 7) // R With Stroke
        add('\u024D', '\u024D', 7) // R With Stroke
        add('\u024E', '\u024E', 8) // Y With Stroke
        add('\u024F', '\u024F', 8) // Y With Stroke
        add('\u0250', '\u0250', 6) // Turned A
        add('\u0251', '\u0251', 6) // Alpha
        add('\u0252', '\u0252', 6) // Turned Alpha
        add('\u0253', '\u0253', 6) // B With Hook
        add('\u0254', '\u0254', 6) // Open O
        add('\u0255', '\u0255', 6) // C With Curl
        add('\u0256', '\u0256', 7) // D With Tail
        add('\u0257', '\u0257', 7) // D With Hook
        add('\u0258', '\u0258', 6) // Reversed E
        add('\u0259', '\u0259', 6) // Schwa
        add('\u025A', '\u025A', 8) // Schwa With Hook
        add('\u025B', '\u025B', 6) // Open E
        add('\u025C', '\u025C', 6) // Reversed Open E
        add('\u025D', '\u025D', 8) // Reversed Open E With Hook
        add('\u025E', '\u025E', 6) // Closed Reversed Open E
        add('\u025F', '\u025F', 5) // Dotless J With Stroke
        add('\u0260', '\u0260', 7) // G With Hook
        add('\u0261', '\u0261', 6) // Script G
        add('\u0262', '\u0262', 6) // Latin Letter Small Capital G
        add('\u0264', '\u0264', 6) // Rams Horn
        add('\u0265', '\u0265', 6) // Turned H
        add('\u0266', '\u0266', 6) // H With Hook
        add('\u0267', '\u0267', 6) // Heng With Hook
        add('\u0268', '\u0268', 4) // I With Stroke
        add('\u026A', '\u026A', 4) // Latin Letter Small Capital I
        add('\u026B', '\u026B', 6) // L With Middle Tilde
        add('\u026C', '\u026C', 5) // L With Belt
        add('\u026D', '\u026D', 3) // L With Retroflex Hook
        add('\u026E', '\u026E', 6) // Lezh
        add('\u026F', '\u026F', 6) // Turned M
        add('\u0270', '\u0270', 6) // Turned M With Long Leg
        add('\u0271', '\u0271', 6) // M With Hook
        add('\u0272', '\u0272', 7) // N With Left Hook
        add('\u0273', '\u0273', 7) // N With Retroflex Hook
        add('\u0274', '\u0274', 6) // Latin Letter Small Capital N
        add('\u0275', '\u0275', 6) // Barred O
        add('\u0277', '\u0277', 8) // Closed Omega
        add('\u0278', '\u0278', 6) // Phi
        add('\u0279', '\u0279', 6) // Turned R
        add('\u027A', '\u027A', 6) // Turned R With Long Leg
        add('\u027B', '\u027B', 7) // Turned R With Hook
        add('\u027C', '\u027C', 6) // R With Long Leg
        add('\u027E', '\u027E', 6) // R With Fishhook
        add('\u027F', '\u027F', 6) // Reversed R With Fishhook
        add('\u0280', '\u0280', 6) // Latin Letter Small Capital R
        add('\u0281', '\u0281', 6) // Latin Letter Small Capital Inverted R
        add('\u0284', '\u0284', 7) // Dotless J With Stroke And Hook
        add('\u0285', '\u0285', 6) // Squat Reversed Esh
        add('\u0286', '\u0286', 7) // Esh With Curl
        add('\u0287', '\u0287', 4) // Turned T
        add('\u0288', '\u0288', 4) // T With Retroflex Hook
        add('\u0289', '\u0289', 8) // U Bar
        add('\u028A', '\u028A', 6) // Upsilon
        add('\u028B', '\u028B', 6) // V With Hook
        add('\u028C', '\u028C', 6) // Turned V
        add('\u028D', '\u028D', 6) // Turned W
        add('\u028E', '\u028E', 6) // Turned Y
        add('\u028F', '\u028F', 6) // Latin Letter Small Capital Y
        add('\u0291', '\u0291', 6) // Z With Curl
        add('\u0292', '\u0292', 6) // Ezh
        add('\u0293', '\u0293', 6) // Ezh With Curl
        add('\u0294', '\u0294', 6) // Latin Letter Glottal Stop
        add('\u0295', '\u0295', 6) // Latin Letter Pharyngeal Voiced Fricative
        add('\u0296', '\u0296', 6) // Latin Letter Inverted Glottal Stop
        add('\u0297', '\u0297', 6) // Latin Letter Stretched C
        add('\u0298', '\u0298', 6) // Latin Letter Bilabial Click
        add('\u0299', '\u0299', 6) // Latin Letter Small Capital B
        add('\u029A', '\u029A', 6) // Closed Open E
        add('\u029B', '\u029B', 7) // Latin Letter Small Capital G With Hook
        add('\u029C', '\u029C', 6) // Latin Letter Small Capital H
        add('\u029D', '\u029D', 6) // J With Crossed-Tail
        add('\u029E', '\u029E', 5) // Turned K
        add('\u029F', '\u029F', 6) // Latin Letter Small Capital L
        add('\u02A0', '\u02A0', 7) // Q With Hook
        add('\u02A1', '\u02A1', 6) // Latin Letter Glottal Stop With Stroke
        add('\u02A2', '\u02A2', 6) // Latin Letter Reversed Glottal Stop With Stroke
        add('\u02AC', '\u02AC', 6) // Latin Letter Bilabial Percussive
        add('\u02BB', '\u02BB', 2) // Modifier Letter Turned Comma
        add('\u02CC', '\u02CC', 2) // Modifier Letter Low Vertical Line
        add('\u02D9', '\u02D9', 2) // Dot Above
        add('\u037E', '\u037E', 2) // Greek Question Mark
        add('\u0387', '\u0387', 2) // Greek Ano Teleia
        add('\u0391', '\u0391', 6) // Greek A
        add('\u0392', '\u0392', 6) // Greek B
        add('\u0393', '\u0393', 6) // Greek Gamma
        add('\u0394', '\u0394', 6) // Greek Delta
        add('\u0395', '\u0395', 6) // Greek E
        add('\u0396', '\u0396', 6) // Greek Z
        add('\u0397', '\u0397', 6) // Greek Eta
        add('\u0398', '\u0398', 6) // Greek Theta
        add('\u0399', '\u0399', 4) // Greek I
        add('\u039A', '\u039A', 6) // Greek K
        add('\u039B', '\u039B', 6) // Greek Lambda
        add('\u039C', '\u039C', 6) // Greek M
        add('\u039D', '\u039D', 6) // Greek N
        add('\u039E', '\u039E', 6) // Greek Xi
        add('\u039F', '\u039F', 6) // Greek O
        add('\u03A0', '\u03A0', 6) // Greek Pi
        add('\u03A1', '\u03A1', 6) // Greek R
        add('\u03A3', '\u03A3', 6) // Greek Sigma
        add('\u03A4', '\u03A4', 6) // Greek T
        add('\u03A5', '\u03A5', 6) // Greek Upsilon
        add('\u03A6', '\u03A6', 6) // Greek Phi
        add('\u03A7', '\u03A7', 6) // Greek Chi
        add('\u03A8', '\u03A8', 6) // Greek Psi
        add('\u03A9', '\u03A9', 6) // Greek Omega
        add('\u03B1', '\u03B1', 6) // Greek alpha
        add('\u03B2', '\u03B2', 6) // Greek beta
        add('\u03B3', '\u03B3', 6) // Greek gamma
        add('\u03B4', '\u03B4', 6) // Greek delta
        add('\u03B5', '\u03B5', 6) // Greek epsilon
        add('\u03B6', '\u03B6', 6) // Greek zeta
        add('\u03B7', '\u03B7', 6) // Greek eta
        add('\u03B8', '\u03B8', 6) // Greek theta
        add('\u03B9', '\u03B9', 3) // Greek iota
        add('\u03BA', '\u03BA', 5) // Greek kappa
        add('\u03BB', '\u03BB', 6) // Greek lambda
        add('\u03BC', '\u03BC', 6) // Greek mu
        add('\u03BD', '\u03BD', 6) // Greek nu
        add('\u03BE', '\u03BE', 6) // Greek xi
        add('\u03BF', '\u03BF', 6) // Greek omicron
        add('\u03C0', '\u03C0', 6) // Greek pi
        add('\u03C1', '\u03C1', 6) // Greek rho
        add('\u03C2', '\u03C2', 6) // Greek final sigma
        add('\u03C3', '\u03C3', 7) // Greek sigma
        add('\u03C4', '\u03C4', 6) // Greek tau
        add('\u03C5', '\u03C5', 6) // Greek upsilon
        add('\u03C6', '\u03C6', 6) // Greek phi
        add('\u03C7', '\u03C7', 6) // Greek chi
        add('\u03C8', '\u03C8', 6) // Greek psi
        add('\u03C9', '\u03C9', 8) // Greek omega
        add('\u03DB', '\u03DB', 6) // Greek Stigma
        add('\u0402', '\u0402', 8) // Cyrillic Dje
        add('\u0404', '\u0404', 6) // Cyrillic Ukrainian Ie
        add('\u0405', '\u0405', 6) // Cyrillic Dze
        add('\u0406', '\u0406', 4) // Cyrillic Byelorussian-Ukrainian I
        add('\u0408', '\u0408', 6) // Cyrillic Je
        add('\u0409', '\u0409', 8) // Cyrillic Lje
        add('\u040A', '\u040A', 7) // Cyrillic Nje
        add('\u040B', '\u040B', 7) // Cyrillic Tshe
        add('\u0410', '\u0410', 6) // Cyrillic A
        add('\u0411', '\u0411', 6) // Cyrillic Be
        add('\u0412', '\u0412', 6) // Cyrillic Ve
        add('\u0413', '\u0413', 6) // Cyrillic Ghe
        add('\u0414', '\u0414', 7) // Cyrillic De
        add('\u0415', '\u0415', 6) // Cyrillic Ie
        add('\u0416', '\u0416', 8) // Cyrillic Zhe
        add('\u0417', '\u0417', 6) // Cyrillic Ze
        add('\u0418', '\u0418', 6) // Cyrillic I
        add('\u041A', '\u041A', 6) // Cyrillic Ka
        add('\u041B', '\u041B', 6) // Cyrillic El
        add('\u041C', '\u041C', 6) // Cyrillic Em
        add('\u041D', '\u041D', 6) // Cyrillic En
        add('\u041E', '\u041E', 6) // Cyrillic O
        add('\u041F', '\u041F', 6) // Cyrillic Pe
        add('\u0420', '\u0420', 6) // Cyrillic Er
        add('\u0421', '\u0421', 6) // Cyrillic Es
        add('\u0422', '\u0422', 6) // Cyrillic Te
        add('\u0423', '\u0423', 6) // Cyrillic U
        add('\u0424', '\u0424', 8) // Cyrillic Ef
        add('\u0425', '\u0425', 6) // Cyrillic Ha
        add('\u0426', '\u0426', 7) // Cyrillic Tse
        add('\u0427', '\u0427', 6) // Cyrillic Che
        add('\u0428', '\u0428', 8) // Cyrillic Sha
        add('\u0429', '\u0429', 9) // Cyrillic Shcha
        add('\u042A', '\u042A', 7) // Cyrillic Hard Sign
        add('\u042B', '\u042B', 8) // Cyrillic Yeru
        add('\u042C', '\u042C', 6) // Cyrillic Soft Sign
        add('\u042D', '\u042D', 6) // Cyrillic E
        add('\u042E', '\u042E', 8) // Cyrillic Yu
        add('\u042F', '\u042F', 6) // Cyrillic Ya
        add('\u0430', '\u0430', 6) // Cyrillic A
        add('\u0431', '\u0431', 6) // Cyrillic Be
        add('\u0432', '\u0432', 6) // Cyrillic Ve
        add('\u0433', '\u0433', 5) // Cyrillic Ghe
        add('\u0434', '\u0434', 7) // Cyrillic De
        add('\u0435', '\u0435', 6) // Cyrillic Ie
        add('\u0436', '\u0436', 6) // Cyrillic Zhe
        add('\u0437', '\u0437', 6) // Cyrillic Ze
        add('\u0438', '\u0438', 6) // Cyrillic I
        add('\u043A', '\u043A', 5) // Cyrillic Ka
        add('\u043B', '\u043B', 6) // Cyrillic El
        add('\u043C', '\u043C', 6) // Cyrillic Em
        add('\u043D', '\u043D', 6) // Cyrillic En
        add('\u043E', '\u043E', 6) // Cyrillic O
        add('\u043F', '\u043F', 6) // Cyrillic Pe
        add('\u0440', '\u0440', 6) // Cyrillic Er
        add('\u0441', '\u0441', 6) // Cyrillic Es
        add('\u0442', '\u0442', 6) // Cyrillic Te
        add('\u0443', '\u0443', 6) // Cyrillic U
        add('\u0444', '\u0444', 6) // Cyrillic Ef
        add('\u0445', '\u0445', 6) // Cyrillic Ha
        add('\u0446', '\u0446', 6) // Cyrillic Tse
        add('\u0447', '\u0447', 6) // Cyrillic Che
        add('\u0448', '\u0448', 6) // Cyrillic Sha
        add('\u0449', '\u0449', 7) // Cyrillic Shcha
        add('\u044A', '\u044A', 7) // Cyrillic Hard Sign
        add('\u044B', '\u044B', 7) // Cyrillic Yeru
        add('\u044C', '\u044C', 6) // Cyrillic Soft Sign
        add('\u044D', '\u044D', 6) // Cyrillic E
        add('\u044E', '\u044E', 8) // Cyrillic Yu
        add('\u044F', '\u044F', 6) // Cyrillic Ya
        add('\u0454', '\u0454', 6) // Cyrillic Ukrainian Ie
        add('\u0455', '\u0455', 6) // Cyrillic Dze
        add('\u0456', '\u0456', 2) // Cyrillic Byelorussian-Ukrainian I
        add('\u0458', '\u0458', 6) // Cyrillic Je
        add('\u0459', '\u0459', 8) // Cyrillic Lje
        add('\u045A', '\u045A', 7) // Cyrillic Nje
        add('\u0462', '\u0462', 7) // Cyrillic Yat
        add('\u0463', '\u0463', 7) // Cyrillic Yat
        add('\u0472', '\u0472', 6) // Cyrillic Fita
        add('\u0473', '\u0473', 6) // Cyrillic Fita
        add('\u0474', '\u0474', 7) // Cyrillic Izhitsa
        add('\u0475', '\u0475', 7) // Cyrillic Izhitsa
        add('\u0492', '\u0492', 7) // Cyrillic Ghe With Stroke
        add('\u0493', '\u0493', 6) // Cyrillic Ghe With Stroke
        add('\u0496', '\u0496', 9) // Cyrillic Zhe With Descender
        add('\u0497', '\u0497', 7) // Cyrillic Zhe With Descender
        add('\u049A', '\u049A', 7) // Cyrillic Ka With Descender
        add('\u049B', '\u049B', 6) // Cyrillic Ka With Descender
        add('\u04A2', '\u04A2', 7) // Cyrillic En With Descender
        add('\u04A3', '\u04A3', 7) // Cyrillic En With Descender
        add('\u04AE', '\u04AE', 6) // Cyrillic Straight U
        add('\u04AF', '\u04AF', 6) // Cyrillic Straight U
        add('\u04B0', '\u04B0', 6) // Cyrillic Straight U With Stroke
        add('\u04B1', '\u04B1', 6) // Cyrillic Straight U With Stroke
        add('\u04BA', '\u04BA', 6) // Cyrillic Shha
        add('\u04BB', '\u04BB', 6) // Cyrillic Shha
        add('\u04C0', '\u04C0', 4) // Cyrillic Letter Palochka
        add('\u04D8', '\u04D8', 6) // Cyrillic Schwa
        add('\u04D9', '\u04D9', 6) // Cyrillic Schwa
        add('\u04E8', '\u04E8', 6) // Cyrillic Barred O
        add('\u04E9', '\u04E9', 6) // Cyrillic Barred O
        add('\u0500', '\u0500', 6) // Cyrillic Komi De
        add('\u0531', '\u0531', 6) // Armenian Capital Letter Ayb
        add('\u0532', '\u0532', 6) // Armenian Capital Letter Ben
        add('\u0533', '\u0533', 7) // Armenian Capital Letter Gim
        add('\u0534', '\u0534', 7) // Armenian Capital Letter Da
        add('\u0535', '\u0535', 6) // Armenian Capital Letter Ech
        add('\u0536', '\u0536', 6) // Armenian Capital Letter Za
        add('\u0537', '\u0537', 6) // Armenian Capital Letter Eh
        add('\u0538', '\u0538', 6) // Armenian Capital Letter Et
        add('\u0539', '\u0539', 7) // Armenian Capital Letter To
        add('\u053A', '\u053A', 7) // Armenian Capital Letter Zhe
        add('\u053B', '\u053B', 6) // Armenian Capital Letter Ini
        add('\u053C', '\u053C', 5) // Armenian Capital Letter Liwn
        add('\u053D', '\u053D', 7) // Armenian Capital Letter Xeh
        add('\u053E', '\u053E', 6) // Armenian Capital Letter Ca
        add('\u053F', '\u053F', 6) // Armenian Capital Letter Ken
        add('\u0540', '\u0540', 6) // Armenian Capital Letter Ho
        add('\u0541', '\u0541', 6) // Armenian Capital Letter Ja
        add('\u0542', '\u0542', 7) // Armenian Capital Letter Ghad
        add('\u0543', '\u0543', 6) // Armenian Capital Letter Cheh
        add('\u0544', '\u0544', 7) // Armenian Capital Letter Men
        add('\u0545', '\u0545', 6) // Armenian Capital Letter Yi
        add('\u0546', '\u0546', 6) // Armenian Capital Letter Now
        add('\u0547', '\u0547', 6) // Armenian Capital Letter Sha
        add('\u0548', '\u0548', 6) // Armenian Capital Letter Vo
        add('\u0549', '\u0549', 6) // Armenian Capital Letter Cha
        add('\u054A', '\u054A', 6) // Armenian Capital Letter Peh
        add('\u054B', '\u054B', 6) // Armenian Capital Letter Jheh
        add('\u054C', '\u054C', 7) // Armenian Capital Letter Ra
        add('\u054D', '\u054D', 6) // Armenian Capital Letter Seh
        add('\u054E', '\u054E', 6) // Armenian Capital Letter Vew
        add('\u054F', '\u054F', 6) // Armenian Capital Letter Tiwn
        add('\u0550', '\u0550', 6) // Armenian Capital Letter Reh
        add('\u0551', '\u0551', 6) // Armenian Capital Letter Co
        add('\u0552', '\u0552', 5) // Armenian Capital Letter Yiwn
        add('\u0553', '\u0553', 6) // Armenian Capital Letter Piwr
        add('\u0554', '\u0554', 6) // Armenian Capital Letter Keh
        add('\u0555', '\u0555', 6) // Armenian Capital Letter Oh
        add('\u0556', '\u0556', 6) // Armenian Capital Letter Feh
        add('\u0559', '\u0559', 3) // Armenian Modifier Letter Left Half Ring
        add('\u055A', '\u055A', 3) // Armenian Apostrophe
        add('\u055B', '\u055B', 3) // Armenian Emphasis Mark
        add('\u055C', '\u055C', 4) // Armenian Exclamation Mark
        add('\u055D', '\u055D', 3) // Armenian Comma
        add('\u055E', '\u055E', 4) // Armenian Question Mark
        add('\u055F', '\u055F', 6) // Armenian Abbreviation Mark
        add('\u0560', '\u0560', 6) // Armenian Small Letter Turned Ayb
        add('\u0561', '\u0561', 6) // Armenian Small Letter Ayb
        add('\u0562', '\u0562', 6) // Armenian Small Letter Ben
        add('\u0563', '\u0563', 7) // Armenian Small Letter Gim
        add('\u0564', '\u0564', 7) // Armenian Small Letter Da
        add('\u0565', '\u0565', 6) // Armenian Small Letter Ech
        add('\u0566', '\u0566', 7) // Armenian Small Letter Za
        add('\u0567', '\u0567', 5) // Armenian Small Letter Eh
        add('\u0568', '\u0568', 6) // Armenian Small Letter Et
        add('\u0569', '\u0569', 6) // Armenian Small Letter To
        add('\u056A', '\u056A', 7) // Armenian Small Letter Zhe
        add('\u056B', '\u056B', 6) // Armenian Small Letter Ini
        add('\u056C', '\u056C', 3) // Armenian Small Letter Liwn
        add('\u056D', '\u056D', 7) // Armenian Small Letter Xeh
        add('\u056E', '\u056E', 6) // Armenian Small Letter Ca
        add('\u056F', '\u056F', 6) // Armenian Small Letter Ken
        add('\u0570', '\u0570', 6) // Armenian Small Letter Ho
        add('\u0571', '\u0571', 6) // Armenian Small Letter Ja
        add('\u0572', '\u0572', 7) // Armenian Small Letter Ghad
        add('\u0573', '\u0573', 6) // Armenian Small Letter Cheh
        add('\u0574', '\u0574', 7) // Armenian Small Letter Men
        add('\u0575', '\u0575', 6) // Armenian Small Letter Yi
        add('\u0576', '\u0576', 7) // Armenian Small Letter Now
        add('\u0577', '\u0577', 6) // Armenian Small Letter Sha
        add('\u0578', '\u0578', 6) // Armenian Small Letter Vo
        add('\u0579', '\u0579', 6) // Armenian Small Letter Cha
        add('\u057A', '\u057A', 6) // Armenian Small Letter Peh
        add('\u057B', '\u057B', 6) // Armenian Small Letter Jheh
        add('\u057C', '\u057C', 6) // Armenian Small Letter Ra
        add('\u057D', '\u057D', 6) // Armenian Small Letter Seh
        add('\u057E', '\u057E', 7) // Armenian Small Letter Vew
        add('\u057F', '\u057F', 8) // Armenian Small Letter Tiwn
        add('\u0580', '\u0580', 6) // Armenian Small Letter Reh
        add('\u0581', '\u0581', 6) // Armenian Small Letter Co
        add('\u0582', '\u0582', 5) // Armenian Small Letter Yiwn
        add('\u0583', '\u0583', 8) // Armenian Small Letter Piwr
        add('\u0584', '\u0584', 7) // Armenian Small Letter Keh
        add('\u0585', '\u0585', 6) // Armenian Small Letter Oh
        add('\u0586', '\u0586', 6) // Armenian Small Letter Feh
        add('\u0587', '\u0587', 7) // Armenian Small Ligature Ech Yiwn
        add('\u0588', '\u0588', 7) // Armenian Small Letter Yi With Stroke
        add('\u058A', '\u058A', 6) // Armenian Hyphen
        add('\u058F', '\u058F', 6) // Armenian Dram Sign
        add('\u05BE', '\u05BE', 6) // Hebrew Punctuation Maqaf
        add('\u05C3', '\u05C3', 2) // Hebrew Punctuation Sof Pasuq
        add('\u05C6', '\u05C6', 4) // Hebrew Punctuation Nun Hafukha
        add('\u05D0', '\u05D0', 6) // Hebrew Letter Alef
        add('\u05D1', '\u05D1', 6) // Hebrew Letter Bet
        add('\u05D2', '\u05D2', 5) // Hebrew Letter Gimel
        add('\u05D3', '\u05D3', 6) // Hebrew Letter Dalet
        add('\u05D4', '\u05D4', 6) // Hebrew Letter He
        add('\u05D5', '\u05D5', 2) // Hebrew Letter Vav
        add('\u05D6', '\u05D6', 4) // Hebrew Letter Zayin
        add('\u05D7', '\u05D7', 6) // Hebrew Letter Het
        add('\u05D8', '\u05D8', 6) // Hebrew Letter Tet
        add('\u05D9', '\u05D9', 2) // Hebrew Letter Yod
        add('\u05DA', '\u05DA', 6) // Hebrew Letter Final Kaf
        add('\u05DB', '\u05DB', 6) // Hebrew Letter Kaf
        add('\u05DC', '\u05DC', 6) // Hebrew Letter Lamed
        add('\u05DD', '\u05DD', 6) // Hebrew Letter Final Mem
        add('\u05DE', '\u05DE', 6) // Hebrew Letter Mem
        add('\u05DF', '\u05DF', 2) // Hebrew Letter Final Nun
        add('\u05E0', '\u05E0', 4) // Hebrew Letter Nun
        add('\u05E1', '\u05E1', 6) // Hebrew Letter Samekh
        add('\u05E2', '\u05E2', 6) // Hebrew Letter Ayin
        add('\u05E3', '\u05E3', 6) // Hebrew Letter Final Pe
        add('\u05E4', '\u05E4', 6) // Hebrew Letter Pe
        add('\u05E5', '\u05E5', 6) // Hebrew Letter Final Tsadi
        add('\u05E6', '\u05E6', 6) // Hebrew Letter Tsadi
        add('\u05E7', '\u05E7', 6) // Hebrew Letter Qof
        add('\u05E8', '\u05E8', 6) // Hebrew Letter Resh
        add('\u05E9', '\u05E9', 6) // Hebrew Letter Shin
        add('\u05EA', '\u05EA', 6) // Hebrew Letter Tav
        add('\u05F0', '\u05F0', 4) // Hebrew Ligature Yiddish Double Vav
        add('\u05F1', '\u05F1', 4) // Hebrew Ligature Yiddish Vav Yod
        add('\u05F2', '\u05F2', 4) // Hebrew Ligature Yiddish Double Yod
        add('\u05F3', '\u05F3', 3) // Hebrew Punctuation Geresh
        add('\u05F4', '\u05F4', 5) // Hebrew Punctuation Gershayim
        add('\u07C8', '\u07C8', 6) // Nko Digit Eight
        add('\u10A0', '\u10A0', 6) // Georgian Capital Letter An
        add('\u10A1', '\u10A1', 8) // Georgian Capital Letter Ban
        add('\u10A2', '\u10A2', 8) // Georgian Capital Letter Gan
        add('\u10A3', '\u10A3', 6) // Georgian Capital Letter Don
        add('\u10A4', '\u10A4', 6) // Georgian Capital Letter En
        add('\u10A5', '\u10A5', 8) // Georgian Capital Letter Vin
        add('\u10A6', '\u10A6', 8) // Georgian Capital Letter Zen
        add('\u10A7', '\u10A7', 8) // Georgian Capital Letter Tan
        add('\u10A8', '\u10A8', 6) // Georgian Capital Letter In
        add('\u10A9', '\u10A9', 6) // Georgian Capital Letter Kan
        add('\u10AA', '\u10AA', 8) // Georgian Capital Letter Las
        add('\u10AB', '\u10AB', 7) // Georgian Capital Letter Man
        add('\u10AC', '\u10AC', 6) // Georgian Capital Letter Nar
        add('\u10AD', '\u10AD', 8) // Georgian Capital Letter On
        add('\u10AE', '\u10AE', 8) // Georgian Capital Letter Par
        add('\u10AF', '\u10AF', 7) // Georgian Capital Letter Zhar
        add('\u10B0', '\u10B0', 8) // Georgian Capital Letter Rae
        add('\u10B1', '\u10B1', 6) // Georgian Capital Letter San
        add('\u10B2', '\u10B2', 6) // Georgian Capital Letter Tar
        add('\u10B3', '\u10B3', 8) // Georgian Capital Letter Un
        add('\u10B4', '\u10B4', 6) // Georgian Capital Letter Phar
        add('\u10B5', '\u10B5', 6) // Georgian Capital Letter Khar
        add('\u10B6', '\u10B6', 6) // Georgian Capital Letter Ghan
        add('\u10B7', '\u10B7', 6) // Georgian Capital Letter Qar
        add('\u10B8', '\u10B8', 6) // Georgian Capital Letter Shin
        add('\u10B9', '\u10B9', 6) // Georgian Capital Letter Chin
        add('\u10BA', '\u10BA', 6) // Georgian Capital Letter Can
        add('\u10BB', '\u10BB', 8) // Georgian Capital Letter Jil
        add('\u10BC', '\u10BC', 6) // Georgian Capital Letter Cil
        add('\u10BD', '\u10BD', 6) // Georgian Capital Letter Char
        add('\u10BE', '\u10BE', 6) // Georgian Capital Letter Xan
        add('\u10BF', '\u10BF', 6) // Georgian Capital Letter Jhan
        add('\u10C0', '\u10C0', 8) // Georgian Capital Letter Hae
        add('\u10C1', '\u10C1', 6) // Georgian Capital Letter He
        add('\u10C2', '\u10C2', 6) // Georgian Capital Letter Hie
        add('\u10C3', '\u10C3', 6) // Georgian Capital Letter We
        add('\u10C4', '\u10C4', 6) // Georgian Capital Letter Har
        add('\u10C5', '\u10C5', 8) // Georgian Capital Letter Hoe
        add('\u10C7', '\u10C7', 6) // Georgian Capital Letter Yn
        add('\u10CD', '\u10CD', 6) // Georgian Capital Letter Aen
        add('\u10D0', '\u10D0', 6) // Georgian Letter An
        add('\u10D1', '\u10D1', 6) // Georgian Letter Ban
        add('\u10D2', '\u10D2', 6) // Georgian Letter Gan
        add('\u10D3', '\u10D3', 6) // Georgian Letter Don
        add('\u10D4', '\u10D4', 6) // Georgian Letter En
        add('\u10D5', '\u10D5', 6) // Georgian Letter Vin
        add('\u10D6', '\u10D6', 6) // Georgian Letter Zen
        add('\u10D7', '\u10D7', 6) // Georgian Letter Tan
        add('\u10D8', '\u10D8', 6) // Georgian Letter In
        add('\u10D9', '\u10D9', 6) // Georgian Letter Kan
        add('\u10DA', '\u10DA', 8) // Georgian Letter Las
        add('\u10DB', '\u10DB', 6) // Georgian Letter Man
        add('\u10DC', '\u10DC', 6) // Georgian Letter Nar
        add('\u10DD', '\u10DD', 6) // Georgian Letter On
        add('\u10DE', '\u10DE', 6) // Georgian Letter Par
        add('\u10DF', '\u10DF', 6) // Georgian Letter Zhar
        add('\u10E0', '\u10E0', 6) // Georgian Letter Rae
        add('\u10E1', '\u10E1', 6) // Georgian Letter San
        add('\u10E2', '\u10E2', 6) // Georgian Letter Tar
        add('\u10E3', '\u10E3', 6) // Georgian Letter Un
        add('\u10E4', '\u10E4', 6) // Georgian Letter Phar
        add('\u10E5', '\u10E5', 6) // Georgian Letter Khar
        add('\u10E6', '\u10E6', 6) // Georgian Letter Ghan
        add('\u10E7', '\u10E7', 6) // Georgian Letter Qar
        add('\u10E8', '\u10E8', 6) // Georgian Letter Shin
        add('\u10E9', '\u10E9', 6) // Georgian Letter Chin
        add('\u10EA', '\u10EA', 6) // Georgian Letter Can
        add('\u10EB', '\u10EB', 6) // Georgian Letter Jil
        add('\u10EC', '\u10EC', 6) // Georgian Letter Cil
        add('\u10ED', '\u10ED', 6) // Georgian Letter Char
        add('\u10EE', '\u10EE', 6) // Georgian Letter Xan
        add('\u10EF', '\u10EF', 5) // Georgian Letter Jhan
        add('\u10F0', '\u10F0', 6) // Georgian Letter Hae
        add('\u10F1', '\u10F1', 7) // Georgian Letter He
        add('\u10F2', '\u10F2', 6) // Georgian Letter Hie
        add('\u10F3', '\u10F3', 6) // Georgian Letter We
        add('\u10F4', '\u10F4', 6) // Georgian Letter Har
        add('\u10F5', '\u10F5', 6) // Georgian Letter Hoe
        add('\u10F6', '\u10F6', 6) // Georgian Letter Fi
        add('\u10F7', '\u10F7', 6) // Georgian Letter Yn
        add('\u10F8', '\u10F8', 6) // Georgian Letter Elifi
        add('\u10F9', '\u10F9', 6) // Georgian Letter Turned Gan
        add('\u10FA', '\u10FA', 6) // Georgian Letter Ain
        add('\u10FB', '\u10FB', 4) // Georgian Paragraph Separator
        add('\u10FC', '\u10FC', 4) // Modifier Letter Georgian Nar
        add('\u10FD', '\u10FD', 6) // Georgian Letter Aen
        add('\u10FE', '\u10FE', 6) // Georgian Letter Hard Sign
        add('\u10FF', '\u10FF', 6) // Georgian Letter Labial Sign
        add('\u15E1', '\u15E1', 6) // Canadian Syllabics Carrier Tha
        add('\u15FA', '\u15FA', 6) // Canadian Syllabics Carrier Kha
        add('\u1614', '\u1614', 6) // Canadian Syllabics Carrier Ju
        add('\u16A0', '\u16A0', 5) // Runic Letter Fehu Feoh Fe F
        add('\u16A2', '\u16A2', 6) // Runic Letter Uruz Ur U
        add('\u16A3', '\u16A3', 6) // Runic Letter Yr
        add('\u16A4', '\u16A4', 6) // Runic Letter Y
        add('\u16A5', '\u16A5', 6) // Runic Letter W
        add('\u16A6', '\u16A6', 5) // Runic Letter Thurisaz Thurs Thorn
        add('\u16A7', '\u16A7', 5) // Runic Letter Eth
        add('\u16A8', '\u16A8', 4) // Runic Letter Ansuz A
        add('\u16A9', '\u16A9', 5) // Runic Letter Os O
        add('\u16AA', '\u16AA', 5) // Runic Letter Ac A
        add('\u16AB', '\u16AB', 5) // Runic Letter Aesc
        add('\u16AC', '\u16AC', 6) // Runic Letter Long-Branch-Oss O
        add('\u16AD', '\u16AD', 4) // Runic Letter Short-Twig-Oss O
        add('\u16AE', '\u16AE', 4) // Runic Letter O
        add('\u16AF', '\u16AF', 6) // Runic Letter Oe
        add('\u16B0', '\u16B0', 6) // Runic Letter On
        add('\u16B1', '\u16B1', 5) // Runic Letter Raido Rad Reid R
        add('\u16B2', '\u16B2', 4) // Runic Letter Kauna
        add('\u16B3', '\u16B3', 5) // Runic Letter Cen
        add('\u16B4', '\u16B4', 5) // Runic Letter Kaun K
        add('\u16B6', '\u16B6', 6) // Runic Letter Eng
        add('\u16B7', '\u16B7', 6) // Runic Letter Gebo Gyfu G
        add('\u16B8', '\u16B8', 6) // Runic Letter Gar
        add('\u16B9', '\u16B9', 5) // Runic Letter Wunjo Wynn W
        add('\u16BA', '\u16BA', 6) // Runic Letter Haglaz H
        add('\u16BB', '\u16BB', 6) // Runic Letter Haegl H
        add('\u16BC', '\u16BC', 6) // Runic Letter Long-Branch-Hagall H
        add('\u16BD', '\u16BD', 4) // Runic Letter Short-Twig-Hagall H
        add('\u16BE', '\u16BE', 6) // Runic Letter Naudiz Nyd Naud N
        add('\u16BF', '\u16BF', 4) // Runic Letter Short-Twig-Naud N
        add('\u16C0', '\u16C0', 6) // Runic Letter Dotted-N
        add('\u16C1', '\u16C1', 2) // Runic Letter Isaz Is Iss I
        add('\u16C2', '\u16C2', 4) // Runic Letter E
        add('\u16C3', '\u16C3', 7) // Runic Letter Jeran J
        add('\u16C4', '\u16C4', 6) // Runic Letter Ger
        add('\u16C5', '\u16C5', 6) // Runic Letter Long-Branch-Ar Ae
        add('\u16C6', '\u16C6', 4) // Runic Letter Short-Twig-Ar A
        add('\u16C7', '\u16C7', 6) // Runic Letter Iwaz Eoh
        add('\u16C8', '\u16C8', 5) // Runic Letter Pertho Peorth P
        add('\u16C9', '\u16C9', 6) // Runic Letter Algiz Eolhx
        add('\u16CA', '\u16CA', 4) // Runic Letter Sowilo S
        add('\u16CB', '\u16CB', 6) // Runic Letter Sigel Long-Branch-Sol S
        add('\u16CC', '\u16CC', 2) // Runic Letter Short-Twig-Sol S
        add('\u16CD', '\u16CD', 4) // Runic Letter C
        add('\u16CE', '\u16CE', 6) // Runic Letter Z
        add('\u16CF', '\u16CF', 6) // Runic Letter Tiwaz Tir Tyr T
        add('\u16D0', '\u16D0', 4) // Runic Letter Short-Twig-Tyr T
        add('\u16D1', '\u16D1', 5) // Runic Letter D
        add('\u16D2', '\u16D2', 5) // Runic Letter Berkanan Beorc Bjarkan B
        add('\u16D3', '\u16D3', 4) // Runic Letter Short-Twig-Bjarkan B
        add('\u16D4', '\u16D4', 5) // Runic Letter Dotted-P
        add('\u16D5', '\u16D5', 5) // Runic Letter Open-P
        add('\u16D6', '\u16D6', 6) // Runic Letter Ehwaz Eh E
        add('\u16D7', '\u16D7', 6) // Runic Letter Mannaz Man M
        add('\u16D8', '\u16D8', 6) // Runic Letter Long-Branch-Madr M
        add('\u16D9', '\u16D9', 4) // Runic Letter Short-Twig-Madr M
        add('\u16DA', '\u16DA', 4) // Runic Letter Laukaz Lagu Logr L
        add('\u16DB', '\u16DB', 5) // Runic Letter Dotted-L
        add('\u16DC', '\u16DC', 6) // Runic Letter Ingwaz
        add('\u16DD', '\u16DD', 6) // Runic Letter Ing
        add('\u16DE', '\u16DE', 6) // Runic Letter Dagaz Daeg D
        add('\u16DF', '\u16DF', 7) // Runic Letter Othalan Ethel O
        add('\u16E0', '\u16E0', 8) // Runic Letter Ear
        add('\u16E1', '\u16E1', 6) // Runic Letter Ior
        add('\u16E2', '\u16E2', 8) // Runic Letter Cweorth
        add('\u16E3', '\u16E3', 6) // Runic Letter Calc
        add('\u16E4', '\u16E4', 6) // Runic Letter Cealc
        add('\u16E5', '\u16E5', 6) // Runic Letter Stan
        add('\u16E6', '\u16E6', 6) // Runic Letter Long-Branch-Yr
        add('\u16E7', '\u16E7', 2) // Runic Letter Short-Twig-Yr
        add('\u16E8', '\u16E8', 6) // Runic Letter Icelandic-Yr
        add('\u16E9', '\u16E9', 5) // Runic Letter Q
        add('\u16EA', '\u16EA', 8) // Runic Letter X
        add('\u16EB', '\u16EB', 3) // Runic Single Punctuation
        add('\u16EC', '\u16EC', 2) // Runic Multiple Punctuation
        add('\u16ED', '\u16ED', 6) // Runic Cross Punctuation
        add('\u16EE', '\u16EE', 6) // Runic Arlaug Symbol
        add('\u16EF', '\u16EF', 6) // Runic Tvimadur Symbol
        add('\u16F0', '\u16F0', 6) // Runic Belgthor Symbol
        add('\u16F1', '\u16F1', 6) // Runic Letter K
        add('\u16F2', '\u16F2', 6) // Runic Letter Sh
        add('\u16F3', '\u16F3', 8) // Runic Letter Oo
        add('\u16F4', '\u16F4', 5) // Runic Letter Franks Casket Os
        add('\u16F5', '\u16F5', 3) // Runic Letter Franks Casket Is
        add('\u16F6', '\u16F6', 6) // Runic Letter Franks Casket Eh
        add('\u16F7', '\u16F7', 6) // Runic Letter Franks Casket Ac
        add('\u16F8', '\u16F8', 6) // Runic Letter Franks Casket Aesc
        add('\u1D00', '\u1D00', 6) // Latin Letter Small Capital A
        add('\u1D04', '\u1D04', 6) // Latin Letter Small Capital C
        add('\u1D05', '\u1D05', 6) // Latin Letter Small Capital D
        add('\u1D07', '\u1D07', 6) // Latin Letter Small Capital E
        add('\u1D09', '\u1D09', 2) // Turned I
        add('\u1D0A', '\u1D0A', 6) // Latin Letter Small Capital J
        add('\u1D0B', '\u1D0B', 6) // Latin Letter Small Capital K
        add('\u1D0D', '\u1D0D', 6) // Latin Letter Small Capital M
        add('\u1D0F', '\u1D0F', 6) // Latin Letter Small Capital O
        add('\u1D18', '\u1D18', 6) // Latin Letter Small Capital P
        add('\u1D1A', '\u1D1A', 6) // Latin Letter Small Capital Turned R
        add('\u1D1B', '\u1D1B', 6) // Latin Letter Small Capital T
        add('\u1D1C', '\u1D1C', 6) // Latin Letter Small Capital U
        add('\u1D20', '\u1D20', 6) // Latin Letter Small Capital V
        add('\u1D21', '\u1D21', 6) // Latin Letter Small Capital W
        add('\u1D22', '\u1D22', 6) // Latin Letter Small Capital Z
        add('\u1D77', '\u1D77', 6) // Turned G
        add('\u1D91', '\u1D91', 7) // D With Hook And Tail
        add('\u1E9C', '\u1E9C', 5) // Long S With Diagonal Stroke
        add('\u1E9D', '\u1E9D', 5) // Long S With High Stroke
        add('\u1E9E', '\u1E9E', 6) // Sharp S
        add('\u1E9F', '\u1E9F', 6) // Delta
        add('\u1EFC', '\u1EFC', 6) // Middle-Welsh V
        add('\u1EFD', '\u1EFD', 5) // Middle-Welsh V
        add('\u1EFE', '\u1EFE', 6) // Y With Loop
        add('\u1EFF', '\u1EFF', 7) // Y With Loop
        add('\u2010', '\u2010', 4) // Hyphen
        add('\u2011', '\u2011', 4) // Non-Breaking Hyphen
        add('\u2013', '\u2013', 7) // En Dash
        add('\u2014', '\u2014', 9) // Em Dash
        add('\u2018', '\u2018', 3) // Left Single Quotation Mark
        add('\u2019', '\u2019', 3) // Right Single Quotation Mark
        add('\u201A', '\u201A', 3) // Single Low-9 Quotation Mark
        add('\u201C', '\u201C', 5) // Left Double Quotation Mark
        add('\u201D', '\u201D', 5) // Right Double Quotation Mark
        add('\u201E', '\u201E', 5) // Double Low-9 Quotation Mark
        add('\u2020', '\u2020', 6) // Dagger
        add('\u2021', '\u2021', 6) // Double Dagger
        add('\u2022', '\u2022', 3) // Bullet
        add('\u2026', '\u2026', 8) // Horizontal Ellipsis
        add('\u2030', '\u2030', 8) // Per Mille Sign
        add('\u2031', '\u2031', 9) // Per Ten Thousand Sign
        add('\u2032', '\u2032', 3) // Prime
        add('\u2033', '\u2033', 5) // Double Prime
        add('\u2034', '\u2034', 7) // Triple Prime
        add('\u2035', '\u2035', 3) // Reversed Prime
        add('\u2036', '\u2036', 5) // Reversed Double Prime
        add('\u2037', '\u2037', 7) // Reversed Triple Prime
        add('\u2039', '\u2039', 4) // Single Left-Pointing Angle Quotation Mark
        add('\u203A', '\u203A', 4) // Single Right-Pointing Angle Quotation Mark
        add('\u203B', '\u203B', 8) // Reference Mark
        add('\u203C', '\u203C', 4) // Double Exclamation Mark
        add('\u203D', '\u203D', 6) // Interrobang
        add('\u2042', '\u2042', 8) // Asterism
        add('\u2048', '\u2048', 8) // Question Exclamation Mark
        add('\u2049', '\u2049', 8) // Exclamation Question Mark
        add('\u204A', '\u204A', 5) // Tironian Sign Et
        add('\u204B', '\u204B', 7) // Reversed Pilcrow Sign
        add('\u204E', '\u204E', 4) // Low Asterisk
        add('\u204F', '\u204F', 2) // Reversed Semicolon
        add('\u2051', '\u2051', 4) // Two Asterisks Aligned Vertically
        add('\u2052', '\u2052', 4) // Commercial Minus Sign
        add('\u2057', '\u2057', 9) // Quadruple Prime
        add('\u2070', '\u2070', 5) // Superscript Zero
        add('\u2071', '\u2071', 2) // Superscript I
        add('\u2074', '\u2074', 5) // Superscript Four
        add('\u2075', '\u2075', 5) // Superscript Five
        add('\u2076', '\u2076', 5) // Superscript Six
        add('\u2077', '\u2077', 5) // Superscript Seven
        add('\u2078', '\u2078', 5) // Superscript Eight
        add('\u2079', '\u2079', 5) // Superscript Nine
        add('\u207A', '\u207A', 4) // Superscript Plus Sign
        add('\u207B', '\u207B', 4) // Superscript Minus
        add('\u207C', '\u207C', 4) // Superscript Equals Sign
        add('\u207D', '\u207D', 3) // Superscript Left Parenthesis
        add('\u207E', '\u207E', 3) // Superscript Right Parenthesis
        add('\u207F', '\u207F', 5) // Superscript N
        add('\u2080', '\u2080', 5) // Subscript Zero
        add('\u2081', '\u2081', 4) // Subscript One
        add('\u2082', '\u2082', 5) // Subscript Two
        add('\u2083', '\u2083', 5) // Subscript Three
        add('\u2084', '\u2084', 5) // Subscript Four
        add('\u2085', '\u2085', 5) // Subscript Five
        add('\u2086', '\u2086', 5) // Subscript Six
        add('\u2087', '\u2087', 5) // Subscript Seven
        add('\u2088', '\u2088', 5) // Subscript Eight
        add('\u2089', '\u2089', 5) // Subscript Nine
        add('\u208A', '\u208A', 4) // Subscript Plus Sign
        add('\u208B', '\u208B', 4) // Subscript Minus
        add('\u208C', '\u208C', 4) // Subscript Equals Sign
        add('\u208D', '\u208D', 3) // Subscript Left Parenthesis
        add('\u208E', '\u208E', 3) // Subscript Right Parenthesis
        add('\u20A0', '\u20A0', 6) // Euro-Currency Sign
        add('\u20A1', '\u20A1', 6) // Colon Sign
        add('\u20A2', '\u20A2', 6) // Cruzeiro Sign
        add('\u20A3', '\u20A3', 7) // French Franc Sign
        add('\u20A4', '\u20A4', 6) // Lira Sign
        add('\u20A5', '\u20A5', 6) // Mill Sign
        add('\u20A6', '\u20A6', 8) // Naira Sign
        add('\u20A9', '\u20A9', 8) // Won Sign
        add('\u20AA', '\u20AA', 8) // New Sheqel Sign
        add('\u20AB', '\u20AB', 7) // Dong Sign
        add('\u20AC', '\u20AC', 7) // Euro Sign
        add('\u20AD', '\u20AD', 7) // Kip Sign
        add('\u20AE', '\u20AE', 6) // Tugrik Sign
        add('\u20B0', '\u20B0', 6) // German Penny Sign
        add('\u20B1', '\u20B1', 8) // Peso Sign
        add('\u20B2', '\u20B2', 6) // Guarani Sign
        add('\u20B3', '\u20B3', 8) // Austral Sign
        add('\u20B4', '\u20B4', 8) // Hryvnia Sign
        add('\u20B5', '\u20B5', 6) // Cedi Sign
        add('\u20B6', '\u20B6', 6) // Livre Tournois Sign
        add('\u20B7', '\u20B7', 8) // Spesmilo Sign
        add('\u20B8', '\u20B8', 6) // Tenge Sign
        add('\u20B9', '\u20B9', 6) // Indian Rupee Sign
        add('\u20BA', '\u20BA', 7) // Turkish Lira Sign
        add('\u20BB', '\u20BB', 8) // Nordic Mark Sign
        add('\u20BC', '\u20BC', 6) // Manat Sign
        add('\u20BD', '\u20BD', 7) // Ruble Sign
        add('\u20BE', '\u20BE', 7) // Lari Sign
        add('\u20BF', '\u20BF', 6) // Bitcoin Sign
        add('\u2117', '\u2117', 8) // Sound Recording Copyright
        add('\u2122', '\u2122', 9) // Trade Mark Sign
        add('\u2132', '\u2132', 6) // Turned Capital F
        add('\u2141', '\u2141', 6) // Turned Sans-Serif Capital G
        add('\u2144', '\u2144', 6) // Turned Sans-Serif Capital Y
        add('\u214B', '\u214B', 6) // Turned Ampersand
        add('\u2150', '\u2150', 9) // Vulgar Fraction One Seventh
        add('\u2151', '\u2151', 9) // Vulgar Fraction One Ninth
        add('\u2153', '\u2153', 9) // Vulgar Fraction One Third
        add('\u2154', '\u2154', 9) // Vulgar Fraction Two Thirds
        add('\u2155', '\u2155', 9) // Vulgar Fraction One Fifth
        add('\u2156', '\u2156', 9) // Vulgar Fraction Two Fifths
        add('\u2157', '\u2157', 9) // Vulgar Fraction Three Fifths
        add('\u2159', '\u2159', 8) // Vulgar Fraction One Sixth
        add('\u215A', '\u215A', 8) // Vulgar Fraction Five Sixths
        add('\u215B', '\u215B', 9) // Vulgar Fraction One Eighth
        add('\u215C', '\u215C', 9) // Vulgar Fraction Three Eighths
        add('\u215D', '\u215D', 9) // Vulgar Fraction Five Eighths
        add('\u215E', '\u215E', 9) // Vulgar Fraction Seven Eighths
        add('\u215F', '\u215F', 7) // Fraction Numerator One
        add('\u2189', '\u2189', 9) // Vulgar Fraction Zero Thirds
        add('\u2190', '\u2190', 8) // Leftwards Arrow
        add('\u2191', '\u2191', 6) // Upwards Arrow
        add('\u2192', '\u2192', 8) // Rightwards Arrow
        add('\u2193', '\u2193', 6) // Downwards Arrow
        add('\u2194', '\u2194', 9) // Left Right Arrow
        add('\u21C4', '\u21C4', 8) // Rightwards Arrow Over Leftwards Arrow
        add('\u21CF', '\u21CF', 9) // Rightwards Double Arrow With Stroke
        add('\u21D2', '\u21D2', 9) // Rightwards Double Arrow
        add('\u21D4', '\u21D4', 9) // Left Right Double Arrow
        add('\u21F5', '\u21F5', 7) // Downwards Arrow Leftwards Of Upwards Arrow
        add('\u2200', '\u2200', 8) // For All
        add('\u2201', '\u2201', 5) // Complement
        add('\u2202', '\u2202', 6) // Partial Differential
        add('\u2203', '\u2203', 6) // There Exists
        add('\u2204', '\u2204', 6) // There Does Not Exist
        add('\u2205', '\u2205', 8) // Empty Set
        add('\u2208', '\u2208', 6) // Element Of
        add('\u2209', '\u2209', 6) // Not An Element Of
        add('\u220B', '\u220B', 6) // Contains As Member
        add('\u220C', '\u220C', 6) // Does Not Contain As Member
        add('\u2211', '\u2211', 6) // N-Ary Summation
        add('\u2212', '\u2212', 6) // Minus Sign
        add('\u2213', '\u2213', 6) // Minus-Or-Plus Sign
        add('\u2219', '\u2219', 6) // Bullet Operator
        add('\u221A', '\u221A', 7) // Square Root
        add('\u221B', '\u221B', 8) // Cube Root
        add('\u221C', '\u221C', 8) // Fourth Root
        add('\u221D', '\u221D', 7) // Proportional To
        add('\u221E', '\u221E', 8) // Infinity
        add('\u2225', '\u2225', 4) // Parallel To
        add('\u2227', '\u2227', 6) // Logical And
        add('\u2228', '\u2228', 6) // Logical Or
        add('\u2229', '\u2229', 6) // Intersection
        add('\u222B', '\u222B', 6) // Integral
        add('\u222E', '\u222E', 6) // Contour Integral
        add('\u2234', '\u2234', 6) // Therefore
        add('\u2235', '\u2235', 6) // Because
        add('\u2248', '\u2248', 7) // Almost Equal To
        add('\u2254', '\u2254', 8) // Colon Equals
        add('\u2260', '\u2260', 6) // Not Equal To
        add('\u2261', '\u2261', 7) // Identical To
        add('\u2262', '\u2262', 7) // Not Identical To
        add('\u2264', '\u2264', 6) // Less-Than Or Equal To
        add('\u2265', '\u2265', 6) // Greater-Than Or Equal To
        add('\u2282', '\u2282', 6) // Subset Of
        add('\u2283', '\u2283', 6) // Superset Of
        add('\u2284', '\u2284', 6) // Not A Subset Of
        add('\u2285', '\u2285', 6) // Not A Superset Of
        add('\u2286', '\u2286', 6) // Subset Of Or Equal To
        add('\u2287', '\u2287', 6) // Superset Of Or Equal To
        add('\u22A2', '\u22A2', 6) // Right Tack
        add('\u22A4', '\u22A4', 6) // Down Tack
        add('\u22A5', '\u22A5', 6) // Up Tack
        add('\u22A8', '\u22A8', 6) // True
        add('\u22BB', '\u22BB', 6) // Xor
        add('\u22BC', '\u22BC', 6) // Nand
        add('\u22BD', '\u22BD', 6) // Nor
        add('\u22C3', '\u22C3', 6) // N-Ary Union
        add('\u22C6', '\u22C6', 4) // Star Operator
        add('\u2300', '\u2300', 8) // Diameter Sign
        add('\u2302', '\u2302', 8) // House
        add('\u2318', '\u2318', 8) // Place Of Interest Sign
        add('\u231A', '\u231A', 8) // Watch
        add('\u231B', '\u231B', 8) // Hourglass
        add('\u2320', '\u2320', 8) // Top Half Integral
        add('\u2321', '\u2321', 5) // Bottom Half Integral
        add('\u23CF', '\u23CF', 6) // Eject Symbol
        add('\u23E9', '\u23E9', 7) // Black Right-Pointing Double Triangle
        add('\u23EA', '\u23EA', 7) // Black Left-Pointing Double Triangle
        add('\u23ED', '\u23ED', 8) // Black Right-Pointing Double Triangle With Vertical Bar
        add('\u23EE', '\u23EE', 8) // Black Left-Pointing Double Triangle With Vertical Bar
        add('\u23EF', '\u23EF', 7) // Black Right-Pointing Triangle With Double Vertical Bar
        add('\u23F3', '\u23F3', 8) // Hourglass With Flowing Sand
        add('\u23F4', '\u23F4', 4) // Black Medium Left-Pointing Triangle
        add('\u23F5', '\u23F5', 4) // Black Medium Right-Pointing Triangle
        add('\u23F6', '\u23F6', 6) // Black Medium Up-Pointing Triangle
        add('\u23F7', '\u23F7', 6) // Black Medium Down-Pointing Triangle
        add('\u23F8', '\u23F8', 4) // Double Vertical Bar
        add('\u23F9', '\u23F9', 6) // Black Square For Stop
        add('\u23FA', '\u23FA', 6) // Black Circle For Record
        add('\u23FB', '\u23FB', 8) // Power Symbol
        add('\u23FC', '\u23FC', 8) // Power On-Off Symbol
        add('\u23FD', '\u23FD', 2) // Power On Symbol
        add('\u2500', '\u2500', 9) // Box Drawings Light Horizontal
        add('\u2502', '\u2502', 6) // Box Drawings Light Vertical
        add('\u250C', '\u250C', 9) // Box Drawings Light Down And Right
        add('\u2510', '\u2510', 6) // Box Drawings Light Down And Left
        add('\u2514', '\u2514', 9) // Box Drawings Light Up And Right
        add('\u2518', '\u2518', 6) // Box Drawings Light Up And Left
        add('\u251C', '\u251C', 9) // Box Drawings Light Vertical And Right
        add('\u2524', '\u2524', 6) // Box Drawings Light Vertical And Left
        add('\u252C', '\u252C', 9) // Box Drawings Light Down And Horizontal
        add('\u2534', '\u2534', 9) // Box Drawings Light Up And Horizontal
        add('\u253C', '\u253C', 9) // Box Drawings Light Vertical And Horizontal
        add('\u2550', '\u2550', 9) // Box Drawings Double Horizontal
        add('\u2551', '\u2551', 8) // Box Drawings Double Vertical
        add('\u2552', '\u2552', 9) // Box Drawings Down Single And Right Double
        add('\u2553', '\u2553', 9) // Box Drawings Down Double And Right Single
        add('\u2554', '\u2554', 9) // Box Drawings Double Down And Right
        add('\u2555', '\u2555', 6) // Box Drawings Down Single And Left Double
        add('\u2556', '\u2556', 8) // Box Drawings Down Double And Left Single
        add('\u2557', '\u2557', 8) // Box Drawings Double Down And Left
        add('\u2558', '\u2558', 9) // Box Drawings Up Single And Right Double
        add('\u2559', '\u2559', 9) // Box Drawings Up Double And Right Single
        add('\u255A', '\u255A', 9) // Box Drawings Double Up And Right
        add('\u255B', '\u255B', 6) // Box Drawings Up Single And Left Double
        add('\u255C', '\u255C', 8) // Box Drawings Up Double And Left Single
        add('\u255D', '\u255D', 8) // Box Drawings Double Up And Left
        add('\u255E', '\u255E', 9) // Box Drawings Vertical Single And Right Double
        add('\u255F', '\u255F', 9) // Box Drawings Vertical Double And Right Single
        add('\u2560', '\u2560', 9) // Box Drawings Double Vertical And Right
        add('\u2561', '\u2561', 6) // Box Drawings Vertical Single And Left Double
        add('\u2562', '\u2562', 8) // Box Drawings Vertical Double And Left Single
        add('\u2563', '\u2563', 8) // Box Drawings Double Vertical And Left
        add('\u2564', '\u2564', 9) // Box Drawings Down Single And Horizontal Double
        add('\u2565', '\u2565', 9) // Box Drawings Down Double And Horizontal Single
        add('\u2566', '\u2566', 9) // Box Drawings Double Down And Horizontal
        add('\u2567', '\u2567', 9) // Box Drawings Up Single And Horizontal Double
        add('\u2568', '\u2568', 9) // Box Drawings Up Double And Horizontal Single
        add('\u2569', '\u2569', 9) // Box Drawings Double Up And Horizontal
        add('\u256A', '\u256A', 9) // Box Drawings Vertical Single And Horizontal Double
        add('\u256B', '\u256B', 9) // Box Drawings Vertical Double And Horizontal Single
        add('\u256C', '\u256C', 9) // Box Drawings Double Vertical And Horizontal
        add('\u2580', '\u2580', 9) // Upper Half Block
        add('\u2584', '\u2584', 9) // Lower Half Block
        add('\u2588', '\u2588', 9) // Full Block
        add('\u258C', '\u258C', 5) // Left Half Block
        add('\u2590', '\u2590', 9) // Right Half Block
        add('\u2591', '\u2591', 8) // Light Shade
        add('\u2592', '\u2592', 9) // Medium Shade
        add('\u2593', '\u2593', 9) // Dark Shade
        add('\u25A0', '\u25A0', 6) // Black Square
        add('\u25A1', '\u25A1', 6) // White Square
        add('\u25B2', '\u25B2', 6) // Black Up-Pointing Triangle
        add('\u25B3', '\u25B3', 6) // White Up-Pointing Triangle
        add('\u25B6', '\u25B6', 7) // Black Right-Pointing Triangle
        add('\u25B7', '\u25B7', 7) // White Right-Pointing Triangle
        add('\u25BC', '\u25BC', 6) // Black Down-Pointing Triangle
        add('\u25BD', '\u25BD', 6) // White Down-Pointing Triangle
        add('\u25C0', '\u25C0', 7) // Black Left-Pointing Triangle
        add('\u25C1', '\u25C1', 7) // White Left-Pointing Triangle
        add('\u25C6', '\u25C6', 6) // Black Diamond
        add('\u25C7', '\u25C7', 6) // White Diamond
        add('\u25CB', '\u25CB', 6) // White Circle
        add('\u25CE', '\u25CE', 8) // Bullseye
        add('\u25CF', '\u25CF', 5) // Black Circle
        add('\u25D8', '\u25D8', 4) // Inverse Bullet
        add('\u25E6', '\u25E6', 4) // White Bullet
        add('\u2600', '\u2600', 9) // Black Sun With Rays
        add('\u2601', '\u2601', 9) // Cloud
        add('\u2602', '\u2602', 8) // Umbrella
        add('\u2603', '\u2603', 8) // Snowman
        add('\u2604', '\u2604', 8) // Comet
        add('\u2605', '\u2605', 8) // Black Star
        add('\u2606', '\u2606', 8) // White Star
        add('\u2608', '\u2608', 8) // Thunderstorm
        add('\u2614', '\u2614', 8) // Umbrella With Rain Drops
        add('\u2620', '\u2620', 8) // Skull And Crossbones
        add('\u2630', '\u2630', 6) // Trigram For Heaven
        add('\u2631', '\u2631', 6) // Trigram For Lake
        add('\u2632', '\u2632', 6) // Trigram For Fire
        add('\u2633', '\u2633', 6) // Trigram For Thunder
        add('\u2634', '\u2634', 6) // Trigram For Wind
        add('\u2635', '\u2635', 6) // Trigram For Water
        add('\u2636', '\u2636', 6) // Trigram For Mountain
        add('\u2637', '\u2637', 6) // Trigram For Earth
        add('\u2639', '\u2639', 6) // White Frowning Face
        add('\u263A', '\u263A', 6) // White Smiling Face
        add('\u263B', '\u263B', 8) // Black Smiling Face
        add('\u263D', '\u263D', 9) // First Quarter Moon
        add('\u2640', '\u2640', 4) // Female Sign
        add('\u2642', '\u2642', 6) // Male Sign
        add('\u2660', '\u2660', 6) // Black Spade Suit
        add('\u2661', '\u2661', 6) // White Heart Suit
        add('\u2662', '\u2662', 6) // White Diamond Suit
        add('\u2663', '\u2663', 6) // Black Club Suit
        add('\u2664', '\u2664', 6) // White Spade Suit
        add('\u2665', '\u2665', 6) // Black Heart Suit
        add('\u2666', '\u2666', 6) // Black Diamond Suit
        add('\u2667', '\u2667', 6) // White Club Suit
        add('\u2669', '\u2669', 4) // Quarter Note
        add('\u266A', '\u266A', 6) // Eighth Note
        add('\u266B', '\u266B', 8) // Beamed Eighth Notes
        add('\u266C', '\u266C', 8) // Beamed Sixteenth Notes
        add('\u266D', '\u266D', 4) // Music Flat Sign
        add('\u266E', '\u266E', 4) // Music Natural Sign
        add('\u266F', '\u266F', 6) // Music Sharp Sign
        add('\u2680', '\u2680', 8) // Die Face-1
        add('\u2681', '\u2681', 8) // Die Face-2
        add('\u2682', '\u2682', 8) // Die Face-3
        add('\u2683', '\u2683', 8) // Die Face-4
        add('\u2684', '\u2684', 8) // Die Face-5
        add('\u2685', '\u2685', 8) // Die Face-6
        add('\u2690', '\u2690', 8) // White Flag
        add('\u2691', '\u2691', 8) // Black Flag
        add('\u2693', '\u2693', 8) // Anchor
        add('\u2694', '\u2694', 8) // Crossed Swords
        add('\u2697', '\u2697', 8) // Alembic
        add('\u26A1', '\u26A1', 6) // High Voltage Sign
        add('\u26A5', '\u26A5', 6) // Male And Female Sign
        add('\u26C4', '\u26C4', 7) // Snowman Without Snow
        add('\u26C8', '\u26C8', 9) // Thunder Cloud And Rain
        add('\u26CF', '\u26CF', 9) // Pick
        add('\u26E8', '\u26E8', 8) // Black Cross On Shield
        add('\u2702', '\u2702', 8) // Black Scissors
        add('\u2709', '\u2709', 8) // Envelope
        add('\u270E', '\u270E', 8) // Lower Right Pencil
        add('\u2714', '\u2714', 7) // Heavy Check Mark
        add('\u2718', '\u2718', 7) // Heavy Ballot X
        add('\u2744', '\u2744', 8) // Snowflake
        add('\u274C', '\u274C', 7) // Cross Mark
        add('\u2763', '\u2763', 6) // Heavy Heart Exclamation Mark Ornament
        add('\u2764', '\u2764', 8) // Heavy Black Heart
        add('\u27D8', '\u27D8', 6) // Large Up Tack
        add('\u295D', '\u295D', 6) // Downwards Harpoon With Barb Right From Bar
        add('\u29C8', '\u29C8', 8) // Squared Square
        add('\u2B50', '\u2B50', 8) // White Medium Star
        add('\u2B58', '\u2B58', 8) // Heavy Circle
        add('\u2BEA', '\u2BEA', 8) // Star With Left Half Black
        add('\u2BEB', '\u2BEB', 8) // Star With Right Half Black
        add('\u2C65', '\u2C65', 7) // A With Stroke
        add('\u2C66', '\u2C66', 6) // T With Diagonal Stroke
        add('\u2C6D', '\u2C6D', 6) // Alpha
        add('\u2C6F', '\u2C6F', 6) // Turned A
        add('\u2C71', '\u2C71', 8) // V With Right Hook
        add('\u2D00', '\u2D00', 6) // Georgian Small Letter An
        add('\u2D01', '\u2D01', 7) // Georgian Small Letter Ban
        add('\u2D02', '\u2D02', 7) // Georgian Small Letter Gan
        add('\u2D03', '\u2D03', 6) // Georgian Small Letter Don
        add('\u2D04', '\u2D04', 6) // Georgian Small Letter En
        add('\u2D05', '\u2D05', 6) // Georgian Small Letter Vin
        add('\u2D06', '\u2D06', 7) // Georgian Small Letter Zen
        add('\u2D07', '\u2D07', 6) // Georgian Small Letter Tan
        add('\u2D08', '\u2D08', 6) // Georgian Small Letter In
        add('\u2D09', '\u2D09', 6) // Georgian Small Letter Kan
        add('\u2D0A', '\u2D0A', 6) // Georgian Small Letter Las
        add('\u2D0B', '\u2D0B', 6) // Georgian Small Letter Man
        add('\u2D0C', '\u2D0C', 6) // Georgian Small Letter Nar
        add('\u2D0D', '\u2D0D', 6) // Georgian Small Letter On
        add('\u2D0E', '\u2D0E', 7) // Georgian Small Letter Par
        add('\u2D0F', '\u2D0F', 7) // Georgian Small Letter Zhar
        add('\u2D10', '\u2D10', 6) // Georgian Small Letter Rae
        add('\u2D11', '\u2D11', 6) // Georgian Small Letter San
        add('\u2D12', '\u2D12', 6) // Georgian Small Letter Tar
        add('\u2D13', '\u2D13', 6) // Georgian Small Letter Un
        add('\u2D14', '\u2D14', 6) // Georgian Small Letter Phar
        add('\u2D15', '\u2D15', 6) // Georgian Small Letter Khar
        add('\u2D16', '\u2D16', 6) // Georgian Small Letter Ghan
        add('\u2D17', '\u2D17', 6) // Georgian Small Letter Qar
        add('\u2D18', '\u2D18', 6) // Georgian Small Letter Shin
        add('\u2D19', '\u2D19', 6) // Georgian Small Letter Chin
        add('\u2D1A', '\u2D1A', 6) // Georgian Small Letter Can
        add('\u2D1B', '\u2D1B', 6) // Georgian Small Letter Jil
        add('\u2D1C', '\u2D1C', 6) // Georgian Small Letter Cil
        add('\u2D1D', '\u2D1D', 7) // Georgian Small Letter Char
        add('\u2D1E', '\u2D1E', 6) // Georgian Small Letter Xan
        add('\u2D1F', '\u2D1F', 6) // Georgian Small Letter Jhan
        add('\u2D20', '\u2D20', 6) // Georgian Small Letter Hae
        add('\u2D21', '\u2D21', 6) // Georgian Small Letter He
        add('\u2D22', '\u2D22', 6) // Georgian Small Letter Hie
        add('\u2D23', '\u2D23', 6) // Georgian Small Letter We
        add('\u2D24', '\u2D24', 6) // Georgian Small Letter Har
        add('\u2D25', '\u2D25', 6) // Georgian Small Letter Hoe
        add('\u2E18', '\u2E18', 6) // Inverted Interrobang
        add('\u2E2E', '\u2E2E', 6) // Reversed Question Mark
        add('\u2E35', '\u2E35', 2) // Turned Semicolon
        add('\u2E38', '\u2E38', 6) // Turned Dagger
        add('\u2E41', '\u2E41', 2) // Reversed Comma
        add('\u2E4B', '\u2E4B', 6) // Triple Dagger
        add('\u3012', '\u3012', 6) // Postal Mark
        add('\u3125', '\u3125', 6) // Bopomofo Letter Eng
        add('\uA726', '\uA726', 6) // Heng
        add('\uA727', '\uA727', 6) // Heng
        add('\uA728', '\uA728', 8) // Tz
        add('\uA729', '\uA729', 7) // Tz
        add('\uA730', '\uA730', 6) // Latin Letter Small Capital F
        add('\uA731', '\uA731', 6) // Latin Letter Small Capital S
        add('\uA739', '\uA739', 9) // Av
        add('\uA73B', '\uA73B', 9) // Av With Horizontal Bar
        add('\uA75A', '\uA75A', 6) // R Rotunda
        add('\uA75B', '\uA75B', 5) // R Rotunda
        add('\uA779', '\uA779', 6) // Insular D
        add('\uA780', '\uA780', 6) // Turned L
        add('\uA781', '\uA781', 3) // Turned L
        add('\uA7A8', '\uA7A8', 7) // S With Oblique Stroke
        add('\uA7A9', '\uA7A9', 6) // S With Oblique Stroke
        add('\uA7AF', '\uA7AF', 6) // Latin Letter Small Capital Q
        add('\uA7B0', '\uA7B0', 6) // Turned K
        add('\uFB00', '\uFB00', 8) // Latin Small Ligature Ff
        add('\uFB01', '\uFB01', 6) // Latin Small Ligature Fi
        add('\uFB02', '\uFB02', 7) // Latin Small Ligature Fl
        add('\uFB03', '\uFB03', 9) // Latin Small Ligature Ffi
        add('\uFB05', '\uFB05', 6) // Latin Small Ligature Long S T
        add('\uFB1D', '\uFB1D', 2) // Hebrew Letter Yod With Hiriq
        add('\uFB1F', '\uFB1F', 4) // Hebrew Ligature Yiddish Yod Yod Patah
        add('\uFB2B', '\uFB2B', 6) // Hebrew Letter Shin With Sin Dot
        add('\uFB31', '\uFB31', 6) // Hebrew Letter Bet With Dagesh
        add('\uFB35', '\uFB35', 4) // Hebrew Letter Vav With Dagesh
        add('\uFB3B', '\uFB3B', 5) // Hebrew Letter Kaf With Dagesh
        add('\uFB44', '\uFB44', 6) // Hebrew Letter Pe With Dagesh
        add('\uFB4A', '\uFB4A', 6) // Hebrew Letter Tav With Dagesh
        add('\uFB4B', '\uFB4B', 3) // Hebrew Letter Vav With Holam
        add('\uFB4C', '\uFB4C', 6) // Hebrew Letter Bet With Rafe
        add('\uFB4E', '\uFB4E', 6) // Hebrew Letter Pe With Rafe
        add('\uFF0B', '\uFF0B', 6) // Fullwidth Plus Sign
        add('\uFFFD', '\uFFFD', 8) // Replacement Character
    }

    fun add(char: Char, glyph: Char, width: Int) {
        chars[char] = CharSpacing(glyph, width)
    }

    internal fun byChar(char: Char) = chars[char] ?: run {
        logger.warning("Char $char not supported by EasyBitmaps.")
        CharSpacing(char, 0)
    }
}
