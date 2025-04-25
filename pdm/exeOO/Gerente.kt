package pdm.exeOO

class Gerente(nome:String, salarioBase:Double, val bonus:Double): Funcionario(nome, salarioBase) {

    override fun salarioTotal() {
        salarioBase += bonus
        println("Salário do funcionário $nome é $salarioBase")
    }
}

fun main(){
    val f1:Funcionario = Funcionario("Ivan Ilitch", 1912);
    f1.salarioTotal();
    val g2:Gerente = Gerente("Nicholas Sparks", 1583, 359);
    g2.salarioTotal();

}