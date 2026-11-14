package ru.yandex.practicum.playlistmaker.presentation.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val PlaylistBlue = Color(0xFF3F6FF4)
val ChevronGray = Color(0xFFAEAFB4)

private val LightBackground = Color(0xFFFFFFFF)
private val LightText = Color(0xFF1A1B22)
private val LightSearchField = Color(0xFFE6E8EB)

private val DarkBackground = Color(0xFF1A1B22)
private val DarkSearchField = Color(0xFF2B2B2B)

private val LightColors = lightColorScheme(
    primary = PlaylistBlue,
    onPrimary = Color.White,
    background = LightBackground,
    onBackground = LightText,
    surface = LightBackground,
    onSurface = LightText,
    surfaceVariant = LightSearchField,
    onSurfaceVariant = ChevronGray
)

private val DarkColors = darkColorScheme(
    primary = PlaylistBlue,
    onPrimary = Color.White,
    background = DarkBackground,
    onBackground = Color.White,
    surface = DarkBackground,
    onSurface = Color.White,
    surfaceVariant = DarkSearchField,
    onSurfaceVariant = ChevronGray
)

@Composable
fun PlaylistMakerTheme(
    darkTheme: Boolean,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
