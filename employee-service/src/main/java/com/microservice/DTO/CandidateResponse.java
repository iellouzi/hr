package com.microservice.DTO;


import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateResponse {

        private Long id;

        private String name;

        private String phone;

        private String email;


}
