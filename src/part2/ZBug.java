package part2;

import info.gridworld.actor.Bug;

public class ZBug extends Bug{
	private int sidelength;
	private int steps;
	private int part;

	public ZBug(int sidelength) {
		this.sidelength = sidelength;
		steps = 0;
		part = 0;
	}
	
	public void act(){
		if(part == 0 && steps < sidelength && canMove()){
			move();
			steps++;
		}else if(part == 1 && steps < sidelength && canMove()){
			move();
			steps++;
		}else if(part == 2 && steps < sidelength && canMove()){
			move();
			steps++;
		}
		if(steps == sidelength && part == 0){
			part++;
			steps = 0;
			for(int i = 0; i < 3; i++){
				turn();
			}
		}else if(steps == sidelength && part == 1){
			part++;
			steps = 0;
			for(int i = 0; i < 5; i++){
				turn();
			}
		}
	}

}
