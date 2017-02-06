import java.awt.*;

public class GUI {

    
    GUI( ) {
        Frame f = new Frame();
        
        Button button = new Button( "Create SportsCar" );
        button.setBounds( 30, 100, 80, 30 );
        
        f.add( button );
        f.setSize( 300, 300 );
        f.setLayout( null );
        f.setVisible( true );
    }
    public static void main( String[] args ) {
        GUI gui = new GUI();
    }
    public static void createVan( ) {
        Van van = new Van();
    }
    
}
