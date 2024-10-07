## Ej 1

### a)

74 mutantes

| Mutator              | Cantidad de mutantes |
| -------------------- | -------------------- |
| ConditionalsBoundary | 3                    |
| Math                 | 5                    |
| NegateConditions     | 9                    |
| FalseConditionals    | 10                   |
| TrueConditionals     | 10                   |
| MinusOneConstant     | 8                    |
| OneConstant          | 6                    |
| ZeroConstant         | 5                    |
| EmptyReturns         | 3                    |
| FalseReturns         | 4                    |
| NullReturns          | 2                    |
| TrueReturns          | 6                    |
| Increments           | 3                    |
| Total                | 74                   |

### b)

Los que generaron más fueron TrueConditionals y FalseConditionals. Esto probablemente se debe a la gran cantidad de ifs en el código, dado que dichos operadores de mutación reemplazan las condiciones de ifs por true y false. Esto lo respalda que NegateConditions,que cambia las condiciones por su opuesto, haya generado 9 mutantes, casi la misma cantidad que TrueConditionals y FalseConditionals.

### c)

El que generó menos fué NullReturns. Esto probablemente se debe a que este operador sólo altera los retornos de objetos, y en StackAr son pocos los métodos que devuelven un objeto en el returns.

## Ej2

| Test suite  | Vivos | Muertos | Score |
| ----------- | ----- | ------- | ----- |
| StackTests1 | 55    | 19      | 25%   |
| StackTests2 | 38    | 36      | 48%   |

## Ej 3

### a)

93%

### b)

Vivos: 5  
Muertos: 69

### c)

- StackArMutated6302 (FalseConditionalsMutator: Se reemplazó this == obj por false en la línea 96.)  
  El if de la linea 96 puede ganar performance pero no cambia la decisión de si se devuelve true o false, ya que si los stacks son la misma variable, igualmente dará true al comparar los elementos (por invariante del stack).
- StackArMutated19 (MathMutator: Se reemplazó * por / en la línea 89.)  
  Reemplazar * 1 por / 1 no cambia nada, x * 1 = x / 1 para todo x.
- StackArMutated3933 (FalseConditionalsMutator: Se reemplazó isEmpty() por false en la línea 69.)  
  El chequeo de que el stack no esté vacío (en cuyo caso se debe arrojar una excepción ante cualquier intento de acceder al tope de pila) se vuelve a hacer en .top(), por lo que incluso si el stack estuviera vacío y el operador de mutación hace que se saltee ese chequeo, la excepción se acaba arrojando igual.
- StackArMutated7656 (FalseConditionalsMutator: Se reemplazó readIndex != other.readIndex por false en la línea 105.)  
  Los readIndex no pueden ser distintos si los elements son iguales por invariante de stack (si la cantidad de elementos es la misma, el puntero a tope de pila debería tener el mismo valor). Como el chequeo de que tengan los mismos elementos se hace antes, este if es completamente redundante.
- StackArMutated7687 (TrueReturnsMutator: Se reemplazó false por true en la línea 106.)  
  Por misma razon que el anterior, nunca entra en el if.

### d)

59%

### e)

StackArMutated687 (TrueConditionalsMutator: Se reemplazó capacity < 0 por true en la línea 19.)
Este mutate hace que siempre se tire error al crear el stack (pues reemplaza el chequeo que hace que se arroje una excepción ante una capacidad no válida por true, haciendo que siempre se arroje una excepción), por lo que no permite ejecutar el resto de instrucciones del stack

## 4

### a)

373

### b)

No

### c)

100%

## 5

### a)

382 tests fallaron. Todos los fallos se debían a que no se ponía en null el valor del stack al hacer un pop antes de decrementar el readIndex (lo cual no cumple con el tercer item del invariante dado, que dice que todos los elementos mayores a readIndex deben ser null).
Ningún otro test falló al corregir el problema y repetir el proceso

### b)

81%

### c)

79%
