package com.codeClanExample.relationshipservices.models;

import jakarta.persistence.*;

@Entity
@Table(name = "files")
public class File {
    //POJO
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "extension")
    private String extension;
    private double size;//in kilobytes

    public File(String name, String extension, double size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
    }
    private File(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
