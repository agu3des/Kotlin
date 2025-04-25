package pdm.exeOO

open class Veiculo(val marca:String, val modelo:String) {

    open fun exibirInfo() {
        println("Marca: $marca | Modelo: $modelo")
    }

}
