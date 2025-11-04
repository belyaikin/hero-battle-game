package me.belyaikin.game.scene.window.factory.impl;

import me.belyaikin.game.GameManager;
import me.belyaikin.game.scene.Scene;
import me.belyaikin.game.ui.button.SceneChangerButton;
import me.belyaikin.game.scene.window.Window;
import me.belyaikin.game.ui.button.impl.ConfirmNameButton;
import me.belyaikin.game.scene.window.factory.WindowFactory;

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

        SceneChangerButton submitButton = new ConfirmNameButton(
                nameField,
                new Scene(new ConfirmWindowFactory().create())
        );
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
