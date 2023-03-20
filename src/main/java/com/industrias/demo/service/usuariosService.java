package com.industrias.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.industrias.demo.interfaceService.IusuariosService;
import com.industrias.demo.interfaces.Iusuarios;
import com.industrias.demo.modelo.usuarios;

@Service
public class usuariosService implements IusuariosService{

//METODO LISTAR
@Autowired
private Iusuarios data;

@Override
public List<usuarios> listar() {

return (List<usuarios>)data.findAll();
}





@Override
public java.util.Optional<usuarios> listarId(int ID_Usuario) {
return data.findById(ID_Usuario);
}





@Override
public int save(usuarios u) {
int res=0;
usuarios Usuarios=data.save(u);
if(!Usuarios.equals(null)) {
res = 1;
}
return res;
}





@Override
public void delete(int ID_Usuario) {
data.deleteById(ID_Usuario);

}

}