package com.ao.portal.repositorios;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ao.portal.modelo.Direccao;

@Repository
public interface DireccaoRepositorio extends JpaRepository<Direccao, Integer> {

}
