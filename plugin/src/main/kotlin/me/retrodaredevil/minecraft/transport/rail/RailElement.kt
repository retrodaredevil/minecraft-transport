package me.retrodaredevil.minecraft.transport.rail

import me.retrodaredevil.minecraft.transport.BlockCoordinate

sealed interface RailElement {
    operator fun contains(block: BlockCoordinate): Boolean
}

class RailPath(
        val frontConnectsTo: BlockCoordinate,
        val rearConnectsTo: BlockCoordinate,
        val blocks: List<BlockCoordinate>,
) : RailElement {
    override fun contains(block: BlockCoordinate): Boolean {
        return block in blocks
    }

}
class RailSwitch(
        val block: BlockCoordinate
) : RailElement {
    override fun contains(block: BlockCoordinate): Boolean {
        return block == this.block
    }
}


