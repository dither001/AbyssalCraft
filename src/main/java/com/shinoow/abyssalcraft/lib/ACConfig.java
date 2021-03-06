/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2020 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.lib;

/**
 * Config option references (except dimension IDs, they're in {@link ACLib})
 * @author shinoow
 *
 */
public class ACConfig {

	public static boolean keepLoaded1, keepLoaded2, keepLoaded3, keepLoaded4;

	public static boolean shouldSpread, shouldInfect, breakLogic, destroyOcean, demonAnimalFire, particleBlock,
	particleEntity, hardcoreMode, antiItemDisintegration, smeltingRecipes, purgeMobSpawns, mimicFire,
	armorPotionEffects, nuclearAntimatterExplosions, syncDataOnBookOpening, dreadGrassSpread, portalSpawnsNearPlayer,
	showBossDialogs, jzaharBreaksFourthWall, lootTableContent, depthsGhoulBiomeDictSpawn, abyssalZombieBiomeDictSpawn,
	useAmplifiedWorldType, generateStatuesInLairs, enchantBooks, nightVisionEverywhere, antiPlayersPickupLoot,
	demonAnimalsSpawnOnDeath, evilAnimalNewMoonSpawning;
	public static int evilAnimalSpawnWeight, portalCooldown, demonAnimalSpawnWeight, shoggothLairSpawnRate, acidSpitFrequency,
	knowledgeSyncDelay, shoggothLairSpawnRateRivers, darkOffspringSpawnWeight, monolithBuildingCooldown, corruptionRitualRange,
	cleansingRitualRange, purgingRitualRange, odbExplosionSize, antimatterExplosionSize, enchantmentMaxLevel, curingRitualRange,
	shoggothLairGenerationDistance;
	public static double damageAmpl, depthsHelmetOverlayOpacity;
	public static boolean shoggothOoze, oozeExpire, consumeItems, shieldsBlockAcid, shoggothGlowingEyes;
	public static double acidResistanceHardness;
	public static boolean generateDarklandsStructures, generateShoggothLairs, generateAbyssalWastelandPillars,
	generateAbyssalWastelandRuins, generateAntimatterLake, generateCoraliumLake, generateDreadlandsStalagmite;
	public static boolean generateCoraliumOre, generateNitreOre, generateAbyssalniteOre, generateAbyssalCoraliumOre,
	generateDreadlandsAbyssalniteOre, generateDreadedAbyssalniteOre, generateAbyssalIronOre, generateAbyssalGoldOre,
	generateAbyssalDiamondOre, generateAbyssalNitreOre, generateAbyssalTinOre, generateAbyssalCopperOre,
	generatePearlescentCoraliumOre, generateLiquifiedCoraliumOre;
	public static boolean hcdarkness_aw, hcdarkness_dl, hcdarkness_omt, hcdarkness_dr;
	public static boolean no_dreadlands_spread, no_acid_breaking_blocks, no_spectral_dragons, no_projectile_damage_immunity,
	no_disruptions, no_black_holes, no_odb_explosions;

	public static boolean crystal_rework;

	public static boolean entropy_spell, life_drain_spell, mining_spell, grasp_of_cthulhu_spell, invisibility_spell,
	detachment_spell, steal_vigor_spell, sirens_song_spell, undeath_to_dust_spell, ooze_removal_spell, teleport_hostile_spell,
	display_routes_spell, toggle_state_spell, floating_spell, teleport_home_spell;
}
