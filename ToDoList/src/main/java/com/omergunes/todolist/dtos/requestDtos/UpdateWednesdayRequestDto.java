package com.omergunes.todolist.dtos.requestDtos;

public class UpdateWednesdayRequestDto {

    private String aciklama;
    private int id;

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}