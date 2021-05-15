package br.com.brq.mytraininglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.mytraininglist.adapter.AdapterDeMusicas
import br.com.brq.mytraininglist.model.Musica

class PrincipalActivity : AppCompatActivity() {

    lateinit private var listaComponente: RecyclerView
    lateinit private var arrayDeMusica: ArrayList<Musica>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

//  Carregar lista de produtos
        arrayDeMusica = Musica.carregarListaMock()

//  Componente (RecyclerView)
//        -> Adapter
//            -> ViewHolder -> (Manipula cada item da lista - linha)
        listaComponente = findViewById(R.id.componente_da_lista)
        listaComponente.adapter = AdapterDeMusicas(arrayDeMusica, this)
        listaComponente.layoutManager = LinearLayoutManager(this)
    }
}