Part 1:
1. No it does not always move a square in any direction.
2. Forward until it can not move in that direction anymore.
3. Turns clockwise.
4. Flowers.
5. The bug will turn in place until it can move forward.
6. It will go around it trying to reach a wall.
7. No.
8. The flower changes color over time.
9. No.
10. No.

1. North-east
	 East
	 South-east
	 South
	 South-west
	 West
	 North-west
	 North
2. Move to an spot on the grid, as far as you can go without hitting a wall, it won't move the bug.
3. setColor()
4. It died.

Part 2:
1. It is used to show how big the square should be relative to the sideLength\
2. Is used as a count to show how many steps have been taken.
3. So that it can turn to 180 degrees.
4. The class bug that it implements has the method move().
5. It depends, a method is given to change it later.
6. No, it uses the same algorithm to move the bug.
7. After it turns to a new direction.

Part 3:
1. loc1.getRow();
2. false
3. new Location(4, 4)
4. 135
5. It uses a constants that adjusts the location to make it the AdjacentLocation.

1. getOccupiedLocations()
2. getEmptyLocations()
3. getNumRows() and getNumCols() to check number of rows and columns
4. It extends gridworld, the method implementations are in the gridworld class
5. No, because an array is not dynamic. It would not make sense to return something static when the actors are dynamic.

1. The color, direction, and location
2. 0 degrees and red
3. Actor has different implementations for different types of actors
4. No, No, No the class instance is destroyed.
5. turn(), turn()

1. If gr == null return false;
2. return (neighbor == null) || (neighbor instanceof Rock);
3. getGrid(), gr.get(next)
4. getAdjacentLocation() to figure out the location in front of the actor. getLocation to find the current location.
5. get(next) to find actors on a location
6. It keeps it at the current location of the actor.
7. Yes, getLocation could be used instead of a loc variable. 
8. When it is creating the flower it sets its color to the color of the bug that placed it.
9. Yes
10. flower.putSelfInGrid(gr, loc);
11. 4 times

Part 4:
1. getActors(), processActors(), getMoveLocations(), selectMoveLocation(), makeMove()
2. getActors, processActors, getMoveLocations, selectMoveLocation, makeMove
3. No, because that is a primitive method non-unique to each Critter, is the super class method that uses hook methods. 
4. Comparing the different actors that could be there, Rock, Bug, Actor etc.
5. Has to check actors, has to compare them, has to find available spots to move, then it will move.
6. Critter extends actor which has a constructor.

1. It overwrites hook methods that are called by act within the superclass, Critter
2. The critter would delete itself because it the loc would be null. 
3. You could create a flower object and put it in the grid using the putSelfInGrid method and passing in the grid and the location that you wanted to put it at. 
4. It doesn't need to change the way that it finds the actors around it, it only needs the actors adjacent.
5. Actor
6. Grid<Actor> getGrid()

1. All that the crab critter does is eat things around it that aren't rocks or other critters. 
2. It finds the actors in front of it, left of it and right of it. Then it "eats" the ones that aren't critters or rocks, by destroying the actor object within the grid.
3. It only wants actors in directions that it specifies using the frame of where it is already looking, so using directions would be able to happen at any point. 
4. (3, 3), (3, 5), (4, 4)
5. Critters and crab critters can move to the same point depending on how they are programmed, but the crab critter can only move left and right whereas a regular critter can move in any direction adjacent to it. 
6. If the crab can't move either left or right, it will turn a random number of turns. 
