package com.webla.student.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.webla.student.entity.StudentInfo;

@Repository
public interface StudentRepository 
extends CrudRepository<StudentInfo, Integer>{

	@Query(value = "from StudentInfo")
	List<StudentInfo> findAllStudents();
	
	@Query(value = "select firstName,lastName from StudentInfo")
	List<Object[]> findFirstnameAndLastName();
	
	@Query(value = "from StudentInfo where firstName=:name")
	List<StudentInfo> findStudentByName(@Param("name") String firstName);
	
	@Query(value = "from StudentInfo where score>:min and score<:max")
	List<StudentInfo> findStudentByScore(@Param("min") int minScore, @Param("max")int maxScore);	
	
	@Modifying
	@Query(value = "delete from StudentInfo where score>:min and score<:max")
	void deleteStudentByScore
	     (@Param("min") int minScore, @Param("max")int maxScore);
	
	
	@Query(value = "select * from student", nativeQuery = true)
	List<StudentInfo> findAllStudentsNativeQuery();
	
	
	@Query(value = "select * from student  where score > :min and score < :max",
			nativeQuery = true)
	List<StudentInfo> findStudentByScoreNativeQuery
		(@Param("min") int minScore, @Param("max")int maxScore);	
	
	
	//update student set lname = 'test student' where score > 70 and score <90

	@Modifying
	@Query(value = "update student set lname =:name where score>:min and score<:max",
	nativeQuery = true)
	void updateStudentByScore(@Param("name") String lastName, 
	     @Param("min") int minScore, @Param("max")int maxScore);
	
}
