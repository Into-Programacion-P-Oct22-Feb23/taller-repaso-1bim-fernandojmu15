# taller-repaso-1bim

* Genere una solución en JAVA que permita generar el valor a cancelar de los empleados de una empresa.
El programa debe ingresar el número de empleados, hasta que el usuario decida lo contrario. Por cada empleado se debe preguntar nombre, cédula, horas trabajadas matutinas, horas trabajadas nocturnas, ciudad de la empresa. Existe un valor fijo por hora trabajada; hora matutina valor $10, hora nocturna valor $15. Según la regulación del país de la empresa; si el número de horas trabajadas por la noche es mayor o igual 10, cada hora nocturna trabajada tendrá un adicional del 10% de su valor original.
El sueldo final a cancelar de cada trabajador será la suma de los valores de las horas matutinas y nocturnas trabajadas, menos el valor de seguro social (considerar el 18% de la suma de las horas matutinas y nocturnas trabajadas)

La solución tendrá la siguiente salida, por ejemplo.

```
Nómina de Trabajadores

Rol del trabajador de nombre Jośe Suarez y cédula 10001.
  Horas matutina trabajadas: 20.
  Horas nocturnas trabajadas: 20.
  Subtotal $530
  Seguro Social $95,4
  Total a cancelar $434,6

Rol del trabajador de nombre Marco Duarte y cédula 21020.
  Horas matutina trabajadas: 10.
  Horas nocturnas trabajadas: 9.
  Subtotal a cancelar $235.
  Seguro Social $42.3
  Total a cancelar $192.7

Número de empleados 2
```
