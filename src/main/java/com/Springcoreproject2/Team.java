package com.Springcoreproject2;

import java.util.*;
public class Team {
	private List<String>names;
		public void setNames(List<String> playersNames)
		{
			this.names=playersNames;
		}
		public void show()
		{
			names.forEach((val)->System.out.println(val));
		}
}
