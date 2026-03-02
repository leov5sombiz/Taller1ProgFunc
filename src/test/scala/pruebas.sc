import Recursion.{potencia,balanceado,cambioMonedas,pascal}

// Pruebas Función Potencia
potencia(5,0)
potencia(4,2)
potencia(2,5)
potencia(7,2)
potencia(5,5)

//pruebas Función Pascal
pascal(0,0)
pascal(1,2)
pascal(1,3)
pascal(1,4)
pascal(2,4)

def filaTriangulo(fila:Int) =
  for (col<-0 to fila) yield pascal(col,fila)
filaTriangulo(0)
filaTriangulo(1)
filaTriangulo(2)
filaTriangulo(3)
filaTriangulo(4)

//pruebas Función Balanceado
balanceado(":-)".toList)
balanceado("())(".toList)
balanceado("(if (zero? x) max (/ 1 x))".toList)
balanceado("()()()()()()()()()()()()()()()()()()()()()()()()".toList)
balanceado("Yo le dije (que no esta hecho (aun)). \n (Pero no me escucho)".toList)

//Pruebas Función CambioMonedas
cambioMonedas(4,List(1,2))
cambioMonedas(500,List(100,200))
cambioMonedas(1000,List(100,200))
cambioMonedas(1001,List(100,200))

