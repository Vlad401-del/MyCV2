package com.filkom.mycv2.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun daftar(onSimpan: () -> Unit) {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
    ) {
        Text(text = "DAFTAR")
        OutlinedTextField(
            value = "text",
            onValueChange = {},
            label = { Text("name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = "text",
            onValueChange = {},
            label = { Text("nim") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = "email",
            onValueChange = {},
            label = { Text("email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = "alamat",
            onValueChange = { },
            label = { Text("alamat") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )

        Button(
            modifier = Modifier.align(Alignment.CenterHorizontally).padding(vertical = 10.dp),
            onClick = onSimpan)
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