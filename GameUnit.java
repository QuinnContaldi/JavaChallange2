//Implements Movement and Attacking Interface

public class GameUnit
{
    public String unitName;
    public AttackingInterface attackingInterface;
    public MovementInterface movementInterface;


    public GameUnit(){
        unitName= "NULL";
        attackingInterface= null;
        movementInterface= null;
    } 
    public void attack()
    {
        attackingInterface.attack();
    }

    public void move()
    {
        movementInterface.move();
    }

    public void changeAttack(AttackingInterface newAttackingInterface)
    {
        attackingInterface = newAttackingInterface;
    }
    
    public void changeMove(MovementInterface newMovementInterface)
    {
        movementInterface = newMovementInterface;
    }

    public void callName()
    {
        System.out.println(unitName);
    }
}