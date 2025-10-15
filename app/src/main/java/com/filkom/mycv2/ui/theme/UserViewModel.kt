package com.filkom.mycv2.ui.theme

import com.filkom.mycv2.UserData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UserViewModel : ViewModel(){
    private val _user = MutableStateFlow<UserData>(UserData())
    val user: StateFlow<UserData> = _user

    fun login(email: String, password: String){
        Log.d("ViewModel", "login model")
        Log.d("ViewModel", "_email" + email)
        Log.d("ViewModel", "_passwd" + password)
        if(password == "123456"){
            _user.update {user -> user.copy(email = email)}
        } else {

        }
    }

    fun daftar(UserData: UserData){
        _user.update { user ->
            user.copy(
                email = userData.email,
                password = userData.password
            )
        }
    }
}

