public class TestRTS {
    public static void main(String[] args) {
        GameUnit grunt = new Grunt();
        GameUnit tank = new Tank();
        grunt.move();
        tank.move();
        grunt.attack();
        tank.attack();

        CannonAttackingBahavior cannonAttack = new CannonAttackingBahavior();
        System.out.println("The GRUNT FOUND A HECKING CANNON!!!!!");
        grunt.changeAttack(cannonAttack);
        grunt.attack();

        System.out.println("GRUNT IN A RUSH!!!");
        grunt.changeMove(new FastWalkingMovementBehavior());
        grunt.move();

        tank.move();
        System.out.println("our Tank got shot Now Its movement has changed!");
        tank.changeMove(new FlyingMovementBehavior());
        tank.move();
    }
}
