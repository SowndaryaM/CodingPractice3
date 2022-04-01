package JavaSessions_Practice;

public class FinalizeConcept {
	// finalize is is method
	public void finalize() {
		System.out.println(
				"finalize method will be called automatically just before executing the system.gc() inside main method just to cleanup the processing of the object");
	}

	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();

		f1 = null;
		f2 = null;
		// if there is no reference or reference is having null value then immediately
		// garbage collector will be called automatically and it will destroy the
		// reference having null or not having any value

		// to manually call garbage collector:
		System.gc();

	}

}
