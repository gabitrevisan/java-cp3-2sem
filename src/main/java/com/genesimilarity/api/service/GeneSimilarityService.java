package com.genesimilarity.api.service;

import com.genesimilarity.api.model.GeneRequest;
import com.genesimilarity.api.model.GeneSimilarityResponse;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class GeneSimilarityService {

    public GeneSimilarityResponse calculateSimilarity(GeneRequest request) {
        GeneSimilarityResponse response = new GeneSimilarityResponse();

        // Verificando se há pelo menos duas sequências para comparar
        if (request.getSequences() != null && request.getSequences().size() > 1) {
            String sequence1 = request.getSequences().get(0);
            String sequence2 = request.getSequences().get(1);

            // Verificando se as sequências têm o mesmo comprimento
            if (sequence1.length() != sequence2.length()) {
                response.setDistanceScore(-1.0); // Alterado para Double
                response.setSimilarityScore(0.0); // Alterado para Double
                response.setStatus("Error: Sequences must be of the same length.");
            } else {
                // Calculando a distância de Hamming
                int distance = calculateHammingDistance(sequence1, sequence2);

                // Calculando a similaridade
                double similarity = 1.0 - ((double) distance / sequence1.length());

                // Preenchendo a resposta
                response.setDistanceScore((double) distance); // Alterado para Double
                response.setSimilarityScore(similarity); // Alterado para Double
                response.setLength(sequence1.length());
                response.setProcessingTime(System.currentTimeMillis());
                response.setStatus("Success");

                // Preenchendo o campo createdAt com a data e hora atual
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
                response.setCreatedAt(sdf.format(new Date()));
            }
        } else {
            response.setDistanceScore(0.0); // Alterado para Double
            response.setSimilarityScore(0.0); // Alterado para Double
            response.setStatus("Error: Not enough sequences.");
        }

        return response;
    }

    private int calculateHammingDistance(String seq1, String seq2) {
        int distance = 0;
        for (int i = 0; i < seq1.length(); i++) {
            if (seq1.charAt(i) != seq2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }
}
