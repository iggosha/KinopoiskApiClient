package bsu.edu.kinopoiskapiclient.entity;


import lombok.Data;

@Data
public class Movie {

    private Long id;

    private String name;

    private String alternativeName;

    private String enName;

    private String type;

    private Integer year;

    private String description;

    private String shortDescription;

    private String slogan;

    private String status;

    private Integer movieLength;

    private Integer ageRating;

    private Boolean ticketsOnSale;

}