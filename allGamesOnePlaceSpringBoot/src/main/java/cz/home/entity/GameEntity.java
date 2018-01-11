package cz.home.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

/**
 * Created by padaw on 11.1.2018.
 */
@Entity
@Table(name = "GAME_TABLE")
public class GameEntity {

    @Id
    @Column(name = "game_id")
    private int id;
    private String game_name;
    private String game_genre;
    private String game_platform;
    private Date game_release_date;
    private int developer_id;

    public GameEntity(int id, String game_name, String game_genre, String game_platform, Date game_release_date, int developer_id) {
        this.id = id;
        this.game_name = game_name;
        this.game_genre = game_genre;
        this.game_platform = game_platform;
        this.game_release_date = game_release_date;
        this.developer_id = developer_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getGame_genre() {
        return game_genre;
    }

    public void setGame_genre(String game_genre) {
        this.game_genre = game_genre;
    }

    public String getGame_platform() {
        return game_platform;
    }

    public void setGame_platform(String game_platform) {
        this.game_platform = game_platform;
    }

    public Date getGame_release_date() {
        return game_release_date;
    }

    public void setGame_release_date(Date game_release_date) {
        this.game_release_date = game_release_date;
    }

    public int getDeveloper_id() {
        return developer_id;
    }

    public void setDeveloper_id(int developer_id) {
        this.developer_id = developer_id;
    }
}
