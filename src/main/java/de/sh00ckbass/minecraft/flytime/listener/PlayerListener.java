package de.sh00ckbass.minecraft.flytime.listener;

import de.sh00ckbass.minecraft.flytime.FlyTime;
import lombok.AllArgsConstructor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

/*******************************************************
 * Copyright (C) Sh00ckBass tobias@sh00ckbass.de
 *
 * This file is part of FlyTime and was created at the 17.12.2021
 *
 * FlyTime can not be copied and/or distributed without the express
 * permission of the owner.
 *
 */

@AllArgsConstructor
public class PlayerListener implements Listener {

    private final FlyTime plugin;

    @EventHandler
    public void onJoin(final PlayerJoinEvent event) {
        this.plugin.getData().registerPlayer(event.getPlayer().getUniqueId());
    }

    @EventHandler
    public void onQuit(final PlayerQuitEvent event) {
        this.plugin.getData().toggleFlying(event.getPlayer());
    }

}