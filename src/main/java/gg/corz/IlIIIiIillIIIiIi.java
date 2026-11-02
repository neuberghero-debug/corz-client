package gg.corz;

import net.minecraft.class_243;

public record IlIIIiIillIIIiIi(int entityId, class_243 velocity, long atMs) {
   private final int IilIlilIIi;
   private final long iilIlilIIi;
   private final class_243 lilIlilIIi;

   public class_243 liiiIIllIl() {
      return this.lilIlilIIi;
   }

   public IlIIIiIillIIIiIi(int entityId, class_243 velocity, long atMs) {
      this.IilIlilIIi = entityId;
      this.lilIlilIIi = velocity;
      this.iilIlilIIi = atMs;
   }

   public int IliIlllilIi() {
      return this.IilIlilIIi;
   }

   public long iIlIlllllill() {
      return this.iilIlilIIi;
   }
}
