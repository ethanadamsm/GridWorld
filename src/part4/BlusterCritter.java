package part4;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter{

	private int c;
	
	public BlusterCritter(int c) {
		this.c = c;
	}
	
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		for (Location loc : getLocationsAround()) {
			Actor a = getGrid().get(loc);
			if (a != null && loc != getLocation() && a instanceof Critter)
				actors.add(a);
		}
		return actors;
	}
	
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		System.out.println("There are: " + (n - 1) + " critters");
		if (n <= c){
			setColor(getColor().brighter());
			System.out.println("Getting brighter");
			return;
		}else if(n >= c){
			setColor(getColor().darker());
			System.out.println("Getting darker");
			return;
		}
	}
	
	public ArrayList<Location> getLocationsAround() {
		int column = getLocation().getCol() - 2;
		int row = getLocation().getRow() - 2;
		ArrayList<Location> locs = new ArrayList<Location>();
		for(int i = 0; i < 5; i++){
			for(int x = 0; x < 5; x++){
				if(getGrid().isValid(new Location(row, column))){
					locs.add(new Location(row, column));
					System.out.println(row + " " + column);
				}
				column ++;
			}
			column = getLocation().getCol() - 2;
			row++;
		}
		return locs;
	}

}
