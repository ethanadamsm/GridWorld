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
