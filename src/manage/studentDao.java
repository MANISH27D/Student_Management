package manage;

import java.sql.*;


public class studentDao {
    public static boolean insertStudentTODB(student_Manage st){

        boolean f =false;

        try {
            Connection con = connection_Provider.createConnection();
            String q = "insert into student_data(NAME,CLASS,AGE) VALUES (?,?,?)";
            //prepared statement
            PreparedStatement pstmt=con.prepareStatement(q);
            //set the values for parameters
            pstmt.setString(1, st.getStudent_name());
            pstmt.setInt(2,st.getStudent_class());
            pstmt.setInt(3,st.getGetStudent_age());
            pstmt.executeUpdate();
            f=true;

        }

        catch (Exception e){
            e.printStackTrace();
        }
        return f;

    }

    public static boolean deleteStudentTODB(student_Manage st){
        boolean f = false;
        try {
            Connection con = connection_Provider.createConnection();
            String q = "delete from student_data where NAME=?";
            //prepared statement
            PreparedStatement stmt=con.prepareStatement(q);
            //set the values from parameter
            stmt.setString(1, st.getStudent_name());
            stmt.executeUpdate();
            f=true;



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return f;


    }


    public static boolean dispalyStudentTODB() {
        boolean f = false;
        try {
            Connection con = connection_Provider.createConnection();
            String q = "select * from student_data";
            //prepared statement
            Statement stmt = con.createStatement();

            ResultSet rs =stmt.executeQuery(q);
            while(rs.next()){
                int student_id=rs.getInt("id");
                String student_name=rs.getString("name");
                String student_Class=rs.getString("class");
                String student_age=rs.getString("age");

                System.out.println("Student_ID : "+student_id);
                System.out.println("Student_Name : "+student_name);
                System.out.println("Student_Class : "+student_Class);
                System.out.println("student_Age : "+student_age);
                System.out.println("*****Following row is displayed successfully*****");
            }
            f=true;



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return f;
    }
}
