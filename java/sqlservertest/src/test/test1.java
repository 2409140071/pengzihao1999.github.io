package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {
	// ��������
	public static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	// �������ݿ��ַ������Ϣ
	public static String url = "jdbc:sqlserver://localhost:1433;DataBaseName=student";

	/*
	 * public static final String driver = "com.mysql.jdbc.Driver"; public
	 * static final String url = "jdbc:mysql://127.0.0.1/Demo";
	 */
	/*
	 * public static final String driver = "oracle.jdbc.driver.OracleDriver";
	 * public static final url = "jdbc:oracle:thin:@127.0.0.1:1521:Demo";
	 */
	public static void main(String[] args) throws Exception {
		Connection con = null;
		Statement sta=null;
		PreparedStatement psta;
		try {
			// ��һ��������������
			Class.forName(driver);
			// �ڶ������������ݿⲢ������ͨ��
			con = DriverManager.getConnection(url, "sa", "pengzihao929");
			System.out.println("con:="+con);
			System.out.println("�����ݿ�����");
			// ��������ͨ�����Ӷ��󴴽�Statement����SQL���
			sta = con.createStatement();	
//		
		//	 ���Ĳ���ִ��SQL���
		
			ResultSet rs = sta.executeQuery("select * from Table_1");
			//��������������ж�ȡ
			while(rs.next()){
				System.out.println("��ţ�"+rs.getString(1));
		
			
			}
			rs.close();
		}
			
//			String sql = "select * from book where bookID=?";
//			psta = con.prepareStatement(sql);
//			psta.setInt(1, 1);
//			ResultSet rs = psta.executeQuery();
//			
//			while(rs.next()){
//				System.out.println("��ţ�"+rs.getInt(1));
//				System.out.println("������"+rs.getString(2));
//				System.out.println("���ߣ�"+rs.getString(3));
//				System.out.println("�۸�"+rs.getFloat(4));
//				System.out.println("=======================");
//			}
//			rs.close();
////			int i = sta.executeUpdate("insert into book values('java','tom',50)");
////			if (i > 0) {
////				System.out.println("����ɹ�");
////			}
////			String author = "mike";
////			float price = 90;
////
////			String updateSql = "update book set author='" + author + "',price="
////					+ price + " where bookID=1";
////			i = sta.executeUpdate(updateSql);
////			if (i > 0) {
////				System.out.println("���³ɹ�");
////			}
////			
////			String delSql = "delete book where bookID=2";
////			i = sta.executeUpdate(delSql);
////			if (i > 0) {
////				System.out.println("ɾ���ɹ�");
////			}
//			sta.close();
//
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
		finally {
			// ���ر����ݿ�����ͨ��
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("�ر����ݿ�����");
		}
	}

}