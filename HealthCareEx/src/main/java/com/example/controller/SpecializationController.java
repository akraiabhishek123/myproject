package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.Specialization;
import com.example.service.ISpecialization;

@Controller
@RequestMapping("/spec")
public class SpecializationController {
	
@Autowired
private ISpecialization service;

/**
 * 1. display all Specialization
 */

@GetMapping("/all")
public String viewAll(Model model) {
	List<Specialization> list = service.getAllSpecializations();
	model.addAttribute("list",list);
	return "SpecializationData";
}
}
