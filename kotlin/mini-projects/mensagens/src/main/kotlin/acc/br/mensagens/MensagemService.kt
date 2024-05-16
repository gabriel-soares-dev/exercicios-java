package acc.br.mensagens

import org.springframework.stereotype.Service

@Service
class MensagemService(val db:MensagemRepository){

    fun findMessage(): List<Mensagem> = db.findMessage()

    fun post(mensagem:Mensagem){
        db.save(mensagem)
    } 
}