package neuron.beans;


public class JavaCourse implements Courses {
	
	

	public  JavaCourse() {
		System.out.println("Java obj created by IOC");
	}
	public boolean courseSelection() {
		// TODO Auto-generated method stub
		System.out.println("Java Course Selected");
		return true;
	}

}
