package com.filkom.mycv2

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
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
                onLogin = { email, passwd -> viewModel.login(email = email, password = passwd)
                    navController.navigate("detail") },
                onDaftar = { navController.navigate("daftar") }
            )
        }
        composable("detail") {
            detail(user = viewModel.user.collectAsState().value,
                onDaftar = { navController.navigate("daftar") })
        }
        composable("daftar") {
            daftar(onSimpan = { userData -> viewModel.daftar(UserData)
                navController.navigate("detail") })
        }
    }
}
