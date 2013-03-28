package ZoneSeek.common.items;
import java.util.Random;

import ZoneSeek.common.entities.EntityInfectionBook;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class ItemBookOfInfecteion extends Item
{
	public ItemBookOfInfecteion(int i)
    {
		super(i);
        maxStackSize = 1;
    }
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer)
    {
        world.playSoundAtEntity(entityplayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        if (!world.isRemote)
        {
        	world.spawnEntityInWorld(new EntityInfectionBook(world, entityplayer));
        }
        return itemstack;
        }
	@Override
	public void updateIcons(IconRegister par1IconRegister)
	{
		this.iconIndex = par1IconRegister.registerIcon("zoneseek:BookOfInfection");
	}

}