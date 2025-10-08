package com.filkom.mycv2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.filkom.mycv2.screen.Login
import com.filkom.mycv2.screen.daftar
import com.filkom.mycv2.screen.detail

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            Login(
                onLogin = { navController.navigate("detail") },
                onDaftar = { navController.navigate("daftar") }
            )
        }
        composable("detail") {
            detail(onDaftar = { navController.navigate("daftar") })
        }
        composable("daftar") {
            daftar(onSimpan = { navController.navigate("detail") })
        }
    }
}
