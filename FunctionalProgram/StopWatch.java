/******************
 * Logical Programs
 * purpose : Stopwatch Program for measuring the time 
 *           that elapses between the start and end clicks
 * @discription
 * @file StopWatch.java
 * @author soundarya<ksoundarya4>
 * @version 1.0
 * @since 11/12/2019
 */
package com.bridgelabs.FunctionalProgram;

public class StopWatch {

	private long startWatch;
	private long stopWatch;
	private boolean running;

	/**
	 * Function to start StopWatch
	 * 
	 * @param{long}startWatch - stores starting time
	 * @return - nothing
	 */
	public void start() {
		startWatch = System.currentTimeMillis();
		running = true;
	}

	/**
	 * Function to Stop StopWatch
	 * 
	 * @param{long}stopWatch - stores stopping time
	 * @return - nothing
	 */
	public void stop() {
		stopWatch = System.currentTimeMillis();
		running = false;
	}

	/**
	 * Function to calculate Elapsed time
	 * 
	 * @param{long}elapsed - calculates time elapsed
	 * @return - returns time elapsed
	 */
	public long getElapsed() {

		long elapsed = 0;
		if (running)
			elapsed = System.currentTimeMillis() - startWatch;
		else
			elapsed = stopWatch - startWatch;
		return elapsed;

	}

	public static void main(String[] args) {
		try {
			StopWatch s = new StopWatch();
			s.start();

			// to check the time ellapsed
			Thread.sleep(1450);

			s.stop();
			System.out.println("Time elapsed = " + (1.0 * s.getElapsed()) / 1000 + "s");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}