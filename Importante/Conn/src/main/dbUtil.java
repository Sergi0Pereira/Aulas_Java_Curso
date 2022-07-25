
        
package main;
        
import java.sql.Connection;
import static conn.dbUtil.getConnection;

 // import the getConnection method from the dbUtil class
import java.sql.Connection;

public class dbUtil {

    public static void main(String[] args) {
        Connection conn = getConnection(); // get a connection to the database
        //dbUtil.closeConnection(conn);
    }

}

