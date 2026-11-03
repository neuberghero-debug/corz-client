# CorzClient — (decompiled)

Decompiled Java sources of the **CorzClient** Fabric mod for Minecraft 1.21.11,
produced with [Vineflower](https://github.com/Vineflower/vineflower).

## What's here

- `src/main/java` — ~2.5k decompiled classes: `com.corz.client` (mixins, accessors,
  module code), the embedded `qvm` native-layer bootstrapper, and bundled libraries
- `src/main/resources` — `fabric.mod.json`, mixin configs, assets, natives

## Notes on completeness

The jar bundles a lot — including a small custom VM layer (`com.corz.client.qvm`)
with per-platform native libraries, and third-party deps — which the decompiler
flattens into the same tree. Synthetic/obfuscated members keep their generated
names; a few methods may not decompile cleanly. That reflects the decompiler's
output, not a redaction.

Not buildable as-is; `build.gradle` is a reconstruction skeleton only.

## Purpose

Reference and auditing. All rights belong to the original authors.
