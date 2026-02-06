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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testbedcompose.basics.AnnotatedStringwithListenerSample
import com.example.testbedcompose.basics.BasicDropdownMenuExample
import com.example.testbedcompose.basics.BottomBarExample
import com.example.testbedcompose.basics.BottomSheetExample
import com.example.testbedcompose.basics.BoxExample
import com.example.testbedcompose.basics.BoxExampleNew
import com.example.testbedcompose.basics.ButtonExample
import com.example.testbedcompose.basics.CheckBoxExample
import com.example.testbedcompose.basics.CheckboxExampleNew
import com.example.testbedcompose.basics.CheckboxWithTextClick
import com.example.testbedcompose.basics.CheckboxwithLazyColumn
import com.example.testbedcompose.basics.ColumnBoxExample
import com.example.testbedcompose.basics.ColumnExample
import com.example.testbedcompose.basics.CounterScreen
//import com.example.testbedcompose.basics.CountryCodePicker
import com.example.testbedcompose.basics.DashboardExample
import com.example.testbedcompose.basics.DatePickerExample
import com.example.testbedcompose.basics.DialogWithImage
import com.example.testbedcompose.basics.ElevatedCardExample
import com.example.testbedcompose.basics.ExposedDropdownMenuExample
import com.example.testbedcompose.basics.FloatingButton
import com.example.testbedcompose.basics.InputChipExample
import com.example.testbedcompose.basics.LazyColumnExample
import com.example.testbedcompose.basics.LazyRowExample
import com.example.testbedcompose.basics.MenuExample
import com.example.testbedcompose.basics.ModifierExample
import com.example.testbedcompose.basics.NavigationDrawerExample
import com.example.testbedcompose.basics.NestedRowExample
import com.example.testbedcompose.basics.PartiallySelectableText
import com.example.testbedcompose.basics.ProfileRowExample
import com.example.testbedcompose.basics.ProgressIndicatorExample
import com.example.testbedcompose.basics.PullToRefreshExample
import com.example.testbedcompose.basics.ResourceAccess
import com.example.testbedcompose.basics.RowExample
import com.example.testbedcompose.basics.ScaffoldExample
import com.example.testbedcompose.basics.SearchScreen
import com.example.testbedcompose.basics.SegmentedbuttonEx
import com.example.testbedcompose.basics.SliderExample
import com.example.testbedcompose.basics.SwitchExample
import com.example.testbedcompose.basics.TopAppBarExample
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
                       // UserCard()

                        //LazyColumnExample()
                        //LazyRowExample()
                        // ModifierExample()
//                        BoxExampleNew()
//                        BottomSheetExample()
                        //CounterScreen()
//                        ElevatedCardExample()
//                          CheckBoxExample()

//                        CheckboxWithTextClick()
//                        CheckboxExampleNew()
//
//                        CheckboxwithLazyColumn()
//                          DialogWithImage()

//                        FloatingButton()
//                        InputChipExample()
//                        MenuExample()
//                          BasicDropdownMenuExample()

//                        ExposedDropdownMenuExample()
//                          ScaffoldExample()
//                        NavigationDrawerExample()

//                        ProgressIndicatorExample()
                          //PullToRefreshExample()
//                          SearchScreen()
                      //  SegmentedbuttonEx()
//                        SliderExample()
//                        CountryCodePicker()(

//                        SwitchExample()
//                          DatePickerExample()
//                        BottomBarExample()
                        TopAppBarExample()
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
