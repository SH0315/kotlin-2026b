package com.kotlinbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasics.ui.theme.KotlinBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week03Variables()
        week03Functions()
    }
}

private fun week03Variables() {
    println("Week 03 : Variables")

    val courseName = "Mobile Programming" // val : 자바에서 final 역할
    var week = 2
    week = 3
    println("Course : $courseName")
    println("Week : $week")

    println("======== Kotlin Variables =========")
    // val (immutable) vs var (mutable)
    // 타입 추론
    val name = "Android"
    var version = 8

    println("Hi $name $version")

    // 타입 지정
    val age : Int = 24
    val height : Double = 183.3
    val isStudent : Boolean = false
    println("Age : $age Height : $height Student :  $isStudent")

    //var nickname : String = null
    var nickname : String? = null
    nickname = "SangHyeok"
    println("Nickname : $nickname ${nickname?.length}")
    // NULL 값이 할당 될수도 있기에 ?.으로 기능을 사용해야함
}

private fun week03Functions(){
//    println("Week 03: Functions")
//
//    fun greet(name: String) = "Hello, $name!"
//
//    println(greet("Android developer"))

    println("== Kotlin Functions ==")

    fun greet(name: String): String {
        return "Hello, $name!"
    }

    fun add(a: Int, b: Int) = a + b

    fun introduce(name: String, age: Int = 19){
        println("My name is $name and I'm $age years old")
    }

    println(greet("Kotlin"))
    println("Sum: ${add(5, -71)}")
    introduce("Kim", 7)
    introduce("Park")
}




@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsTheme {
        Greeting("Android")
    }
}