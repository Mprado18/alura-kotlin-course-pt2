fun testaSet() {
    val assistaramCursoAndroid = setOf("Marcos", "Angie", "Winky", "Erlete")
    val assistiramCursoKotlin = setOf("Marcos", "Erlete")
//    val assistiramAmbos: Set<String> = assistaramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistaramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos)

    println(assistaramCursoAndroid.union(assistiramCursoKotlin))
    println(assistiramCursoKotlin union assistaramCursoAndroid) //usando infix
    println(assistaramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoKotlin subtract assistaramCursoAndroid)
    println(assistiramCursoKotlin intersect assistaramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Marcos")
    println(assistiramList)
    println(assistiramList.toSet())
}