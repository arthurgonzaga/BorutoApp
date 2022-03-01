package br.com.borutoapp.navigation

import br.com.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY

sealed class Screen(val route: String) {
    object Splash: Screen(route = "splash_screen")
    object Welcome: Screen(route = "welcome_screen")
    object Home: Screen(route = "home_screen")
    object Search: Screen(route = "search_screen")
    object Detail: Screen(route = "detail_screen/{$DETAILS_ARGUMENT_KEY}")
}
