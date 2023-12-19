package br.infnet.com.lojaremedio.model;

import br.infnet.com.lojaremedio.enums.VendaEnums;
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
