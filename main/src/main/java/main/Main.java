package main;

import java.io.IOException;
import contract.IBoulderDashController;
import contract.IModel;
import controller.Controller;
import model.BoulderDashModel;
import view.View;

/**
 * The Class Main.
 *
 * @author GROUP 10
 */
public abstract class Main {


    private static String[] filenames = new String[] {"C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\map4.txt", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/background.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/boulder.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/diamond.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/door.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/greenMonster.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/ground.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/pDead.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/pDown.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/pLeft.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/pNope.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/pRight.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/pUp.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/pWin.png", "C:\\Users\\ouank\\OneDrive\\Bureau\\boulderdash_final\\JPU-BlankProject\\sprites/wall.png"};

    private static View view;
    private static IModel model;
    private static  IBoulderDashController controller;

    /**
     * The main method.
     *
     * @param args
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(final String[] args) {

    	 model = new BoulderDashModel(filenames[0], 1, 1);
    	 
    	 

         view = new View(model.getMap(), model.getMyPlayer());
         controller = new Controller(view, model);
         view.setOrderPerformer(controller.getOrderPerformer());

         controller.run();
       
                
    }
    
}

