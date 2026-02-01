# BowOptimizer - Fabric Mod for Minecraft 1.21.8

A lightweight **client-side only** Fabric mod that removes bow and crossbow cooldown delays, allowing them to fire instantly for PvP and general gameplay optimization.

![Bow & Crossbow Icon](src/main/resources/icon.png)

## Features

✨ **Instant Bow Firing** - Removes client-side draw delay for bows  
✨ **Instant Crossbow Firing** - Same instant-fire behavior for crossbows  
⚡ **Client-Side Only** - Lightweight, no server-side dependencies  
🎯 **PvP Optimized** - Designed for competitive bow combat

## What This Mod Does

- Clears the client-side item cooldown for bows and crossbows every tick
- Immediately triggers the release action when you start using a bow/crossbow
- Result: Bows and crossbows fire instantly when you click, no draw animation delay

## Requirements

- **Minecraft:** 1.21.8
- **Fabric Loader:** 0.14.0 or newer
- **Fabric API:** 0.84.0+1.21.8 or compatible

## Installation

### Option 1: Download Pre-compiled JAR (Easiest)

1. Go to [Releases](https://github.com/hushedveilgamer-web/BowOptimizer/releases)
2. Download `bowoptimizer-1.0.0.jar`
3. Place it in your Fabric mods folder: `~/.minecraft/mods/` (or wherever your instance stores mods)
4. Launch Minecraft with Fabric Loader
5. Done!

### Option 2: Build From Source

**Requirements:** Java 17 or newer, internet connection

```bash
# 1. Clone the repository
git clone https://github.com/hushedveilgamer-web/BowOptimizer.git
cd BowOptimizer

# 2. Build the mod
gradle build

# 3. Find the compiled JAR
# Location: build/libs/bowoptimizer-1.0.0.jar

# 4. Copy to your mods folder
cp build/libs/bowoptimizer-1.0.0.jar ~/.minecraft/mods/
```

## Project Structure

```
BowOptimizer/
├── src/main/java/com/hushedveilgamer/bowoptimizer/
│   └── BowOptimizerClient.java          # Main mod entry point
├── src/main/resources/
│   ├── fabric.mod.json                   # Fabric mod metadata
│   └── icon.png                          # Mod icon (64x64)
├── build.gradle                          # Gradle build config
├── settings.gradle                       # Gradle settings
└── gradle.properties                     # Gradle properties
```

## How It Works

The mod uses Fabric's `ClientTickEvents.END_CLIENT_TICK` event to:

1. **Clear cooldowns** - Removes stored cooldown times for bow/crossbow from the client-side cooldown manager
2. **Detect usage** - Checks if the player is currently holding/using a bow or crossbow
3. **Force release** - Immediately triggers the release action, causing the projectile to fire

This happens every client tick (60 times per second by default), ensuring zero-delay firing.

## Compatibility

- **Servers:** Client-side only - works on any server (Vanilla, Fabric, Spigot, etc.)
- **Other Mods:** Should not conflict with other mods
- **Sodium/Lithium:** Compatible with optimization mods

⚠️ **Warning:** Some servers may have rules against instant-fire bows. Check your server's terms before using!

## Building & Contributing

To build locally:

```bash
gradle build
```

The compiled JAR will be in `build/libs/bowoptimizer-1.0.0.jar`

## License

MIT License - Feel free to use, modify, and distribute!

## Author

- **HushedVeilGamer** - https://github.com/hushedveilgamer-web

## Disclaimer

This mod is provided as-is for personal use. Use responsibly and in compliance with your server's rules. The author is not responsible for bans or other consequences from misuse on servers that prohibit PvP mods.
# BowOptimizer
a mod made to optimxe bows
