
package io.github.team_lodestar.transcendeum.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

import io.github.team_lodestar.transcendeum.procedures.BerthelSharpBladeProcedure;
import io.github.team_lodestar.transcendeum.itemgroup.TranscendeumGearItemGroup;
import io.github.team_lodestar.transcendeum.TheTranscendeumModElements;

@TheTranscendeumModElements.ModElement.Tag
public class BerthelShovelItem extends TheTranscendeumModElements.ModElement {
	@ObjectHolder("the_transcendeum:berthel_shovel")
	public static final Item block = null;
	public BerthelShovelItem(TheTranscendeumModElements instance) {
		super(instance, 105);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 532;
			}

			public float getEfficiency() {
				return 11f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 11;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BerthelShardItem.block));
			}
		}, 1, -3f, new Item.Properties().group(TranscendeumGearItemGroup.tab)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("sourceentity", sourceentity);
					$_dependencies.put("itemstack", itemstack);
					$_dependencies.put("world", world);
					BerthelSharpBladeProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("berthel_shovel"));
	}
}
