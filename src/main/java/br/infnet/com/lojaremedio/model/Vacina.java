package br.infnet.com.lojaremedio.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vacina")
public class Vacina extends Venda{

    private String informacoes;

    private BigDecimal valor;
}
