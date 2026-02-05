package com.example.testbedcompose.basics

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.LinkInteractionListener
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withLink
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.testbedcompose.R


@Composable
fun ResourceAccess(){

    Text(text = stringResource(R.string.app_name), color = colorResource(R.color.purple_200))
}

@Composable
fun accessImage(){
    Image(painter = painterResource( R.drawable.news), contentDescription = "newImage")

}

@Composable
fun simpleText(){
    Text(text = "Hello from ResourceAccesss.kt",
        color = colorResource(R.color.teal_200),
        fontSize = 30.sp,
        fontFamily = FontFamily.Serif,
        style = TextStyle(
            shadow = Shadow(color =Color.Black)
        )

    )
}

@Composable
fun colorfulText(){
    val rainbowColors = listOf(
        Color.Blue,
        Color.Cyan,
        Color.Yellow,
        Color.Green,
        Color.Cyan,
        Color.Magenta,
    )

    val str =
        buildAnnotatedString {
            append("This is colorful text\n")
            withStyle(
                SpanStyle(
                    brush = Brush.linearGradient(
                        colors = rainbowColors
                    )
                )
            ) {
                append("because they are blinded.")
            }
            append("\n tell them to put some sunglasses on")

        }

    Text(text = str)
}


@Composable
fun outlinedTextFieldSample(){

    var text by remember {
        mutableStateOf("")
    }

    val rainbowcolors = listOf(

        Color.Red,
        Color.Cyan,
        Color.Yellow,
        Color.Green,
        Color.Blue,
    )

    val brush = remember {

        Brush.linearGradient(
            colors = rainbowcolors
        )
    }

    TextField(

        value = text, onValueChange = {
            text = it
        },
        textStyle = TextStyle(brush = brush)
    )
 }

@Composable
fun PartiallySelectableText(){
    SelectionContainer {
        Column {
            Text("This is a text can be select")
            Text("this one too")
            Text("this is the third")

            DisableSelection {
                Text("this is not selectable one")
                Text("this is not selectable text")
            }
        }
    }
}

@Composable
fun AnnotatedStringwithListenerSample(){
    val uriHandler= LocalUriHandler.current;

    var link = LinkAnnotation.Url("https://developer.android.com/develop/ui/compose/documentation",
        TextLinkStyles(
            SpanStyle(
                color = Color.Blue
            )
        ),
        linkInteractionListener = {
            val url = (it as LinkAnnotation.Url).url
            uriHandler.openUri(url)
        }
    )

    val link2 = LinkAnnotation.Url("https://google.co.in",
        TextLinkStyles(
            SpanStyle(
                color = Color.Red
            )
        )

    ){
        val url = (it as LinkAnnotation.Url).url
        uriHandler.openUri(url)
    };

    var link3 = LinkAnnotation.Url("https://developer.android.com/develop/ui/compose/documentation"){
        val url = (it as LinkAnnotation.Url).url
        uriHandler.openUri(url)
    }


    val str = buildAnnotatedString {
        append("Build better apps faster with")
        withLink(link){
            append(" Jetpack Compose")
        }
        withLink(link2){
            append(" and Google")
         }

    };

    Text(text = str)
}