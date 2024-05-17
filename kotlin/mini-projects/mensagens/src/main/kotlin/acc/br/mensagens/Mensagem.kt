package acc.br.mensagens

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
@Table
data class Mensagem(
    @Id
    @GeneratedValue
    val id: Long = 0L,
    val text: String = "",
)