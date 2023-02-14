package otherFile.com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegiDAO {

	public String insert(RegiPojo rpojo) throws SQLException
	{
		String sql1="insert into regi values(?,?,?,?,?,?,?,?)";
		DBAdapter adapter=new DBAdapter();
		Connection con=adapter.dbConnect();
		
		PreparedStatement pst=con.prepareStatement(sql1);
		
		pst.setInt(1,0);
		pst.setString(2,rpojo.getName());
		pst.setString(3,rpojo.getEmail());
		pst.setString(4,rpojo.getPwd());
		pst.setString(5,rpojo.getGender());
		pst.setString(6,rpojo.getCountry());
		pst.setLong(7,rpojo.getPhno());
		pst.setString(8,rpojo.getRdate());
		
		int i=pst.executeUpdate();
		
		String sql2="insert into login values(?,?)";
		pst=con.prepareStatement(sql2);
		
		pst.setString(1,rpojo.getEmail());
		pst.setString(2,rpojo.getPwd());
		
		int j=pst.executeUpdate();
		
		if(i>0 && j>0)
			return "success";
			else
				return "error";
		
	}
}
