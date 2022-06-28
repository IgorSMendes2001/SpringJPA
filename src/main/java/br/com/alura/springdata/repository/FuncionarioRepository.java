package br.com.alura.springdata.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.alura.springdata.orm.Funcionario;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Long>{
    List<Funcionario>findByNome(String nome);
    @Query("SELECT f FROM Funcionario f WHERE f.nome = :nome AND f.salario >= :salario AND f.dataContratacao = :data")
    List<Funcionario>findNomeDataContratacaoSalarioMaior(String nome,Double salario,LocalDate data);
}
