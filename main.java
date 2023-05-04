package src;

public class Character {
    private String nama;
    private int heal;
    private String weapon;
    private int attackP;
    private int mana;

    public Character(String nama, int heal, String weapon, int attackP, int mana) {
        this.nama = nama;
        this.heal = heal;
        this.weapon = weapon;
        this.attackP = attackP;
        this.mana = mana;
        print();
    }

    public void attack() {
        this.mana -= 5;
        System.out.println(this.nama + " menyerang si sotong");
        // System.out.println("sotong terkena demage sebanyak " + this.attackP);
    }

    public void demage(int attackP) {
        System.out.println(this.nama + " terkena demage sebanyak " + attackP);
        this.heal -= attackP;
    }

    public void print() {
        System.out.println("nama: " + nama);
        System.out.println("heal: " + heal);
        System.out.println("weapon: " + weapon);
        System.out.println("attack power: " + attackP);
        System.out.println("mana : " + mana);
    }

    public static void main(String[] args) {
        Character character1 = new Character("ucup", 100, "pedang excalibur", 5, 100);
        character1.attack();
        character1.demage(10);
        character1.print();
    }
}
