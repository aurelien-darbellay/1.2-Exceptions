# 1.2-Exceptions

# Nivell 1

Crea una classe anomenada "Producte" amb els atributs nom i preu, i una altra classe anomenada "Venda". Aquesta classe
té com a atributs una col·lecció de productes i el preu total de la venda.

La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada "VendaBuidaException" i
mostra per pantalla “Per fer una venda primer has d’afegir productes” si la col·lecció de productes està buida. Si la
col·lecció té productes, llavors ha de recórrer la col·lecció i guardar la suma de tots els preus dels productes a
l’atribut preu total de la venda.

L’excepció personalitzada "VendaBuidaException" ha de ser filla de la classe Exception. Al seu constructor li hem de
passar el missatge “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, l’hem de mostrar per
pantalla amb el mètode getMessage() de l’excepció.

Escriu el codi necessari per a generar i capturar una excepció de tipus "IndexOutOfBoundsException".

# Nivell 2

Crea una classe anomenada "Entrada". Aquesta classe ha de servir per controlar les diferents excepcions que poden
aparèixer en Java a l’hora d’introduir dades per teclat utilitzant la classe Scanner.

Tots els mètodes reben un String amb el missatge que es vol mostrar a l’usuari/ària, per exemple: “Introdueix la teva
edat”, i retornen la dada oportuna introduïda per l’usuari/ària en cada mètode, per exemple: un byte amb l’edat de
l’usuari/ària.

**Mètodes a implementar capturant l’excepció de la classe "InputMismatchException":**

* public static byte llegirByte(String missatge);
* public static int llegirInt(String missatge);
* public static float llegirFloat(String missatge);
* public static double llegirDouble(String missatge);

**Mètodes a implementar capturant una excepció personalitzada de la classe Exception:**

* public static char llegirChar(String missatge);
* public static String llegirString(String missatge);
* public static boolean llegirSiNo(String missatge), si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari/ària
  introdueix “n”, retorna “false”.

# Nivell 3

Una famosa empresa de cinemes ens ha demanat que desenvolupem una aplicació per a la reserva de seients en els seus
cinemes. L’aplicació serà utilitzada pels venedors/es a l’hora de vendre les entrades.

** Funcionament**

L’aplicació un cop s’hagi iniciat, preguntarà a l’usuari/ària quantes files i quants seients per fila té la sala de
cinema. Un cop introduïdes aquestes dades, es mostrarà el següent menú:

1. Mostrar totes les butaques reservades.
2. Mostrar les butaques reservades per una persona.
3. Reservar una butaca.
4. Anul·lar la reserva d’una butaca.
5. Anul·lar totes les reserves d’una persona.
6. Sortir.

**Arquitectura **

L'aplicació té les classes:

+ Theater: la seva instància representa el cine
+ Seat: cada instància representa una butaca reservada
+ TheaterManagement & SeatManagement: juntament, les seves instàncies representen el sistem de gestió de reserves del
  cine

