package JPotifyGUI.BottomPanel;

import JPotifyGUI.GUI;
import JPotifyLogic.Player;
import JPotifyLogic.Playlist.Playlist;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

public class BottomPanelsMusicControlPanel extends JPanel {
    private JButton[] controlButtons;
    JPanel buttonsPanel ;
    JSlider musicSlider;
    Player player;
    public BottomPanelsMusicControlPanel(Player player) {
        super();
        this.player = player;
        buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 5));
        String[] addresses = {"icons8-shuffle-100.png", "icons8-skip-to-start-100.png",
                "icons8-circled-play-100.png", "icons8-end-100.png", "icons8-repeat-100.png"};
        MouseListener[] mouseListeners = {new ShuffleMouseListener(), new PreviousMouseListener(),
                new PlayPauseMouseListener(), new NextMouseListener(), new RepeatMouseListener()};
        this.controlButtons = new JButton[5];
        for (int i = 0; i < 5; i++) {
            try {
                ImageIcon ii = new ImageIcon(ImageIO.read(new File(
                        "src/JPotifyGUI/images/music control/" + addresses[i])));
                Image image = ii.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
                this.controlButtons[i] = new JButton();
                this.controlButtons[i].setIcon(new ImageIcon(image));
                this.controlButtons[i].addMouseListener(mouseListeners[i]);
                this.controlButtons[i].setBackground(GUI.bottomColorBlack);
                buttonsPanel.add(this.controlButtons[i]);
            } catch (
                    IOException e) {
                e.printStackTrace();
            }
            musicSlider = new JSlider();
            musicSlider.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent changeEvent) {
                    player.gotoPercent(100* (float)musicSlider.getValue()/(float)musicSlider.getMaximum());
                    System.out.println((float)100* musicSlider.getValue()/(float)musicSlider.getMaximum());
                }
            });
            this.setLayout(new BorderLayout());
            this.add(buttonsPanel,BorderLayout.CENTER);
            this.add(musicSlider,BorderLayout.SOUTH);
            this.setVisible(true);

        }
    }


    public void setMusicSliderValue(float persent) {
        this.musicSlider.setValue((int)persent);
    }

    public class ShuffleMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private class PreviousMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private class PlayPauseMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private class NextMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    private class RepeatMouseListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }
}
