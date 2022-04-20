package com.mylittlecookie123.mylittlecookie.repository;


import com.mylittlecookie123.mylittlecookie.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer> {
}
