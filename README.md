# BowOptimizer (Fabric client-side mod)

Small Fabric client mod for Minecraft 1.21.8 that removes the client-side cooldown for bows and crossbows and makes them draw instantly on the client.

Important: This is a client-side mod only. Servers may still enforce server-side mechanics — using this on protected servers may be against the server's rules.

Files created:

- [src/main/java/com/hushedveilgamer/bowoptimizer/BowOptimizerClient.java](src/main/java/com/hushedveilgamer/bowoptimizer/BowOptimizerClient.java)
- [src/main/java/com/hushedveilgamer/bowoptimizer/mixin/ItemMixin.java](src/main/java/com/hushedveilgamer/bowoptimizer/mixin/ItemMixin.java)
- [src/main/resources/fabric.mod.json](src/main/resources/fabric.mod.json)
- [src/main/resources/mixins.bowoptimizer.json](src/main/resources/mixins.bowoptimizer.json)

Build / run (recommended using Fabric Loom):

```bash
./gradlew build
```

Drop the resulting JAR from `build/libs` into your Fabric client's `mods` folder.

Notes:
- This mod uses a mixin to make bows/crossbows report a max use time of 1 tick on the client, and it clears the client-side cooldown manager each tick. The server may still require legitimate use times for fully charged shots.
- If you want a toggle or keybind, I can add one.
# BowOptimizer
a mod made to optimxe bows
