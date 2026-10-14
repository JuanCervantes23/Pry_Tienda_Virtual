package com.example.pry_tienda_virtual.InterfaceApi

import com.example.pry_tienda_virtual.Modelo.dataCategorias
import retrofit2.http.GET

interface ApiService {
    @GET("obtener_categorias.php")
    suspend fun obtenerCategorias(): List<dataCategorias>
}