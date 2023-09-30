package com.microservice.DTO;

import com.microservice.model.Status;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatureRequest {

    private Long candidateId;

    private Long offreId;

    private Long evaluationId;

}
