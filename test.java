/**
 TEST File
 **/

 public class Test {

 	public Test() {

 	}

 	public void testCommit() {
 		System.out.printf("Commit Test ");
 	}

 	public void testStage() {
 		System.out.printf("Stage File Test");
 	}

 	public boolean testStashe() {
 		System.out.printf("Stashe Test");
 		return false;
 	}

 	public boolean testConflictMaster() {
 		System.out.printf("Conflict Test Master");

 		return true;
 	}

	public boolean testConfilictDev() {
		System.out.printf("Confilict Test DEV");

		return true;
	}

 }