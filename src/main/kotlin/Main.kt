fun main() {


    var num = 0
    var par = 0
    var impar = 0

    for (i in 1..10) {
        print("Digite um número: ")
        num = readLine()!!.toInt()

        if (num % 2 == 0) {
            par++
        } else {
            impar++
        }
    }

    println("A quantidade de número pares é: $par")
    println("A quantidade de número ímpares é: $impar")

}






