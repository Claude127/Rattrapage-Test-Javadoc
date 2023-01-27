package contract;


/**
 * 
 * this interface contents the main method of the controller.
 * @author GROUP 10
 *  @see IBoulerDashController#run()
 *
 */
public interface IBoulderDashController {
	
	/**
	 * this method allow to assure the run function in the controller .
	 * @throws InterruptedException
	 * @see IBoulerDashController#getOrderPerformer()
	 */
	void run();
	
	/**
	 * this method allow to get the orderperformer choosed by the user .
	 * @return the orderPerformer choose by the user.
	 */
	IOrderPerformer getOrderPerformer();
}
