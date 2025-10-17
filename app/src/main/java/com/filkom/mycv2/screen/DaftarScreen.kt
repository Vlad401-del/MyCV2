package com.filkom.mycv2.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.filkom.mycv2.UserData

@Composable
fun daftar(onSimpan: (UserData) -> Unit) {
    var nama by remember { mutableStateOf("") }
    var nim by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        Text(text = "DAFTAR")
        OutlinedTextField(
            value = nama,
            onValueChange = {nama = it},
            label = { Text("Nama") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = nim,
            onValueChange = {nim = it},
            label = { Text("NIM") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = alamat,
            onValueChange = {alamat = it},
            label = { Text("Alamat") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            label = { Text("Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )

        Button(
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(vertical = 10.dp),
            onClick = {
                val userData = UserData(
                    nama = nama,
                    nim = nim,
                    email = email,
                    alamat = alamat,
                    password = password
                )
                onSimpan(userData)
            })
        {
            Text("SIMPAN")
        }
    }
}

@Preview
@Composable
fun daftarPreview() {
    daftar({})
}