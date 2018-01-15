package datahora

class Registro {
    Date dataRegistro
    String tipoRegistro
    static belongsTo = [pessoa: Pessoa]
    static constraints = {
        tipoRegistro inList: ['A','B','C']
    }
}