package gg.corz;

import net.minecraft.class_2338;

public record iliIiIIiIiiIiIIi(int breakerId, class_2338 pos, int stage, long startTick, long lastTick) {
   private final int lIlllliiil;
   private final long lllllliiil;
   private final class_2338 iIlllliiil;
   private final int Illllliiil;
   private final long illllliiil;

   public int iIlIlllllill() {
      return this.Illllliiil;
   }

   public int IliIlllilIi() {
      return this.lIlllliiil;
   }

   public long lIiiIiIlilli() {
      return this.illllliiil;
   }

   public iliIiIIiIiiIiIIi(int breakerId, class_2338 pos, int stage, long startTick, long lastTick) {
      this.lIlllliiil = breakerId;
      this.iIlllliiil = pos;
      this.Illllliiil = stage;
      this.lllllliiil = startTick;
      this.illllliiil = lastTick;
   }

   public long IilliliilIIi() {
      return this.lllllliiil;
   }

   public class_2338 liiiIIllIl() {
      return this.iIlllliiil;
   }
}
