public class Tank extends GameUnit
{
   
   public Tank()
   {
    unitName = "TANK";
    attackingInterface =  new CannonAttackingBahavior();
    movementInterface = new DrivingMovementBehavior();
   }

}