package com.yaksha.training.grades.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.yaksha.training.grades.entity.Grade;

@Service
public class GradeService {

	public Grade addGrade(Grade grade) {
		return null;
	}

	public Grade updateGrade(Grade grade, Grade existing) {
		grade.setId(existing.getId());
		return null;
	}

	public List<Grade> getGrades() {
		return null;
	}

	public Grade getGradeById(Long id) {
		return null;
	}

	public Grade submitGrade(Grade grade) {
		return null;
	}
}
