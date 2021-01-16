package br.com.zallpy.technicalevaluation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zallpy.technicalevaluation.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
