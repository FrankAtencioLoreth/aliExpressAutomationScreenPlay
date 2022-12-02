# language: es

  Característica: Realizar compra de artículos
    Como nuevo cliente
    Quiero ingresar a la página www.abc.com
    Para realizar una compra de un artículo

  Escenario: Agregar artículos al carro de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agrega productos al carro
    Entonces el ve los productos listados en el carro de compras

  Esquema del escenario: Agregar artículos al carro de compras
      Dado que un nuevo cliente accede hasta la web de compras
      Cuando el agrega productos al carro
        | <nombreProducto> | <cantidad> |
    Entonces el ve los productos listados en el carro de compras

    Ejemplos:
      | nombreProducto | cantidad |
      | Tapabocas N95  | 20       |