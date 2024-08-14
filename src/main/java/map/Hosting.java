package map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Clob;

@Getter
@Setter
@ToString
public class Hosting {
 
    private int Id;
    private Clob name;
    private long websites;

    public Hosting() {

    }




    //getters, setters and toString()
}