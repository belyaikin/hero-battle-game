package me.belyaikin.game.ui.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class GameButton extends JButton implements ActionListener {
    public GameButton(String text) {
        this.setText(text);
    }
}
