package com.unla.grupo5OO22023.services.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.unla.grupo5OO22023.entity.LogAuditoria;
import com.unla.grupo5OO22023.models.LogAuditoriaModel;
import com.unla.grupo5OO22023.repositories.ILogAuditoriaRepository;
import com.unla.grupo5OO22023.services.ILogAuditoriaService;
import java.util.List;

@Service("logAuditoriaService")
public class LogAuditoriaService implements ILogAuditoriaService{
	@Autowired
    @Qualifier("logAuditoriaRepository")
	private ILogAuditoriaRepository logAuditoriaRepository;
    private ModelMapper modelMapper = new ModelMapper();

    @Override
	public LogAuditoria findById(int idLogAuditoria) {
    	return logAuditoriaRepository.findByIdLogAuditoria(idLogAuditoria);
	}
    
    @Override
    public List<LogAuditoria> getAll() {
        return logAuditoriaRepository.findAll();
    }
    
    @Override
    public LogAuditoriaModel insertOrUpdate(LogAuditoriaModel logAuditoriaModel) {
        LogAuditoria logAuditoria = logAuditoriaRepository.save(modelMapper.map(logAuditoriaModel, LogAuditoria.class));
        return modelMapper.map(logAuditoria, LogAuditoriaModel.class);
    }

    @Override
    public boolean remove(int id) {
        try{
            logAuditoriaRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    

}