package br.com.alura.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.springdata.orm.Cargo;
@Repository
public interface CargoRepository extends JpaRepository<Cargo,Long>{
    
}
