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

## Installation

Drop the release jar from the [Releases](../../releases) page into
`.minecraft/mods` (Fabric Loader ≥ 0.16, Fabric API, Minecraft 1.21.11).

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
