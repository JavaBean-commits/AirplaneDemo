import org.junit.Test;

import java.sql.*;

public class Tests {
    @Test
    public void test1() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/airplane","root","root");
        String sql="select * from trips";
        Statement statement=conn.createStatement();
        ResultSet resultSet=statement.executeQuery(sql);
        while(resultSet.next()){
            System.out.println("连接成功");
        }
    }
}

