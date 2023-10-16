package id.rifqipadisiliwangi.JuaraAndroidTIga.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with

val Typography = androidx.compose.material.Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h4 = TextStyle(
        color = Color(0xFF008577),
        fontSize = 33.sp,
    ),
    h6 = TextStyle(
        color = Color(0x99000000),
        fontSize = 20.sp
    )
)