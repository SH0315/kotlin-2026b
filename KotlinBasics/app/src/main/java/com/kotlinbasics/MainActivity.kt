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
        week04Classes()
        week04Collections()
    }
}


private fun week04Classes(){
    println("== Kotlin Classes ==")

    //클래스 생성 (생성자 X)
    class Student {
        var name : String = ""
        var age : Int = 0

        fun introduce(){
            println("안녕 나는 $name 이고 $age 살이야")
        }
    }

    //객체 생성 1
    val student1 = Student()
    student1.name="Mirae"
    student1.age = 21
    student1.introduce()


    //클래스 생성 (생성자 O)
    data class Person (val name : String, val age :Int)

    //객체 생성 2
    val person1 = Person("Kim", 23)
    val person2 = Person("Park", 21)
    println("Person1 : $person1")
    println("Person1 : ${person1.name}님은 ${person1.age}살입니다")
    println("Person2 : $person2")



}

private fun week04Collections(){
    println("== Kotlin Collections ==")

    //리스트 생성
    val fruits = listOf("apple", "banana", "orange")
    val mutableFruits = mutableListOf("kiwi", "watermelon")

    println("Fruits : $fruits")
    mutableFruits.add("banana")
    println("Mutable fruits : $ mutableFruits")

    val scores = mapOf("Kim" to 100, "Park" to 97, "Lee" to 99)

    for(fruit in  mutableFruits) {
        println("I like $fruit")
    }

    scores.forEach{(name,score) -> println("$name scored $score")}

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

private fun week03Functions() {
//    println("Week 03: Functions")
//
//    fun greet(name: String) = "Hello, $name!"
//
//    println(greet("Android developer"))

    println("== Kotlin Functions ==")

    fun printAll(vip: Boolean, name: String) {
        println("$vip, $name")
    }

    fun printMany(vararg msg: String) {
        for (m in msg) println(m)
    }

    printAll(name = "mirae", vip = true)
    printMany("A", "B", "C", "D")
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