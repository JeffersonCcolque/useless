public class Student {
	
	int cui;
	String email;
	String name;
	String lastnamef;
	String lastnamem;
	int year;
	int month;
	int day;
	
	//String birthdate;
	
	String gender;
	boolean status;
	
	public void setCui(int c) {
		this.cui = c;
	}
	public void setEmain(String e){
		this.name = e;
	}
	public void setName(String n){
		this.name = n;
	}
	public void setLastnamef(String lf){
		this.name = lf;
	}
	public void setLastnamem(String lm){
		this.name = lm;
	}
	public void setYear(int y) {
		this.year = y;
	}
	public void setMonth(int m) {
		this.month = m;
	}
	public void setDay(int d) {
		this.day = d;
	}
	
	/*public void setBirthdate(String b){
		this.name = b;
	}
    */
	
	public int getCui(){
		return this.cui;
	}
	public String getEmail(){
		return this.email;
	}
	public String getName(){
		return this.name;
	}
	public String getLastamef(){
		return this.lastnamef;
	}
	public String getLastamem(){
		return this.lastnamem;
	}
	public int getYear(){
		return this.year;
	}
	public int getMonth(){
		return this.month;
	}
	public int getDay(){
		return this.day;
	}
	
	/*public void getBirthdate() {
		return this.birthDate;
	}
	*/
	
	public String getGender() {
		return this.gender;
	}
	public boolean getStatus() {
		return this.status;
	}
}
