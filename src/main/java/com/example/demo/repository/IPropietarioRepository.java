package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Propietario;

public interface IPropietarioRepository {

	public Propietario buscarPorid(Integer id);

	public void insertar(Propietario propietario);

	public void eliminar(Integer id);

	public void actualizar(Propietario propietario);

	public List<Propietario> buscarTodos();
}
