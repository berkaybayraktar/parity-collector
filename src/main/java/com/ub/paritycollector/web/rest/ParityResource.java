package com.ub.paritycollector.web.rest;

import com.ub.paritycollector.domain.Parity;
import com.ub.paritycollector.domain.enumeration.ParitySymbol;
import com.ub.paritycollector.service.parity.ParityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ParityResource {

    private final Logger log = LoggerFactory.getLogger(ParityResource.class);

    @GetMapping("/parities")
    public ResponseEntity<List<Parity>> getAllParities() {
        log.info("Getting all parities");

        List<Parity> parities = ParityService.getInstance().getParities();

        log.info("Returning all parities {}", parities);

        return ResponseEntity.ok(parities);
    }

    @GetMapping("/parity/{paritySymbol}")
    public ResponseEntity<Parity> getParity(@PathVariable ParitySymbol paritySymbol) {
        log.info("Getting parity of {}", paritySymbol);

        Parity parity = ParityService.getInstance().getParity(paritySymbol);

        log.info("Returning parity {}", parity);

        return ResponseEntity.ok(parity);
    }
}
