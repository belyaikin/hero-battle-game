package me.belyaikin.game.ui.window.factory.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.ui.button.WindowChangerButton;
import me.belyaikin.game.ui.window.Window;
import me.belyaikin.game.ui.button.impl.ConfirmNameButton;
import me.belyaikin.game.ui.window.factory.WindowFactory;

import javax.swing.*;
import java.awt.*;

public final class IntroWindowFactory implements WindowFactory {
    @Override
    public Window create() {
        JLabel enterYourNameText = new JLabel("ENTER YOUR NAME.");
        enterYourNameText.setForeground(Color.WHITE);

        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(250, 40));
        nameField.setBackground(Color.BLACK);
        nameField.setForeground(Color.WHITE);

        WindowChangerButton submitButton = new ConfirmNameButton(GameManager.getInstance().getWindowManager(), new ConfirmWindowFactory(), nameField);
        submitButton.setBackground(Color.BLACK);
        submitButton.setForeground(Color.WHITE);

        return new Window.Builder()
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
