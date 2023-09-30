package com.microservice.DTO;

import com.microservice.model.Status;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatureResponse {
 
    private Long id;
    
    private Long candidateId;
    
    private Long offreId;
    
    private Long evaluationId;
    
    private Status status;
    
    private String creationDate;
}
