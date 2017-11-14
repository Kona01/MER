package mer.mod.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityLion extends EntityMob {

    public EntityLion(World worldIn) {
        super(worldIn);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAILookIdle(this));
        this.tasks.addTask(1, new EntityAIWander(this, 0.50D));
        this.targetTasks.addTask(0, new EntityAIAttackMelee(this, 1.0D, true));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12D);
    }
}
