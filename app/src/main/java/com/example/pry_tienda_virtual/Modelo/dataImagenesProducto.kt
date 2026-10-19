package com.example.pry_tienda_virtual.Modelo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class dataImagenesProducto(
    @SerialName(value = "id") val id: Int = 0,
    @SerialName(value = "producto_Id") val productoId: Int = 0,
    @SerialName(value = "url_imagen") val urlimagen: String = "",
    )
