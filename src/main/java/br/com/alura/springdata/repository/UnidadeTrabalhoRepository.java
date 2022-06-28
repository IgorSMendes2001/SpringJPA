package br.com.alura.springdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.springdata.orm.UnidadeTrabalho;

@Repository
public interface UnidadeTrabalhoRepository extends JpaRepository<UnidadeTrabalhoRepository,Long>{

    void save(UnidadeTrabalho unidadeTrabalho);
    
}
