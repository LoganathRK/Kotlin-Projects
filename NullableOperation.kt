    fun Display(name: String?="Default Name",age: Int?=0,email: String?="Default Email"){
        val Name=name?.uppercase()?:"Name is not provided"
        val Age=age?.let{"Age   : $it"}?:"Age is not given"
        val Email=email?.let{"Email:$it"}?:"Email is empty"
        println("---- User Profile ----\n")
        println("Name  : $Name")
        println(Age)
        println("Email : $Email")
        println()
        println("*************End of the Program***************")
        println()
    }
    fun main(){
        Display("loganath",20,"rkloganath22@gmail.com")
        Display("loganath",20)
        Display("loganath")
        Display()
    }
