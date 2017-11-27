import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreateUserGUI {
    public static void addComponents( Container pane ) {
        pane.setLayout( new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel label;
        JTextField nameField;
        JTextField idField;
        JTextField balField;
        JButton button;

        IO IO = new IO();

        label = new JLabel( "Enter Name" );
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add( label, c );

        label = new JLabel( "Enter ID" );
        c.gridx = 1;
        c.gridy = 0;
        pane.add( label, c );

        label = new JLabel( "Enter Balance" );
        c.gridx = 2;
        c.gridy= 0;
        pane.add( label, c );

        nameField = new JTextField( 20 );
        c.gridx = 0;
        c.gridy = 1;
        pane.add( nameField, c );

        idField = new JTextField(20);
        c.gridx = 1;
        c.gridy = 1;
        pane.add( idField, c );

        balField = new JTextField(20);
        c.gridx = 2;
        c.gridy = 1;
        pane.add( balField, c );

        button = new JButton( "Create User" );
        c.gridx = 1;
        c.gridy = 2;
        pane.add( button, c );

        button.addActionListener( new ActionListener() {
                public void actionPerformed( ActionEvent e ) {
                    try{
                        Integer.parseInt(idField.getText()); //exception handling
                        Double.parseDouble( balField.getText() ); //exception handling
                        String content = nameField.getText()+","+idField.getText()+","+balField.getText();
                        String fname = nameField.getText()+":"+idField.getText();
                        IO.outFile( fname, content );
                        System.out.println( "User Created!" );
                    } catch( Exception ex ) {
                        System.out.println("Incorrect Field Entries");
                    }
                }
            });
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Create User");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        addComponents( frame.getContentPane() );

        frame.pack();
        frame.setVisible( true );
    }

    public static void main( String[] args ) {
        javax.swing.SwingUtilities.invokeLater( new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }
}