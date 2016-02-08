package part2;

import info.gridworld.actor.Bug;

public class CircleBug extends Bug {

	private int sideLength;
	private int steps;
	
	public CircleBug(int sidelength) {
		this.sideLength = sidelength;
		steps = 0;
	}
	
	public void act(){
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else {
			turn();
			turn();
			steps = 0;
			sideLength++;
		}
	}

}
