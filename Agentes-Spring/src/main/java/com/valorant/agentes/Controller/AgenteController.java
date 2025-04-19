package com.valorant.agentes.Controller;

import com.valorant.agentes.Entidades.Agentes.Agente;
import com.valorant.agentes.Entidades.Agentes.ListaAgentes;
import com.valorant.agentes.Entidades.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RequestMapping(value = "/Agentes")
@RestController
public class AgenteController {

    @Autowired
    private Url url;

    @GetMapping("/AllAgents")
    public ListaAgentes allAgents() {
        String urlAgentes = url.getHosts().get(0);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(urlAgentes, ListaAgentes.class);
    }

    @GetMapping("/{idAgente}")
    public Agente getAgenteById(@PathVariable String idAgente) {
        String urlAgentes = url.getHosts().get(0);
        urlAgentes = urlAgentes.concat("/").concat(idAgente);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(urlAgentes, Agente.class);
    }

    @GetMapping("/Hello")
    public String hello() {
        return "Hello World";
    }


}

