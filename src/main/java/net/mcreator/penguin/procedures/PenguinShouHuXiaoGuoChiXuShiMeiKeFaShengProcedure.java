package net.mcreator.penguin.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.penguin.init.PenguinModParticleTypes;

public class PenguinShouHuXiaoGuoChiXuShiMeiKeFaShengProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.giveExperiencePoints(500);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 1, 0, 0);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 1, 1, 0);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 1, 1, 1);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 0, 1, 1);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 0, 0, 1);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 0, 0, 0);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 0, 1, 0);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, (-1), 0, 0);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, (-1), (-1), 0);
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, (-1), (-1), (-1));
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 0, (-1), (-1));
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 0, 0, (-1));
		world.addParticle((SimpleParticleType) (PenguinModParticleTypes.QE_LIZ.get()), x, y, z, 0, (-1), 0);
	}
}
