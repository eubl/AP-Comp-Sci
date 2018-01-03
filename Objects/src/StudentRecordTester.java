
public class StudentRecordTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentRecord plato = new StudentRecord("Plato", "P312");
		
		plato.addClass(StudentRecord.HALF, StudentRecord.B);
		plato.addClass(StudentRecord.FULL, StudentRecord.A);
		
		StudentRecord aristotle = new StudentRecord("Aristotle", "A51");
		
		aristotle.addClass(StudentRecord.HALF, StudentRecord.A);
		aristotle.addClass(StudentRecord.FULL, StudentRecord.B);
		aristotle.addClass(StudentRecord.QUARTER, StudentRecord.A);
		
		System.out.println(plato);
		System.out.println(aristotle);
		
	}

}
