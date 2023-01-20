import java.util.function.BinaryOperator

fun main(){
    println("testValidateCodeTrue"+testValidateCodeTrue())
    println("testValidateCodeFalse"+testValidateCodeFalse())
}
fun validateCode (valor: String): Boolean{
    val codigo = "768"
    return valor.substring(0,3) == codigo
}

fun testValidateCodeTrue(): Boolean{
    val res=validateCode("76859748648")
    val esp= true
    return (res == esp)
}

fun testValidateCodeFalse(): Boolean{
    val res=validateCode("76859748648")
    val esp= false
    return (res == esp)
}
