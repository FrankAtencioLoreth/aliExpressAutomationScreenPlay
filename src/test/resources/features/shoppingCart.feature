# language: es

  Característica: Realizar compra de articulos
    Como nuevo cliente
    Quiero ingresar a la página www.abc.com
    Para realizar una compra de un articulo

  Antecedentes:
    Dado que un nuevo cliente BOT accede hasta la web de compras

  @EscenarioSinDatos
  Escenario: Agregar articulos al carro de compras
    Cuando el agrega 3 unidades el producto Tapabocas KN95 de Belleza y salud al carro
    Entonces el ve los productos listados en el carro de compras

  @EscenarioConDatos
  Esquema del escenario: Agregar articulos al carro de compras
      Cuando el agrega productos al carro
        | <cantidad> | <nombreProducto> | <categoria> |
    Entonces el ve los productos listados en el carro de compras

    Ejemplos:
      | cantidad | nombreProducto                                 | categoria       |
      | 3        | sombrero pescador hombre                       | Belleza y salud |
      | 2        | juego de escoba                                | Belleza y salud |
      | 5        | Funda de silicona Original oficial para iPhone | Belleza y salud |
