package part2;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner {

	public static void main(String[] args){
		ActorWorld world = new ActorWorld();
		DancingBug a = new DancingBug(new int[]{23, 1, 2, 3, 423, 1});
		world.add(new Location(5, 5), a);
		world.show();
	}

}