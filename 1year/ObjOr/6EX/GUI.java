import java.awt.*;
import java.awt.event.*;

public class GUI {
    
    private Frame mainFrame;
    
    private Button vanbutton;   
    private Button sportscarbutton;
    
    protected static TextField weighttext;
    protected static TextField horsepowertext;
    protected static TextField aerodynamicstext;
    protected static TextField carryweighttext; 
    protected static TextField topspeedtext;

    public static void main( String[] args ) {
        new GUI();     
    }
    public GUI(){
        
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        
        mainFrame = new Frame();
        mainFrame.setLayout( layout );
        
        gbc.fill = GridBagConstraints.NONE;
        gbc.gridwidth = GridBagConstraints.RELATIVE;
        
        
        vanbutton = new Button( "Create Van" );
        gbc.gridx = 1;
        gbc.gridy = 1;
        layout.setConstraints( vanbutton, gbc );
        mainFrame.add( vanbutton );
        
        sportscarbutton = new Button( "Create Sports Car" );
        sportscarbutton.setSize( 100, 100 );
        gbc.gridx = 3;
        gbc.gridy = 1;
        layout.setConstraints( sportscarbutton, gbc );
        mainFrame.add( sportscarbutton );
        
        mainFrame.add( weighttext = new TextField( "Enter Weight" ) );
        mainFrame.add( horsepowertext = new TextField( "Enter Horsepower" )); 
        mainFrame.add( aerodynamicstext = new TextField( "Enter Aerodynamics" ));
        mainFrame.add( carryweighttext = new TextField( "Enter CarryWeight" ));
        mainFrame.add( topspeedtext = new TextField( "Enter TopSpeed" ));
        
        
        mainFrame.setSize( 700, 400 );
        
        weighttext.addMouseListener( new MouseAdapter() {
            public void mouseClicked( MouseEvent e ) {
                weighttext.setText( "" );
            }
        });
        horsepowertext.addMouseListener( new MouseAdapter() {
            public void mouseClicked( MouseEvent e ) {
                horsepowertext.setText( "" );
            }        
        });
        aerodynamicstext.addMouseListener( new MouseAdapter() {
            public void mouseClicked( MouseEvent e ) {
                aerodynamicstext.setText( "" );
            }
        });  
        carryweighttext.addMouseListener( new MouseAdapter() {
            public void mouseClicked( MouseEvent e ) {
                carryweighttext.setText( "" );
            }
        }); 
        topspeedtext.addMouseListener( new MouseAdapter() {
            public void mouseClicked( MouseEvent e ) {
                topspeedtext.setText( "" );
            }
        });
        VehicleWindow vw = new VehicleWindow( this );
        vanbutton.addActionListener( vw );
        
        sportscarbutton.addActionListener( vw );
        
        mainFrame.addWindowListener( new WindowAdapter() {
            public void windowClosing( WindowEvent WindowEvent ){
                System.exit( 0 );
            } 
        });
        
        mainFrame.setVisible( true );
    }
}
