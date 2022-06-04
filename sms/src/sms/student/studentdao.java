package sms.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class studentdao {
	
	
public static boolean insertStudentTodb(Student st) {
	// TODO Auto-generated method stub
	boolean f=false;
	
	try {
		Connection con=cp.cretec();
		String q = "insert into students(sname,sphone,scity) values(?,?,?)";
	 
		
		PreparedStatement ptmt=con.prepareStatement(q);
		ptmt.setString(1, st.getStudenntname());
		ptmt.setString(2, st.getStudentphone());
		ptmt.setString(3, st.getStudentcity());
		ptmt.executeUpdate();
		f=true;
		
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
	
}

public static boolean deletestudent(int userId) {
	// TODO Auto-generated method stub
	
boolean f=false;
	
	try {
		Connection con=cp.cretec();
		String q = "delete from students where sid=?";
		 
		
		PreparedStatement ptmt=con.prepareStatement(q);
		ptmt.setInt(1, userId);
 
		ptmt.executeUpdate();
		f=true;
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return f;
}
	public static void showAll() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	boolean f=false;
		
		try {
			Connection con=cp.cretec();
			String q = "select * from students";
			 
			
		
Statement stat=con.createStatement();
			
			ResultSet resultSet=stat.executeQuery(q);
			
			while(resultSet.next()) {
				
				int id=resultSet.getInt(1);
				String nameString=resultSet.getString(2);
				String getCityString=resultSet.getString(4);
				String getphoneNumberInteger=resultSet.getString(3);
				
				
				String hexing="SBSSTC";
				
				
				System.out.println("User_Id: "+hexing+id);
				System.out.println("Name: "+nameString);
				System.out.println("City:- "+getCityString);
				System.out.println("Phone No: "+getphoneNumberInteger);
			}
			
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	 
	}
}
