package com.yaksha.grades.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.grades.entity.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long> {

	// write your logic here

	// feel free to update this
	Page<Grade> findGradeByNameSubjectAndGrade(@Param("keyword") String keyword, @Param("grade") String grade,
			Pageable pageable);

}
