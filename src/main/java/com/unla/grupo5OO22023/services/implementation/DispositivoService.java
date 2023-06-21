package com.unla.grupo5OO22023.services.implementation;

import com.unla.grupo5OO22023.entity.Dispositivo;
import com.unla.grupo5OO22023.models.DispositivoModel;
import com.unla.grupo5OO22023.repositories.IDispositivoRepository;
import com.unla.grupo5OO22023.services.IDispositivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.List;

@Service("dispositivoService")
public class DispositivoService implements IDispositivoService{
    @Autowired
    @Qualifier("dispositivoRepository")
    private IDispositivoRepository dispositivoRepository;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
	public Dispositivo findByid(int id) {
		return dispositivoRepository.findByIdDispositivo(id);
	}
    
    @Override
    public List<Dispositivo> getAll() {
        return dispositivoRepository.findAll();
    }

    @Override
    public DispositivoModel insertOrUpdate(DispositivoModel dispositivoModel) {
        Dispositivo dispositivo = dispositivoRepository.save(modelMapper.map(dispositivoModel, Dispositivo.class));
        return modelMapper.map(dispositivo, DispositivoModel.class);
    }

    @Override
    public boolean remove(int id) {
        try{
            dispositivoRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
}