package datahora

class Pessoa {
    String nome
    String emailDoCidadao
    Integer cepDoCidadao
    String estadoDoCidadao
    static constraints = {
        nome inList: ["Walter", "Carlos", "Joaquim"]
        emailDoCidadao email: true, nullable: true
        cepDoCidadao min: 80000, max: 89999, nullable: true
        estadoDoCidadao (validator:{ value, object ->
            if (!["RS","SC","PR"].contains(value)) {
                return "custom.erro.finalSemana"
			}
        })
    }
}
