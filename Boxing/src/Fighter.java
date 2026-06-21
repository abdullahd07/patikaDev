public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getWeight() {
        return weight;
    }

    public double getDodge() {
        return dodge;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    void hit(Fighter enemy) {
        int chance = (int) (Math.random() * 100) + 1;

        if (chance <= enemy.getDodge()) {
            System.out.println("--> " + enemy.getName() + " gelen atağı harika bir şekilde blokladı!");
            return;
        }


        int currentEnemyHealth = enemy.getHealth() - this.damage;


        if (currentEnemyHealth < 0) {
            currentEnemyHealth = 0;
        }


        enemy.setHealth(currentEnemyHealth);

        System.out.println(this.getName() + " vurdu! " + enemy.getName() + " " + this.damage + " hasar aldı.");
    }

}
