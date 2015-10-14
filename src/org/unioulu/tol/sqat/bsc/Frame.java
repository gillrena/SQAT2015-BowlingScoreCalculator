package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		//to be implemented
		int totalScores = 0;
		if(isStrike()){
			totalScores = bonus() + 10;
		}else if(isSpare()){
			totalScores = bonus() + 10;
		}else{
			totalScores = firstThrow + secondThrow;
		}
		
		return totalScores;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		//to be implemented
		if(firstThrow == 10){
			return true;
		}else{
			return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		if((firstThrow+secondThrow)==10){
			return true;
		}else{
			return false;
		}
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
