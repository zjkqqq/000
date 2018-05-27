package dbc;
import java.sql.Connection;
import java.sql.DriverManager;
public class DatabaseConnection {
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";//驱动器名称
	//private static final String DBURL = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=GBK";
	private static final String DBURL = "jdbc:mysql://localhost:3306/chatroom";//URL指向要访问的数据库名mysql
	private static final String DBUSER = "root";//MySQL配置时的用户名
	private static final String DBPASSWORD = "104079";//密码
	private Connection conn;//声明connection对象
	
	public DatabaseConnection() throws Exception{
		Class.forName(DBDRIVER);
		this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
	}
	public Connection getConnection(){
		return this.conn;
	}
	public void close() throws Exception{
		if(this.conn != null){
			try{
				this.conn.close();
			}catch(Exception e){
				throw e;
			}
		}
	}
}
