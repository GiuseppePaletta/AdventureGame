public class Level_1 {

    private int PlayerChoiceLevel_1;

    public void setPlayerChoiceLevel_1(int playerChoiceLevel_1) {
        this.PlayerChoiceLevel_1 = playerChoiceLevel_1;
    }

    public int getPlayerChoiceLevel_1() {
        return PlayerChoiceLevel_1;
    }

    public void Level_1_Message() throws InterruptedException {
        String Level_1_Message = "There is a old wooden box on the floor. Apparently some pirates must have left it here.\n" +
                "What do you want to do? \n" +
                "[1] Open the box\n" +
                "[2] Turnaround and run away\n" +
                "[3] Start singing: A pirate I was meant to be .. Trim the sails and roam the sea!\n";

        char[] chars = Level_1_Message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            Thread.sleep(10);
        }

    }


    public void FirstObstacle(int PlayersChoice, Player player) {

        switch (PlayersChoice) {

            case 1:
                System.out.println("Heureka! You found some gold!");
                break;
            case 2:
                System.out.println("While running away you stumble over your wooden leg and loose some health.");
                player.setHealth(player.getHealth() - 20);
                break;
            case 3:
                System.out.println("The ghost of Guybrush Threepwood joins you while you are singing\nand gives you some health for present!");
                player.setHealth(player.getHealth() + 20);
                break;
            default:
                System.out.println("You selected a wrong number. You are a real pirate.");
                break;
        }
    }
}