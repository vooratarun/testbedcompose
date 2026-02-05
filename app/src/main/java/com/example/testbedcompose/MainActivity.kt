package com.example.testbedcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testbedcompose.basics.AnnotatedStringwithListenerSample
import com.example.testbedcompose.basics.BoxExample
import com.example.testbedcompose.basics.ButtonExample
import com.example.testbedcompose.basics.ColumnBoxExample
import com.example.testbedcompose.basics.ColumnExample
import com.example.testbedcompose.basics.DashboardExample
import com.example.testbedcompose.basics.NestedRowExample
import com.example.testbedcompose.basics.PartiallySelectableText
import com.example.testbedcompose.basics.ProfileRowExample
import com.example.testbedcompose.basics.ResourceAccess
import com.example.testbedcompose.basics.RowExample
import com.example.testbedcompose.basics.UserCard
import com.example.testbedcompose.basics.accessImage
import com.example.testbedcompose.basics.colorfulText
import com.example.testbedcompose.basics.outlinedTextFieldSample
import com.example.testbedcompose.basics.simpleText
import com.example.testbedcompose.ui.theme.TestbedcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestbedcomposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    println(innerPadding)
                    Column {
//                        ResourceAccess()
//                        space()
//                        accessImage()
//                        space()
//                        simpleText()
//                        space()
//                        colorfulText()
//                        space()
//                        outlinedTextFieldSample()
//                        space()
//                        PartiallySelectableText()
//                        space()
                        //AnnotatedStringwithListenerSample()

//                        space()
//                        ButtonExample()

                        space()
                        //ColumnExample()
                        space()
//                        ColumnBoxExample()
//                        BoxExample()
//                        RowExample()
//                          NestedRowExample()
                        //ProfileRowExample()
                        //DashboardExample()
                        UserCard()
                    }

                }
            }
        }
    }
}


@Composable
fun space(){
    Spacer(modifier = Modifier.size(20.dp))

}
