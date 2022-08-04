package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {

}
