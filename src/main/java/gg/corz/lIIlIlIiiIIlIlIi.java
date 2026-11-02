package gg.corz;

import net.minecraft.class_243;

public record lIIlIlIiiIIlIlIi(int id, class_243 base, class_243 pos, long arrivalFrame) {
   private final long liiiiiiiil;
   private final class_243 iliiiiiiil;
   private final class_243 Iiiiiiiiil;
   private final int lliiiiiiil;

   public lIIlIlIiiIIlIlIi lIiiIiIlilli(class_243 frame, long position) {
      return new lIIlIlIiiIIlIlIi(this.lliiiiiiil, frame, frame, position);
   }

   public static lIIlIlIiiIIlIlIi IliIlllilIi(int frame, long id) {
      return new lIIlIlIiiIIlIlIi(frame, null, null, id);
   }

   public class_243 IiIlliIliiIl() {
      return this.Iiiiiiiiil;
   }

   public int IIIllIIliIIl() {
      return this.lliiiiiiil;
   }

   public lIIlIlIiiIIlIlIi iliIiiliiiii(class_243 frame, long position) {
      return new lIIlIlIiiIIlIlIi(this.lliiiiiiil, this.iliiiiiiil, frame, position);
   }

   public lIIlIlIiiIIlIlIi iIlIlllllill(class_243 newPos, class_243 newBase) {
      return new lIIlIlIiiIIlIlIi(this.lliiiiiiil, newPos, newBase, this.liiiiiiiil);
   }

   public boolean liiiIIllIl() {
      return this.iliiiiiiil != null && this.Iiiiiiiiil != null;
   }

   public long IIlllIlliIll() {
      return this.liiiiiiiil;
   }

   public lIIlIlIiiIIlIlIi IilliliilIIi(long dx, long dy, long frame, long dz) {
      if (this.iliiiiiiil == null) {
         return new lIIlIlIiiIIlIlIi(this.lliiiiiiil, null, null, dz);
      } else {
         class_243 var9 = lIiIlIiliIiIlIil.iIlIlllllill(this.iliiiiiiil, dx, dy, frame);
         return new lIIlIlIiiIIlIlIi(this.lliiiiiiil, var9, var9, dz);
      }
   }

   public class_243 IlIlllIlilIl() {
      return this.iliiiiiiil;
   }

   public lIIlIlIiiIIlIlIi(int id, class_243 base, class_243 pos, long arrivalFrame) {
      this.lliiiiiiil = id;
      this.iliiiiiiil = base;
      this.Iiiiiiiiil = pos;
      this.liiiiiiiil = arrivalFrame;
   }
}
