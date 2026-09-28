package com.kotlinbasics

import android.os.Bundle
<<<<<<< HEAD
import android.util.Log
=======
>>>>>>> 5a56584274efc868051d1b48a5f4dac2bc4f6aac
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
<<<<<<< HEAD
//        week03Variables()
//        week03Functions()
        week04Classes()
//        week04Collections()
    }
}

private fun week04Collections(){
    println("== Kotlin Collections ==")

    val fruits = listOf("apple", "banana", "orange")
    val mutableFruits = mutableListOf("kiwi", "watermelon")

    //fruits.add("kiwi")
    println("Fruits : $fruits")
    mutableFruits.add("banana")
    println("Mutable fruits : $mutableFruits")

    val scores = mapOf("Kim" to 100, "Park" to 97, "Lee" to 99)
    println("Scores : $scores")

    for(fruit in mutableFruits){
        println("I like $fruit")
    }

    scores.forEach{(name, score) -> println("$name scored $score")}
    fruits.forEach { fruit -> println("$fruit") }
}

private fun week04Classes(){
    Log.d("KotlinWeek04", "== Kotlin Classes ==")

    class Person(val name: String, var age: Int){
        fun introduce(){
            Log.d("KotlinWeek04", "안녕하세요, $name ($age 세)입니다.")
        }
        fun birthday(){
            age++
            Log.d("KotlinWeek04", "$name 의 생일! 이제 $age 세...")
        }
    }
    val person1 = Person("홍길동", 27)
    person1.introduce()
    person1.birthday()

    class Animal(var species: String){
        var weight: Double = 0.0
        constructor(species: String, weight: Double) : this(species){
            this.weight = weight
            Log.d("KotlinWeek04", "$species 의 무게 : $weight kg")
        }
        fun makeSound(){
            Log.d("KotlinWeek04", "$species 가 소리를 냅니다.")
        }
    }
    val puppy = Animal("웰시코기", 10.5)
    puppy.makeSound()
}


private fun week02Functions(){
//    println("Week 02: Functions")
=======
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
    fruits.forEach{fruits -> println("$fruits")}
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
>>>>>>> 5a56584274efc868051d1b48a5f4dac2bc4f6aac
//
//    fun greet(name: String) = "Hello, $name!"
//
//    println(greet("Android developer"))

    println("== Kotlin Functions ==")

<<<<<<< HEAD
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

private fun week02Variables(){
//    println("Week 02: Variables")
//
//    val courseName = "Mobile Programming"
//    //courseName = "IoT Programming"
//    var week = 1
//    week = 2
//    println("Course : $courseName")
//    println("Week : $week")

    println("== Kotlin Variables ==")

    // val(immutable) vs var(mutable)
    val name = "Android"
    var version = 8

    println("Hello $name $version")

    val age: Int = 24
    val height: Double = 177.7
    val isStudent: Boolean = false

    println("Age: $age, Height: $height, Student: $isStudent")

    //var nickname: String = null
    var nickname: String? = null
    nickname = "mirae"
    println("Nickname: $nickname ${nickname?.length}")
}
=======
    fun printAll(vip: Boolean, name: String) {
        println("$vip, $name")
    }

    fun printMany(vararg msg: String) {
        for (m in msg) println(m)
    }

    printAll(name = "mirae", vip = true)
    printMany("A", "B", "C", "D")
}



>>>>>>> 5a56584274efc868051d1b48a5f4dac2bc4f6aac

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