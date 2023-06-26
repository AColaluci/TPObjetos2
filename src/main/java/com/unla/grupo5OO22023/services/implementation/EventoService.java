package com.unla.grupo5OO22023.services.implementation;

import com.unla.grupo5OO22023.entity.Evento;
import com.unla.grupo5OO22023.entity.SensorLuz;
import com.unla.grupo5OO22023.models.EventoModel;
import com.unla.grupo5OO22023.services.IEventoService;
import com.unla.grupo5OO22023.repositories.IEventoRepository;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("eventoService")
public class EventoService implements IEventoService {

	@Autowired
    @Qualifier("eventoRepository")
    private IEventoRepository eventoRepository;

    private ModelMapper modelMapper = new ModelMapper();

    @Override
	public Evento findById(int id) {
		return eventoRepository.findByidEvento(id);
	}
    
    @Override
    public List<Evento> getAll() {
        return (List<Evento>)eventoRepository.findAll();
    }

    @Override
    public EventoModel insertOrUpdate(EventoModel eventoModel) {
        Evento evento = eventoRepository.save(modelMapper.map(eventoModel, Evento.class));
        return modelMapper.map(evento, EventoModel.class);
    }

	@Override
	public void save(Evento evento) {
		eventoRepository.save(evento);
	}
    
    @Override
    public boolean remove(int id) {
        try{
            eventoRepository.deleteById(id);
            return true;
        } catch(Exception e){
            return false;
        }
    }
}