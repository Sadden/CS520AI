package sadden.maze.make;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sadden.LCS.typical.Word_function;
public class JTest {

	@Before
	public void Inite()
	{
		System.out.println("before the test");
	}
	
	@Test
	public void Test()
	{
		System.out.println("begin the test");
		Maze maze = new Maze(10, 0.1);
		maze.showMaze();
//		BFS bfs = new BFS(maze);
//		bfs.doBFS();
		
		
//		DFS dfs = new DFS(maze);
//		dfs.doDFS();
		
		Astar A = new Astar(maze);
		A.doAstarManhattan();
		
	}
	@After
	public void delete()
	{
		System.out.println("after the test");
	}
}
