package com.genesimilarity.api.controller;

import com.genesimilarity.api.model.GeneRequest;
import com.genesimilarity.api.model.GeneSimilarityResponse;
import com.genesimilarity.api.service.GeneSimilarityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/alignment")
public class GeneSimilarityController {

    @Autowired
    private GeneSimilarityService geneSimilarityService;

    @PostMapping("/distance")
    public GeneSimilarityResponse calculateDistance(@RequestBody GeneRequest request) {
        return geneSimilarityService.calculateSimilarity(request);
    }
}
