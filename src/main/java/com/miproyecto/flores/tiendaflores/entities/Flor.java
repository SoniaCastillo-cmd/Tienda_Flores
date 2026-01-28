package com.miproyecto.flores.tiendaflores.entities;

import com.miproyecto.flores.tiendaflores.common.ExistenciaFlor;
import com.miproyecto.flores.tiendaflores.common.TipoFlor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flor {

    @Id
    private Long id;

    @Column

    private String nombre;

    private String color;

    @Column
    @Enumerated(EnumType.STRING)
    private TipoFlor tipo;

    @Enumerated(EnumType.ORDINAL)
    private ExistenciaFlor existencia;


}
