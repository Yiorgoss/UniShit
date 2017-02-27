import java.awt.*;
import java.awt.event.*;

public  class VehicleWindow extends Frame implements ActionListener {
    GUI obj;
    VehicleWindow( GUI obj ) {
        this.obj = obj;
    }
    public void actionPerformed( ActionEvent e ) {
        Button acceltest;
        Button consumtest;

        TextField AccelText;
        TextField ConsumpText;
        
        Frame vehicle = new Frame( );
        vehicle.setSize( 600, 600 );
        vehicle.setLayout( new GridLayout( 2, 1 ));
        vehicle.setVisible( true );
        
        System.out.println( e.getActionCommand() );
        vehicle.addWindowListener( new WindowAdapter() {
            public void windowClosing( WindowEvent WindowEvent ) {
                System.exit(0);
            }
        });
        
        String text = GUI.weighttext.getText();
        double weight = Double.parseDouble( text );
        text = GUI.horsepowertext.getText();
        double horsepower = Double.parseDouble( text );
        text = GUI.aerodynamicstext.getText();
        double aerodynamics = Double.parseDouble( text );
        text = GUI.topspeedtext.getText();
        double topspeed = Double.parseDouble( text );
        text = GUI.carryweighttext.getText();
        double carryweight = Double.parseDouble( text );
        
        if( e.getActionCommand() == "Create Van" ) {
            Van van = new Van( weight, horsepower, aerodynamics, carryweight, topspeed );
            vehicle.add( AccelText = new TextField( "Vans acceleration = "+ Van.acceleration()));
            vehicle.add( ConsumpText = new TextField( "Vans consumption = "+ Van.consumption()));
            vehicle.setTitle( van.toString());
            AccelText.setEditable( false );
            ConsumpText.setEditable( false );
        }
        
        if( e.getActionCommand() == "Create Sports Car" ) {
            SportsCar sportscar = new SportsCar( weight, horsepower, aerodynamics, topspeed, carryweight );
            vehicle.add( AccelText = new TextField( "Sport Car acceleration = " + SportsCar.acceleration()));
            vehicle.add( ConsumpText = new TextField( "Sport Car acceleration = "+ SportsCar.consumption()));
            vehicle.setTitle( sportscar.toString() );
            AccelText.setEditable( false );
            ConsumpText.setEditable( false );
        }
        
        
        
    }
}
