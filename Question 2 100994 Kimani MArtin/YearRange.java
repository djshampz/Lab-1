public class YearRange{
	//Attributes
	int firstDivisor;
    int secondDivisor;
    int firstYear;
    int secondYear;
    int rangeType;


	//Constructor
	public YearRange( int min, int max){
       	firstYear = min;
       	secondYear = max;
    }
	
	//Getters
    public int getFirstDivisor(){
        return firstDivisor;
    }
    public int getSecondDivisor(){
        return secondDivisor;
    }
    public int getFirstYear(){
        return firstYear;
    }
    public int getSecondYear(){
        return secondYear;
    }
    public int getRangeType(){
        return rangeType;
    }

	//Setters
    public void setFirstDivisor(int newFirstDivisor){
        this.firstDivisor = newFirstDivisor;
    }
    public void setSecondDivisor(int newSecondDivisor){
        this.secondDivisor = newSecondDivisor;
    }
    public void setFirstYear(int newFirstYear){
        this.firstYear = newFirstYear;
    }
    public void setSecondYear(int newSecondYear){
        this.secondYear = newSecondYear;
    }
    public void setRangeType(int newRangeType){
        this.rangeType = newRangeType;
    }

	//Method
	public int printYears(){
		if(rangeType == 1){
			//Get all Divisible Years Between 14 and 20
			for(int i = firstYear; i <= secondYear; i++){
				if(i % 14 == 0 && i % 20 == 0){
					System.out.println(i);
				}

			}	
		}
		if(rangeType == 2){
			//Get all Leap years
			for(int i = firstYear; i <= secondYear; i++){
				if(i % 4 == 0){
					System.out.println(i);
				}
			}
		}
		if(rangeType == 3){
			//Get all Olympic Years Divisible by 3
			for(int i = firstYear; i <= secondYear; i++){
				if(i % 4 == 0 && i % 3 == 0){
					System.out.println(i);
				}
			}
		}
		return 0;
	}

}