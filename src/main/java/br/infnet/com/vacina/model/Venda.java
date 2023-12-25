package br.infnet.com.vacina.model;

import br.infnet.com.vacina.enums.VendaEnums;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "venda")
@Data
public abstract class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private VendaEnums tipo;
}
