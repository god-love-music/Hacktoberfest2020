class person(
    val name:String,
    val age:Int,
    val height:Double,
    val weight:Double,
    val sex:String
){
    fun greet(){
        println("Hi!! my name is $name")
    }

    fun tall(){
        if (height >= 180){
            print("i am tall ")
        } else {
            print("i am short ")
        }
    }

    fun mySex(){
        if (sex=="male"){
            println("and i am a man")
        }else{
            println("and i am a girl")
        }
    }
}

fun main(){
    val person_1 = person(
        name = "Jane",
        age = 18,
        height = 183.67,
        weight = 65.3,
        sex = "female"
    )

    println("""
        name : ${person_1.name}
        age : ${person_1.age}
        height : ${person_1.height}
        weight : ${person_1.weight}
        gender : ${person_1.sex}
    """.trimIndent())

    person_1.tall()
    person_1.mySex()
    person_1.greet()

    println()

    val person_2 = person(
        name = "John",
        age = 25,
        height = 172.67,
        weight = 70.3,
        sex = "male"
    )

    println("""
        name : ${person_2.name}
        age : ${person_2.age}
        height : ${person_2.height}
        weight : ${person_2.weight}
        gender : ${person_2.sex}
    """.trimIndent())

    person_2.tall()
    person_2.mySex()
}