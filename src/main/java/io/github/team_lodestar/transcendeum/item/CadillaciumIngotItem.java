
package io.github.team_lodestar.transcendeum.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import io.github.team_lodestar.transcendeum.itemgroup.TranscendeumItemsItemGroup;
import io.github.team_lodestar.transcendeum.TheTranscendeumModElements;

@TheTranscendeumModElements.ModElement.Tag
public class CadillaciumIngotItem extends TheTranscendeumModElements.ModElement {
	@ObjectHolder("the_transcendeum:cadillacium_ingot")
	public static final Item block = null;
	public CadillaciumIngotItem(TheTranscendeumModElements instance) {
		super(instance, 202);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TranscendeumItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("cadillacium_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
