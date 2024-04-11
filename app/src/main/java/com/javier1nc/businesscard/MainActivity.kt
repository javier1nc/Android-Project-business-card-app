package com.javier1nc.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.javier1nc.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFFd1e4cf)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier
            .background(Color.Black)
            .height(120.dp)
            .width(120.dp)
        ){
            val image = painterResource(R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = null,
                Modifier
                    .fillMaxWidth(1f)
            )
        }

        Text(
            text = "Javier1nc",
            modifier = Modifier.padding(top = 0.dp),
            fontSize = 50.sp,
            fontWeight = FontWeight.Light,
        )
        Text(
            text = "Android Developer Extraordinary",
            modifier = Modifier.padding(top = 10.dp),
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3a5332)
        )
    }

    Column(
        modifier = Modifier.padding(bottom = 40.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {


        Row {
            Column {
                Icon(
                    imageVector = Icons.Rounded.Phone,
                    contentDescription = null,
                    tint = Color(0xFF3a5332),
                    modifier = Modifier.padding(top = 10.dp)
                )
                Icon(
                    imageVector = Icons.Rounded.Share,
                    contentDescription = null,
                    tint = Color(0xFF3a5332),
                    modifier = Modifier.padding(top = 10.dp)
                )
                Icon(
                    imageVector = Icons.Rounded.Email,
                    contentDescription = null,
                    tint = Color(0xFF3a5332),
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
            Column(
                modifier = Modifier.padding(start =20.dp)
            ) {
                Text(
                    text = "+52(55)12341234",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF3a5332),
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text = "@Javier1nc",
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF3a5332),
                    modifier = Modifier.padding(top = 10.dp)
                )
                Text(
                    text = "c***@javier1nc.com",
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF3a5332),
                    modifier = Modifier.padding(top = 10.dp)
                )
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}