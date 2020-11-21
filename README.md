# UMB_APP_SISDIS_202
Desarrollo de una app distribuida por medio de microservicios en apache kafka

Documentación Api

EndPoints

POST: /addItem
Me permite agregar un ítem a mi carrito de compras.

Parámetros:

topic:	el topic del bróker

idCart:	el id del carrito de compras que le pertenece a un único usuario

product:	Objeto de tipo produto

GET: /showCart
Me retorna todos los ítems que tiene el carrito de compras.

Parámetros:

topic:	el topic del bróker

idCart:	el id del carrito de compras que le pertenece a un único usuario

GET: /confirmarCompra
Me retorna todos los ítems que tiene el carrito de compras con el precio total de estos ítems.

Parámetros:

topic:	el topic del bróker

idCart:	el id del carrito de compras que le pertenece a un único usuario

DELETE: /deleteItemCart
Elimina un ítem especifico del carrito de compras.

Parámetros:

topic:	el topic del bróker

idCart:	el id del carrito de compras que le pertenece a un único usuario

idProduct:	El id del produto a eliminar

DELETE: /deleteAllItems
Elimina todos los ítems que contiene el carrito de compras.

Parámetros:

topic:	el topic del bróker

idCart:	el id del carrito de compras que le pertenece a un único usuario

Integrantes:
Edison Armando Sanchez Avendaño y
Stewar Bonikson Piñeros
