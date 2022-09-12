package JDBC;

import java.sql.*;

public class TestJDBC {
    private Connection connection;
    @BeforeEach
    public void initializeConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:h2:mem:test_mem");
        connection.createStatement().executeUpdate("CREATE TABLE accomodation (id integer PRIMARY KEY, type varchar(32), bed_type varchar (32), max_guests integrer, description varchar(512)");
        connection.createStatement().executeUpdate("CREATE TABLE room_fair (id integer PRIMARY KEY, value double, season varchar(32)");
        connection.createStatement().executeUpdate("CREATE TABLE accomodation_fair_relation (id integer PRIMARY KEY, id_accomodation integrer FOREIGN KEY (id) references accomodation (id),id_room_fair integer FOREIGN KEY (id) references room_fair (id)");

    }
    @Test
    public void testInsertAccomodation() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accomodation VALUES (?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "101");
        preparedStatement.setString(2, "Single");
        preparedStatement.setString(3, "KingSize");
        preparedStatement.setString(4, "2");
        preparedStatement.setString(5, "Enjoy our elegant 40 m² guest rooms, designed in warm beige tones and tailored to the needs of private and business travelers alike.........");
        preparedStatement.execute();

        Accomodation accomodationInDb = readSingleAccomodationFromDb(connection);
        Assertions.assertEquals(new Accomodation("101", "Single", "KingSize", "2", "Enjoy our elegant 40 m² guest rooms, designed in warm beige tones and tailored to the needs of private and business travelers alike........."), accomodationInDb);
    }

    private Accomodation readSingleAccomodationFromDb(Connection connection) throws SQLException {
        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM accomodation");
        if (resultSet.next()) {
            String id = resultSet.getString("id");
            String type = resultSet.getString("type");
            String bed_type = resultSet.getString("bed_type");
            String max_guests = resultSet.getString("max_guests");
            String description = resultSet.getString("description");

            return new Accomodation(id, type, bed_type, max_guests, description);
        }
        return null;
    }
    private void insertAccomodation() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accomodation VALUES (?, ?, ?, ?, ?)");
        preparedStatement.setString(1, "101");
        preparedStatement.setString(2, "Single");
        preparedStatement.setString(3, "KingSize");
        preparedStatement.setString(4, "2");
        preparedStatement.setString(5, "Enjoy our elegant 40 m² guest rooms, designed in warm beige tones and tailored to the needs of private and business travelers alike.........");
        preparedStatement.execute();
    }
    private void insertRoomFair() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accomodation VALUES (?, ?, ?)");
        preparedStatement.setString(1, "10");
        preparedStatement.setString(2, "350");
        preparedStatement.setString(3, "Summer");
        preparedStatement.execute();
    }
    private void insertAccomodationFairRelation() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO accomodation VALUES (?, ?, ?)");
        preparedStatement.setString(1, "1");
        preparedStatement.setString(2, "101");
        preparedStatement.setString(3, "10");
        preparedStatement.execute();
    }
    @Test
    public void testSelectFromAccomodation() throws SQLException {
        insert101();

        ResultSet resultSet = connection.createStatement().executeQuery("SELECT * FROM accomodation");

        assertTrue(resultSet.next());
        assertEquals("101", resultSet.getString(1));
    }
}