package com.kayzenmicroservices.mailchimp.dtos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kayzenmicroservices.mailchimp.dtos.response.audienceList.AudienceMembersDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.audienceList.ConstraintsDTO;
import com.kayzenmicroservices.mailchimp.dtos.response.campaign.LinkDTO;

import java.util.List;

/**
 * Autor: William Castaño ;)
 * Fecha: 25/02/2025
 * Descripción: response audience DTO of mailchimp
 */

public class AudienceResponseDTO {
    @JsonProperty("lists")
    private List<AudienceMembersDTO> campaigns;

    @JsonProperty("total_items")
    private Integer totalItems;

    @JsonProperty("constraints")
    private ConstraintsDTO constraints;

    @JsonProperty("_links")
    private List<LinkDTO> links;
}
