package Layer.Service;

import DAO.StudentDAO;

public class StudentService {
	public void insertD() throws Exception{
	StudentDAO obj1 = new StudentDAO();
	obj1.insertD();
	}
	public void insertDPS() throws Exception{
		StudentDAO obj2 = new StudentDAO();
		obj2.insertDPS();
		}
	public void insertPPS(int id,String name,String address) throws Exception{
		StudentDAO obj3 = new StudentDAO();
		obj3.insertPPS(id,name,address);
		}
}
