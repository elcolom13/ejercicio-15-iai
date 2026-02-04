md
# ejercicio-15-iai
```java
programa Cap2Ejemplo15
areas
  ciudad: AreaC(1,1,100,100)
robots
  robot robot1
  comenzar
    derecha
    repetir 49
      mientras ((~HayFlorEnLaEsquina)&(HayPapelEnLaEsquina))
        repetir 2
          mover
      si((HayFlorEnLaEsquina)&(~HayPapelEnLaEsquina))
        repetir 3
          derecha
        repetir 4
          mover
          derecha
        derecha
        mover
        mover
      repetir 2
        mover
  fin
variables
  Rinfo: robot1
comenzar
  AsignarArea(Rinfo,ciudad)
  Iniciar(Rinfo,1,1)
fin
