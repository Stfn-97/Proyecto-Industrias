package com.industrias.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;//
import com.industrias.demo.modelo.usuarios;

//@Repository//
public interface Iusuarios extends CrudRepository<usuarios, Integer>{

}