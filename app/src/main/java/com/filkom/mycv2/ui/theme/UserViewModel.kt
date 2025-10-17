package com.filkom.mycv2.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import com.filkom.mycv2.UserData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class UserViewModel : ViewModel(){
    private val _user = MutableStateFlow(UserData())
    val user: StateFlow<UserData> = _user.asStateFlow()

    fun login(email: String, password: String){
        Log.d("ViewModel", "login model")
        Log.d("ViewModel", "_email" + email)
        Log.d("ViewModel", "_passwd" + password)
        if(password == _user.value.password && email == _user.value.email){
            _user.update {user -> user.copy(email = email)}
        } else {

        }
    }

    fun daftar(userData: UserData){
        _user.update { it.copy (
            email = userData.email,
            nim = userData.nim,
            nama = userData.nama,
            alamat = userData.alamat,
            password = userData.password
        )
        }
    }
}