package part4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

public class BlusterRunner {
	
	public static void main(String[] args){
		ActorWorld world = new ActorWorld();
		world.add(new Location(5, 5), new BlusterCritter(2));
		world.add(new Location(4, 4), new Rock());
		world.add(new Location(3, 5), new Rock());
		world.add(new Location(7, 5), new Rock());
		world.show();
	}
	
}
