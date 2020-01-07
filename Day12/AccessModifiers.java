package Day12;

class AccessModifiers{
	int NewECode;

	public static void main(String [] args){
	       Exam e = new Exam();
               AccessModifiers am = new AccessModifiers();
	       e.ExamNumber =599;
               e.ExamName="Finals";
               e.ExamSub ="Cloud computing";
	       am.NewECode =400;

	       System.out.println("Exam number: "+e.ExamNumber);
	       System.out.println("Exam name: "+e.ExamName);
	       System.out.println("Exam Subject: "+e.ExamSub);
	       System.out.println("Exam Code :"+ am.NewECode);
               	       

	}
}
	class Exam{
	       	int ExamNumber;          //default type It can be accessed in same class and same package and non subclass
	       	public String ExamName;  //public can be used anywhere
	       	private int ExamCode;    //protected can only be used in same class
	       	protected String ExamSub;//Protected can be used in Same package, same class and non subclass as well as different package subclass
	}
