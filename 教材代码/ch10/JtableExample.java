import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import javax.swing.table.*;
public class JtableExample extends JFrame {
	Vector vect = new Vector();
	String title[] = { "���", "����", "����", "ѧУ" };
	// �̳�AbstractTableModel
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
		// ����table�ڵĵ���ѡ��(JTable���õ���ListSelectionModel)
		jt.getSelectionModel().setSelectionMode(
				ListSelectionModel.SINGLE_SELECTION);
		// ��ӱ��(ѡ����)��˫������¼�
		jt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) { // ���˫��
				// ��������Ϊ��˫��ɾ��ѡ����
					int row = jt.getSelectedRow();
					vect.removeElementAt(row);
					tm.fireTableStructureChanged();
				}
			}
		});
		this.getContentPane().add(jsp, BorderLayout.CENTER);
	}
	// �������ݿⷽ�� ��������Ϊ Connection
	public Connection connect() throws SQLException, ClassNotFoundException {
		String dburl = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ=student.mdb";
		// ���ݿ��ֶ�Ϊ���ı����ı������ڣ��ı�
		String user = "";
		String password = "";
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection c = DriverManager.getConnection(dburl, user, password);
		return c;
	}
	// ��DataGrid ��ʽ��ʾ���ݿ��еĲ�ѯ���
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
		fm.setTitle("DataGrid��ʾ���ݿ��JTable����");
		fm.setVisible(true);
	}
}
