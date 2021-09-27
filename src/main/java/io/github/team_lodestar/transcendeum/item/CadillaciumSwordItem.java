
package io.github.team_lodestar.transcendeum.item;

@TheTranscendeumModElements.ModElement.Tag
public class CadillaciumSwordItem extends TheTranscendeumModElements.ModElement {

	@ObjectHolder("the_transcendeum:cadillacium_sword")
	public static final Item block = null;

	public CadillaciumSwordItem(TheTranscendeumModElements instance) {
		super(instance, 201);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 916;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CadillaciumIngotItem.block));
			}
		}, 3, -2.4f, new Item.Properties().group(TranscendeumGearItemGroup.tab)) {

		}.setRegistryName("cadillacium_sword"));
	}

}
