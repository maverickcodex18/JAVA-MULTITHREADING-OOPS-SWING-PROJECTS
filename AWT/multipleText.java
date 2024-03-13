package AWT;

import java.awt.*;
import java.awt.event.*;

class win extends Frame{

    TextArea txt1;

    public win(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

    setLayout(new FlowLayout(FlowLayout.TRAILING));
    txt1=new TextArea("Certainly! Here's a random passage for you:\nIn the quiet embrace of the moonlit night, shadows danced whimsically across the ancient walls of a forgotten castle. The air was filled with the enchanting scent of blooming jasmine, as a gentle breeze whispered secrets through the rustling leaves of an old oak tree. Lost in the serenity of the moment, a solitary figure strolled along the cobblestone path, their footsteps echoing in harmony with the distant melody of a hidden stream.\nAs the stars painted constellations overhead, a symphony of crickets and night creatures played a lullaby for the world. The passage of time seemed to pause, allowing the universe to reveal its mysteries to those willing to listen. Deep within the tapestry of the night, dreams unfolded like delicate petals, carrying the promise of untold adventures and magical realms waiting to be explored.\nIn this nocturnal realm, where reality and fantasy entwined, every shadow held a story, and every rustle in the foliage whispered the secrets of the universe. It was a place where imagination reigned supreme, and the ordinary transformed into the extraordinary under the watchful gaze of the celestial canopy.\nAnd so, under the spell of the moon's gentle glow, the night unfolded its tapestry, weaving tales of wonder and inviting wanderers to get lost in the beauty of the unknown.",10,15,TextArea.SCROLLBARS_VERTICAL_ONLY);
    add(txt1);


    }
}

public class multipleText {
    public static void main(String[] args) {
        win win1= new win();
        win1.setSize(700,700);
        win1.setVisible(true);

    }
}
