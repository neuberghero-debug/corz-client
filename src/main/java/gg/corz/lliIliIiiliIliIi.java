package gg.corz;

import net.minecraft.class_6606;

record lliIliIiiliIliIi(int chunkX, int chunkZ, class_6606 data, long arrivalNanos) {
   private final int illilliIIi;
   private final long iililliIIi;
   private final int IililliIIi;
   private final class_6606 lililliIIi;

   private lliIliIiiliIliIi(int chunkX, int chunkZ, class_6606 data, long arrivalNanos) {
      this.illilliIIi = chunkX;
      this.IililliIIi = chunkZ;
      this.lililliIIi = data;
      this.iililliIIi = arrivalNanos;
   }

   public class_6606 iIlIlllllill() {
      return this.lililliIIi;
   }

   public int IliIlllilIi() {
      return this.illilliIIi;
   }

   public int liiiIIllIl() {
      return this.IililliIIi;
   }

   public long IilliliilIIi() {
      return this.iililliIIi;
   }
}
