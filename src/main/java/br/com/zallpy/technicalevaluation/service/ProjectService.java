package br.com.zallpy.technicalevaluation.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.zallpy.technicalevaluation.dto.ProjectDTO;
import br.com.zallpy.technicalevaluation.repository.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

	public List<ProjectDTO> list() {
		return projectRepository.findAll().stream().map(ProjectDTO::new).collect(Collectors.toList());
	}

}
