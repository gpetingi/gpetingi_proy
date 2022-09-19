package com.portfolio.gp.Repository;

import com.portfolio.gp.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,
  Long> {
  @Query(value = "SELECT * FROM persona LIMIT 1", nativeQuery = true)
  Persona getPerfil();

}
