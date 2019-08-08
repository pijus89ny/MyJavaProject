package oopsdemo;

public class EncasulationDemo1 {
  private String nameOfTheStudent;
  private int monthlyincome;
  private int ssn;
public String getNameOfTheStudent() {
	return nameOfTheStudent;
}
public void setNameOfTheStudent(String nameOfTheStudent) {
	this.nameOfTheStudent = nameOfTheStudent;
}
public int getMonthlyincome() {
	return monthlyincome;
}
public void setMonthlyincome(int monthlyincome) {
	this.monthlyincome = monthlyincome;
}
public int getSsn() {
	return ssn;
}
public void setSsn(int ssn) {
	this.ssn = ssn;
}
public static void main(String[] args) {
	
	EncasulationDemo1 abc=new EncasulationDemo1();
	abc.nameOfTheStudent="pijus";
	abc.monthlyincome=1200;
	abc.ssn=646;
	System.out.println("the name :"+abc. nameOfTheStudent);
	System.out.println("the monthly:"+abc.monthlyincome);
	System.out.println("the ssn:"+abc.ssn);
	
}
}
