package acc.br.notas.repository

import acc.br.notas.model.Note
import org.springframework.data.repository.CrudRepository

interface NoteRepository : CrudRepository<Note, Long>