package com.valorant.agentes.Entidades.Agentes;

import com.valorant.agentes.Entidades.Agentes.Atributos.InfoAgente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ListaAgentes {
    private int status;
    private List<InfoAgente> data;
}
