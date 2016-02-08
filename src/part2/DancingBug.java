package part2;
import info.gridworld.actor.Bug;

public class DancingBug extends Bug{
	private int[] array;
	private int position = 0;
	public DancingBug(int[] array) {
		this.array = array;
	}
	
	public void act(){
		if (position != array.length - 1){
			for(int i = 0; i < array[position]; i++){
				turn();
			}
			position++;
		}
		if (canMove()) {
			move();
		} else {
			turn();
		}
	}

}
