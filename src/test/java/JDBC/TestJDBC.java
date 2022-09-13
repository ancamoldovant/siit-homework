package JDBC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestJDBC {
    private Connection connection;

    @BeforeEach
    //am creat tabelele
    public void initializeConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:h2:mem:test_mem");
        connection.createStatement().executeUpdate("CREATE TABLE accommodation (id int PRIMARY KEY, type varchar(32), bed_type varchar (32), max_guests int, description varchar(512));");
        connection.createStatement().executeUpdate("CREATE TABLE room_fair (id int PRIMARY KEY, room_value double, season varchar(32));");
        connection.createStatement().executeUpdate("Create table accommodation_fair_relation (id int PRIMARY KEY, id_accommodation int, id_room_fair int, foreign key (id_accommodation) references accommodation(id), foreign key (id_room_fair) references room_fair(id));");

    }

    @Test
    //testez un insert pe tabela accommodation
    public void testInsertAccommodation() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accommodation VALUES (?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "101");
        preparedStatement.setString(2, "Single");
        preparedStatement.setString(3, "KingSize");
        preparedStatement.setString(4, "2");
        preparedStatement.setString(5, "Enjoy our elegant 40 m² guest rooms, designed in warm beige tones and tailored to the needs of private and business travelers alike.........");
        preparedStatement.execute();

        Accommodation accommodationInDb = readSingleAccommodationFromDb(connection);
        Assertions.assertEquals(new Accommodation("101", "Single", "KingSize", "2", "Enjoy our elegant 40 m² guest rooms, designed in warm beige tones and tailored to the needs of private and business travelers alike........."), accommodationInDb);
        System.out.println(accommodationInDb);
    }

    @Test
    public void testSelectFromAccommodation() throws SQLException {
        insertAccommodation();

        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM accommodation");

        assertTrue(resultSet.next());
        assertEquals("101", resultSet.getString(1));

    }

    @Test
    public void testRoomPrice() throws SQLException {
        insertAccommodation();
        insertRoomFair();
        insertAccommodationFairRelation();
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT type, room_value FROM accommodation JOIN accommodation_fair_relation ON accommodation_fair_relation.id_accommodation=accommodation.id JOIN room_fair ON room_fair.id=id_room_fair WHERE type='Single'");
        //System.out.printf("Single, 350");


    }

    private Accommodation readSingleAccommodationFromDb(Connection connection) throws SQLException {
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM accommodation");
        if (resultSet.next()) {
            String id = resultSet.getString("id");
            String type = resultSet.getString("type");
            String bed_type = resultSet.getString("bed_type");
            String max_guests = resultSet.getString("max_guests");
            String description = resultSet.getString("description");

            return new Accommodation(id, type, bed_type, max_guests, description);
        }
        return null;
    }

    private void insertAccommodation() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accommodation VALUES (?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "101");
        preparedStatement.setString(2, "Single");
        preparedStatement.setString(3, "KingSize");
        preparedStatement.setString(4, "2");
        preparedStatement.setString(5, "Enjoy our elegant 40 m² guest rooms, designed in warm beige tones and tailored to the needs of private and business travelers alike.........");
        preparedStatement.execute();
    }

    private void insertRoomFair() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO room_fair VALUES (?, ?, ?);");
        preparedStatement.setString(1, "10");
        preparedStatement.setString(2, "350");
        preparedStatement.setString(3, "Summer");
        preparedStatement.execute();
    }

    private void insertAccommodationFairRelation() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accommodation_fair_relation VALUES (?, ?, ?);");
        preparedStatement.setString(1, "1");
        preparedStatement.setString(2, "101");
        preparedStatement.setString(3, "10");
        preparedStatement.execute();
    }



}