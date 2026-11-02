#language: es
@testfeature
Característica: Product - Store

  @test
  Escenario: Validación del precio de un producto
    Dado estoy en la página de la tienda
    Y me logueo con mi correo "correodepruebas@gmai.com" y clave "wilsonra123456789"
    Cuando navego a la categoria Clothes y subcategoria Men
    Y agrego 2 unidades del primer producto al carrito
    Entonces valido en el popup la confirmación "Producto añadido correctamente a su carrito de compra" del producto agregado
    Y valido en el popup que el monto total sea calculado correctamente
    Cuando finalizo la compra
    Entonces valido el titulo de la pagina del "CARRITO"



      

