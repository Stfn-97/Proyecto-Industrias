package com.industrias.demo.interfaces;

import com.industrias.demo.modelo.usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IloginRepository extends JpaRepository<usuarios,Integer> {

   List <usuarios> findByEmailAndPassword (String Email, String password);
}
