package Game;

public class Main {
    public static void main(String args[]){
        Player1 player= new Player1("Ronald", "sword", 900);
        System.out.println(player.getName());
        System.out.println(player.getHealth());
        System.out.println(player.getWeapon());

        player.damageByGun1();
        player.damageByGun1();
        player.damageByGun2();

        Player2 betterPlayer = new Player2("Kevin","gun", 80, false);
        betterPlayer.damageByGun1();

        player.heal();
    }
}
