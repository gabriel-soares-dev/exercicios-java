package acc.br.mensagens

import org.springframework.web.bind.annotation.*

@RestController
class MensagemResource(val service: MensagemService){

    @GetMapping
    fun index(): List<Mensagem> = service.findMessage()

    @PostMapping
    fun post(@RequestBody message:Mensagem){
        service.post(message)
    }

    @PutMapping("{id}")
    fun put(@PathVariable id: Long, @RequestBody message:Mensagem):Mensagem {
        return service.put(id, message)
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) {
        service.delete(id)
    }

}