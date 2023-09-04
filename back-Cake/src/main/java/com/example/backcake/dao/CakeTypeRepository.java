package com.example.backcake.dao;

import com.example.backcake.entity.CakeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CakeTypeRepository extends JpaRepository<CakeType, String> {
}
