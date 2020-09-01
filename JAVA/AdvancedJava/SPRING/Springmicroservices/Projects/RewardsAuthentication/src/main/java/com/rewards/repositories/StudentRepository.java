package com.rewards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rewards.entities.Student;

@Repository /*
			 * @Repository is a Spring annotation that indicates that the decorated class is
			 * a repository. A repository is a mechanism for encapsulating storage,
			 * retrieval, and search behavior which emulates a collection of objects
			 */
/*
 * We are extending JpaRepository using two generics - Student & Long. Student
 * is the entity that is being managed and the primary key of Student is Long.
 */
public interface StudentRepository extends JpaRepository<Student, Long>{

}
