package br.com.brq.mytraininglist.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.mytraininglist.R
import br.com.brq.mytraininglist.model.Musica

class AdapterDeMusicas (val arrayDeMusica: ArrayList<Musica>, val context: Context) :
    RecyclerView.Adapter<ViewHolderItemMusica>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItemMusica {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.card_view_musicas, parent, false)
        return ViewHolderItemMusica(view)
    }

    override fun onBindViewHolder(holder: ViewHolderItemMusica, position: Int) {
        arrayDeMusica[position].apply {
            holder.textViewIdMusica.text = this.id
            holder.textViewNomeMusica.text = this.nome
            holder.textViewBandaMusica.text = this.banda
            holder.textViewLetraMusica.text = this.letra
            holder.textViewAnoMusica.text = this.ano.toString()
        }
    }

    override fun getItemCount(): Int {
        return arrayDeMusica.size
    }
}
