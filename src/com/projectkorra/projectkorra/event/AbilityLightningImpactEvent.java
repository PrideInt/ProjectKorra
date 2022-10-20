package com.projectkorra.projectkorra.event;

import com.projectkorra.projectkorra.firebending.lightning.Lightning;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AbilityLightningImpactEvent extends Event implements Cancellable {
	public static final HandlerList HANDLER_LIST = new HandlerList();
	
	private Lightning lightning;
	private Block block;
	private Entity entity;
	private boolean cancelled;
	
	public AbilityLightningImpactEvent(final Lightning lightning, final Block block) {
		this.lightning = lightning;
		this.block = block;
	}
	public AbilityLightningImpactEvent(final Lightning lightning, final Entity entity) {
		this.lightning = lightning;
		this.entity = entity;
	}
	
	public Lightning getLightningAbility() {
		return this.lightning;
	}
	public Block getBlock() {
		return this.block;
	}
	public Entity getEntity() {
		return this.entity;
	}
	
	@Override
	public HandlerList getHandlers() {
		return HANDLER_LIST;
	}
	public static HandlerList getHandlerList() {
		return HANDLER_LIST;
	}
	
	@Override
	public boolean isCancelled() {
		return this.cancelled;
	}
	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
}
