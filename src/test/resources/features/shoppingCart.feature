# language: es

  Característica: Realizar compra de articulos
    Como nuevo cliente
    Quiero ingresar a la página www.abc.com
    Para realizar una compra de un articulo

  @EscenarioSinDatos
  Escenario: Agregar articulos al carro de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agrega 3 unidades el producto Tapabocas N95 de Belleza y salud al carro
    Entonces el ve los productos listados en el carro de compras

  @EscenarioConDatos
  Esquema del escenario: Agregar articulos al carro de compras
      Dado que un nuevo cliente accede hasta la web de compras
      Cuando el agrega productos al carro
        | <nombreProducto> | <cantidad> |
    Entonces el ve los productos listados en el carro de compras

    Ejemplos:
      | nombreProducto | cantidad |
      | Tapabocas N95  | 20       |