package com.example.pry_tienda_virtual.Modelo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class dataCategorias(
    @SerialName("id") val id:Int=0,
    @SerialName("categoria") val categoria: String=""
)
{
    override fun toString(): String {
        return categoria
    }
}
