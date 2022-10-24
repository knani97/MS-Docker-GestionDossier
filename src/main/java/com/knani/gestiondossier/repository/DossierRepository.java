package com.knani.gestiondossier.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.knani.gestiondossier.entity.Dossier;

@Repository
public interface DossierRepository extends JpaRepository<Dossier, Long> {

}