fun add(a: Int,b: Int):Int{
    return a+b
}
fun sub(a: Int,b: Int):Int{
    return a-b
}
fun mul(a: Int,b: Int):Int{
    return a*b
}
fun div(a: Int,b: Int):Int{
    if(b==0) return 0
    return a/b
}
fun main(){
    println("************ welcome to Calulator*****************")
    print("Enter the first number: ")
    val a=readLine()!!.toInt()
    print("Enter the second number: ")
    val b=readLine()!!.toInt()
    println("choose your choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division")
    val choice=readLine()!!.toInt()
    val res = when (choice) {
        1 -> add(a, b)
        2 -> sub(a, b)
        3 -> mul(a, b)
        4 -> div(a, b)
        else -> {
            println("Invalid choice")
        }
    }
    println("Result:$res")
}
