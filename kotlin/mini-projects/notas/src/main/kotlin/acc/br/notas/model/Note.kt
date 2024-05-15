package acc.br.notas.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Note(@Id
           @GeneratedValue
           val id: Long = 0L,
           val title: String = "",
           val description: String = "")