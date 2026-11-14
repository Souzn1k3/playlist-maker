package ru.yandex.practicum.playlistmaker.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import ru.yandex.practicum.playlistmaker.presentation.main.MainScreen
import ru.yandex.practicum.playlistmaker.presentation.search.SearchScreen
import ru.yandex.practicum.playlistmaker.presentation.settings.SettingsScreen

@Composable
fun PlaylistHost(
    navController: NavHostController,
    isDarkTheme: Boolean,
    onThemeChanged: (Boolean) -> Unit
) {
    fun navigateTo(screen: Screen) {
        navController.navigate(screen.route)
    }

    NavHost(
        navController = navController,
        startDestination = Screen.MAIN.route
    ) {
        composable(Screen.MAIN.route) {
            MainScreen(
                onSearchClick = { navigateTo(Screen.SEARCH) },
                onSettingsClick = { navigateTo(Screen.SETTINGS) }
            )
        }

        composable(Screen.SEARCH.route) {
            SearchScreen(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(Screen.SETTINGS.route) {
            SettingsScreen(
                isDarkTheme = isDarkTheme,
                onThemeChanged = onThemeChanged,
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
