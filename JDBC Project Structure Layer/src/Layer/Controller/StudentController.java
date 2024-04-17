package Layer.Controller;

import Layer.Service.StudentService;

public class StudentController {
	public static void main(String[] args) throws Exception {
		StudentService ss = new StudentService();
		ss.insertD();
		ss.insertDPS();
		ss.insertPPS(557, "Anaya", "Amravati");
	}
}
