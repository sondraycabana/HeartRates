public class HeartRates{
	String firstName;
	String lastName;
	int  dayOfBirth;
	int  monthOfBirth;
	int  yearOfBirth;
public HeartRates(String firstName,String lastName,int dayOfBirth,int monthOfBirth,int yearOfBirth){
  	this.firstName = firstName;
	this.lastName = lastName;
	this.dayOfBirth = dayOfBirth;
	this.monthOfBirth = monthOfBirth;
	this.yearOfBirth = yearOfBirth;
	}

	public void setFName(String firstName){
  	this.firstName = firstName;
	}
	public String getFName(){
		return firstName;
		}

	public void setLName(String lastName){
  	this.lastName = lastName;
	}
	public String getLName(){
		return lastName;
		}
	
	public void setDayOfBirth(int dayOfBirth){
  	this.dayOfBirth = dayOfBirth;
	}
	public int getDayOfBirth(){
		return dayOfBirth;
		}

	public void setMonthOfBirth(int monthOfBirth){
  	this.monthOfBirth = monthOfBirth;
	}
	public int getMonthOfBirth(){
		return monthOfBirth;
		}

	public void setYearOfBirth(int yearOfBirth){
  	this.yearOfBirth = yearOfBirth;
	}
	public int getYearOfBirth(){
		return yearOfBirth;
		}

//To calculate person's age in years
public int personAge(){       
	int calcAge =  2020 - yearOfBirth; 
	return calcAge;
	}

//To calculate person's  max  heart rate
public int personMaxRate(){       
	int calcmax = 220 - personAge();
	return calcmax;
	}

//To calculate person's  target  heart rate
public double personTargetRate(){       
	double calcTarget = (personMaxRate() * 0.85);
	return calcTarget;
	}

//To calculate person's  BMI
public double personTargetRate(){       
	 double calcBMI = (weight * 703) / (height * height);
	return calcBMI;
	}

}