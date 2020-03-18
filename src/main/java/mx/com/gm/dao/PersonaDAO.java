package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends JpaRepository<Persona, Long>{ 
    /* Al extender de CRUDREPOSITORY no es necesario crear una implementación.
    Implementa automaticamente los métodos:
        - Save
        - SaveAll
        - findById
        - existsById
        - findAll
        - findAllById
        - count
        - deleteById
        - delete
        - deleteAll
    
    Dentro de esta interface, podemos agregar métodos personalizados ademas de los métodos por default.
    
    */
}
