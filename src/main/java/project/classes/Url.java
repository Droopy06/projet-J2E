package project.classes;

/**
 * Created by LAMOOT Alexandre on 15/12/15.
 */
import lombok.Data;

import java.io.Serializable;

@Data
public class Url implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String shortUrl;
    private String longUrl;
    private Integer idUser;
}
