package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;

public record illliiIillii(GpuBuffer buffer, int baseVertex) {
   private final GpuBuffer iIlIiilIlIllIiilIl;
   private final int lllIiilIlillIiilIl;

   public int liiiIIllIl() {
      return this.lllIiilIlillIiilIl;
   }

   public illliiIillii(GpuBuffer buffer, int baseVertex) {
      this.iIlIiilIlIllIiilIl = buffer;
      this.lllIiilIlillIiilIl = baseVertex;
   }

   public GpuBuffer IliIlllilIi() {
      return this.iIlIiilIlIllIiilIl;
   }
}
