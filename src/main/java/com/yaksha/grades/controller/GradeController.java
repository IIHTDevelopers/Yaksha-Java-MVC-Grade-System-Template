package com.yaksha.grades.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.grades.entity.Grade;

import jakarta.validation.Valid;

@Controller
public class GradeController {

	@GetMapping("/form")
	public String getForm(Model model, @RequestParam(required = false) Long id) {
		// write your logic here
		return "";
	}

	@PostMapping("/handleSubmit")
	public String submitForm(@Valid Grade grade, BindingResult result) {
		// write your logic here
		return "";
	}

	@RequestMapping(value = { "/", "/grades", "/search" })
	public String getGrades(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@RequestParam(value = "searchGrade", required = false) String searchGrade,
			@PageableDefault(size = 5) Pageable pageable, Model model) {
		// write your logic here
		return "";
	}
}