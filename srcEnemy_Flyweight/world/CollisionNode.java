//	Copyright 2009 Nicolas Devere
//
//	This file is part of FLESH SNATCHER.
//
//	FLESH SNATCHER is free software; you can redistribute it and/or modify
//	it under the terms of the GNU General Public License as published by
//	the Free Software Foundation; either version 2 of the License, or
//	(at your option) any later version.
//
//	FLESH SNATCHER is distributed in the hope that it will be useful,
//	but WITHOUT ANY WARRANTY; without even the implied warranty of
//	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//	GNU General Public License for more details.
//
//	You should have received a copy of the GNU General Public License
//	along with FLESH SNATCHER; if not, write to the Free Software
//	Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

package world;

import jglcore.JGL_3DVector;
import phys.Trace;


/**
 * 
 * @author Nicolas Devere
 *
 */
public interface CollisionNode {
	
	public String getName();
	
	public void setInGame(boolean arg);
	
	public void addPvs(CollisionNode arg);
	
	public boolean collideRecursive(Trace trace);
	
	public boolean collideSimple(Trace trace, boolean test);
	
	public boolean intersect(JGL_3DVector p1, JGL_3DVector p2);
	
	public boolean isIn(Trace trace);
	
	public boolean isCrossing(Trace trace);
}