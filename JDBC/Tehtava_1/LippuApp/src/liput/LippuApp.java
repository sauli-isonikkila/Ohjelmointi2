package liput;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LippuApp {

	private static final String JDBC_CONNECTION_STRING = "jdbc:sqlite:data/LippuTietokanta.sqlite3";

	public static void main(String[] args) {
		Connection connection = null;
       PreparedStatement preparedStatement = null;
       ResultSet resultSet = null;

       try {
           // Create a connection to the database
           connection = DriverManager.getConnection(JDBC_CONNECTION_STRING);

           // Create a prepared statement to execute a query
           preparedStatement = connection.prepareStatement("SELECT LippuID, TapahtumanNimi, Hinta FROM Liput ORDER BY TapahtumanNimi ASC");

           // Execute the query and get the result set
           resultSet = preparedStatement.executeQuery();

           /*
            * Iterate over the result set and print the results. The result set contains
            * the rows returned by the query. Each time next() is called, the result set
            * moves to the next row.
            *
            * If next() returns false, then there are no more rows in the result set, and
            * the loop terminates.
            */
           
           int id;
           String name;
           double price;
           
           while (resultSet.next()) {
               /*
                * getLong() and getString() are used to retrieve the values from the current
                * row in the result set. The argument passed to these methods is the name of
                * the column in the result set. There are also methods for other types of
                * data, such as getInt() and getDouble().
                */
               id = resultSet.getInt("LippuID");
        	   name = resultSet.getString("TapahtumanNimi");
        	   price = resultSet.getDouble("Hinta");
               
               System.out.println(id + " " +  name + " " + price);
           }
       } catch (SQLException e) {
           /*
            * Operations that access the database can throw SQLExceptions. SQLException is
            * a checked exception, so it must be caught or thrown. Here we don't really
            * handle the exception, we just print the stack trace and exit.
            */
           e.printStackTrace();

       } finally {
           /*
            * Close the result set, prepared statement, and connection in the finally block
            * to ensure they are closed even if an exception is thrown.
            *
            * This is a bit verbose, and you could either implement a utility method to
            * close the resources, or use a try-with-resources block.
            */
           try {
               if (resultSet != null) {
                   resultSet.close();
               }
               if (preparedStatement != null) {
                   preparedStatement.close();
               }
               if (connection != null) {
                   connection.close();
               }
           } catch (Exception e) {
               /*
                * Even operations that close the resources can throw exceptions, so we still
                * need to catch them.
                */
               e.printStackTrace();
           }

       }
	}

}
