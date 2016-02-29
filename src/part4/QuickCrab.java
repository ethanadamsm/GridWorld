package part4;

import java.util.ArrayList;

import info.gridworld.grid.Location;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Grid;

public class QuickCrab extends CrabCritter{
	
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] dirs = { Location.AHEAD, Location.HALF_LEFT, Location.HALF_RIGHT };
		for (Location loc : getLocationsInDirections(dirs)) {
			Actor a = getGrid().get(loc);
			if (a != null)
				actors.add(a);
		}
		getLocations();
		return actors;
	}
	
	public ArrayList<Location> getLocations(){
		System.out.println("The crab is at: (" + getLocation().getRow() + ", " + getLocation().getCol() + ")");
		Grid gr = getGrid();
		ArrayList<Location> locations = new ArrayList<Location>();
		int[] directions = new int[]{Location.LEFT, Location.RIGHT};
		for (int d : directions) { //for loop that first finds the adjacent locations of the critter
			Location neighborLoc = getLocation().getAdjacentLocation(getDirection() + d);
			if (gr.isValid(neighborLoc))
				System.out.println("The loc = (" + neighborLoc.getRow() + ", " + neighborLoc.getCol() + ")");
				locations.add(neighborLoc);
		}
		System.out.println("----------------");
		for (Location loc : locations) { //finds the adjacent to the adjacent
			for(int d: directions){
				Location neighborLoc = loc.getAdjacentLocation(getDirection() + d);
				System.out.println("The loc = (" + neighborLoc.getRow() + ", " + neighborLoc.getCol() + ")");
				//System.out.println(neighborLoc.getCol() != getLocation().getCol());
				if (gr.isValid(neighborLoc) && (neighborLoc.getRow() != getLocation().getRow()) || (neighborLoc.getCol() != getLocation().getCol())){
					System.out.println("Adding location ^");
					locations.add(neighborLoc);
				}else{
					System.out.println("Didn't add");
				}
			}
		}
		System.out.println("----------------");
		for(Location loc: locations){
			System.out.println("The loc = (" + loc.getRow() + ", " + loc.getCol() + ")");
		}
		return locations;
	}
	
}
