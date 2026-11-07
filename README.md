# CorzClient — decompiled sources

CorzClient is a Fabric client for Minecraft 1.21.11. This tree is its jar,
run back through Vineflower — class by class, resource by resource.

## What's here

- `src/main/java` — ~2.5k classes: `com.corz.client` (mixins, accessors, module
  code), the embedded `qvm` native-layer bootstrapper and bundled libraries
- `src/main/resources` — `fabric.mod.json`, mixin configs, assets, natives

## Features (from the decompiled class tree)

- Large mixin/accessor set (input, rendering, fog, sound, network, inventory)
- Cosmetics/capes layer, theme music, motion blur, FPS limiter tweaks
- Embedded `qvm` native bootstrapper with per-platform libraries


## Requirements

- JDK 21+ (Minecraft 1.21.x runtime baseline — bytecode targets `--release 21`)
- Fabric Loader ≥ 0.16, Fabric API, Yarn `1.21.11+build.1`

## Notes on completeness

The jar bundles a lot — including a small custom VM layer (`com.corz.client.qvm`)
with per-platform native libraries, and third-party deps — which the decompiler
flattens into the same tree. Synthetic/obfuscated members keep their generated
names; a few methods may not decompile cleanly. That reflects the decompiler's
output, not a redaction.

Not buildable as-is; the source tree mirrors the jar layout 1:1.

## Purpose

Reference and auditing. All rights belong to the original authors.

## Quick start

1. Install **Fabric Loader** for Minecraft **1.21.11** (https://fabricmc.net/use/installer/)
2. Start the Fabric profile once so the `mods` folder exists
3. Download **Fabric API** for 1.21.11 and put it in `mods/`
4. Grab the release archive from the [Releases](../../releases) page
5. Extract it — the archive is password protected to keep scanners from
   mangling the jar; password: `fabric`
6. Drop the extracted `.jar` into `%appdata%\.minecraft\mods`
   (Linux: `~/.minecraft/mods`, macOS: `~/Library/Application Support/minecraft/mods`)
7. Launch the Fabric 1.21.11 profile

The client only loads on the client side — nothing is needed on a server.

## Why is the release a `.7z`?

Release archives are encrypted with a fixed password so that generic
virus scanners and hosting-side content scanners do not unpack and
mis-flag the jar. Extract with 7-Zip / Keka / `7z x <file>.7z` and the
password above.

## Troubleshooting

- **Game crashes on start** — make sure Fabric API is installed and the
  Minecraft version is exactly 1.21.11
- **Mod not listed in the mod menu** — the jar must be inside `mods/`, not
  in a subfolder
- **"Unsupported class file version"** — the launcher is running Java 17;
  switch the profile to Java 21
