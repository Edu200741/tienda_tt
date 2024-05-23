package com.Edu200741.projectTiendaTT.domain.dto;

public class CustomerDTO {

    private String id;

    private String name;

    private String lastName;

    public CustomerDTO() {
    }

    public CustomerDTO(String id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
