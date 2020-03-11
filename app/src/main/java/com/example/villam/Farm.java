package com.example.villam;

public class Farm {
    private String name;
    private String diachi;
    private String id;

    public Farm(String name, String diachi, String id) {
        this.name = name;
        this.diachi = diachi;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
