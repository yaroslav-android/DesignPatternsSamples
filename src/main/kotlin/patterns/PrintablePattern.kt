package team.idivision.samples.designpatterns.patterns


interface PrintablePattern<P : Pattern> {
    fun P.print()
}