package br.com.zallpy.technicalevaluation.dto;

import java.util.List;

import br.com.zallpy.technicalevaluation.model.Project;
import br.com.zallpy.technicalevaluation.model.User;

public class UserDTO {

	private User user;

	public UserDTO(User user) {
		this.user = user;
	}

	public int getId() {
		return user.getId();
	}

	public String getName() {
		return user.getName();
	}

	public List<Project> getProjects() {
		return user.getProjects();
	}

}
