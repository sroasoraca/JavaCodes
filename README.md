# JavaCodes
This section is about my Java Codes that i builded in the university.


The next code is for solve a problem that is about:

Problema E
Descripción del problema
Master Chef es un programa de televisión gastronómico que busca al mejor
cocinero amateur de Colombia. Fabián, un participante con suerte ha llegado a la
final del concurso y debe pasar su última prueba. Fabián debe tomar la posición de
un gerente de Crepes and Waffles, un restaurante que atiende a las personas con
diferentes platos muy deliciosos. Es un lugar muy famoso y la gente siempre está
haciendo fila para obtener uno de los platos. Cada plato tiene un costo asociado.
Debido a las reglas del concurso, el restaurante cambia la forma en que se entregan
los platos a los clientes. Un cliente selecciona un plato e inmediatamente dicho plato
es preparado y colocado en la parte superior de una torre con todos los platos
preparados hasta el momento, cuando un cliente quiere el plato se le entrega el que
se encuentra en la parte superior de la torre. Debido a este modo tan extraño de
entregar los pedidos, los clientes no recibirán siempre el plato que ellos eligieron.
Los platos se mantienen en una pila. La tarea de Fabián es manejar dos tipos de
consultas:
1. Consulta de un cliente: Cuando un cliente quiere un plato, se debe entregar el
que se encuentra en la parte superior de la pila y el cliente se debe pagar el
costo del plato servido. En caso de que la pila esté vacía, el cliente se va con
las manos vacías.
2. Preparar un plato: Fabián prepara un plato de alimentos y es añadido a la
parte superior de la pila con su respectivo costo.
Su tarea consiste en ayudar a Fabián a cumplir con esta tarea.
Entrada
La primera línea del es un número Q que representa la cantidad consultas que
siguen. Q líneas siguen con el siguiente formato:
Consulta 1: Se indica por medio del número 1 en una sola línea
Consulta 2: Se indica por medio de 2 números separados por espacios ( 2 y c )
donde c indica el costo del nuevo plato.
Restricciones/Consideraciones
● 0 < Q < 1000000
● 1≤ C ≤10000000
Salida
Por cada consulta del tipo 1 se debe imprimir el costo del plato, en caso de no haber
platos se debe imprimir ‘No Food’. La consulta 2 no debe imprimir ningún mensaje.
Ejemplo de Entrada Ejemplo de Salida
6
1
25
27
29
1
1
NoFood
9
7
Ejemplo de Entrada Ejemplo de Salida
10
1
25
27
29
1
1
1
1
21
1
NoFood
9
7
5
NoFood
1

Problema B
Descripción del problema
Un nuevo juego de cartas se está volviendo popular entre estudiantes, el juego es
jugado siempre por K personas y se desarrolla de la siguiente manera:
Se comienza con un mazo de N cartas, el jugador 1 debe retirar la carta mayor de
uno de los extremos del mazo (arriba o abajo), luego el jugador 2 retira nuevamente
la carta mayor de las dos posibilidades que queden en los extremos. Este proceso
se repite hasta llegar al jugador K. Luego se vuelve a comenzar con el jugador 1. El
juego termina cuando se acaban las cartas del mazo. El ganador del juego es quien
al finalizar el mazo de cartas consiga una suma mayor que la de los demás
participantes.
Luego de conocer el juego, los estudiantes de estructuras de datos se percatan que
el juego no tiene sentido y es posible saber quién ganará el juego dado el mazo y el
número de jugadores por medio de un robot. Su tarea consiste en la construcción de
este robot que permita saber el ganador de cada juego.
NOTA: En caso de existir empate en las cartas de los extremos se debe seleccionar
la carta que se encuentra a la Derecha.
Entrada
La primera línea es un número T que representa la cantidad de casos de prueba.
Cada caso de prueba inicia con una línea con dos enteros N, K que representan la
cantidad de cartas en el mazo y la cantidad de jugadores respectivamente. La
segunda línea de cada caso de prueba contiene N números Pi separados por
espacios que representan los valores de las cartas.
Restricciones/Consideraciones
● 0 < T < 1000
● 1 ≤ N ≤ 100000
● 1 ≤ K ≤ 100000
● 1 ≤ Pi ≤ 1000
Salida
Por cada caso de prueba se debe imprimir el ganador del juego, en caso de haber
empate entre 2 o más jugadores, se debe imprimir todos los jugadores en empate
separados por espacios y ordenados de menor a mayor.
Ejemplo de Entrada Ejemplo de Salida
4
42
1234
46
1111
62
2103211
22
11
Caso#1:
1
Caso#2:
1234
Caso#3:
2
Caso#4:
12
