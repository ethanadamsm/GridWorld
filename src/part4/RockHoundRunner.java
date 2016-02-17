package part4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class RockHoundRunner {

	public static void main(String args[]){
		ActorWorld world = new ActorWorld();
		world.add(new Location(4, 4), new RockHound());
		world.add(new Location(2, 3), new Rock());
		world.show();
	}

}
