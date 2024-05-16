package acc.br.mensagens

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface MensagemRepository : CrudRepository<Mensagem, String>{

    @Query(value="select id,text from Mensagem", nativeQuery = true)
    fun findMessage(): List<Mensagem>
}