fun main(){
        school()
        println(sentence("Atarah",23))
        println(length("Nairobi"))
        println(conditions("Atarah"))
        println(conditions("Ann"))


    }
    fun school(){
        val school = "akiraChix"
        println("${school[0]}${school[2]}${school[3]}")

    }

    fun sentence(name: String,age: Int ): String{
        return ("Hi,my name is $name and I am $age years old")
    }
    fun length(name: String): Int{
        return name.length
    }
    fun conditions(name: String) {
        var me = "Atarah"
        if (name== me) {
            println("Thats me")
        } else {
            println("I dont know who that is")
        }
    }








