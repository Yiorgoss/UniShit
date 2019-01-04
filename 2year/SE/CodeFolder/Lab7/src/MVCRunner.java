package controllers;

import models.SimpleSums;
import InputWindows.FrameInputWindow;
import InputWindows.ConsoleInputWindow;
import InputWindows.FrameInputWindow2;
import observers.ObserverFrame;

public class MVCRunner {

    public static SimpleSums model;
    public static FrameInputWindow frame;
    public static FrameInputWindow2 frame2;
    public static ConsoleInputWindow console;
    public static FrameController controller;
    public static FrameController2 controller2;
    public static ConsoleController consController;
    //public static ObserverFrame observerFrame;

    public static void main(String[] args) {
        /**
         * Initialise the variables to be used.
         */
        model = new SimpleSums(); // The SimpleSums Model Class
        frame = new FrameInputWindow(); // First Input
        frame2 = new FrameInputWindow2(); // Second Input
        console = new ConsoleInputWindow();// Third Input
        
        controller = new FrameController(model, frame);
        controller2 = new FrameController2(model, frame2);
        consController = new ConsoleController(model, console);
        console.addController(consController);
// Create a new instance of the MVCRunner class (this class  ).
        MVCRunner anMVC = new MVCRunner();
// Show the first view
        anMVC.showInput();
// Show the second view
        anMVC.showInput2();
// add the observers
        anMVC.addObservers();
        // Show the final view     
        anMVC.showConsoleInput();

    }

    /**
     * Show the first input window
     */
    public void showInput() {
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    /**
     * Show the second input window
     */
    public void showInput2() {
        int xPos = frame.getLocation().x;
        int yPos = frame.getLocation().y;
        int height = frame.getHeight();
        frame2.setLocation(xPos, yPos - height);
        frame2.setVisible(true);
    }

    /**
     * Code to get inputs from the console.
     */
    public void showConsoleInput() {
        boolean isContinue = true;
        console.showOpeningMessage();
        while (isContinue) {
            console.setInputs();            
            isContinue = console.checkForExit();
        }
    }

    //Add observers to the observable
    public void addObservers() {
        for (int i = 0; i < 3; i++) {
            model.addObserver(new ObserverFrame(i));
        }
    }
}