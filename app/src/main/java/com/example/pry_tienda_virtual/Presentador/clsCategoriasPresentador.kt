package com.example.pry_tienda_virtual.Presentador

import com.example.pry_tienda_virtual.Modelo.clsCategoriasModelo
import com.example.pry_tienda_virtual.Modelo.dataCategorias
import com.example.pry_tienda_virtual.Vista.MainActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

// Reemplaza esto:
// class clsCategoriasPresentador {

// Por esto (asegúrate de importar MainActivity si el editor te lo pide):
class clsCategoriasPresentador(private val vista: MainActivity) {
    private val modelo = clsCategoriasModelo()
    private var listaCategorias: List<dataCategorias> = emptyList()

    fun iniciar() {

        // Se usa un Scope simple para no bloquear la interfaz
        CoroutineScope(Dispatchers.Main).launch {
            try {
                // Aquí recibes el RETURN directo del modelo
                listaCategorias = modelo.obtenerCategorias()
                vista.mostrarCategorias(listaCategorias)

            } catch (e: Exception) {
                vista.mostrarError("Error: " + e.localizedMessage)
            }
        }
    }

    fun seleccionarCategoria(posicion: Int) {
        if (posicion > 0 && posicion < listaCategorias.size) {
            val categoria = listaCategorias[posicion]
            vista.mostrarMensajeExito(categoria.id, categoria.categoria)
        }
    }
}