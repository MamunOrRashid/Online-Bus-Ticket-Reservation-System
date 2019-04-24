
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User extends Person {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     *
     */
    public User() throws SQLException{
        conn = javaconnect.ConnecrDb();
    }
}
