import Recursion.{potencia,balanceado,cambioMonedas,pascal}

// Pruebas Función Potencia
potencia(5,0)
potencia(1,10)
potencia(2,5)
potencia(7,2)
potencia(5,5)

//pruebas Función Pascal
pascal(1,2)

def filaTriangulo(fila:Int) =
  for (col<-0 to fila) yield pascal(col,fila)
filaTriangulo(0)
filaTriangulo(1)
filaTriangulo(2)
filaTriangulo(3)
