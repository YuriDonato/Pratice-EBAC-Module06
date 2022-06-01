package com.example.modulo6tarefa

/* Exercicio proposto
//• Para esta atividade vamos modificar o código do exercício anterior
//•     Atividade 1:
//•         Transformar a classe veículo em uma classe abstrata
//•         Criar uma classe carro que estenda a classe veículo
//•         Criar uma classe moto que estenda a classe veículo,
//           com o valor da aceleração de 5
//•     Atividade 2:
//•         Transformar a classe veículo em uma interface
//•         Criar uma classe carro que implemente a interface veículos
//•         Criar uma classe moto que estenda a classe veículo,
//           com o valor da aceleração de 5
//•     Atividade 3:
//•         Crie um lista do tipo veículo
//•         Utilizando a factory crie uma moto e um carro e adicione eles
//           na lista
//•         Percorra a lista e utilize o método de acelerar em cada item dela
//•         Imprima a velocidade de cada veiculo da lista
*/

//   Respostas
/*//Atividade 01
fun main() {
    var carro = Carro("Celta Rebaixado")
    var moto = Moto("Suzuki")

    carro.incrementoVelocidade(5)
    println(carro)
    carro.decrementoVelocidade(-2)
    println(carro)
    carro.decrementoVelocidade(-10)
    println(carro)
    moto.incrementoVelocidade(5)
    println(moto)
    moto.decrementoVelocidade(-2)
    println(moto)
    moto.decrementoVelocidade(-10)
    println(moto)
}

//Classe Veiculo transformada em abstract
abstract class Veiculo(model: String){
    abstract var velocity: Long
    abstract var acceleration: Long
    abstract var model: String
    var andando: Boolean = velocity>0

    fun incrementoVelocidade(velocidade: Long){
        acceleration = velocidade
        velocity += acceleration
        if((velocity-velocidade) >=0){
            andando = true
        }
    }

    fun decrementoVelocidade(velocidade: Long): Long{
        acceleration = velocidade
        velocity += acceleration
        if(velocity <= 0){
            velocity = 0
            andando = false
        }
        return velocity
    }

    override fun toString() = "Modelo: $model em movimento? $andando \nVelocidade: $velocity Aceleracao: $acceleration\n"

}
//Classe Carro que estende classe Veiculo
class Carro(model: String): Veiculo(model){
    override var acceleration: Long = 0
    override var model = model
    override var velocity: Long = acceleration

}
//Classe Moto que estende classe Veiculo com valor de aceleracao 5
class Moto(model: String): Veiculo(model){
    override var acceleration: Long = 5
    override var model = model
    override var velocity: Long = acceleration

}
*/
/*
//Atividade 02

fun main() {
    var carro = Carro("Celta Rebaixado")
    var moto = Moto("Suzuki")

    carro.incrementoVelocidade(5)
    println(carro)
    carro.decrementoVelocidade(-2)
    println(carro)
    carro.decrementoVelocidade(-10)
    println(carro)
    moto.incrementoVelocidade(5)
    println(moto)
    moto.decrementoVelocidade(-2)
    println(moto)
    moto.decrementoVelocidade(-10)
    println(moto)
}
//Transformar classe Veiculo em interface
interface Veiculo{
    var velocity: Long
    var acceleration: Long
    var model: String
    var andando: Boolean

    fun incrementoVelocidade(velocidade: Long){
        acceleration = velocidade
        velocity += acceleration
        if((velocity-velocidade) >=0){
            andando = true
        }
    }

    fun decrementoVelocidade(velocidade: Long): Long{
        acceleration = velocidade
        velocity += acceleration
        if(velocity <= 0){
            velocity = 0
            andando = false
        }
        return velocity
    }
}

//Criar uma classe carro que implemente a interface veículos
class Carro(modelo: String): Veiculo {
    override var acceleration: Long = 0
    override var velocity: Long = acceleration
    override var model: String = modelo
    override var andando: Boolean = velocity>0

    override fun toString() = "Modelo: $model em movimento? $andando \nVelocidade: $velocity Aceleracao: $acceleration\n"
}

//Criar uma classe moto que estenda a classe veículo, com o valor da aceleração de 5
class Moto(modelo: String): Veiculo {
    override var acceleration: Long = 5
    override var velocity: Long = acceleration
    override var model: String = modelo
    override var andando: Boolean = velocity>0

    override fun toString() = "Modelo: $model em movimento? $andando \nVelocidade: $velocity Aceleracao: $acceleration\n"
}
 */
/*
//Atividade 03
fun main() {
    //Factory de veiculo
    val fabrica = VeiculoFactory()
    //Lista de tipo veiculo
    val veiculoList: MutableList<Veiculo> = mutableListOf()

    for(i in 1..2){
        val veiculo = fabrica.criarVeiculo(i,i)
        veiculoList.add(veiculo)
    }

    veiculoList.forEach{
        veiculo ->
            println(veiculo)
            //Percorre e incrementa a velocidade de cada item da lista
            veiculo.incrementoVelocidade(10)
            //Imprime a velocidade de cada item da lista
            println(veiculo)
    }
}

abstract class Veiculo(val id: Int){
    abstract var velocity: Long
    abstract var acceleration: Long
    abstract var model: String
    var andando: Boolean = velocity>0

    fun incrementoVelocidade(velocidade: Long){
        acceleration = velocidade
        velocity += acceleration
        if((velocity-velocidade) >=0){
            andando = true
        }
    }

    fun decrementoVelocidade(velocidade: Long): Long{
        acceleration = velocidade
        velocity += acceleration
        if(velocity <= 0){
            velocity = 0
            andando = false
        }
        return velocity
    }
    override fun toString() = "Modelo: $model em movimento? $andando \nVelocidade: $velocity Aceleracao: $acceleration\n"
}

class Carro(id: Int): Veiculo(id){
    override var acceleration: Long = 0
    override var model: String = "Carro ID: $id"
    override var velocity: Long = acceleration
}

class Moto(id: Int): Veiculo(id){
    override var acceleration: Long = 5
    override var model: String = "Moto ID: $id"
    override var velocity: Long = acceleration
}

class VeiculoFactory{
    fun criarVeiculo(type: Int,id: Int): Veiculo{
        return when(type){
            1 -> Carro(id)
            else -> Moto(id)
        }
    }
}
 */



