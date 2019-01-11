import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;
public class JtableExample extends JFrame {
	Vector vect = new Vector();
	String title[] = { "编号", "姓名", "生日", "学校" };
	// 继承AbstractTableModel
	AbstractTableModel tm = new AbstractTableModel() {
		public int getColumnCount() {
			return title.length;
		}
		public int getRowCount() {
			return vect.size();
		}
		public Object getValueAt(int row, int column) {
			if (!vect.isEmpty())
				return ((Vector) vect.get(row)).get(column);
			else
				return null;
		}
		public String getColumnName(int column) {
			return title[column];
		}
		public void setValueAt(Object value, int row, int column) {
		}
		public boolean isCellEditable(int row, int column) {
			return false;
		}
	};

	JTable jt = new JTable(tm);
	JScrollPane jsp = new JScrollPane(jt);
	public JtableExample() throws SQLException, ClassNotFoundException {
		Connection c = connect();
		Statement s = c.createStatement();
		String sql = "select * from student";
		ResultSet r = s.executeQuery(sql);
		showResult(r);
		// 设置table内的单行选定(JTable利用的是ListSelectionModel)
		jt.getSelectionModel().setSelectionMode(
				ListSelectionModel.SINGLE_SELECTION);
		// 添加表格(选定行)的双击左键事件
		jt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) { // 鼠标双击
				// 以下三句为：双击删除选定行
					int row = jt.getSelectedRow();
					vect.removeElementAt(row);
					tm.fireTableStructureChanged();
				}
			}
		});
		this.getContentPane().add(jsp, BorderLayout.CENTER);
	}
	// 连接数据库方法 返回类型为 Connection
	public Connection connect() throws SQLException, ClassNotFoundException {
		String dburl = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=student.mdb";
		// 数据库字段为：文本，文本，日期，文本
		String user = "";
		String password = "";
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c = DriverManager.getConnection(dburl, user, password);
		return c;
	}
	// 以DataGrid 样式显示数据库中的查询结果
	public void showResult(ResultSet rs) throws SQLException {
		vect.removeAllElements();
		tm.fireTableStructureChanged();
		while (rs.next()) {
			Vector rec_vector = new Vector();
			rec_vector.addElement(rs.getString(1));
			rec_vector.addElement(rs.getString(2));
			rec_vector.addElement(rs.getDate(3));
			rec_vector.addElement(rs.getString(4));
			vect.addElement(rec_vector);
		}
		tm.fireTableStructureChanged();
	}
	public static void main(String[] args) throws SQLException,
			ClassNotFoundException {
		JtableExample fm = new JtableExample();
		fm.setSize(400, 200);
		fm.setTitle("DataGrid显示数据库和JTable操作");
		fm.setVisible(true);
	}
}
