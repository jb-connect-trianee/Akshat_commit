package com.demo.json1;

import java.sql.*;
import org.codehaus.jackson.map.ObjectMapper;
@SuppressWarnings("unused")
public class EmpMapper {
    /**
     * @param args
     */
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        // TODO Auto-generated method stub
            try{
                ObjectMapper objMap=new ObjectMapper();
                EmpModel empModel=new EmpModel();
                empModel.setEmpId(101);
                empModel.setName("Manish");
                empModel.setNotes("Hello manish how are you");
                Connection con=null;
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/glau","root","");
                PreparedStatement pstmt=con.prepareStatement("INSERT INTO emp(empId,name,notes) VALUES(?,?,?)");
                pstmt.setInt(1,101 );
                pstmt.setString(2, "Manish");
                pstmt.setObject(3, objMap.defaultPrettyPrintingWriter().writeValueAsString(empModel));
                pstmt.execute();
            }
            catch(Exception e){e.printStackTrace();}
            }
    }
