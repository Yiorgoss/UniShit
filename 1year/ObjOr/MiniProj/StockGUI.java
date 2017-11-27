import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class StockGUI {

    private static StockParse inpStocks;
    private static UserInp inpUser;    
    //private User user1 = UserInp.initUser();
    static User user1;

    private static ArrayList<Stock> stocks;
    /*
    public static String purchase( String aamount, String pprice, String bbalance ){
    double balance = Double.parseDouble( bbalance );
    double price = Double.parseDouble( pprice );
    double amount = Double.parseDouble( aamount );

    balance = balance - price * amount;
    String message =","+aamount+",";

    return message;
    }*/

    public static void addComponents( Container pane, String[] args ) {

        pane.setLayout( new GridBagLayout() );
        GridBagConstraints c = new GridBagConstraints();
        user1 = new User( args[0] );
        JLabel titles;

        titles = new JLabel( " Name of Stock ");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add( titles, c );

        titles = new JLabel( " Ask Price " );
        c.gridx = 1;
        c.gridy = 0;
        pane.add( titles, c );

        titles = new JLabel( " Bid Price " );
        c.gridx = 2;
        c.gridy = 0;
        pane.add( titles, c );

        int counter = 1;
        for( Stock stock : stocks ) {

            JLabel label;
            JButton buyBut;
            JButton sellBut;
            JTextField text ;

            JLabel color = new JLabel( "" );
            if( stock instanceof RisingStock ) {
                color.setForeground( Color.green );
            } else {
                color.setForeground( Color.red );
            }

            label = new JLabel( stock.getName() );
            c.gridx = 0;
            c.gridy = counter;
            label.setForeground( color.getForeground() );
            pane.add( label, c );

            label = new JLabel( " "+Double.toString( stock.getAsk()));
            c.gridx = 1;
            c.gridy = counter;
            label.setForeground( color.getForeground() );
            pane.add( label, c );

            label = new JLabel( " "+Double.toString( stock.getBid()));
            c.gridx = 2;
            c.gridy = counter;
            label.setForeground( color.getForeground() );
            pane.add( label, c );

            buyBut = new JButton( "Buy" );
            c.gridx = 3;
            c.gridy = counter;
            pane.add( buyBut, c );

            sellBut = new JButton( "Sell" );
            c.gridx = 4;
            c.gridy = counter;
            pane.add( sellBut, c );

            text = new JTextField(10);
            c.gridx = 5;
            c.gridy = counter;
            pane.add( text, c );

            counter++;

            buyBut.addActionListener( new ActionListener() {
                    public void actionPerformed( ActionEvent e ) {
                        try{
                            String textfield = text.getText();
                            String[] arr = textfield.split(":");

                            Integer.parseInt(arr[1]); // exception handling
                            Owned own = new Owned( arr[0], Integer.parseInt( arr[1] ) );
                            if( own == null ) { 
                                System.out.println( arr[0]+"and"+arr[1]+"and"+stock.getAsk());
                            }
                            System.out.println( user1.getBalance() );
                            user1.buyStock( own, stock.getAsk());
                            System.out.println( user1.getBalance() ); //showing balance changed on purchase

                            String content = user1.getName()+","+user1.getID()+","+user1.getBalance()+","+user1.saveStocks( user1.getOwned());
                            saveChanges((user1.getName()+":"+user1.getID()), content);
                        }catch(Exception ex ) {
                            System.out.println("Incorrect Entry Field" );
                        }
                    }
                }); 
            sellBut.addActionListener( new ActionListener() {
                    public void actionPerformed( ActionEvent e ) {
                        try{
                            String textfield = text.getText();
                            String[] arr = textfield.split(":");

                            Integer.parseInt(arr[1]); // exception handling

                            Owned own = new Owned( arr[0], Integer.parseInt( arr[1] ) );
                            user1.sellStock( own, stock.getAsk());

                            String content = user1.getName()+","+user1.getID()+","+user1.getBalance()+","+user1.saveStocks( user1.getOwned());
                            saveChanges((user1.getName()+":"+user1.getID()), content);
                        }catch(Exception ex ) {
                            System.out.println("Incorrect Entry Field" );
                        }
                    }
                });
        }
    }

    public static void saveChanges( String fname, String content ) {
        IO IO = new IO();
        IO.outFile( fname, content );
    }

    private static void createAndShowGUI( String[] args) {
        JFrame frame = new JFrame(args[0]);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponents( frame.getContentPane(), args );
        frame.pack();
        frame.setVisible(true);
    }

    public static void main( String[] args ) {
        stocks = inpStocks.inputFile( "Stock_Search" );

        javax.swing.SwingUtilities.invokeLater( new Runnable() {
                public void run() {
                    createAndShowGUI( args );
                }
            });
    }   
}
