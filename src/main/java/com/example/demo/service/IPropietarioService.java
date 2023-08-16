package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Propietario;

public interface IPropietarioService {
	public Propietario buscarPorid(Integer id);

	public void guardar(Propietario propietario);

	public void eliminar(Integer id);

	public void actualizar(Propietario propietario);

	public List<Propietario> buscarTodos();
}
