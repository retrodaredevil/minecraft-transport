package me.retrodaredevil.minecraft.transport

import org.bukkit.Material
import org.bukkit.block.data.Rail
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockEvent
import org.bukkit.event.block.BlockPhysicsEvent
import org.bukkit.event.block.BlockPlaceEvent

class SimpleListener(
        private val world: String
) : Listener {

    private fun shouldIgnore(event: BlockEvent): Boolean {
        return event.block.location.world?.name != world
    }

    @EventHandler
    fun onBlockChange(event: BlockEvent) {
        if (shouldIgnore(event)) {
            return
        }
        if (event.block.blockData.material == Material.RAIL) {
            val rail: Rail = event.block.blockData as Rail
            rail.shape
        }
    }

    @EventHandler
    fun onBlockChange(event: BlockPhysicsEvent) {
        if (shouldIgnore(event)) {
            return
        }
        if (event.block.blockData.material == Material.GRASS_BLOCK && event.changedType == Material.DIRT) {
            event.isCancelled = true
        }
    }
}