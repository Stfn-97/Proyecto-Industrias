package com.industrias.demo.service;

import com.industrias.demo.interfaces.IloginRepository;
import com.industrias.demo.modelo.usuarios;
import com.industrias.demo.modelo.Validacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class validationService implements IvalidationService {
    @Autowired
    IloginRepository Lr;
    @Override
    public usuarios ValidarUsuario(Validacion v1) {
        List<usuarios> usuarios1 = Lr.findByEmailAndPassword(v1.getUsuario(), v1.getPassword());
        if (usuarios1.isEmpty()) {
            return null;
        }

        usuarios u = usuarios1.get(0);
        return u;

    }
}
