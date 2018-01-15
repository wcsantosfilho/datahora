package datahora

class Estado {
    String siglaEstado
    String nomeEstado
    static constraints = {
        siglaEstado inList: ["RS", "SC", "PR"]
        nomeEstado size: 8..50
    }
}
