package com.unla.grupo5OO22023.services;
import com.unla.grupo5OO22023.entity.Dispositivo;
import com.unla.grupo5OO22023.models.DispositivoModel;
import java.util.List;


public interface IDispositivoService {
    public List<Dispositivo> getAll();
    public DispositivoModel insertOrUpdate(DispositivoModel dispositivoModel);  
    public boolean remove(int id);  
    public Dispositivo findByid(int id);
}