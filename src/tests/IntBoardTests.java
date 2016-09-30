package tests;

import experiment.*;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class IntBoardTests {
	IntBoard board;
	
	@Before
	public void initialize() {
		board = new IntBoard();
	}
	
	/*
	 * Test adjacencies for top left corner
	 */
	@Test
	public void testAdjacency0()
	{
		BoardCell cell = board.getCell(0,0);
		Set<BoardCell> testList = board.getAdjList(cell);
		assertTrue(testList.contains(board.getCell(1, 0)));
		assertTrue(testList.contains(board.getCell(0, 1)));
		assertEquals(2, testList.size());
	}
	
	/*
	 * Test adjacencies for bottom right corner
	 */
	@Test
	public void testAdjacency1()
	{
		
	}
	
	/*
	 * Test adjacencies for a right edge
	 */
	@Test
	public void testAdjacency2()
	{
		
	}
	
	/*
	 * Test adjacencies for a left edge
	 */
	public void testAdjacency3()
	{
		
	}
	
	/*
	 * Test adjacencies for second column middle of grid
	 */
	public void testAdjacency4()
	{
		
	}
	
	/*
	 * Test adjacencies for last column, middle of grid
	 */
	public void testAdjacency5()
	{
		
	}
}
