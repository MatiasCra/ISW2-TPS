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

Los que generaron más fueron TrueConditionals y FalseConditionals

### c)

El que generó menos fué NullReturns

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
  El if de la linea 96 puede ganar performance pero no cambia la decicion de si se devuelve true o false ya que si los stacks son la misma variable igualmente dará true al comparar los elementos.
- StackArMutated19 (MathMutator: Se reemplazó _ por / en la línea 89.)
  Reemplazar _ 1 por / 1 no cambia nada
- StackArMutated3933 (FalseConditionalsMutator: Se reemplazó isEmpty() por false en la línea 69.)
  El chequeo se vuelve a hacer en .top()
- StackArMutated7656 (FalseConditionalsMutator: Se reemplazó readIndex != other.readIndex por false en la línea 105.)
  Los readIndex no pueden ser distintos si los elements son iguales, chequeo que se hace antes y si son distintos entra en otro return
- StackArMutated7687 (TrueReturnsMutator: Se reemplazó false por true en la línea 106.)
  Por misma razon que el anterior, nunca entra en el if

### d)

59%

### e)

StackArMutated687 (TrueConditionalsMutator: Se reemplazó capacity < 0 por true en la línea 19.)
Este mutate hace que siempre se tire error al crear el stack por lo que no permite ejecutar el resto de instrucciones del stack

## 4

### a)

373

### b)

No

### c)

100%

## 5
### a)
17 tests fallaron