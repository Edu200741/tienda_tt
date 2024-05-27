package com.Edu200741.projectTiendaTT.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {

    private Integer id;

    private String name;

    private String lastName;

    private Long cell;

    private String address;

    private String email;


}
