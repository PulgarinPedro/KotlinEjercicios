fun main(){
// llamar  a las funciones test
    println("Prueba 1 paso:"+dashSeparateTest())
    println("Prueba 2 paso:"+sizeLicPlateTest())
    println("Prueba 3 paso:"+ getProvinceTest())
}

//CODIGO


fun sizeLicPlate(licPlate: String):Boolean{
    val size = 8
    val  placa = licPlate.length
    return placa == size
}
fun dashSeparate(licPlate: String):Boolean{
    val guion = "-"
    return licPlate.substring(3,4) == guion
}
fun getProvince(licPlate: String):String{
    val provincia = when (licPlate.substring(0,1)){
        "A" -> ("Azuay")
        "E" -> ("Esmeralda")
        "M" -> ("Manabi")
        else -> "Desconocido"
    }
    return (provincia)
}

//TEST

//Ejemplo
fun sizeLicPlateTest(): Boolean {
    val res = sizeLicPlate("AAA-8989")
    val esp= true
    return ( esp == res)
}
fun dashSeparateTest(): Boolean {
    val res = dashSeparate("AAA-8989")
    val esp= true
    return ( esp == res)
}

fun getProvinceTest(): Boolean {
    val esp = "Azuay"
    val res = getProvince("AAA-8989")
    return( esp == res)
}