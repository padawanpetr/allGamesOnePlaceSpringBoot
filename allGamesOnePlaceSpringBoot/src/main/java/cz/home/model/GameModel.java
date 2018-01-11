package cz.home.model;

import java.util.Date;

/**
 * Created by padaw on 11.1.2018.
 */
public class GameModel {

    private String name;
    private String genre;
    private String platform;
    private Date releaseDate;

    public GameModel(int id, String name, String genre, String platform, Date releaseDate) {
        this.name = name;
        this.genre = genre;
        this.platform = platform;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
