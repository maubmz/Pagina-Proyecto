package com.valorant.agentes.Entidades.Agentes.Atributos;

import lombok.Data;

@Data
public class RecruitmentData {
    private String counterId;
    private String milestoneId;
    private int milestoneThreshold;
    private boolean useLevelVpCostOverride;
    private int levelVpCostOverride;
    private Object startDate;
    private Object endDate;

}
