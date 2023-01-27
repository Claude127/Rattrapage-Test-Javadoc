package contract;

import java.io.IOException;

/**
 * the Interface IOrderPerformer.
 * This interface contains the method that will allow the classes that implement it to manage the movements of the user.
 * @author GROUP 10
 * @see IOrderPerformer#orderPerform(UserOrder)
 *
 */
public interface IOrderPerformer {

		/**
		 * this method allows to update the new displacements of the user in the classes which will use it.
		 * @param userOrder
		 * @throws IOException
		 * 
		 * @see Controller#orderPerform
		 */
		void orderPerform(UserOrder userOrder) throws IOException;

}
