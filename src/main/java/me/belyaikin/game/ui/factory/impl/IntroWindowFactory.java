package me.belyaikin.game.ui.factory.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.ui.button.WindowChangerGameButton;
import me.belyaikin.game.ui.window.GameWindow;
import me.belyaikin.game.ui.button.impl.ConfirmNameButton;
import me.belyaikin.game.ui.factory.GameWindowFactory;

import javax.swing.*;
import java.awt.*;

public final class IntroWindowFactory implements GameWindowFactory {
    @Override
    public GameWindow create() {
        JLabel enterYourNameText = new JLabel("ENTER YOUR NAME.");
        enterYourNameText.setForeground(Color.WHITE);

        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(250, 40));
        nameField.setBackground(Color.BLACK);
        nameField.setForeground(Color.WHITE);

        WindowChangerGameButton submitButton = new ConfirmNameButton(GameManager.getInstance().getWindowManager(), new ConfirmWindowFactory(), nameField);
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);

        return new GameWindow.Builder()
                .layout(new FlowLayout())

                .background(Color.BLACK)
                .foreground(Color.WHITE)

                .component(enterYourNameText)
                .component(nameField)
                .component(submitButton)

                .notResizable()
                .pack()
                .build();
    }
}
