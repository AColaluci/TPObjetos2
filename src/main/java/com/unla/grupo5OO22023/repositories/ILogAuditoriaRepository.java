package com.unla.grupo5OO22023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.grupo5OO22023.entity.LogAuditoria;
import java.io.Serializable;

@Repository("logAuditoriaRepository")
public interface ILogAuditoriaRepository extends JpaRepository<LogAuditoria, Serializable>{
	public abstract LogAuditoria findByIdLogAuditoria(int idLogAuditoria);
}