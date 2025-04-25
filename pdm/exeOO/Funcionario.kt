package pdm.exeOO

abstract class Funcionario(val nome:String, var salarioBase:Double) {

    open fun salarioTotal() {
        println("Salário do funcionário $nome é $salarioBase")
    }

}