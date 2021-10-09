import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {

    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/test_db", "root", "");
                    Statement statement = con.createStatement();
                    ResultSet resultSet = statement.executeQuery("select * from users");

                    while (resultSet.next()){
                        System.out.println(resultSet.getString("name"));
                    }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
