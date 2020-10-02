import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {

    JFrame window;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, healthLabel, healthLabelNumber, selectedItemLabel, selectedItemLabelName, goldLabel, goldLabelNumber;
    Font titleFont = new Font("Times New Roman", Font.ITALIC, 50);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 25);

    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    String position;
    Level_1 level_1 = new Level_1();
    Player player = new Player();





    public static void main(String[] args) {

        new Game();

    }


    public Game() {




        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("A Pirate Game for Pirates");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);


        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        startButton.setFocusPainted(false);


        titleNamePanel.add(titleNameLabel);

        startButtonPanel.add(startButton);


        window.add(titleNamePanel);
        window.add(startButtonPanel);
        window.setVisible(true);


    }

    public void createGamePlayScreen() {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(150,350,500, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        choice1 = new JButton();
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton();
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton();
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton();
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(10,15,800,50);
        playerPanel.setBackground(Color.black);
        playerPanel.setLayout(new GridLayout(1,4));

        healthLabel = new JLabel("Health:");
        healthLabel.setFont(normalFont);
        healthLabel.setForeground(Color.white);
        playerPanel.add(healthLabel);
        healthLabelNumber = new JLabel();
        healthLabelNumber.setFont(normalFont);
        healthLabelNumber.setForeground(Color.white);
        playerPanel.add(healthLabelNumber);

        goldLabel = new JLabel("Gold:");
        goldLabel.setFont(normalFont);
        goldLabel.setForeground(Color.white);
        playerPanel.add(goldLabel);
        goldLabelNumber = new JLabel();
        goldLabelNumber.setFont(normalFont);
        goldLabelNumber.setForeground(Color.white);
        playerPanel.add(goldLabelNumber);

        selectedItemLabel = new JLabel("Item:");
        selectedItemLabel.setFont(normalFont);
        selectedItemLabel.setForeground(Color.white);
        playerPanel.add(selectedItemLabel);
        selectedItemLabelName = new JLabel();
        selectedItemLabelName.setFont(normalFont);
        selectedItemLabelName.setForeground(Color.white);

        playerPanel.add(selectedItemLabelName);

        playerSetup();
        Level1();



        window.add(playerPanel);


    }

    public void playerSetup() {

        Inventory inventory = new Inventory("");
        inventory.setItem("rum");
        inventory.addItemtoInventoryList("rum");
        selectedItemLabelName.setText(inventory.getItem());
        healthLabelNumber.setText(""+player.getHealth());
        goldLabelNumber.setText(""+player.getGold());


    }

    public void Level1 (){

        position = "Outside House";


        mainTextArea.setText(level_1.Level_1_Message());
        choice1.setText(level_1.Level_1_Choice1Message());
        choice2.setText(level_1.Level_1_Choice2Message());
        choice3.setText(level_1.Level_1_Choice3Message());
        choice4.setText(level_1.Level_1_Choice4Message());
    }

    public void FloorOption1 () {
        position = "Floor";
        mainTextArea.setText("Heureka! You found some gold!");
        player.setGold(player.getGold() + 20);
        choice1.setText("Oh, I love gold!");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        goldLabelNumber.setText(""+player.getGold());

    }

    public void FloorOption2 () {
        position = "Floor";
        mainTextArea.setText("While running away you stumble over your wooden leg and loose some health.");
        player.setHealth(player.getHealth() - 20);
        choice1.setText("Damn it, I need some rum!");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        healthLabelNumber.setText(""+player.getHealth());


    }

    public void FloorOption3 () {
        position = "Floor";
        mainTextArea.setText("The ghost of Guybrush Threepwood joins you while you are singing and gives you some 1000 years old rum for present!");
        player.setHealth(player.getHealth() + 20);
        choice1.setText("Oh holy pirate leg, ruuuuuuummmm!");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        healthLabelNumber.setText(""+player.getHealth());


    }



    //Eine Instanz von TitleScreenHandler wird zum ActionListener gemacht
    public class TitleScreenHandler implements ActionListener {

        @Override
        //Event-Handling Methode wird implementiert
        public void actionPerformed(ActionEvent e) {
            createGamePlayScreen();

        }
    }

    public class ChoiceHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String yourChoice = e.getActionCommand();

            switch (position) {
                case "Outside House":
                    switch (yourChoice){
                        case "c1": FloorOption1(); break;
                        case "c2": FloorOption2(); break;
                        case "c3": FloorOption3(); break;
                    }
                    break;
                case "Floor":
                    switch (yourChoice) {
                        case "c1": Level1(); break;
                    }


            }


        }
    }


}



