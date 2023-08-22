package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modelo.Propietario;
import com.example.demo.repository.IPropietarioRepo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class PropietarioServiceImpl implements IPropietarioService{
	
	@Autowired
	private IPropietarioRepo iPropietarioRepo;

	@Override
	public void agregar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.insertar(propietario);
	}

	@Override
	public void modificar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.actualizar(propietario);
	}

	@Override
	public Propietario encontrarId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscarId(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iPropietarioRepo.eliminar(id);
	}

	@Override
	public List<Propietario> reporte() {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.buscarTodos();
	}

	

}
