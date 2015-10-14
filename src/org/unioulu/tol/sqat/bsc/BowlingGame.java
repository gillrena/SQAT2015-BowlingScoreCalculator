package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		
		
		
	}
	
	public void addFrame(Frame frame){
		//to be implemented
		for(int i=0; i<=10; i++){
			frames.add(frame)
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		
		if(firstThrow==10 || (firstThrow+secondThrow)==10){
			
		}
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		if(bonus.bonus()>0){
			return true;
		}else{
			return false;
		}
	}
}
