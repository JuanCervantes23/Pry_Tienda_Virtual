package com.example.pry_tienda_virtual.InterfaceApi

import com.example.pry_tienda_virtual.Modelo.dataCategorias
import com.example.pry_tienda_virtual.Modelo.dataImagenesProducto
import com.example.pry_tienda_virtual.Modelo.dataProductos
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("obtener_categorias.php")
    suspend fun obtenerCategorias(): List<dataCategorias>

    @GET(value = "obtener_productos.php")
    suspend fun obtenerProductos(@Query(value = "categoria_id") categoriaId: Int): List<dataProductos>

    @GET(value = "detalle_producto.php")
    suspend fun detalleProducto(@Query(value = "producto_id") productoId: Int): List<dataImagenesProducto>
}