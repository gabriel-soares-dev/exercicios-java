package acc.br.mensagens

import org.springframework.stereotype.Service

@Service
class MensagemService(val db:MensagemRepository){

    fun findMessage(): List<Mensagem> = db.findMessage()

    fun post(mensagem:Mensagem){
        db.save(mensagem)
    } 

    fun put(id: Long,mensagem:Mensagem): Mensagem{
        if (db.existsById(id)){
            return db.save(mensagem)
        }

        return Mensagem()
    }

    fun delete(id: Long){
        if (db.existsById(id)){
            db.deleteById(id)
        }
    }
} 