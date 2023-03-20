package com.industrias.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;//
import com.industrias.demo.modelo.productos;

//@Repository//
public interface Iproductos extends CrudRepository<productos, Integer>{

}
