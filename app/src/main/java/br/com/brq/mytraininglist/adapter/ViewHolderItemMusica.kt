package br.com.brq.mytraininglist.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.brq.mytraininglist.R

class ViewHolderItemMusica (view: View) : RecyclerView.ViewHolder(view){

    var textViewIdMusica: TextView
    var textViewNomeMusica: TextView
    var textViewBandaMusica: TextView
    var textViewLetraMusica: TextView
    var textViewAnoMusica: TextView

    init{
        textViewIdMusica = view.findViewById(R.id.textViewIdMusica)
        textViewNomeMusica = view.findViewById(R.id.textViewNomeMusica)
        textViewBandaMusica = view.findViewById(R.id.textViewBandaMusica)
        textViewLetraMusica = view.findViewById(R.id.textViewLetraMusica)
        textViewAnoMusica = view.findViewById(R.id.textViewAnoMusica)
    }
}