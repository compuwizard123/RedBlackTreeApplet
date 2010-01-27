import java.awt.*;
import java.applet.*;

public class RedBlackTreeApplet extends Applet {
	Button increase, decrease;
	int value = 1000;

	public void init() {
		increase = new Button("Increase the value");
		add(increase);
		decrease = new Button("Decrease the value");
		add(decrease);
	}

	public void stop() {
	}

	public boolean action(Event e, Object args) {
		if (e.target == increase)
			value++;
		if (e.target == decrease)
			value--;
		repaint();
		return true;
	}

	public void paint(Graphics g) {
		g.drawString("The value is currently " + value, 50, 80);
	}
}
