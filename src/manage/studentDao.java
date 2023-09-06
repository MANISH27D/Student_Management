package manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


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


    public static boolean dispalyStudentTODB(student_Manage st) {
        boolean f = false;
        try {
            Connection con = connection_Provider.createConnection();
            String q = "select * from student_data where id=?";
            //prepared statement
            PreparedStatement stmt=con.prepareStatement(q);
            //set the values from parameter
            stmt.setInt(0, st.getStudent_id());
            ResultSet set = stmt.executeQuery();
            f=true;
            while(set.next())
            {
                int id = set.getInt(1);
                String name = set.getString(2);
                int class_1 = set.getInt(3);
                int age = set.getInt(4);

                System.out.println("student_id : "+ id);
                System.out.println("student_name"+ name);
                System.out.println("student_class : "+class_1 );
                System.out.println("student_age : "+ age);
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return f;
    }
}
