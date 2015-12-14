package project.classes;

/**
 * Created by LAMOOT Alexandre on 14/12/15.
 */
import java.io.Serializable;
import lombok.Data;
@Data
public class Users implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String pseudo;
    private String password;
}
