package com.unla.grupo5OO22023.services;

import java.util.List;

import com.unla.grupo5OO22023.entity.LogAuditoria;
import com.unla.grupo5OO22023.models.LogAuditoriaModel;

public interface ILogAuditoriaService {
	
	LogAuditoria findById(int id);	
	public List<LogAuditoria> getAll();
    public LogAuditoriaModel insertOrUpdate(LogAuditoriaModel logAuditoriaModel);
    public boolean remove(int idLogAuditoria);
}