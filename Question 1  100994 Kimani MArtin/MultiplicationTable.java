public class MultiplicationTable{
	//Atributes
	int num;//Multiplication Number
	int min;//Range From
	int max;//Range to
	
	//Constructor
	public MultiplicationTable(int a, int b, int c){
		num = a;
		min = b;
		max = c;
	}

	//Getters
	public int getNum(){
		return num;
	}
	public int getMin(){
		return min;
	}
	public int getMax(){
		return max;
	}
	
	//Setters
	public void setNum(int newNum){
		this.num = newNum;
	}
	public void setMin(int newMin){
		this.min = newMin;
	}
	public void setMax(int newMax){
		this.max = newMax;
	}
	
	//Method
	public String printTable(){
		for(int j=min; j<=max; j++){
			System.out.println(num+"x"+j+"="+num*j); 
		}
		String x = "======================================================";
		return x;
	}

	
}