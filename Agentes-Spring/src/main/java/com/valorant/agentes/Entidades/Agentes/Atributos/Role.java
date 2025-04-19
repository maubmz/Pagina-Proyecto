package com.valorant.agentes.Entidades.Agentes.Atributos;

import lombok.Data;
import lombok.Getter;

@Data
public class Role {
    private String uuid;
    private String displayName;
    private String description;
    private String displayIcon;
    private String assetPath;

}
