package Task9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class QuestionTwo {

    public static void main(String[] args) {

        try (Connection connection = MyDatabaseConnection.getConnection()) {

            if (connection == null) {
                System.out.println("❌ Database connection failed. Exiting...");
                return;
            }

            // STEP 1: Create the table safely
            String createTableQuery = """
                    CREATE TABLE IF NOT EXISTS employee (
                        empcode INT PRIMARY KEY,
                        empname VARCHAR(255),
                        emppage INT,
                        empsalary INT
                    )
                    """;

            try (Statement statement = connection.createStatement()) {
                statement.execute(createTableQuery);
                System.out.println("✔ Table checked or created successfully.");
            }

            // STEP 2: Insert employee records using PreparedStatement
            String insertQuery = 
                "INSERT INTO employee (empcode, empname, emppage, empsalary) VALUES (?, ?, ?, ?)";

            Object[][] employeeData = {
                {101, "Jenny", 25, 10000},
                {102, "Jacky", 30, 20000},
                {103, "Joe", 20, 40000},
                {104, "John", 40, 80000},
                {105, "Shameer", 25, 90000}
            };

            try (PreparedStatement ps = connection.prepareStatement(insertQuery)) {

                for (Object[] record : employeeData) {
                    ps.setInt(1, (int) record[0]);
                    ps.setString(2, (String) record[1]);
                    ps.setInt(3, (int) record[2]);
                    ps.setInt(4, (int) record[3]);

                    ps.executeUpdate();
                }

                System.out.println("✔ All employee records inserted successfully.");
            }

        } catch (Exception e) {
            System.err.println("❌ Error while inserting records:");
            e.printStackTrace();
        }
    }
}
