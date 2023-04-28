package me.retrodaredevil.minecraft.transport.rail

import me.retrodaredevil.minecraft.transport.BlockCoordinate
import org.bukkit.block.data.Rail

class Switch(
        val location: BlockCoordinate,
        val originalShape: Rail.Shape,
        val switchShape: Rail.Shape,
)

class SwitchManager {
    private val activeSwitches = mutableListOf<Switch>()
}