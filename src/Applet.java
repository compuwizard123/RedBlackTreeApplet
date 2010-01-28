import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyEvent;

public class Applet extends JApplet {

	private JPanel jContentPane = null;
	private JButton insert = null;
	private JButton remove = null;
	private JButton restart = null;
	private JTextField input = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JMenuItem jMenuItem = null;
	private JMenuItem jMenuItem1 = null;
	private JPanel jPanel = null;
	/**
	 * This is the xxx default constructor
	 */
	public Applet() {
		super();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	public void init() {
		this.setSize(1016, 564);
		this.setVisible(true);
		this.setJMenuBar(getJJMenuBar());
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getInsert(), null);
			jContentPane.add(getRemove(), null);
			jContentPane.add(getRestart(), null);
			jContentPane.add(getInput(), null);
			jContentPane.add(getJPanel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes insert	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getInsert() {
		if (insert == null) {
			insert = new JButton();
			insert.setBounds(new Rectangle(691, 493, 76, 26));
			insert.setText("Insert");
		}
		return insert;
	}

	/**
	 * This method initializes remove	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getRemove() {
		if (remove == null) {
			remove = new JButton();
			remove.setBounds(new Rectangle(795, 492, 91, 26));
			remove.setText("Remove");
			remove.addActionListener(null);


		}
		return remove;
	}

	/**
	 * This method initializes restart	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getRestart() {
		if (restart == null) {
			restart = new JButton();
			restart.setBounds(new Rectangle(912, 491, 80, 26));
			restart.setText("Restart");
		}
		return restart;
	}

	/**
	 * This method initializes input	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getInput() {
		if (input == null) {
			input = new JTextField();
			input.setBounds(new Rectangle(358, 495, 282, 27));
		}
		return input;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Test");
			jMenu.add(getJMenuItem());
			jMenu.add(getJMenuItem1());
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem() {
		if (jMenuItem == null) {
			jMenuItem = new JMenuItem();
			jMenuItem.setText("Test1");
		}
		return jMenuItem;
	}

	/**
	 * This method initializes jMenuItem1	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem1() {
		if (jMenuItem1 == null) {
			jMenuItem1 = new JMenuItem();
			jMenuItem1.setText("Test2");
		}
		return jMenuItem1;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(21, 15, 971, 467));
			jPanel.setBackground(Color.white);
		}
		return jPanel;
	}
	
	public void actionPerformed(ActionEvent e) {
	    if ("Insert".equals(e.getActionCommand())) {
	        input.setText("Insert");
	    } else if("Remove".equals(e.getActionCommand())) {
	    	input.setText("Remove");
	    } else if("Restart".equals(e.getActionCommand())) {
	    	input.setText("Restart");
	    }
	} 

}  //  @jve:decl-index=0:visual-constraint="14,11"
