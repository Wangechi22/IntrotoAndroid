package com.example.introtojetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.introtojetpack.ui.theme.IntrotoJetpackTheme

class SingupPage : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            signup()

        }
    }
}
@Preview(showBackground = true)

@Composable
fun signup(){

    var username by remember {
        mutableStateOf("")
    }

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

        Column(
            modifier = Modifier
                .background(Color.Transparent) // Make the content background transparent
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = "Fill in the necessary information to sign into your account", color = Color.Black, fontSize = 15.sp)

            TextField(
                value = username,
                leadingIcon = { Icon(Icons.Default.Person, contentDescription ="Input name" ) },
                onValueChange = { username },
                label = { Text(text = "User name") },
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(8.dp))

            TextField(value = email,
                leadingIcon = { Icon(Icons.Default.Email , contentDescription ="Input email" ) },
                onValueChange = {email},
                label = {Text(text = "Email")},
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(15.dp))

            TextField(value = password,
                leadingIcon = { Icon(Icons.Default.Lock , contentDescription ="Input key" ) },
                onValueChange = {password},
                label = {Text(text = "Password")},
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(15.dp))

            Button(onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "SIGNUP")

            }

            Spacer(modifier = Modifier.height(15.dp))

            Button(onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "GO BACK")

            }


        }
    }
}

