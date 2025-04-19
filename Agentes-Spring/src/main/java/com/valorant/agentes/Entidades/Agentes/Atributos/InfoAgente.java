package com.valorant.agentes.Entidades.Agentes.Atributos;

import lombok.Data;

import java.util.List;

@Data
public class InfoAgente {
    private String uuid;
    private String displayName;
    private String description;
    private String developerName;
    private Object releaseDate;
    private String[] characterTags;
    private String displayIcon;
    private String dipslayIconSmall;
    private String bustPortrait;
    private String fullPortrait;
    private String fullPortraitV2;
    private String killfeedPortrait;
    private String background;
    private String[] backgroundGradientColors;
    private String assetPath;
    private boolean isFullPortraitRightFacing;
    private boolean isPlayableCharacter;
    private boolean isAvalaibleForTest;
    private boolean isBaseContent;
    private Role role;
    private RecruitmentData recruitmentData;
    private List<Abilities> abilities;
    private VoiceLine voiceLine;


}
