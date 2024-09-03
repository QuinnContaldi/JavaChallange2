public class Grunt extends GameUnit {
    public Grunt(){
        System.out.println("new Grunt");
        unitName = "Grunt";
        movementInterface= new SlowWalkingMovementBehavioir();
        attackingInterface= new AxeAttackingBahavior();
    }
}