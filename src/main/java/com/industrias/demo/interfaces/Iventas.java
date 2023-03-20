package com.industrias.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

//import org.springframework.stereotype.Repository;//
import com.industrias.demo.modelo.ventas;

public interface Iventas extends CrudRepository <ventas, Integer> {

}
