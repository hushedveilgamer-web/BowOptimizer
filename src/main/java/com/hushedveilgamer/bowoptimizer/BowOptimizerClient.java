package com.hushedveilgamer.bowoptimizer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.client.MinecraftClient;

public class BowOptimizerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.player == null) return;
            
            // Remove client-side cooldown for bow and crossbow so player can use them instantly
            try {
                var cooldown = client.player.getItemCooldownManager();
                cooldown.remove(Items.BOW);
                cooldown.remove(Items.CROSSBOW);
            } catch (Exception ignored) {}

            // If the player begins using a bow or crossbow, immediately stop using to trigger an instant shot
            try {
                if (client.player.isUsingItem()) {
                    Item current = client.player.getActiveItem().getItem();
                    if (current instanceof BowItem || current instanceof CrossbowItem) {
                        // Immediately release/stop using to fire instantly
                        client.player.stopUsingItem();
                    }
                }
            } catch (Exception ignored) {}
        });
    }
}
