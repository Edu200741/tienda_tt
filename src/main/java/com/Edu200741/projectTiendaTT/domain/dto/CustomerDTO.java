package com.Edu200741.projectTiendaTT.domain.dto;

public class CustomerDTO {

    private Integer id;

    private String name;

    private String lastName;

    private Long cell;

    private String address;

    private String email;

    public CustomerDTO() {
    }

    public CustomerDTO(Integer id, String name, String lastName, Long cell, String address, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.cell = cell;
        this.address = address;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Long getCell() {
        return cell;
    }

    public void setCell(Long cell) {
        this.cell = cell;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
