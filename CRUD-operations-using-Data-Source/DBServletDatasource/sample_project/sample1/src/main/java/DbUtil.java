import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class DbUtil {
    static MysqlDataSource datasource=new MysqlDataSource();
    public static Connection connection = null;
    public static PreparedStatement ps = null;
	private static Reader inputStream;

   // private static Connection connection = null;
   public static Connection getConnection() {
     if (connection != null)
        return connection;
        else{

    try{ 
        Properties prop=new Properties();
         // Set dataSource Properties
        //  dataSource.setServerName("localhost");
        //  dataSource.setPortNumber(3306);
        //  dataSource.setDatabaseName("register");
        //  dataSource.setUser("root");
        //  dataSource.setPassword("");
            ClassLoader c1=Thread.currentThread().getContextClassLoader();
            InputStream inputstream=c1.getResourceAsStream("db.properties");  

             try{
                 prop.load(inputstream);
             }catch(IOException e){
                 e.printStackTrace();
             }                   
                   String driver=prop.getProperty("driver");
                   String url=prop.getProperty("url");
                   String user=prop.getProperty("user");
                   String password=prop.getProperty("password");
                   System.out.println(datasource+ "???????????");
                   datasource.setURL(prop.getProperty("url"));
                   datasource.setUser(prop.getProperty("user"));
                   datasource.setPassword(prop.getProperty("password"));
              /* Properties prop = new Properties();
                InputStream inputStream = DbUtil.class.getClassLoader().getResourceAsStream("/db.properties");
                prop.load(inputStream);
                String driver = prop.getProperty("driver");
                String url = prop.getProperty("url");
                String user = prop.getProperty("user");
                String password = prop.getProperty("password");
                // Class.forName("com.mysql.jdbc.driver");*/
               connection = datasource.getConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            } 
            return  connection;
            
            //return conn;
        }

    }
}