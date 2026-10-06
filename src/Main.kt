fun main(){

    var opcion: Int?

    do{
        println("===== CALCULADORA =====")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Resto")
        println("6. Salir")
        println("Seleccione una opción")

        opcion = readln().toIntOrNull()

        if(opcion == null || opcion <1 || opcion > 6){
            println("Error. Tienes que introducir un número valido")
            continue

        }else if (opcion != 6){

            println("Introduce el primer número: ")
            var numero1 = readln().toDoubleOrNull()
            while (numero1 == null) {
                println("Error: tienes que introducir un número válido")
                println("Introduce el primer número: ")
                numero1 = readln().toDoubleOrNull()
            }

            println("Introduce el egundo número: ")
            var numero2 = readln().toDoubleOrNull()

            while (numero2 == null) {
                println("Error: tienes que introducir un número válido")
                println("Introduce el segundo número: ")
                numero2 = readln().toDoubleOrNull()
            }

            when (opcion){
                1-> println("El resultado de la suma es: ${numero1+numero2}")
                2-> println("El resultado de la resta es: ${numero1-numero2}")
                3-> println("El resultado de la multiplicar es: ${numero1*numero2}")
                4-> {
                    if(numero2 == 0.0){
                            println("Error: no se puede dividir entre cero")
                    }else{
                        println("El resultado de la división es: ${numero1/numero2}")
                    }

                }
                5-> {
                    if(numero2 == 0.0){
                        println("Error: no se puede calcular el resto entre cero")
                    }else{
                        println ("El resultado del resto es: ${numero1%numero2}")
                    }

                }
            }
        } else {
            println("Saliendo de la calculadora...")
    }
    }while( opcion !=6)

}