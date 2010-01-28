import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.util.ArrayList;
import java.util.Iterator;

public class RedBlackTreeApplet extends Applet {
	Button insert, remove, restart;
	int value = 1000;
	RedBlackTree<Integer> b;

	public void init() {
		setLayout(null);
		
		insert = new Button("Insert");
		remove = new Button("Remove");
		restart = new Button("Restart");
		
		insert.setBounds(20,20,100,30);
		remove.setBounds(20,50,100,30);
		restart.setBounds(20,100,100,30);
		
		add(insert);
		add(remove);
		add(restart);
		
		b = new RedBlackTree<Integer>();
		for(int i=0; i < 10; i++) {
			b.insert(i);
		}
	}

	public void stop() {
	}

	public boolean action(Event e, Object args) {
		if (e.target == insert)
			value++;
		if (e.target == remove)
			value--;
		if (e.target == restart)
			value = 1000;
		repaint();
		return true;
	}

	public void paint(Graphics g) {
		g.drawString("The value is currently " + value, 50, 80);
	}
}
