package gg.corz;

import net.minecraft.class_2338;

public record iIIlllllIlIlllll(int breakerId, class_2338 pos, int stage) implements IlIillIiilIi {
   private final int llililIill;
   private final class_2338 ilililIill;
   private final int IiililIill;

   public class_2338 liiiIIllIl() {
      return this.ilililIill;
   }

   public iIIlllllIlIlllll(int breakerId, class_2338 pos, int stage) {
      this.llililIill = breakerId;
      this.ilililIill = pos;
      this.IiililIill = stage;
   }

   public int iIlIlllllill() {
      return this.IiililIill;
   }

   public int IliIlllilIi() {
      return this.llililIill;
   }
}
