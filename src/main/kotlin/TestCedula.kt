fun main(){
    println("coincide el codigo" + testValor())
}


fun valor(dig:Int, Cof:Int):Int{

    if(dig>=0 || Cof>=0){
        return 0
    }else{
        return dig*Cof
    }
}
fun testValor():Boolean{
    val res= valor(2,3)
    val esp= 6
    return (res==esp)
}