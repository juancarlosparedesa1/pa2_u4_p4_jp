package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository propietarioRepository;

	@Override
	public Propietario buscarPorid(Integer id) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscarPorid(id);
	}

	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.insertar(propietario);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(id);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.actualizar(propietario);
	}

	@Override
	public List<Propietario> buscarTodos() {
		// TODO Auto-generated method stub
		return this.propietarioRepository.buscarTodos();
	}

}
