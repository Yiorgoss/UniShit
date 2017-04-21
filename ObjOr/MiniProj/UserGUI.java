import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserGUI extends IO{

    public static void addComponents( Container pane ) {
        
        //create compononents add to pane 
        //rinse and repeat
        pane.setLayout( new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JButton button;
        JTextField NameField;
        JTextField IDField;
        JLabel label;

        label = new JLabel( "Enter Name" );
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add( label, c );

        NameField = new JTextField(20);
        c.gridx = 0;
        c.gridy = 1;
        pane.add( NameField, c );

        label = new JLabel( "Enter ID" );
        c.gridx = 1;
        c.gridy = 0;
        pane.add( label, c );

        IDField = new JTextField(20);
        c.gridx = 1;
        c.gridy = 1;
        pane.add( IDField, c );

        button = new JButton("Log In");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 3;
        pane.add( button, c );

        button.addActionListener( new ActionListener () {
                public void actionPerformed( ActionEvent e ) {
                    try{ // exception handling
                        Integer.parseInt(IDField.getText() );
                        String nameid = NameField.getText() +":"+ IDField.getText();
                        
                        if( IO.isThereFile( nameid )) {
                            String[] args = new String[]{nameid};
                            SearchGUI.main(args);
                        } else {
                            System.out.println("User Not Found");
                        }
                    }catch( Exception ex ) { 
                        System.out.println("Incorrect Entry Field" );
                    }
                }
            });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Create Portfolio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponents( frame.getContentPane() );

        frame.pack();
        frame.setVisible(true);
    }

    public static void main( String[] args ) {
        javax.swing.SwingUtilities.invokeLater( new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}
