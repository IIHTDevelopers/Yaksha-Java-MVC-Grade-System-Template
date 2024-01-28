package com.yaksha.grades.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.grades.entity.Grade;

@Service
public class GradeService {

	public Grade addGrade(Grade grade) {
		// write your logic here
		return null;
	}

	public Grade updateGrade(Grade grade, Grade existing) {
		// write your logic here
		return null;
	}

	public Page<Grade> getGrades(String keyword, String gradeSearch, Pageable pageable) {
		// write your logic here
		return null;
	}

	public Grade getGradeById(Long id) {
		// write your logic here
		return null;
	}

	public Grade submitGrade(Grade grade) {
		// write your logic here
		return null;
	}
}
