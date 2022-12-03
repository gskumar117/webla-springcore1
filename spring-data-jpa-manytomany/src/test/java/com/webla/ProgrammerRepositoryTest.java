package com.webla;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.util.CollectionUtils;

import com.webla.entity.Programmer;
import com.webla.entity.Project;
import com.webla.repos.ProgrammerRepository;
import com.webla.repos.ProjectRepository;

@SpringBootTest
public class ProgrammerRepositoryTest {

	@Autowired
	private ProgrammerRepository programmerRepository;

	@Autowired
	private ProjectRepository projectRepository;

	@Test
	/*
	 * @Transactional
	 * 
	 * @Rollback(false)
	 */
	public void testSaveProgrammer() {
		Programmer programmer = new Programmer();
		programmer.setName("Maithra");
		programmer.setSalary(60000);

		Set<Project> projects = new HashSet<>();

		Project project1 = new Project();
		project1.setName("Hibernate");

		Project project2 = new Project();
		project2.setName("Spring");

		projects.add(project2);
		projects.add(project1);

		programmer.setProjects(projects);

		programmerRepository.save(programmer);

	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void testUpdateProjects() {
		Programmer programmer = new Programmer();
		programmer.setName("Anil");
		programmer.setSalary(80000);

		List<Project> projects = (List<Project>) projectRepository.findAll();
		Set<Project> projectsSet = 
				projects.stream().collect(Collectors.toSet());
		
		Project project = new Project();
		project.setName("Sprng Framework");
		projectsSet.add(project);
		programmer.setProjects(projectsSet);

		programmerRepository.save(programmer);

	}
	
	
}
