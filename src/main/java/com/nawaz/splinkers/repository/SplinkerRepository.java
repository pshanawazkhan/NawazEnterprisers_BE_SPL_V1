package com.nawaz.splinkers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nawaz.splinkers.entity.Splinkers;

@Repository
public interface SplinkerRepository extends JpaRepository<Splinkers,Integer>{

}
