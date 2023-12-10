package com.springhow.examples.drools;

import com.springhow.examples.drools.domain.AnxityScore;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DecisionController {


    private final KieContainer kieContainer;

    public DecisionController(KieContainer kieContainer) {
        this.kieContainer = kieContainer;
    }

    @PostMapping("/discount")
    private AnxityScore getDiscountPercent(@RequestBody AnxityScore anxityScore) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(anxityScore);
        kieSession.fireAllRules();
        kieSession.dispose();
        return anxityScore;
    }
}
