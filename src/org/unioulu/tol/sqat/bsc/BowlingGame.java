package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private Frame Frame;
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int frameCounter = 0;
	private int prevTotalScore = 0;
	private int bonusForPrevFrame = 0;
	
	public BowlingGame(){
		
		
		
	}
	
	public void addFrame(Frame frame){
		//to be implemented
		for(int i=0; i<frames.size(); i++){
			frames.add(frame);
			frameCounter++;
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		if(getPrevFrame().isStrike()){
			bonusForPrevFrame = firstThrow;
		}else if(getPrevFrame().isSpare()){
			bonusForPrevFrame = firstThrow+secondThrow;
		}
		
	}
	
	public int score(){
		//to be implemented
		prevTotalScore = getPrevFrame().score() + bonusForPrevFrame;
		return prevTotalScore;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
	
	private Frame getPrevFrame(){
		return frames.get(frameCounter-1);
	}
	
	private Frame getCurFrame(){
		return frames.get(frameCounter);
	}
	
}
