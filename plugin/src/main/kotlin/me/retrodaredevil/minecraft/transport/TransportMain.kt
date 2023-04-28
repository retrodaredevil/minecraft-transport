package me.retrodaredevil.minecraft.transport

import org.bukkit.plugin.java.JavaPlugin

class TransportMain : JavaPlugin() {
    override fun onEnable() {
        super.onEnable()
        logger.info("Enabling minigames plugin!")
        val boardManager = createBoardManager()
    }

    override fun onDisable() {
        super.onDisable()
        logger.info("Disabling minigames plugin!")
    }
}