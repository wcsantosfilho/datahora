package datahora

p1 = new Pessoa(nome: "Walter", emailDoCidadao: "wcsantosfilho@gmail.com", 
cepDoCidadao: 88000, estadoDoCidadao: "PR")
if (!p1.save(flush: true)) { println "Erro no save da pessoa!" }

r1 = new RegAlmoco(dataRegistro: "2015-05-02 06:02:02.00", tipoRegistro: 'A',
pessoa: p1, comida: "Xuxu")
if (!r1.save(flush: true)) { println "Erro no save!" }
r2 = new RegJantar(dataRegistro: "2015-05-02 08:03:02.00", tipoRegistro: 'B',
pessoa: p1, bebeu: "Vinho")
if (!r2.save(flush: true)) { println "Erro no save do jantar!" }


rr = Registro.findAll()
rr.each {
//println "${it} - ${it.tipoRegistro}"

if (it.instanceOf(RegAlmoco)) {
    println "Data: ${it.dataRegistro}, ${it.comida}"
    } 
if (it.instanceOf(RegJantar)) {
    println "Data: ${it.dataRegistro}, ${it.bebeu}"
    }

}
