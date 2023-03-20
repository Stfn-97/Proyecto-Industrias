package com.industrias.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.industrias.demo.modelo.usuarios;

public interface IusuariosService {
public List<usuarios>listar();
public Optional<usuarios>listarId(int ID_Usuario);
public int save(usuarios u);
public void delete(int ID_Usuario);
}