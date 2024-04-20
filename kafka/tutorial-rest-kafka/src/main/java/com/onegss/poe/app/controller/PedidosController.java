package com.onegss.poe.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.onegss.poe.app.data.PedidosData;
import com.onegss.poe.app.services.RegistraEventoService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController()
@RequiredArgsConstructor
public class PedidosController {

    private final RegistraEventoService eventoService;

    @PostMapping("/api/savePedido")
    public ResponseEntity<String> savePedido(@RequestBody PedidosData pedido) {
        eventoService.adicionarEvento("SavePedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }

}
