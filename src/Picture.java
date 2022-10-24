import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;

/**
 *  This class describes a Picture object which Figures can be drawn on.
 *
 *@author     David Dallmann
 *@created    October 28, 2008
 */
public class Picture extends Frame {
    private Vector figureVector;
    private Image offScreenBuffer;
    private MouseEvent lastMouseEvent;

    /**
     *  Creates a Picture object of size 500 by 400 called "My Picture".
     */
    public Picture() {
        this("My Picture");
    }


    /**
     *  Creates a Picture object of size 500 by 400 called title.
     *
     *@param  title  the title of this Picture
     */
    public Picture(String title) {
        this(title, 500, 400);
    }

    /**
     * Creates a Picture object of the given size called "My Picture".
     *
     *@param width the width of this Picture
     *@param height the height of this Picture
     */
    public Picture(int width, int height) {
        this("My Picture", 500, 400);
    }

    /**
     *  Creates a Picture object of size width by height called title.
     *
     *@param  title   the title of this Picture
     *@param  width   the width of this Picture in pixels
     *@param  height  the height of this Picture in pixels
     */
    public Picture(String title, int width, int height) {
        super(title);
        this.figureVector = new Vector();
        createUI(width, height);
        setVisible(true);
    }


    /**
     *  creates the UI
     *
     *@param  width
     *@param  height
     */
    private void createUI(int width, int height) {
        setSize(width, height);
        center();

        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        dispose();
                        System.exit(0);
                    }
                });
        addMouseListener(new MyMouseListener());
    }


    /**
     *  Centers the picture on the screen
     */
    private void center() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        int x = (screenSize.width - frameSize.width) / 2;
        int y = (screenSize.height - frameSize.height) / 2;
        setLocation(x, y);
    }


    /**
     *  Pauses millis milliseconds.
     *
     *@param  millis  the amount of time to pause in milliseconds
     */
    public void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // do nothing
        }
    }

    /**
     * This method will wait until the user clicks somewhere in this
     * Picture and then return the MouseEvent they used
     */
    public MouseEvent getMouseClick() {
        this.lastMouseEvent = null;
        while (lastMouseEvent == null) {
            //wait here
        }
        return lastMouseEvent;
    }

    /**
     *  This method is called by the graphics system to paint this component
     *
     *@param  g  a Graphics object
     */
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Figure f;
        Vector stringVector;
        for (int i = 0; i < figureVector.size(); i++) {
            f = (Figure) figureVector.get(i);
            g2.setPaint(f.getColor());
            g2.setStroke(f.getStroke());
            if (f.isFilled()) {
                g2.fill(f.getShape());
            } else {
                g2.draw(f.getShape());
            }
            stringVector = f.getStrings();
            DrawnString d;
            for (int j = 0; j < stringVector.size(); j++) {
                d = (DrawnString) stringVector.get(j);
                g2.setFont(d.getFont());
                // g2.drawString(d.getString(), (float) d.getX(), (float) d.getY());
            }
        }
    }


    /**
     *  This method adds the passed-in Figure to this Picture
     *
     *@param  f  the Figure to add to this Picture
     */
    public void add(Figure f) {
        figureVector.add(f);
        this.repaint();
    }


    /**
     *  Removes the given Figure from this Picture
     *
     *@param  f  the Figure to remove. Note that this must be exactly the Figure
     *    you want to remove (i.e. it must be ==), an identical Figure will not work
     */
    public void remove(Figure f) {
        figureVector.remove(f);
        this.repaint();
    }

    /**
     * This method draws the Picture on an image and then switches the images to
     * reduce flicker.
     *
     *@param g a Graphics object
     */
    public void update(Graphics g)
    {
        Graphics gr;
        // Will hold the graphics context from the offScreenBuffer.
        // We need to make sure we keep our offscreen buffer the same size
        // as the graphics context we're working with.
        if (offScreenBuffer==null ||
                (! (offScreenBuffer.getWidth(this) == this.getSize().width
                        && offScreenBuffer.getHeight(this) == this.getSize().height))) {
            offScreenBuffer = this.createImage(getSize().width, getSize().height);
        }

        // We need to use our buffer Image as a Graphics object:
        gr = offScreenBuffer.getGraphics();
        gr.setColor(java.awt.Color.white);
        gr.fillRect(0,0,getSize().width, getSize().height);
        gr.setColor(java.awt.Color.black);
        paint(gr); // Passes our off-screen buffer to our paint method, which,
        // unsuspecting, paints on it just as it would on the Graphics
        // passed by the browser or applet viewer.
        g.drawImage(offScreenBuffer, 0, 0, this);
        // And now we transfer the info in the buffer onto the
        // graphics context we got from the browser in one smooth motion.
    }

    private class MyMouseListener extends javax.swing.event.MouseInputAdapter {
        public void mouseClicked(MouseEvent e) {
            lastMouseEvent = e;
        }
    }
}





