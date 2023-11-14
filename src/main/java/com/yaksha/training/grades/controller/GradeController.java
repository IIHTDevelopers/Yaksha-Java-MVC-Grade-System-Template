package com.yaksha.training.grades.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.grades.entity.Grade;

@Controller
public class GradeController {

	@GetMapping("/")
	public String getForm(Model model, @RequestParam(required = false) Long id) {
		return "";
	}

	@PostMapping("/handleSubmit")
	public String submitForm(@Valid Grade grade, BindingResult result) {
		return "";
	}

	@GetMapping("/grades")
	public String getGrades(Model model) {
		return "";
	}
}