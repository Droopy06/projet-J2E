package project.classes;

import javax.validation.constraints.NotNull;

/**
 * Created by LAMOOT Alexandre on 15/12/15.
 */

public class Url{

    private Integer id;
    @NotNull
    private String shortUrl;
    @NotNull
    private String longUrl;
    private Integer idUser;

    public Url() {
        this.id = 0;
        this.shortUrl = "";
        this.longUrl = "";
        this.idUser = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }
}
