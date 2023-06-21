package com.unla.grupo5OO22023.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter 
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="logAuditoria")

public class LogAuditoria {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idLogAuditoria;
    
    @Column(name="fechaRegistro")
    private LocalDate fechaLogAuditoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idEvento", nullable=true)
    private Evento evento;
}