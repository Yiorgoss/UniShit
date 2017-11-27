import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchGUI {
    
    public static void addComponents( Container pane, String nameid ) {
        //create compononents add to pane 
        //rinse and repeat
        
        pane.setLayout( new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        JButton button;
        JTextField textField;
        
        textField = new JTextField( 20 );
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add( textField, c );
        
        button = new JButton( "Find Stock" );
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 1;
        pane.add( button, c );

        button.addActionListener( new ActionListener () {
            public void actionPerformed( ActionEvent e ) {
                
                //exception cannot be handled as it feeds straight into the API call
                //Must use Real Ticker stock names
                //trailing and leading whitespace handled however
                String temp = textField.getText();
                temp.trim();
                String[] text = new String[]{ temp };
                APICall.main( text );
                String[] args = new String[]{ nameid };
                StockGUI.main(args);
            }
        });
    }
    private static void createAndShowGUI( String nameid) {
        JFrame frame = new JFrame( nameid );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        addComponents( frame.getContentPane(), nameid );
        
        frame.pack();
        frame.setVisible(true);
    }
    public static void main( String[] args ) {
        javax.swing.SwingUtilities.invokeLater( new Runnable() {
            public void run() {
                    createAndShowGUI(args[0]);
            }
        });
    }
}