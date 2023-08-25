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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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

class Signupactivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            signupInterface()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)

@Composable

fun signupInterface(){

    var firstname by remember {
        mutableStateOf("")
    }
//mutablestateof basically enable data capture
    var lastname by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var phonenumber by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bg3),
            contentDescription = null, // No description for background image
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .background(Color.Transparent) // Make the content background transparent
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(text = "Fill in the necessary information to create an account", color = Color.Black, fontSize = 15.sp)

            OutlinedTextField(
                value = firstname,
                leadingIcon = {Icon(Icons.Default.Person, contentDescription ="Input name" )},
                onValueChange = { firstname },
                label = { Text(text = "Firstname") },
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(value = lastname,
                leadingIcon = { Icon(Icons.Default.Person , contentDescription ="Input name" ) },
                onValueChange = {lastname},
                label = {Text(text = "Lastname")},
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(value = email,
                leadingIcon = { Icon(Icons.Default.Email , contentDescription ="Input email" ) },
                onValueChange = {email},
                label = {Text(text = "Email")},
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(value = phonenumber,
                leadingIcon = { Icon(Icons.Default.Phone , contentDescription ="Input phoneno" ) },
                onValueChange = {phonenumber},
                label = {Text(text = "Phonenumber")},
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(15.dp))

            OutlinedTextField(value = password,
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


        }
    }
}


//add background images to all images
//resize using painter
//ufile.io - for resizing images to fit the screens


