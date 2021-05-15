package br.com.brq.mytraininglist.model

class Musica (
    val id: String,
    val nome: String,
    val banda: String,
    val letra: String,
    val ano: Int,
) {

    companion object {

        fun carregarListaMock(): ArrayList<Musica> {
            val lista = arrayListOf<Musica>()
            Musica("1º", "Bohemian Raphsody", "Queen", "Freddie Mercury",1975).let {
                lista.add(it)
            }
            Musica("2º", "Then Bones", "Alice in Chains", "Jerry Cantrell", 1992).let {
                lista.add(it)
            }
            Musica("3º", "Who Says", "John Mayer", "John Mayer", 2009).let {
                lista.add(it)
            }
            Musica("4º", "Losing My Religion", "R.E.M", "Michael Stipe, Bill Berry, Mike Mills, Peter Buck", 1997).let {
                lista.add(it)
            }
            Musica("5º", "Like a Stone", "Audioslave", "Timothy Commerford, Chris Cornell, Tom Morello, Brad Wilk", 2002).let {
                lista.add(it)
            }
            return lista
        }
    }
}